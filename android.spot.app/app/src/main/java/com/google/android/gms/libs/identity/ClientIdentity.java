package com.google.android.gms.libs.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fnp;
import defpackage.hwx;
import defpackage.jis;
import defpackage.jmi;
import defpackage.moz;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnp(17);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final ClientIdentity f;

    static {
        Process.myUid();
        Process.myPid();
    }

    public ClientIdentity(int i, String str, String str2, String str3, List list, ClientIdentity clientIdentity) {
        if (clientIdentity != null && clientIdentity.f != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        if (str3 == null) {
            if (clientIdentity != null) {
                str3 = clientIdentity.d;
            } else {
                str3 = null;
            }
        }
        this.d = str3;
        if (list == null) {
            list = clientIdentity != null ? clientIdentity.e : null;
            if (list == null) {
                int i2 = jis.d;
                list = jmi.a;
                list.getClass();
            }
        }
        this.e = hwx.p(list);
        this.f = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ClientIdentity) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            if (this.a == clientIdentity.a && amr.i(this.b, clientIdentity.b) && amr.i(this.c, clientIdentity.c) && amr.i(this.d, clientIdentity.d) && amr.i(this.f, clientIdentity.f) && amr.i(this.e, clientIdentity.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.f});
    }

    public final String toString() {
        int i;
        String str = this.c;
        int i2 = 0;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder(this.b.length() + 18 + i);
        sb.append(this.a);
        sb.append("/");
        sb.append(this.b);
        String str2 = this.c;
        if (str2 != null) {
            sb.append("[");
            if (moz.I(str2, this.b)) {
                String str3 = this.b;
                sb.append((CharSequence) str2, str3.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        if (this.d != null) {
            sb.append("/");
            String str4 = this.d;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            sb.append(Integer.toHexString(i2));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int i2 = this.a;
        int D = fma.D(parcel);
        fma.L(parcel, 1, i2);
        fma.X(parcel, 3, this.b);
        fma.X(parcel, 4, this.c);
        fma.X(parcel, 6, this.d);
        fma.W(parcel, 7, this.f, i);
        fma.ab(parcel, 8, this.e);
        fma.F(parcel, D);
    }
}
