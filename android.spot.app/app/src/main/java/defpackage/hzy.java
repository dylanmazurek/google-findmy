package defpackage;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hzy implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hzy(hzz hzzVar, int i) {
        this.b = i;
        this.a = hzzVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        CharSequence convertSelectionToString;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                View view2 = null;
                if (i < 0) {
                    ky kyVar = ((ixz) this.a).a;
                    if (!kyVar.x()) {
                        item = null;
                    } else {
                        item = kyVar.e.getSelectedItem();
                    }
                } else {
                    item = ((ixz) this.a).getAdapter().getItem(i);
                }
                ixz ixzVar = (ixz) this.a;
                convertSelectionToString = ixzVar.convertSelectionToString(item);
                ixzVar.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = ((ixz) this.a).getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        ky kyVar2 = ((ixz) this.a).a;
                        if (kyVar2.x()) {
                            view2 = kyVar2.e.getSelectedView();
                        }
                        view = view2;
                        ky kyVar3 = ((ixz) this.a).a;
                        i = kyVar3.o();
                        if (!kyVar3.x()) {
                            j = Long.MIN_VALUE;
                        } else {
                            j = kyVar3.e.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(((ixz) this.a).a.e, view, i, j);
                }
                ((ixz) this.a).a.m();
                return;
            }
            ((ir) this.a).d.setSelection(i);
            if (((ir) this.a).d.getOnItemClickListener() != null) {
                ir irVar = (ir) this.a;
                irVar.d.performItemClick(view, i, irVar.b.getItemId(i));
            }
            ((ky) this.a).m();
            return;
        }
        hzx hzxVar = (hzx) adapterView.getItemAtPosition(i);
        LicenseMenuActivity licenseMenuActivity = ((hzz) this.a).b;
        if (licenseMenuActivity != null) {
            Intent intent = new Intent(licenseMenuActivity, (Class<?>) LicenseActivity.class);
            intent.putExtra("license", hzxVar);
            licenseMenuActivity.startActivity(intent);
        }
    }

    public hzy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
