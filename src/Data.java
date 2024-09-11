public class Data {
    public static void main(String[] args) {
        int x = 10; // 기본형
        int y = x; // 값 복사
        y = 20; // y 값을 변경

        int[] arr1 = {1, 2, 3}; // 참조형
        int[] arr2 = arr1; // 주소 복사
        arr2[0] = 100; // arr2를 통한 값 변경

        arr1[1] = 200;

        System.out.println("x: " + x); // x는 10으로 유지
        System.out.println("y: " + y); // y는 20으로 변경
        System.out.println("arr1[0]: " + arr1[0]); // arr1[0]도 100으로 변경 (arr1과 arr2는 같은 배열을 참조)

        System.out.println("arr2[1]:" + arr2[1]);
    }
}