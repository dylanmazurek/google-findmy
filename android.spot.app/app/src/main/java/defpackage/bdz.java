package defpackage;

import android.view.View;
import com.google.android.apps.adm.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdz {
    public static final Map a = new LinkedHashMap();

    public static final abt a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof abt) {
            return (abt) tag;
        }
        return null;
    }

    public static final void b(View view, abt abtVar) {
        view.setTag(R.id.androidx_compose_ui_view_composition_context, abtVar);
    }
}
