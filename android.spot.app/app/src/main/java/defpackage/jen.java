package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jen {
    private final String a;

    public jen(jen jenVar) {
        this.a = jenVar.a;
    }

    public static jen b(char c) {
        return new jen(String.valueOf(c));
    }

    public CharSequence a(Object obj) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public final String c(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        e(sb, it);
        return sb.toString();
    }

    public final String d(Object obj, Object obj2, Object... objArr) {
        return c(new jem(objArr, obj, obj2));
    }

    public final void e(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    sb.append(a(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public jen(String str) {
        str.getClass();
        this.a = str;
    }
}
