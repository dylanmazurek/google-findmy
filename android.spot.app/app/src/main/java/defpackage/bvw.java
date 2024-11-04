package defpackage;

import android.view.View;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvw extends bvy {
    public bvw(Class cls) {
        super(R.id.tag_accessibility_heading, cls);
    }

    @Override // defpackage.bvy
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(bwg.i(view));
    }

    @Override // defpackage.bvy
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        bwg.e(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.bvy
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        if (!f((Boolean) obj, (Boolean) obj2)) {
            return true;
        }
        return false;
    }
}
