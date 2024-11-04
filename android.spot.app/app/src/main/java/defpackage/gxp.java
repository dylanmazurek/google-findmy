package defpackage;

import android.os.Bundle;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxp {
    public final int a = 2;
    private final List b = null;
    private final Bundle c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxp)) {
            return false;
        }
        gxp gxpVar = (gxp) obj;
        int i = gxpVar.a;
        List list = gxpVar.b;
        if (!amr.i(null, null)) {
            return false;
        }
        Bundle bundle = gxpVar.c;
        if (amr.i(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        a.V(2);
        return 1922;
    }

    public final String toString() {
        return "ClickBehavior(behaviorType=BACKGROUND, activityIntents=null, appProvidedData=null)";
    }
}
