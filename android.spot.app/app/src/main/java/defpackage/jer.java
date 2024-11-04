package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jer implements Serializable {
    private static final long serialVersionUID = 0;

    public static jer h(Object obj) {
        if (obj == null) {
            return jdl.a;
        }
        return new jeu(obj);
    }

    public static jer i(Object obj) {
        obj.getClass();
        return new jeu(obj);
    }

    public abstract jer a(jer jerVar);

    public abstract jer b(jei jeiVar);

    public abstract Object c();

    public abstract Object d(jfe jfeVar);

    public abstract Object e(Object obj);

    public abstract boolean equals(Object obj);

    public abstract Object f();

    public abstract boolean g();

    public abstract int hashCode();
}
