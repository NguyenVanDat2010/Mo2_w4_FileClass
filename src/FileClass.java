import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        /* Tạo một đối tượng File đại diện cho một file đang tồn tại: */
        File file = new File("foo.txt");

        /* Tạo một thư mục mới:  */
        File dir = new File("Books");
        dir.mkdir();

        /* Liệt kê nội dung của một thư mục:  */
        if (dir.isDirectory()) {
            String[] dirContents = dir.list();
            for (int i = 0; i < dirContents.length; i++) {
                System.out.println(dirContents[i]);
            }
        }

        /*Lấy đường dẫn tuyệt đối của file hoặc thư mục:  */
        System.out.println(dir.getAbsolutePath());

        /* Xóa file hoặc thư mục (trả về true nếu thành công):     */
        boolean isDeleted = dir.delete();
//        System.out.println(isDeleted);
    }
}
