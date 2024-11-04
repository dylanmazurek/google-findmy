package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fwf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConsentInformation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;
    private final List c;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class AccountConsentInformation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new fwf(16);
        public final String a;
        public final byte[] b;
        public final List c;

        public AccountConsentInformation(String str, byte[] bArr, List list) {
            ArrayList arrayList;
            this.a = str;
            this.b = bArr;
            if (list == null) {
                arrayList = new ArrayList(0);
            } else {
                arrayList = new ArrayList(list);
            }
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccountConsentInformation)) {
                return false;
            }
            AccountConsentInformation accountConsentInformation = (AccountConsentInformation) obj;
            if (amr.g(this.a, accountConsentInformation.a) && amr.g(this.b, accountConsentInformation.b) && amr.g(this.c, accountConsentInformation.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int D = fma.D(parcel);
            fma.X(parcel, 1, str);
            fma.I(parcel, 2, this.b, false);
            ArrayList arrayList = new ArrayList(this.c);
            int E = fma.E(parcel, 3);
            int size = arrayList.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) arrayList.get(i2)).intValue());
            }
            fma.F(parcel, E);
            fma.F(parcel, D);
        }
    }

    static {
        new ConsentInformation(null, false, false);
        CREATOR = new fwf(17);
    }

    public ConsentInformation(List list, boolean z, boolean z2) {
        ArrayList arrayList;
        if (list == null) {
            arrayList = new ArrayList(0);
        } else {
            arrayList = new ArrayList(list);
        }
        this.c = arrayList;
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentInformation)) {
            return false;
        }
        ConsentInformation consentInformation = (ConsentInformation) obj;
        if (amr.g(this.c, consentInformation.c) && amr.g(Boolean.valueOf(this.a), Boolean.valueOf(consentInformation.a))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.ab(parcel, 1, new ArrayList(this.c));
        fma.G(parcel, 2, this.a);
        fma.G(parcel, 3, this.b);
        fma.F(parcel, D);
    }
}
