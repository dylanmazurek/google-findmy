package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.adm.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvu extends bvy {
    public bvu(Class cls) {
        super(R.id.tag_accessibility_pane_title, cls, 8, 28);
    }

    @Override // defpackage.bvy
    public final /* synthetic */ Object a(View view) {
        return bwg.a(view);
    }

    @Override // defpackage.bvy
    public final /* synthetic */ void b(View view, Object obj) {
        bwg.f(view, (CharSequence) obj);
    }

    @Override // defpackage.bvy
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        if (!TextUtils.equals((CharSequence) obj, (CharSequence) obj2)) {
            return true;
        }
        return false;
    }
}
