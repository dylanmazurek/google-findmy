package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.der;
import defpackage.fgz;
import defpackage.fma;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator CREATOR = new fgz(5);
    final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    public int h;
    boolean i = false;
    private final boolean j = true;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    public final void a(String str, int i) {
        Bundle bundle = this.c;
        if (bundle != null && bundle.containsKey(str)) {
            if (!b()) {
                if (i >= 0 && i < this.h) {
                    return;
                } else {
                    throw new CursorIndexOutOfBoundsException(i, this.h);
                }
            }
            throw new IllegalArgumentException("Buffer is closed.");
        }
        throw new IllegalArgumentException("No such column: ".concat(str));
    }

    public final boolean b() {
        boolean z;
        synchronized (this) {
            z = this.i;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.d;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    protected final void finalize() {
        try {
            if (this.j && this.d.length > 0 && !b()) {
                close();
                Log.e("DataBuffer", der.c(this, "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", ")"));
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.b;
        int D = fma.D(parcel);
        fma.Y(parcel, 1, strArr);
        fma.aa(parcel, 2, this.d, i);
        fma.L(parcel, 3, this.e);
        fma.O(parcel, 4, this.f);
        fma.L(parcel, 1000, this.a);
        fma.F(parcel, D);
        if ((i & 1) != 0) {
            close();
        }
    }
}
