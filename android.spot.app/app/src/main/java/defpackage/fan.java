package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fan extends ViewGroup.MarginLayoutParams implements faj {
    public static final Parcelable.Creator CREATOR = new ewd(2);
    private int a;
    private float b;
    private float c;
    private int d;
    private float e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;

    public fan(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = -1;
        this.e = -1.0f;
        this.h = 16777215;
        this.i = 16777215;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fas.b);
        this.a = obtainStyledAttributes.getInt(8, 1);
        this.b = obtainStyledAttributes.getFloat(2, 0.0f);
        this.c = obtainStyledAttributes.getFloat(3, 1.0f);
        this.d = obtainStyledAttributes.getInt(0, -1);
        this.e = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        this.f = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.g = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        this.i = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        this.j = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.faj
    public final float a() {
        return this.e;
    }

    @Override // defpackage.faj
    public final float b() {
        return this.b;
    }

    @Override // defpackage.faj
    public final float c() {
        return this.c;
    }

    @Override // defpackage.faj
    public final int d() {
        return this.d;
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
        return this.i;
    }

    @Override // defpackage.faj
    public final int k() {
        return this.h;
    }

    @Override // defpackage.faj
    public final int l() {
        return this.g;
    }

    @Override // defpackage.faj
    public final int m() {
        return this.f;
    }

    @Override // defpackage.faj
    public final int n() {
        return this.a;
    }

    @Override // defpackage.faj
    public final int o() {
        return this.width;
    }

    @Override // defpackage.faj
    public final void p(int i) {
        this.g = i;
    }

    @Override // defpackage.faj
    public final void q(int i) {
        this.f = i;
    }

    @Override // defpackage.faj
    public final boolean r() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.bottomMargin);
        parcel.writeInt(this.leftMargin);
        parcel.writeInt(this.rightMargin);
        parcel.writeInt(this.topMargin);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }

    public fan(Parcel parcel) {
        super(0, 0);
        this.a = 1;
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = -1;
        this.e = -1.0f;
        this.h = 16777215;
        this.i = 16777215;
        this.a = parcel.readInt();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readInt();
        this.e = parcel.readFloat();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readByte() != 0;
        this.bottomMargin = parcel.readInt();
        this.leftMargin = parcel.readInt();
        this.rightMargin = parcel.readInt();
        this.topMargin = parcel.readInt();
        this.height = parcel.readInt();
        this.width = parcel.readInt();
    }

    public fan(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = -1;
        this.e = -1.0f;
        this.h = 16777215;
        this.i = 16777215;
    }

    public fan(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = -1;
        this.e = -1.0f;
        this.h = 16777215;
        this.i = 16777215;
    }

    public fan(fan fanVar) {
        super((ViewGroup.MarginLayoutParams) fanVar);
        this.a = 1;
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = -1;
        this.e = -1.0f;
        this.h = 16777215;
        this.i = 16777215;
        this.a = fanVar.a;
        this.b = fanVar.b;
        this.c = fanVar.c;
        this.d = fanVar.d;
        this.e = fanVar.e;
        this.f = fanVar.f;
        this.g = fanVar.g;
        this.h = fanVar.h;
        this.i = fanVar.i;
        this.j = fanVar.j;
    }
}
