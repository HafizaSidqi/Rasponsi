
package responsi;

public class MVUpdate {
    //untuk menghubungkan 3 kelas view model dan controller
    Update update = new Update();
    UpdateModel model = new UpdateModel();
    UpdateController controller = new UpdateController(model, update);
}
