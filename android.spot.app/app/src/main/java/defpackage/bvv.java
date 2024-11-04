package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bvv extends bvy {
    public bvv(Class cls) {
        super(R.id.tag_state_description, cls, 64, 30);
    }

    @Override // defpackage.bvy
    public final /* synthetic */ Object a(View view) {
        return bwi.b(view);
    }

    @Override // defpackage.bvy
    public final /* synthetic */ void b(View view, Object obj) {
        bwi.d(view, (CharSequence) obj);
    }

    @Override // defpackage.bvy
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        if (!TextUtils.equals((CharSequence) obj, (CharSequence) obj2)) {
            return true;
        }
        return false;
    }
}
