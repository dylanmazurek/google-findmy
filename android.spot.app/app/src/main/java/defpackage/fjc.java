package defpackage;

import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjc {
    public final fik a;
    public final Feature b;

    public fjc(fik fikVar, Feature feature) {
        this.a = fikVar;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fjc)) {
            fjc fjcVar = (fjc) obj;
            if (amr.g(this.a, fjcVar.a) && amr.g(this.b, fjcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        fma.aV("key", this.a, arrayList);
        fma.aV("feature", this.b, arrayList);
        return fma.aU(arrayList, this);
    }
}
