package defpackage;

import android.graphics.Typeface;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvw {
    public final int a;
    public final Object b;

    public kvw(int i) {
        this.b = null;
        this.a = i;
    }

    public static kvw a(int i, mca mcaVar) {
        if (i != 4) {
            i = 5;
        }
        hwx.U(true);
        mcaVar.getClass();
        return new kvw(i, mcaVar);
    }

    public static kvw b(int i) {
        hwx.U(true);
        return new kvw(i, (mca) null);
    }

    public static kvw c(String str, int i) {
        if (str == null) {
            str = "";
        }
        return new kvw(str, i);
    }

    private kvw(int i, mca mcaVar) {
        this.a = i;
        this.b = mcaVar;
    }

    public kvw(Typeface typeface) {
        this.b = typeface;
        this.a = 0;
    }

    public kvw(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public kvw(ConnectionResult connectionResult, int i) {
        fma.aR(connectionResult);
        this.b = connectionResult;
        this.a = i;
    }
}
