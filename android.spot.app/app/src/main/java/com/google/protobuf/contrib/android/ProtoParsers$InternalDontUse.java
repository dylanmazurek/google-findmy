package com.google.protobuf.contrib.android;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hlg;
import defpackage.hwx;
import defpackage.liv;
import defpackage.lkq;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ProtoParsers$InternalDontUse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new hlg(9);
    public volatile byte[] a;
    public volatile lkq b;

    public ProtoParsers$InternalDontUse(byte[] bArr, lkq lkqVar) {
        boolean z = true;
        if (bArr == null && lkqVar == null) {
            z = false;
        }
        hwx.K(z, "Must have a message or bytes");
        this.a = bArr;
        this.b = lkqVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            byte[] bArr = new byte[this.b.j()];
            try {
                this.b.cA(liv.af(bArr));
                this.a = bArr;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }
}
