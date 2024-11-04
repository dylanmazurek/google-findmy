package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator CREATOR = new h(1);
    final int[] a;
    final ArrayList b;
    final int[] c;
    final int[] d;
    final int e;
    final String f;
    final int g;
    final int h;
    final CharSequence i;
    final int j;
    final CharSequence k;
    final ArrayList l;
    final ArrayList m;
    final boolean n;

    public g(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public g(f fVar) {
        int size = fVar.d.size();
        this.a = new int[size * 6];
        if (fVar.j) {
            this.b = new ArrayList(size);
            this.c = new int[size];
            this.d = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                bm bmVar = (bm) fVar.d.get(i2);
                int i3 = i + 1;
                this.a[i] = bmVar.a;
                ArrayList arrayList = this.b;
                ag agVar = bmVar.b;
                arrayList.add(agVar != null ? agVar.l : null);
                int[] iArr = this.a;
                iArr[i3] = bmVar.c ? 1 : 0;
                iArr[i + 2] = bmVar.d;
                iArr[i + 3] = bmVar.e;
                int i4 = i + 5;
                iArr[i + 4] = bmVar.f;
                i += 6;
                iArr[i4] = bmVar.g;
                this.c[i2] = bmVar.h.ordinal();
                this.d[i2] = bmVar.i.ordinal();
            }
            this.e = fVar.i;
            this.f = fVar.l;
            this.g = fVar.c;
            this.h = fVar.m;
            this.i = fVar.n;
            this.j = fVar.o;
            this.k = fVar.p;
            this.l = fVar.q;
            this.m = fVar.r;
            this.n = fVar.s;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }
}
