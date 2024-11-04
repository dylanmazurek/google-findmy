package com.google.android.gms.feedback;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.fma;
import defpackage.fnq;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ServiceDumpRequest extends AbstractSafeParcelable {
    public static final fnq CREATOR = new fnq(0);
    public final String a;
    public final String[] b;
    public final int c;
    public final boolean d;

    public ServiceDumpRequest(String str, String[] strArr, int i, boolean z) {
        str.getClass();
        this.a = str;
        this.b = strArr;
        if (i != 2 && i != 1) {
            throw new IllegalArgumentException(a.ae(i, "Unknown expected output format="));
        }
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ServiceDumpRequest serviceDumpRequest = (ServiceDumpRequest) obj;
            if (this.d == serviceDumpRequest.d && this.c == serviceDumpRequest.c && this.a.equals(serviceDumpRequest.a) && Arrays.equals(this.b, serviceDumpRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a, Boolean.valueOf(this.d), Integer.valueOf(this.c)) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "ServiceDumpRequest{service='" + this.a + "', dumpsysFlags=" + Arrays.toString(this.b) + ", expectedOutputFormat=" + this.c + ", showOutputToUser=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.X(parcel, 2, this.a);
        fma.Y(parcel, 3, this.b);
        fma.L(parcel, 4, this.c);
        fma.G(parcel, 5, this.d);
        fma.F(parcel, D);
    }
}
