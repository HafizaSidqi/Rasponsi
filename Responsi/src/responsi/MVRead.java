
package responsi;

public class MVRead {
    //untuk menghubungkan 3 kelas view model dan controller
    Read read = new Read();
    ReadModel model = new ReadModel();
    ReadController controller = new ReadController(model, read);
}
