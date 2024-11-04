package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fld extends dug implements fle {
    private int a;

    /* JADX INFO: Access modifiers changed from: protected */
    public fld(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        fma.aF(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] c(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.fle
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        fmn f;
        if (obj != null && (obj instanceof fle)) {
            try {
                fle fleVar = (fle) obj;
                if (fleVar.e() != this.a || (f = fleVar.f()) == null) {
                    return false;
                }
                return Arrays.equals(x(), (byte[]) fmm.b(f));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    @Override // defpackage.fle
    public final fmn f() {
        return new fmm(x());
    }

    public final int hashCode() {
        return this.a;
    }

    public abstract byte[] x();

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int i2 = this.a;
            parcel2.writeNoException();
            parcel2.writeInt(i2);
        } else {
            fmn f = f();
            parcel2.writeNoException();
            duh.d(parcel2, f);
        }
        return true;
    }

    public fld() {
        super("com.google.android.gms.common.internal.ICertData");
    }
}
