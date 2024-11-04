package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsa {
    public final fsf a;

    public fsa(fsf fsfVar) {
        fma.aR(fsfVar);
        this.a = fsfVar;
    }

    public final LatLng a() {
        try {
            fsf fsfVar = this.a;
            Parcel b = fsfVar.b(4, fsfVar.a());
            LatLng latLng = (LatLng) duh.a(b, LatLng.CREATOR);
            b.recycle();
            return latLng;
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }

    public final void b(LatLng latLng) {
        try {
            fsf fsfVar = this.a;
            Parcel a = fsfVar.a();
            duh.c(a, latLng);
            fsfVar.c(3, a);
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.os.IInterface, java.lang.Object] */
    public final void c(bym bymVar) {
        try {
            ?? r3 = bymVar.a;
            fsf fsfVar = this.a;
            Parcel a = fsfVar.a();
            duh.d(a, r3);
            fsfVar.c(18, a);
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fsa)) {
            return false;
        }
        try {
            fsf fsfVar = this.a;
            fsf fsfVar2 = ((fsa) obj).a;
            Parcel a = fsfVar.a();
            duh.d(a, fsfVar2);
            Parcel b = fsfVar.b(16, a);
            boolean e = duh.e(b);
            b.recycle();
            return e;
        } catch (RemoteException e2) {
            throw new fsc(e2);
        }
    }

    public final int hashCode() {
        try {
            fsf fsfVar = this.a;
            Parcel b = fsfVar.b(17, fsfVar.a());
            int readInt = b.readInt();
            b.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }
}
