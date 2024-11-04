package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class inx implements Parcelable {
    public static final Parcelable.Creator CREATOR = new inw(0);
    public Integer A;
    public Integer B;
    public Integer C;
    public Boolean D;
    private Integer E;
    public int a;
    public Integer b;
    public Integer c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public Integer h;
    public int i;
    public String j;
    public int k;
    public int l;
    public int m;
    public Locale n;
    public CharSequence o;
    public CharSequence p;
    public int q;
    public int r;
    public Integer s;
    public Boolean t;
    public Integer u;
    public Integer v;
    public Integer w;
    public Integer x;
    public Integer y;
    public Integer z;

    public inx() {
        this.i = 255;
        this.k = -2;
        this.l = -2;
        this.m = -2;
        this.t = true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.a);
        parcel.writeSerializable(this.b);
        parcel.writeSerializable(this.c);
        parcel.writeSerializable(this.d);
        parcel.writeSerializable(this.e);
        parcel.writeSerializable(this.f);
        parcel.writeSerializable(this.g);
        parcel.writeSerializable(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        CharSequence charSequence = this.o;
        String str2 = null;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        CharSequence charSequence2 = this.p;
        if (charSequence2 != null) {
            str2 = charSequence2.toString();
        }
        parcel.writeString(str2);
        parcel.writeInt(this.q);
        parcel.writeSerializable(this.s);
        parcel.writeSerializable(this.u);
        parcel.writeSerializable(this.v);
        parcel.writeSerializable(this.w);
        parcel.writeSerializable(this.x);
        parcel.writeSerializable(this.y);
        parcel.writeSerializable(this.z);
        parcel.writeSerializable(this.C);
        parcel.writeSerializable(this.A);
        parcel.writeSerializable(this.B);
        parcel.writeSerializable(this.t);
        parcel.writeSerializable(this.n);
        parcel.writeSerializable(this.D);
        parcel.writeSerializable(this.E);
    }

    public inx(Parcel parcel) {
        this.i = 255;
        this.k = -2;
        this.l = -2;
        this.m = -2;
        this.t = true;
        this.a = parcel.readInt();
        this.b = (Integer) parcel.readSerializable();
        this.c = (Integer) parcel.readSerializable();
        this.d = (Integer) parcel.readSerializable();
        this.e = (Integer) parcel.readSerializable();
        this.f = (Integer) parcel.readSerializable();
        this.g = (Integer) parcel.readSerializable();
        this.h = (Integer) parcel.readSerializable();
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.o = parcel.readString();
        this.p = parcel.readString();
        this.q = parcel.readInt();
        this.s = (Integer) parcel.readSerializable();
        this.u = (Integer) parcel.readSerializable();
        this.v = (Integer) parcel.readSerializable();
        this.w = (Integer) parcel.readSerializable();
        this.x = (Integer) parcel.readSerializable();
        this.y = (Integer) parcel.readSerializable();
        this.z = (Integer) parcel.readSerializable();
        this.C = (Integer) parcel.readSerializable();
        this.A = (Integer) parcel.readSerializable();
        this.B = (Integer) parcel.readSerializable();
        this.t = (Boolean) parcel.readSerializable();
        this.n = (Locale) parcel.readSerializable();
        this.D = (Boolean) parcel.readSerializable();
        this.E = (Integer) parcel.readSerializable();
    }
}
