package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gak implements Parcelable, dir {
    public static final Parcelable.Creator CREATOR = new hlg(1);
    public final String b;

    public gak(Parcel parcel) {
        this.b = parcel.readString();
    }

    @Override // defpackage.dir
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.dir
    public final boolean equals(Object obj) {
        if (obj instanceof gak) {
            return this.b.equals(((gak) obj).b);
        }
        return false;
    }

    @Override // defpackage.dir
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ProvidedFifeUrl{baseUrl='" + this.b + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }

    public gak(String str) {
        if (iac.a(str)) {
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("baseUrl is not a fife Url: ".concat(String.valueOf(str)));
    }
}
