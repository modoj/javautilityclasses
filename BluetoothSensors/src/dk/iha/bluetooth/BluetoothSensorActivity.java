package dk.iha.bluetooth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class BluetoothSensorActivity extends Activity {

  /** Called when the activity is first created. */
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    Intent intent = new Intent(this, BluetoothSensorService.class);
    intent.putExtra(BluetoothSensorService.REQUEST_CODE, BluetoothSensorService.REQUEST_CODE_START);
    startService(intent);
  }
}