package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mea extends mct {
    private static final mdy b = new mdw(1);
    private static final mdy c = new mdw(0);
    private static final mdy d = new mdw(2);
    private static final mdy e = new mdw(3);
    private static final mdz f = new mdx();
    public int a;
    private final Deque g;
    private Deque h;
    private boolean i;

    public mea() {
        new ArrayDeque(2);
        this.g = new ArrayDeque();
    }

    private final int m(mdz mdzVar, int i, Object obj, int i2) {
        a(i);
        if (!this.g.isEmpty()) {
            p();
        }
        while (i > 0 && !this.g.isEmpty()) {
            mif mifVar = (mif) this.g.peek();
            int min = Math.min(i, mifVar.f());
            i2 = mdzVar.a(mifVar, min, obj, i2);
            i -= min;
            this.a -= min;
            p();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final int n(mdy mdyVar, int i, Object obj, int i2) {
        try {
            return m(mdyVar, i, obj, i2);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    private final void o() {
        if (this.i) {
            this.h.add((mif) this.g.remove());
            mif mifVar = (mif) this.g.peek();
            if (mifVar != null) {
                mifVar.b();
                return;
            }
            return;
        }
        ((mif) this.g.remove()).close();
    }

    private final void p() {
        if (((mif) this.g.peek()).f() == 0) {
            o();
        }
    }

    @Override // defpackage.mct, defpackage.mif
    public final void b() {
        if (this.h == null) {
            this.h = new ArrayDeque(Math.min(this.g.size(), 16));
        }
        while (!this.h.isEmpty()) {
            ((mif) this.h.remove()).close();
        }
        this.i = true;
        mif mifVar = (mif) this.g.peek();
        if (mifVar != null) {
            mifVar.b();
        }
    }

    @Override // defpackage.mct, defpackage.mif
    public final void c() {
        if (this.i) {
            mif mifVar = (mif) this.g.peek();
            if (mifVar != null) {
                int f2 = mifVar.f();
                mifVar.c();
                this.a += mifVar.f() - f2;
            }
            while (true) {
                mif mifVar2 = (mif) this.h.pollLast();
                if (mifVar2 != null) {
                    mifVar2.c();
                    this.g.addFirst(mifVar2);
                    this.a += mifVar2.f();
                } else {
                    return;
                }
            }
        } else {
            throw new InvalidMarkException();
        }
    }

    @Override // defpackage.mct, defpackage.mif, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (!this.g.isEmpty()) {
            ((mif) this.g.remove()).close();
        }
        if (this.h != null) {
            while (!this.h.isEmpty()) {
                ((mif) this.h.remove()).close();
            }
        }
    }

    @Override // defpackage.mct, defpackage.mif
    public final boolean d() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            if (!((mif) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.mif
    public final int e() {
        return n(b, 1, null, 0);
    }

    @Override // defpackage.mif
    public final int f() {
        return this.a;
    }

    @Override // defpackage.mif
    public final mif g(int i) {
        mif mifVar;
        int i2;
        mif mifVar2;
        if (i <= 0) {
            return mij.a;
        }
        a(i);
        this.a -= i;
        mif mifVar3 = null;
        mea meaVar = null;
        while (true) {
            mif mifVar4 = (mif) this.g.peek();
            int f2 = mifVar4.f();
            if (f2 > i) {
                mifVar2 = mifVar4.g(i);
                i2 = 0;
            } else {
                if (this.i) {
                    mifVar = mifVar4.g(f2);
                    o();
                } else {
                    mifVar = (mif) this.g.poll();
                }
                mif mifVar5 = mifVar;
                i2 = i - f2;
                mifVar2 = mifVar5;
            }
            if (mifVar3 == null) {
                mifVar3 = mifVar2;
            } else {
                if (meaVar == null) {
                    int i3 = 2;
                    if (i2 != 0) {
                        i3 = Math.min(this.g.size() + 2, 16);
                    }
                    meaVar = new mea(i3);
                    meaVar.h(mifVar3);
                    mifVar3 = meaVar;
                }
                meaVar.h(mifVar2);
            }
            if (i2 <= 0) {
                return mifVar3;
            }
            i = i2;
        }
    }

    public final void h(mif mifVar) {
        boolean z;
        if (this.i && this.g.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!(mifVar instanceof mea)) {
            this.g.add(mifVar);
            this.a += mifVar.f();
        } else {
            mea meaVar = (mea) mifVar;
            while (!meaVar.g.isEmpty()) {
                this.g.add((mif) meaVar.g.remove());
            }
            this.a += meaVar.a;
            meaVar.a = 0;
            meaVar.close();
        }
        if (z) {
            ((mif) this.g.peek()).b();
        }
    }

    @Override // defpackage.mif
    public final void i(ByteBuffer byteBuffer) {
        n(e, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // defpackage.mif
    public final void j(OutputStream outputStream, int i) {
        m(f, i, outputStream, 0);
    }

    @Override // defpackage.mif
    public final void k(byte[] bArr, int i, int i2) {
        n(d, i2, bArr, i);
    }

    @Override // defpackage.mif
    public final void l(int i) {
        n(c, i, null, 0);
    }

    public mea(int i) {
        new ArrayDeque(2);
        this.g = new ArrayDeque(i);
    }
}
