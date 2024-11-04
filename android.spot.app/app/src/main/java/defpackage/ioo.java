package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ioo implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public ioo(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new iop(parcel, (ClassLoader) null);
            case 1:
                return new ink(parcel, null);
            case 2:
                return new ipd(parcel, null);
            case 3:
                return new iri(parcel, null);
            case 4:
                return new irq(parcel, null);
            case 5:
                return new isv(parcel, null);
            case 6:
                return new iwo(parcel, null);
            default:
                return new iyg(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new iop[i];
            case 1:
                return new ink[i];
            case 2:
                return new ipd[i];
            case 3:
                return new iri[i];
            case 4:
                return new irq[i];
            case 5:
                return new isv[i];
            case 6:
                return new iwo[i];
            default:
                return new iyg[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new iop(parcel, classLoader);
            case 1:
                return new ink(parcel, classLoader);
            case 2:
                return new ipd(parcel, classLoader);
            case 3:
                return new iri(parcel, classLoader);
            case 4:
                return new irq(parcel, classLoader);
            case 5:
                return new isv(parcel, classLoader);
            case 6:
                return new iwo(parcel, classLoader);
            default:
                return new iyg(parcel, classLoader);
        }
    }
}
