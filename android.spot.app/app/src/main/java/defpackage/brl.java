package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.adm.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brl {
    public static void a(Resources.Theme theme) {
        theme.rebase();
    }

    public static final void b(View view) {
        Iterator a = new bwu(new bwv(view, null), 3).a();
        while (a.hasNext()) {
            c((View) a.next()).c();
        }
    }

    public static final bym c(View view) {
        bym bymVar = (bym) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (bymVar == null) {
            bym bymVar2 = new bym((byte[]) null);
            view.setTag(R.id.pooling_container_listener_holder_tag, bymVar2);
            return bymVar2;
        }
        return bymVar;
    }
}
