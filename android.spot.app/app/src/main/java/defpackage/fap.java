package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fap extends ls implements faj {
    public static final Parcelable.Creator CREATOR = new ewd(3);
    private float a;
    private float b;
    private int g;
    private float h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;

    public fap() {
        super(-2, -2);
        this.a = 0.0f;
        this.b = 1.0f;
        this.g = -1;
        this.h = -1.0f;
        this.k = 16777215;
        this.l = 16777215;
    }

    @Override // defpackage.faj
    public final float a() {
        return this.h;
    }

    @Override // defpackage.faj
    public final float b() {
        return this.a;
    }

    @Override // defpackage.faj
    public final float c() {
        return this.b;
    }

    @Override // defpackage.faj
    public final int d() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.faj
    public final int e() {
        return this.height;
    }

    @Override // defpackage.faj
    public final int f() {
        return this.bottomMargin;
    }

    @Override // defpackage.faj
    public final int g() {
        return this.leftMargin;
    }

    @Override // defpackage.faj
    public final int h() {
        return this.rightMargin;
    }

    @Override // defpackage.faj
    public final int i() {
        return this.topMargin;
    }

    @Override // defpackage.faj
    public final int j() {
        return this.l;
    }

    @Override // defpackage.faj
    public final int k() {
        return this.k;
    }

    @Override // defpackage.faj
    public final int l() {
        return this.j;
    }

    @Override // defpackage.faj
    public final int m() {
        return this.i;
    }

    @Override // defpackage.faj
    public final int n() {
        return 1;
    }

    @Override // defpackage.faj
    public final int o() {
        return this.width;
    }

    @Override // defpackage.faj
    public final void p(int i) {
        this.j = i;
    }

    @Override // defpackage.faj
    public final void q(int i) {
        this.i = i;
    }

    @Override // defpackage.faj
    public final boolean r() {
        return this.m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeInt(this.g);
        parcel.writeFloat(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.bottomMargin);
        parcel.writeInt(this.leftMargin);
        parcel.writeInt(this.rightMargin);
        parcel.writeInt(this.topMargin);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }

    public fap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0.0f;
        this.b = 1.0f;
        this.g = -1;
        this.h = -1.0f;
        this.k = 16777215;
        this.l = 16777215;
    }

    public fap(Parcel parcel) {
        super(-2, -2);
        this.a = 0.0f;
        this.b = 1.0f;
        this.g = -1;
        this.h = -1.0f;
        this.k = 16777215;
        this.l = 16777215;
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.g = parcel.readInt();
        this.h = parcel.readFloat();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readByte() != 0;
        this.bottomMargin = parcel.readInt();
        this.leftMargin = parcel.readInt();
        this.rightMargin = parcel.readInt();
        this.topMargin = parcel.readInt();
        this.height = parcel.readInt();
        this.width = parcel.readInt();
    }
}
