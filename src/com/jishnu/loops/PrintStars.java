package com.jishnu.loops;

import javax.swing.*;

public class PrintStars {
    public static void main(String[] args) {
        pattern27(5);
//        pattern7(5);
//        pattern21(7);
//        pattern17(7);
//        pattern15(5);
//        pattern14(5);
//        pattern13();
//        pattern9();
//        pattern6();
//        rightAlignedRisePyramidInverted();
//        rightAlignedRisePyramid();
//        pyramidRise();
//        System.out.println("\n\n------------\n\n");
//        pyramidFall();
//        System.out.println("\n\n------------\n\n");
//
//        printLine();
//        System.out.println("\n\n------------\n\n");
//        printSquare();
    }

    public static void pattern27(int n) {
        int total_rows = n;
        int row = 1;

        while (row <= total_rows) {
            int star = 1;
            int space = 0;
            int numberToPrint = 1;

            while (space < n - row) {
                System.out.print("\t");
                space++;
            }

            while (star <= 2 * row - 1) {
                System.out.print(numberToPrint + "\t");
                if (star < row){
                    numberToPrint++;
                }else{
                    numberToPrint--;
                }
                star++;
            }

            System.out.println();
            row++;
        }
    }


    public static void pattern8(int n) {
        int total_row = n;
        int row = 1;
        int changingPoint = (n + 1) / 2;
        while (row <= total_row) {

            int spaceL = 0;
            int spaceR = 0;
            int starPositionL = row;
            int starPositionR = total_row - row + 1;
            int cursorPosition = 1;

            if (row < changingPoint) {
                while (cursorPosition <= n) {
                    while (spaceL < changingPoint - row) {
                        System.out.print("  ");
                        spaceL++;
                        cursorPosition++;
                    }

                    if (cursorPosition == starPositionL) {
                        System.out.print("* ");
                        cursorPosition++;
                    }

                    while (spaceR < changingPoint - row) {
                        System.out.print("  ");
                        spaceL++;
                        cursorPosition++;
                    }


                }

            } else if (row == changingPoint) {

            } else {

            }


            System.out.println();
            row++;
        }
    }

    public static void pattern7(int n) {
        int total_rows = n;
        int row = 1;

        while (row <= total_rows) {
            int stars = 1;
            int space = 0;
            if (row == 1 || row == n) {
                while (stars <= n) {
                    System.out.print("* ");
                    stars++;
                }
            } else {
                System.out.print("* ");

                while (space < n - 2) {
                    System.out.print("  ");
                    space++;
                }

                System.out.print("* ");
            }

            System.out.println();
            row++;
        }
    }

    private static void pattern21(int n) {
        int total_rows = n;
        int row = 1;
        int total_elements_in_1_line = 2 * n - 1;
        while (row <= total_rows) {
            int starLeft = 1;
            int starRight = 1;
            int space = 0;
            int total_star_on_1_side = row;
            int total_space = total_elements_in_1_line - 2 * row;

            while (starLeft <= total_star_on_1_side) {
                System.out.print("* ");
                starLeft++;
            }

            while (space < total_space) {
                System.out.print("  ");
                space++;
            }

            if (row == n) {
                starRight++;
            }
            while (starRight <= row) {
                System.out.print("* ");
                starRight++;
            }

            System.out.println();
            row++;
        }
    }

    private static void pattern17(int n) {
        int total_rows = n;
        int row = 1;
        int changingPoint = (n + 1) / 2;

        while (row <= total_rows) {
            int starLeft = 0;
            int starRight = 0;
            int space = 1;

            if (row <= changingPoint) {
                while (starLeft < changingPoint - row) {
                    System.out.print("* ");
                    starLeft++;
                }

                while (space <= row * 2 - 1) {
                    System.out.print("  ");
                    space++;
                }

                while (starRight < changingPoint - row) {
                    System.out.print("* ");
                    starRight++;
                }
            } else {
                while (starLeft < row - changingPoint) {
                    System.out.print("* ");
                    starLeft++;
                }

                while (space <= 2 * (total_rows - row) + 1) {
                    System.out.print("  ");
                    space++;
                }

                while (starRight < row - changingPoint) {
                    System.out.print("* ");
                    starRight++;
                }

            }

            System.out.println();
            row++;
        }
    }

