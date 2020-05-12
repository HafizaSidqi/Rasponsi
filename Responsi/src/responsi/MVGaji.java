
package responsi;

public class MVGaji {
    //untuk menghubungkan 3 kelas view model dan controller
    Gaji gaji = new Gaji();
    GajiModel model = new GajiModel();
    GajiController controller = new GajiController(model, gaji);
}
