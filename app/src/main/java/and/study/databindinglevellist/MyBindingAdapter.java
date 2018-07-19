package and.study.databindinglevellist;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

public class MyBindingAdapter {

    @BindingAdapter("imgLevel")
    public static void setImgLevel(ImageView view, Integer level) {
        view.setImageLevel(level);
    }
}
