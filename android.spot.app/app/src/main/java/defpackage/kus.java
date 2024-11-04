package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kus implements Parcelable {
    public static final Parcelable.Creator CREATOR = new hlg(8);
    public final List a;
    public final String b;

    public kus(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.a = arrayList;
        this.b = parcel.readString();
    }

    public static String a(ktp ktpVar) {
        String str = ktpVar.a().a;
        int lastIndexOf = str.lastIndexOf(46);
        boolean z = false;
        if (lastIndexOf != -1 && lastIndexOf < str.length() - 1) {
            z = true;
        }
        hwx.X(z, "Expected service name %s to have the form path.to.ServiceName", str);
        return str.substring(lastIndexOf + 1);
    }

    public static String c(String str) {
        if (str.length() > 31) {
            return str.substring(0, 31);
        }
        return str;
    }

    public final String b() {
        return c(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeString(this.b);
    }

    public kus(ktp ktpVar) {
        this.a = ktpVar.d();
        this.b = a(ktpVar);
    }
}
