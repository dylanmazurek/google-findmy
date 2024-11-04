package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frz {
    public final fse a;

    public frz(fse fseVar) {
        fma.aR(fseVar);
        this.a = fseVar;
    }

    public final void a(boolean z) {
        try {
            fse fseVar = this.a;
            Parcel a = fseVar.a();
            int i = duh.a;
            a.writeInt(z ? 1 : 0);
            fseVar.c(15, a);
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof frz)) {
            return false;
        }
        try {
            fse fseVar = this.a;
            fse fseVar2 = ((frz) obj).a;
            Parcel a = fseVar.a();
            duh.d(a, fseVar2);
            Parcel b = fseVar.b(17, a);
            boolean e = duh.e(b);
            b.recycle();
            return e;
        } catch (RemoteException e2) {
            throw new fsc(e2);
        }
    }

    public final int hashCode() {
        try {
            fse fseVar = this.a;
            Parcel b = fseVar.b(18, fseVar.a());
            int readInt = b.readInt();
            b.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }
}
