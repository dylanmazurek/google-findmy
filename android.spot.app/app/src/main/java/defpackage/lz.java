package defpackage;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lz implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public lz(int i) {
        this.a = i;
    }

    public static final cad a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return cad.c;
        }
        throw new IllegalStateException("superState must be null");
    }

    public static final cpf b(Parcel parcel, ClassLoader classLoader) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new cpf(parcel, classLoader);
        }
        return new cpf(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        if (i == 0) {
            return new ma(parcel, null);
        }
        if (i == 1) {
            return new af(parcel, null);
        }
        if (i == 2) {
            return new ng(parcel, null);
        }
        if (i == 3) {
            return new bou(parcel, null);
        }
        if (i != 4) {
            return i != 5 ? b(parcel, null) : new coi(parcel, null);
        }
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                return new cpf[i];
                            }
                            return new coi[i];
                        }
                        return new cad[i];
                    }
                    return new bou[i];
                }
                return new ng[i];
            }
            return new af[i];
        }
        return new ma[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int i = this.a;
        if (i == 0) {
            return new ma(parcel, classLoader);
        }
        if (i == 1) {
            return new af(parcel, classLoader);
        }
        if (i == 2) {
            return new ng(parcel, classLoader);
        }
        if (i == 3) {
            return new bou(parcel, classLoader);
        }
        if (i != 4) {
            return i != 5 ? b(parcel, classLoader) : new coi(parcel, classLoader);
        }
        return a(parcel, classLoader);
    }
}
