package defpackage;

import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class byq {
    public final Object b;

    public byq(Object obj) {
        this.b = obj;
    }

    public byn a(int i) {
        return null;
    }

    public byn b(int i) {
        return null;
    }

    public boolean d(int i, int i2, Bundle bundle) {
        return false;
    }

    public byq() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = new byp(this);
        } else {
            this.b = new byo(this);
        }
    }

    public void c(int i, byn bynVar, String str, Bundle bundle) {
    }
}
