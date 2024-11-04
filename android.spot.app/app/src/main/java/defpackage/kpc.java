package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpc extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hlg(4);
    public final String a;
    public final String b;
    public final int c;
    public long d;
    public final Uri e;
    private final Bundle f;

    public kpc(String str, String str2, int i, long j, Bundle bundle, Uri uri) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.f = bundle;
        this.e = uri;
    }

    public final Bundle a() {
        Bundle bundle = this.f;
        if (bundle == null) {
            return new Bundle();
        }
        return bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.X(parcel, 1, this.a);
        fma.X(parcel, 2, this.b);
        fma.L(parcel, 3, this.c);
        fma.M(parcel, 4, this.d);
        fma.O(parcel, 5, a());
        fma.W(parcel, 6, this.e, i);
        fma.F(parcel, D);
    }
}
