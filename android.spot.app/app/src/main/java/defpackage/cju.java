package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cju implements cjx {
    public final Set a = new LinkedHashSet();

    public cju(cjy cjyVar) {
        cjyVar.b("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.cjx
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
        return bundle;
    }
}