    public static void pattern15(int n) {

        int total_rows = 2 * n - 1;
        int row = 1;

        while (row <= total_rows) {
            int space = 0;
            int star = 1;
            if (row <= n) {
                while (space < row * 2 - 2) {
                    System.out.print("  ");
                    space++;
                }

                while (star <= n - row + 1) {
                    System.out.print("* ");
                    star++;
                }
            } else {
                while (space < 2 * (total_rows - row)) {
                    System.out.print("  ");
                    space++;
                }

                while (star <= row - n + 1) {
                    System.out.print("* ");
                    star++;
                }
            }

            System.out.println();
            row++;
        }
    }

    public static void pattern14(int n) {

        int total_row = 2 * n - 1;
        int changing_row_index = n;
        int row = 1;

        while (row <= total_row) {
            int space = 0;
            int star = 1;

            if (row <= changing_row_index) {
                while (space < n - row) {
                    System.out.print("  ");
                    space++;
                }

                while (star <= row) {
                    System.out.print("* ");
                    star++;
                }

            } else {
                while (space < row - n) {
                    System.out.print("  ");
                    space++;
                }

                while (star <= total_row - row + 1) {
                    System.out.print("* ");
                    star++;
                }

            }

            System.out.println();
            row++;
        }
    }

    public static void pattern13() {

        int total_row = 9;
        int row = 1;

        while (row <= total_row) {
            int star = 1;
            if (row < (total_row + 1) / 2) {
                while (star <= row) {
                    System.out.print("*");
                    star++;
                }
            } else {
                while (star <= total_row - row + 1) {
                    System.out.print("*");
                    star++;
                }
            }
            System.out.println();
            row++;
        }
    }

    public static void pattern9() {
        int total_rows = 5;
        int row = 1;

        while (row <= total_rows) {
            int space = 0;
            int star = 1;

            while (space <= total_rows - row) {
                System.out.print("  ");
                space++;
            }

            while (star <= row * 2 - 1) {
                System.out.print("* ");
                star++;
            }

            System.out.println();
            row++;
        }
    }

    public static void pattern6() {

        int total_rows = 5;
        int row = 1;

        while (row <= total_rows) {
            int star = 1;
            int space = 0;

            while (space < row * 2 - 2) {
                System.out.print("  ");
                space++;
            }

            while (star <= total_rows - row + 1) {
                System.out.print("* ");
                star++;
            }

            System.out.println();
            row++;
        }
    }

    public static void rightAlignedRisePyramidInverted() {
        int total_rows = 7;
        int row = 1;
        while (row <= total_rows) {
            int space = 0;
            int stars = 1;

            while (space < row) {
                System.out.print(" ");
                space++;
            }

            while (stars <= total_rows - row + 1) {
                System.out.print("*");
                stars++;
            }

            System.out.println();
            row++;
        }
    }

    public static void rightAlignedRisePyramid() {
        int total_rows = 7;
        int row = 1;
        while (row <= total_rows) {
            int space = 0;
            int stars = 1;

            while (space < total_rows - row) {
                System.out.print(" ");
                space++;
            }

            while (stars <= row) {
                System.out.print("*");
                stars++;
            }

            System.out.println();
            row++;
        }
    }

    public static void pyramidRise() {
        int total_rows = 5;
        int row = total_rows;
        while (row > 0) {
            int columns = 1;
            while (columns <= row) {
                System.out.print("* ");
                columns++;
            }

            System.out.println();
            row--;
        }
    }

    public static void pyramidFall() {
        int total_rows = 5;
        int row = 1;
        while (row <= total_rows) {
            int columns = 1;
            while (columns <= row) {
                System.out.print("* ");
                columns++;
            }

            System.out.println();
            row++;
        }
    }

    public static void printLine() {
        int count = 0;
        while (count < 5) {
            System.out.print("* ");
            count++;
        }
    }

    public static void printSquare() {
        int row = 0;
        while (row < 5) {
            int column = 0;
            while (column < 5) {
                System.out.print("* ");
                column++;
            }
            row++;
            System.out.println();
        }
    }
}
