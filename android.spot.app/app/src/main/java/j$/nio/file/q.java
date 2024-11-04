package j$.nio.file;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q implements Iterator {
    private int a = 0;
    final /* synthetic */ j$.desugar.sun.nio.fs.o b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(j$.desugar.sun.nio.fs.o oVar) {
        this.b = oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a < this.b.getNameCount()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        j$.desugar.sun.nio.fs.o oVar = this.b;
        if (i < oVar.getNameCount()) {
            j$.desugar.sun.nio.fs.o name = oVar.getName(this.a);
            this.a++;
            return name;
        }
        throw new NoSuchElementException();
    }
}
