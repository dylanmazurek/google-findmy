package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jek extends jed implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern a;

    public jek(Pattern pattern) {
        pattern.getClass();
        this.a = pattern;
    }

    @Override // defpackage.jed
    public final jck a(CharSequence charSequence) {
        return new jck(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }
}
