package defpackage;

import java.io.OutputStream;
import java.io.Writer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jtc extends OutputStream {
    int a = 0;
    int b = 0;
    int c = 0;
    final /* synthetic */ Writer d;
    final /* synthetic */ jte e;

    public jtc(jte jteVar, Writer writer) {
        this.d = writer;
        this.e = jteVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i > 0) {
            int i2 = this.a;
            jsx jsxVar = this.e.b;
            this.d.write(jsxVar.a((i2 << (jsxVar.c - i)) & jsxVar.b));
            this.c++;
            if (this.e.c != null) {
                while (true) {
                    int i3 = this.c;
                    jte jteVar = this.e;
                    if (i3 % jteVar.b.d == 0) {
                        break;
                    }
                    Writer writer = this.d;
                    jteVar.c.charValue();
                    writer.write(61);
                    this.c++;
                }
            }
        }
        this.d.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.d.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.a = (i & 255) | (this.a << 8);
        int i2 = this.b + 8;
        while (true) {
            this.b = i2;
            int i3 = this.b;
            jsx jsxVar = this.e.b;
            int i4 = jsxVar.c;
            if (i3 >= i4) {
                this.d.write(jsxVar.a((this.a >> (i3 - i4)) & jsxVar.b));
                this.c++;
                i2 = this.b - this.e.b.c;
            } else {
                return;
            }
        }
    }
}
