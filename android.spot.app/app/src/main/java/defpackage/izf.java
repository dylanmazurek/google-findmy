package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izf {
    public static final /* synthetic */ int a = 0;

    static {
        ".".codePointAt(0);
        Pattern.compile("[^()<>@,;:\\\"/\\[\\]\\?={}\\s]+");
        Pattern.compile("[^,;\\s\"]+");
        Pattern.compile("(^|[\\s;,]+)([^()<>@,;:\\\"/\\[\\]\\?={}\\s]+)\\s*=\\s*(\"[^\"]*\"|[^,;\\s\"]+)");
    }
}
