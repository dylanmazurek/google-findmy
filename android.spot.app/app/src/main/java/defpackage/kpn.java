package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpn extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hlg(5);
    public final Uri a;
    public final Uri b;
    public final List c;

    public kpn(Uri uri, Uri uri2, List list) {
        this.a = uri;
        this.b = uri2;
        this.c = list == null ? new ArrayList() : list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int D = fma.D(parcel);
        fma.W(parcel, 1, uri, i);
        fma.W(parcel, 2, this.b, i);
        fma.ab(parcel, 3, this.c);
        fma.F(parcel, D);
    }
}
