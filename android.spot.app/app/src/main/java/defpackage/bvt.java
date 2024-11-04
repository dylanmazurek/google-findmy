package defpackage;

import android.view.View;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvt extends bvy {
    public bvt(Class cls) {
        super(R.id.tag_screen_reader_focusable, cls);
    }

    @Override // defpackage.bvy
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(bwg.j(view));
    }

    @Override // defpackage.bvy
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        bwg.h(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.bvy
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        if (!f((Boolean) obj, (Boolean) obj2)) {
            return true;
        }
        return false;
    }
}
