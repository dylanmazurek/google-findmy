package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmn {
    public View b;
    public final Map a = new HashMap();
    final ArrayList c = new ArrayList();

    @Deprecated
    public cmn() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cmn) {
            cmn cmnVar = (cmn) obj;
            if (this.b == cmnVar.b && this.a.equals(cmnVar.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        String concat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n").concat("    values:");
        for (String str : this.a.keySet()) {
            concat = concat + "    " + str + ": " + this.a.get(str) + "\n";
        }
        return concat;
    }

    public cmn(View view) {
        this.b = view;
    }
}
