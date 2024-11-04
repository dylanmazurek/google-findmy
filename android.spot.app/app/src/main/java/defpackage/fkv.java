package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkv {
    public static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String b;
    public final String c;
    public final ComponentName d;
    public final int e;
    public final boolean f;

    public fkv(ComponentName componentName) {
        this.b = null;
        this.c = null;
        fma.aR(componentName);
        this.d = componentName;
        this.e = 4225;
        this.f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkv)) {
            return false;
        }
        fkv fkvVar = (fkv) obj;
        if (amr.g(this.b, fkvVar.b) && amr.g(this.c, fkvVar.c) && amr.g(this.d, fkvVar.d)) {
            int i = fkvVar.e;
            if (this.f == fkvVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, 4225, Boolean.valueOf(this.f)});
    }

    public final String toString() {
        String str = this.b;
        if (str == null) {
            fma.aR(this.d);
            return this.d.flattenToString();
        }
        return str;
    }

    public fkv(String str, boolean z) {
        fma.aP(str);
        this.b = str;
        fma.aP("com.google.android.gms");
        this.c = "com.google.android.gms";
        this.d = null;
        this.e = 4225;
        this.f = z;
    }
}
