package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ewd;
import defpackage.fma;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ewd(16);
    public final Intent a;

    public CloudMessage(Intent intent) {
        this.a = intent;
    }

    public final Integer a() {
        if (this.a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    public final String b() {
        String stringExtra = this.a.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return this.a.getStringExtra("message_id");
        }
        return stringExtra;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.W(parcel, 1, this.a, i);
        fma.F(parcel, D);
    }
}
