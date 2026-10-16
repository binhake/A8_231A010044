package vn.edu.vhu.ltdd.a8fragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * NC2: lưu tin vừa đọc ở mức Activity.
 * NewsListFragment bị hủy khi chuyển tab, nhưng ViewModel lấy từ requireActivity()
 * vẫn còn, nên quay lại tab Tin tức vẫn thấy dòng "Đã đọc: ...".
 */
public class TinTucViewModel extends ViewModel {

    private final MutableLiveData<String> tinDaDoc = new MutableLiveData<>();

    public LiveData<String> getTinDaDoc() {
        return tinDaDoc;
    }

    public void setTinDaDoc(String tieuDe) {
        tinDaDoc.setValue(tieuDe);
    }
}
