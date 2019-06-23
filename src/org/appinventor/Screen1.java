package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Image;
class Screen1 extends Form implements HandlesEventDispatching {
  private TextBox TextBox1;
  private Button Button3;
  private Button Button2;
  private Button Button1;
  private Image Image1;
  protected void $define() {
    this.AppName("ECOGENETICS");
    this.Title("Screen1");
    TextBox1 = new TextBox(this);
    TextBox1.Hint("Hint for TextBox1");
    Button3 = new Button(this);
    Button3.Text("Upload to Cloud");
    Button2 = new Button(this);
    Button2.Text("Getting Results");
    Button1 = new Button(this);
    Button1.Text("Send and analysis");
    Image1 = new Image(this);
    Image1.Height(100);
    Image1.Width(-1100);
    Image1.Picture("istockphoto-1076544354-1024x1024.jpg");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}