import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static int[][] office;
    static List<CCTV> cctvs = new ArrayList<>();
    static int[] dirX = {-1, 0, 1, 0}; // 상, 우, 하, 좌
    static int[] dirY = {0, 1, 0, -1};
    static int minBlindSpot = Integer.MAX_VALUE;

    static class CCTV {
        int x, y, type;

        CCTV(int x, int y, int type) {
            this.x = x;
            this.y = y;
            this.type = type;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        office = new int[N][M];

        // 사무실 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                office[i][j] = Integer.parseInt(st.nextToken());
                if (office[i][j] >= 1 && office[i][j] <= 5) {
                    cctvs.add(new CCTV(i, j, office[i][j]));
                }
            }
        }

        // 백트래킹으로 모든 경우의 수 탐색
        dfs(0, office);

        // 최소 사각지대 출력
        System.out.println(minBlindSpot);
    }

    // 모든 CCTV 방향 설정 후 사각지대 최소 구하기
    static void dfs(int cctvIdx, int[][] map) {
        if (cctvIdx == cctvs.size()) {
            minBlindSpot = Math.min(minBlindSpot, countBlindSpot(map));
            return;
        }

        CCTV cctv = cctvs.get(cctvIdx);
        int[][] backupMap;

        // CCTV 유형별 감시 방향 처리
        for (int[] directions : getDirections(cctv.type)) {
            backupMap = copyMap(map);
            for (int dir : directions) {
                watch(cctv.x, cctv.y, dir, backupMap);
            }
            dfs(cctvIdx + 1, backupMap);
        }
    }

    // CCTV의 감시 방향 설정
    static int[][] getDirections(int type) {
        switch (type) {
            case 1: return new int[][]{{0}, {1}, {2}, {3}}; // 한 방향
            case 2: return new int[][]{{0, 2}, {1, 3}}; // 반대 방향
            case 3: return new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}}; // 직각 방향
            case 4: return new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 3, 0}, {3, 0, 1}}; // 세 방향
            case 5: return new int[][]{{0, 1, 2, 3}}; // 네 방향
        }
        return new int[0][];
    }

    // 감시 영역 표시
    static void watch(int x, int y, int dir, int[][] map) {
        int nx = x, ny = y;
        while (true) {
            nx += dirX[dir];
            ny += dirY[dir];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M || map[nx][ny] == 6) break; // 벽 만나면 중단
            if (map[nx][ny] == 0) map[nx][ny] = 9; // 감시 영역
        }
    }

    // 사각지대 개수 세기
    static int countBlindSpot(int[][] map) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) count++;
            }
        }
        return count;
    }

    // 맵 복사
    static int[][] copyMap(int[][] map) {
        int[][] newMap = new int[N][M];
        for (int i = 0; i < N; i++) {
            newMap[i] = map[i].clone();
        }
        return newMap;
    }
}
