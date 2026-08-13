class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<9; i++){
            int[] freq = new int[9];
            for(int j = 0; j<9; j++){
                int x = board[i][j];
                if(x >= '1' && x <= '9'){
                    freq[x-'1']++;
                    if(freq[x-'1']>1) return false;
                }
            }
        }
        for(int i = 0; i<9; i++){
            int[] freq = new int[9];
            for(int j = 0; j<9; j++){
                int x = board[j][i];
                if(x >= '1' && x <= '9'){
                    freq[x-'1']++;
                    if(freq[x-'1']>1) return false;
                }
            }
        }
        for(int y = 0; y<3; y++){
        for(int z = 0; z<3; z++){
            int[] freq = new int[9];
            for(int i = 0; i<3; i++){
                for(int j = 0; j<3; j++){
                    int x = board[i+(z*3)][j+(y*3)];
                    if(x >= '1' && x <= '9'){
                        freq[x-'1']++;
                        if(freq[x-'1']>1) return false;
                    }
                }
            }
        }
        }
        return true;
    }
}
