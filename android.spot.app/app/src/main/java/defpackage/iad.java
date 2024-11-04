package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class iad {
    public static final Pattern a = Pattern.compile("^(((http(s)?):)?\\/\\/images(\\d)?-.+-opensocial\\.googleusercontent\\.com\\/gadgets\\/proxy\\?)");
    private static int b;

    public static synchronized int a() {
        int i;
        synchronized (iad.class) {
            i = b + 1;
            b = i % 3;
        }
        return i;
    }
}
