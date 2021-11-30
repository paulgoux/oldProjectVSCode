import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.sound.*; 
import java.io.*; 
import java.net.*; 
import processing.core.PApplet; 
import org.apache.poi.hwpf.HWPFDocument; 
import org.apache.poi.hwpf.extractor.WordExtractor; 
import java.awt.datatransfer.Clipboard; 
import java.awt.datatransfer.Transferable; 
import java.awt.datatransfer.DataFlavor; 
import java.awt.datatransfer.UnsupportedFlavorException; 
import java.awt.Toolkit; 
import processing.video.*; 
import processing.sound.*; 
import java.lang.reflect.Constructor; 
import java.lang.reflect.Field; 
import java.lang.reflect.InvocationTargetException; 
import java.lang.reflect.Method; 
import java.lang.reflect.Modifier; 
import twitter4j.conf.*; 
import twitter4j.api.*; 
import twitter4j.*; 
import java.util.*; 

import com.sun.activation.registries.*; 
import com.sun.activation.viewers.*; 
import javax.activation.*; 
import org.apache.commons.codec.binary.*; 
import org.apache.commons.codec.*; 
import org.apache.commons.codec.digest.*; 
import org.apache.commons.codec.language.bm.*; 
import org.apache.commons.codec.language.*; 
import org.apache.commons.codec.net.*; 
import org.apache.commons.codec.cli.*; 
import org.apache.commons.collections4.bag.*; 
import org.apache.commons.collections4.bidimap.*; 
import org.apache.commons.collections4.collection.*; 
import org.apache.commons.collections4.*; 
import org.apache.commons.collections4.functors.*; 
import org.apache.commons.collections4.iterators.*; 
import org.apache.commons.collections4.list.*; 
import org.apache.commons.collections4.map.*; 
import org.apache.commons.collections4.multimap.*; 
import org.apache.commons.collections4.multiset.*; 
import org.apache.commons.collections4.queue.*; 
import org.apache.commons.collections4.sequence.*; 
import org.apache.commons.collections4.set.*; 
import org.apache.commons.collections4.trie.*; 
import org.apache.commons.collections4.comparators.*; 
import org.apache.commons.collections4.keyvalue.*; 
import org.apache.commons.collections4.properties.*; 
import org.apache.commons.collections4.splitmap.*; 
import org.apache.commons.collections4.trie.analyzer.*; 
import org.apache.commons.compress.parallel.*; 
import org.apache.commons.compress.utils.*; 
import org.apache.commons.compress.changes.*; 
import org.apache.commons.compress.archivers.dump.*; 
import org.apache.commons.compress.archivers.examples.*; 
import org.apache.commons.compress.archivers.zip.*; 
import org.apache.commons.compress.archivers.sevenz.*; 
import org.apache.commons.compress.archivers.cpio.*; 
import org.apache.commons.compress.archivers.*; 
import org.apache.commons.compress.archivers.tar.*; 
import org.apache.commons.compress.archivers.ar.*; 
import org.apache.commons.compress.compressors.*; 
import org.apache.commons.compress.compressors.lz4.*; 
import org.apache.commons.compress.compressors.xz.*; 
import org.apache.commons.compress.compressors.gzip.*; 
import org.apache.commons.compress.compressors.brotli.*; 
import org.apache.commons.compress.compressors.bzip2.*; 
import org.apache.commons.compress.compressors.lzma.*; 
import org.apache.commons.compress.compressors.lz77support.*; 
import org.apache.commons.compress.compressors.pack200.*; 
import org.apache.commons.compress.compressors.deflate64.*; 
import org.apache.commons.compress.compressors.snappy.*; 
import org.apache.commons.compress.compressors.deflate.*; 
import org.apache.commons.compress.compressors.zstandard.*; 
import org.apache.commons.compress.*; 
import org.apache.commons.compress.archivers.jar.*; 
import org.apache.commons.compress.compressors.lzw.*; 
import org.apache.commons.compress.archivers.arj.*; 
import org.apache.commons.compress.compressors.z.*; 
import org.apache.commons.logging.impl.*; 
import org.apache.commons.logging.*; 
import org.apache.commons.math3.ml.neuralnet.*; 
import org.apache.commons.math3.ml.neuralnet.twod.*; 
import org.apache.commons.math3.ml.neuralnet.twod.util.*; 
import org.apache.commons.math3.ml.neuralnet.oned.*; 
import org.apache.commons.math3.ml.neuralnet.sofm.*; 
import org.apache.commons.math3.ml.neuralnet.sofm.util.*; 
import org.apache.commons.math3.ml.clustering.*; 
import org.apache.commons.math3.ml.clustering.evaluation.*; 
import org.apache.commons.math3.ml.distance.*; 
import org.apache.commons.math3.analysis.*; 
import org.apache.commons.math3.analysis.differentiation.*; 
import org.apache.commons.math3.analysis.integration.*; 
import org.apache.commons.math3.analysis.integration.gauss.*; 
import org.apache.commons.math3.analysis.function.*; 
import org.apache.commons.math3.analysis.polynomials.*; 
import org.apache.commons.math3.analysis.solvers.*; 
import org.apache.commons.math3.analysis.interpolation.*; 
import org.apache.commons.math3.stat.interval.*; 
import org.apache.commons.math3.stat.ranking.*; 
import org.apache.commons.math3.stat.clustering.*; 
import org.apache.commons.math3.stat.*; 
import org.apache.commons.math3.stat.inference.*; 
import org.apache.commons.math3.stat.correlation.*; 
import org.apache.commons.math3.stat.descriptive.*; 
import org.apache.commons.math3.stat.descriptive.rank.*; 
import org.apache.commons.math3.stat.descriptive.summary.*; 
import org.apache.commons.math3.stat.descriptive.moment.*; 
import org.apache.commons.math3.stat.regression.*; 
import org.apache.commons.math3.linear.*; 
import org.apache.commons.math3.*; 
import org.apache.commons.math3.distribution.*; 
import org.apache.commons.math3.distribution.fitting.*; 
import org.apache.commons.math3.complex.*; 
import org.apache.commons.math3.ode.*; 
import org.apache.commons.math3.ode.nonstiff.*; 
import org.apache.commons.math3.ode.events.*; 
import org.apache.commons.math3.ode.sampling.*; 
import org.apache.commons.math3.random.*; 
import org.apache.commons.math3.primes.*; 
import org.apache.commons.math3.optim.*; 
import org.apache.commons.math3.optim.linear.*; 
import org.apache.commons.math3.optim.nonlinear.vector.*; 
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.*; 
import org.apache.commons.math3.optim.nonlinear.scalar.*; 
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.*; 
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.*; 
import org.apache.commons.math3.optim.univariate.*; 
import org.apache.commons.math3.exception.*; 
import org.apache.commons.math3.exception.util.*; 
import org.apache.commons.math3.fitting.leastsquares.*; 
import org.apache.commons.math3.fitting.*; 
import org.apache.commons.math3.dfp.*; 
import org.apache.commons.math3.fraction.*; 
import org.apache.commons.math3.special.*; 
import org.apache.commons.math3.geometry.*; 
import org.apache.commons.math3.geometry.hull.*; 
import org.apache.commons.math3.geometry.enclosing.*; 
import org.apache.commons.math3.geometry.spherical.twod.*; 
import org.apache.commons.math3.geometry.spherical.oned.*; 
import org.apache.commons.math3.geometry.euclidean.threed.*; 
import org.apache.commons.math3.geometry.euclidean.twod.*; 
import org.apache.commons.math3.geometry.euclidean.twod.hull.*; 
import org.apache.commons.math3.geometry.euclidean.oned.*; 
import org.apache.commons.math3.geometry.partitioning.*; 
import org.apache.commons.math3.geometry.partitioning.utilities.*; 
import org.apache.commons.math3.optimization.*; 
import org.apache.commons.math3.optimization.linear.*; 
import org.apache.commons.math3.optimization.direct.*; 
import org.apache.commons.math3.optimization.fitting.*; 
import org.apache.commons.math3.optimization.univariate.*; 
import org.apache.commons.math3.optimization.general.*; 
import org.apache.commons.math3.util.*; 
import org.apache.commons.math3.genetics.*; 
import org.apache.commons.math3.transform.*; 
import org.apache.commons.math3.filter.*; 
import javax.xml.bind.*; 
import javax.xml.bind.util.*; 
import javax.xml.bind.annotation.*; 
import javax.xml.bind.attachment.*; 
import javax.xml.bind.annotation.adapters.*; 
import javax.xml.bind.helpers.*; 
import com.sun.xml.txw2.*; 
import com.sun.xml.txw2.output.*; 
import com.sun.xml.txw2.annotation.*; 
import com.sun.xml.bind.*; 
import com.sun.xml.bind.unmarshaller.*; 
import com.sun.xml.bind.api.impl.*; 
import com.sun.xml.bind.api.*; 
import com.sun.xml.bind.marshaller.*; 
import com.sun.xml.bind.v2.runtime.unmarshaller.*; 
import com.sun.xml.bind.v2.runtime.*; 
import com.sun.xml.bind.v2.*; 
import com.sun.xml.bind.v2.model.core.*; 
import com.sun.xml.bind.v2.model.nav.*; 
import com.sun.xml.bind.v2.model.impl.*; 
import com.sun.xml.bind.v2.model.annotation.*; 
import com.sun.xml.bind.v2.schemagen.episode.*; 
import com.sun.xml.bind.v2.util.*; 
import com.sun.xml.bind.util.*; 
import com.sun.xml.bind.annotation.*; 
import com.sun.istack.*; 
import com.sun.istack.localization.*; 
import com.sun.istack.logging.*; 
import com.sun.xml.bind.v2.model.util.*; 
import com.sun.xml.bind.v2.model.runtime.*; 
import com.sun.xml.bind.v2.runtime.property.*; 
import com.sun.xml.bind.v2.runtime.reflect.opt.*; 
import com.sun.xml.bind.v2.runtime.reflect.*; 
import com.sun.xml.bind.v2.runtime.output.*; 
import com.sun.xml.bind.v2.schemagen.xmlschema.*; 
import com.sun.xml.bind.v2.schemagen.*; 
import com.sun.xml.bind.v2.bytecode.*; 
import org.junit.*; 
import org.junit.rules.*; 
import org.junit.runners.*; 
import org.junit.runners.parameterized.*; 
import org.junit.runners.model.*; 
import org.junit.matchers.*; 
import org.junit.runner.*; 
import org.junit.runner.manipulation.*; 
import org.junit.runner.notification.*; 
import org.junit.validator.*; 
import org.junit.internal.*; 
import org.junit.internal.matchers.*; 
import org.junit.internal.runners.*; 
import org.junit.internal.runners.rules.*; 
import org.junit.internal.runners.statements.*; 
import org.junit.internal.runners.model.*; 
import org.junit.internal.requests.*; 
import org.junit.internal.builders.*; 
import org.junit.experimental.results.*; 
import org.junit.experimental.*; 
import org.junit.experimental.max.*; 
import org.junit.experimental.theories.*; 
import org.junit.experimental.theories.suppliers.*; 
import org.junit.experimental.theories.internal.*; 
import org.junit.experimental.categories.*; 
import org.junit.experimental.runners.*; 
import junit.framework.*; 
import junit.runner.*; 
import junit.extensions.*; 
import junit.textui.*; 
import org.apache.log4j.*; 
import org.apache.log4j.chainsaw.*; 
import org.apache.log4j.config.*; 
import org.apache.log4j.helpers.*; 
import org.apache.log4j.jdbc.*; 
import org.apache.log4j.jmx.*; 
import org.apache.log4j.lf5.*; 
import org.apache.log4j.lf5.util.*; 
import org.apache.log4j.lf5.viewer.*; 
import org.apache.log4j.lf5.viewer.categoryexplorer.*; 
import org.apache.log4j.lf5.viewer.configure.*; 
import org.apache.log4j.net.*; 
import org.apache.log4j.nt.*; 
import org.apache.log4j.or.*; 
import org.apache.log4j.or.jms.*; 
import org.apache.log4j.or.sax.*; 
import org.apache.log4j.pattern.*; 
import org.apache.log4j.rewrite.*; 
import org.apache.log4j.spi.*; 
import org.apache.log4j.varia.*; 
import org.apache.log4j.xml.*; 
import org.apache.poi.*; 
import org.apache.poi.common.*; 
import org.apache.poi.common.usermodel.*; 
import org.apache.poi.common.usermodel.fonts.*; 
import org.apache.poi.ddf.*; 
import org.apache.poi.extractor.*; 
import org.apache.poi.hpsf.*; 
import org.apache.poi.hpsf.extractor.*; 
import org.apache.poi.hpsf.wellknown.*; 
import org.apache.poi.hssf.*; 
import org.apache.poi.hssf.dev.*; 
import org.apache.poi.hssf.eventmodel.*; 
import org.apache.poi.hssf.eventusermodel.*; 
import org.apache.poi.hssf.eventusermodel.dummyrecord.*; 
import org.apache.poi.hssf.extractor.*; 
import org.apache.poi.hssf.model.*; 
import org.apache.poi.hssf.record.*; 
import org.apache.poi.hssf.record.aggregates.*; 
import org.apache.poi.hssf.record.cf.*; 
import org.apache.poi.hssf.record.chart.*; 
import org.apache.poi.hssf.record.common.*; 
import org.apache.poi.hssf.record.cont.*; 
import org.apache.poi.hssf.record.crypto.*; 
import org.apache.poi.hssf.record.pivottable.*; 
import org.apache.poi.hssf.usermodel.*; 
import org.apache.poi.hssf.usermodel.helpers.*; 
import org.apache.poi.hssf.util.*; 
import org.apache.poi.poifs.common.*; 
import org.apache.poi.poifs.crypt.*; 
import org.apache.poi.poifs.crypt.binaryrc4.*; 
import org.apache.poi.poifs.crypt.cryptoapi.*; 
import org.apache.poi.poifs.crypt.standard.*; 
import org.apache.poi.poifs.crypt.xor.*; 
import org.apache.poi.poifs.dev.*; 
import org.apache.poi.poifs.eventfilesystem.*; 
import org.apache.poi.poifs.filesystem.*; 
import org.apache.poi.poifs.macros.*; 
import org.apache.poi.poifs.nio.*; 
import org.apache.poi.poifs.*; 
import org.apache.poi.poifs.property.*; 
import org.apache.poi.poifs.storage.*; 
import org.apache.poi.sl.draw.*; 
import org.apache.poi.sl.draw.binding.*; 
import org.apache.poi.sl.draw.geom.*; 
import org.apache.poi.sl.extractor.*; 
import org.apache.poi.sl.image.*; 
import org.apache.poi.sl.usermodel.*; 
import org.apache.poi.ss.*; 
import org.apache.poi.ss.extractor.*; 
import org.apache.poi.ss.format.*; 
import org.apache.poi.ss.formula.*; 
import org.apache.poi.ss.formula.atp.*; 
import org.apache.poi.ss.formula.constant.*; 
import org.apache.poi.ss.formula.eval.*; 
import org.apache.poi.ss.formula.eval.forked.*; 
import org.apache.poi.ss.formula.function.*; 
import org.apache.poi.ss.formula.functions.*; 
import org.apache.poi.ss.formula.ptg.*; 
import org.apache.poi.ss.formula.udf.*; 
import org.apache.poi.ss.usermodel.*; 
import org.apache.poi.ss.usermodel.charts.*; 
import org.apache.poi.ss.usermodel.helpers.*; 
import org.apache.poi.ss.util.*; 
import org.apache.poi.ss.util.cellwalk.*; 
import org.apache.poi.util.*; 
import org.apache.poi.wp.usermodel.*; 
import org.apache.poi.crypt.examples.*; 
import org.apache.poi.examples.util.*; 
import org.apache.poi.hpsf.examples.*; 
import org.apache.poi.hslf.examples.*; 
import org.apache.poi.hsmf.examples.*; 
import org.apache.poi.hssf.eventusermodel.examples.*; 
import org.apache.poi.hssf.usermodel.examples.*; 
import org.apache.poi.hwpf.*; 
import org.apache.poi.ss.examples.*; 
import org.apache.poi.ss.examples.formula.*; 
import org.apache.poi.ss.examples.html.*; 
import org.apache.poi.xslf.usermodel.*; 
import org.apache.poi.xslf.usermodel.tutorial.*; 
import org.apache.poi.xssf.eventusermodel.*; 
import org.apache.poi.xssf.eventusermodel.examples.*; 
import org.apache.poi.xssf.streaming.examples.*; 
import org.apache.poi.xssf.usermodel.examples.*; 
import org.apache.poi.xwpf.usermodel.examples.*; 
import org.apache.poi.ss.excelant.*; 
import org.apache.poi.ss.excelant.util.*; 
import org.apache.poi.ooxml.*; 
import org.apache.poi.ooxml.dev.*; 
import org.apache.poi.ooxml.extractor.*; 
import org.apache.poi.ooxml.util.*; 
import org.apache.poi.openxml4j.exceptions.*; 
import org.apache.poi.openxml4j.opc.*; 
import org.apache.poi.openxml4j.opc.internal.*; 
import org.apache.poi.openxml4j.opc.internal.marshallers.*; 
import org.apache.poi.openxml4j.opc.internal.unmarshallers.*; 
import org.apache.poi.openxml4j.util.*; 
import org.apache.poi.poifs.crypt.agile.*; 
import org.apache.poi.poifs.crypt.dsig.*; 
import org.apache.poi.poifs.crypt.dsig.facets.*; 
import org.apache.poi.poifs.crypt.dsig.services.*; 
import org.apache.poi.poifs.crypt.temp.*; 
import org.apache.poi.xddf.usermodel.*; 
import org.apache.poi.xddf.usermodel.chart.*; 
import org.apache.poi.xddf.usermodel.text.*; 
import org.apache.poi.xdgf.exceptions.*; 
import org.apache.poi.xdgf.extractor.*; 
import org.apache.poi.xdgf.geom.*; 
import org.apache.poi.xdgf.usermodel.*; 
import org.apache.poi.xdgf.usermodel.section.*; 
import org.apache.poi.xdgf.usermodel.section.geometry.*; 
import org.apache.poi.xdgf.usermodel.shape.*; 
import org.apache.poi.xdgf.usermodel.shape.exceptions.*; 
import org.apache.poi.xdgf.util.*; 
import org.apache.poi.xdgf.xml.*; 
import org.apache.poi.xslf.draw.*; 
import org.apache.poi.xslf.extractor.*; 
import org.apache.poi.xslf.model.*; 
import org.apache.poi.xslf.util.*; 
import org.apache.poi.xssf.*; 
import org.apache.poi.xssf.binary.*; 
import org.apache.poi.xssf.extractor.*; 
import org.apache.poi.xssf.model.*; 
import org.apache.poi.xssf.streaming.*; 
import org.apache.poi.xssf.usermodel.*; 
import org.apache.poi.xssf.usermodel.charts.*; 
import org.apache.poi.xssf.usermodel.extensions.*; 
import org.apache.poi.xssf.usermodel.helpers.*; 
import org.apache.poi.xssf.util.*; 
import org.apache.poi.xwpf.extractor.*; 
import org.apache.poi.xwpf.model.*; 
import org.apache.poi.xwpf.*; 
import org.apache.poi.xwpf.usermodel.*; 
import com.microsoft.schemas.compatibility.*; 
import com.microsoft.schemas.compatibility.impl.*; 
import com.microsoft.schemas.office.excel.*; 
import com.microsoft.schemas.office.excel.impl.*; 
import com.microsoft.schemas.office.office.*; 
import com.microsoft.schemas.office.office.impl.*; 
import com.microsoft.schemas.office.visio.x2012.main.*; 
import com.microsoft.schemas.office.visio.x2012.main.impl.*; 
import com.microsoft.schemas.office.x2006.digsig.*; 
import com.microsoft.schemas.office.x2006.digsig.impl.*; 
import com.microsoft.schemas.office.x2006.encryption.*; 
import com.microsoft.schemas.office.x2006.encryption.impl.*; 
import com.microsoft.schemas.office.x2006.keyEncryptor.certificate.*; 
import com.microsoft.schemas.office.x2006.keyEncryptor.certificate.impl.*; 
import com.microsoft.schemas.office.x2006.keyEncryptor.password.*; 
import com.microsoft.schemas.office.x2006.keyEncryptor.password.impl.*; 
import com.microsoft.schemas.vml.*; 
import com.microsoft.schemas.vml.impl.*; 
import org.etsi.uri.x01903.v13.*; 
import org.etsi.uri.x01903.v13.impl.*; 
import org.openxmlformats.schemas.drawingml.x2006.chart.*; 
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.*; 
import org.openxmlformats.schemas.drawingml.x2006.main.*; 
import org.openxmlformats.schemas.drawingml.x2006.main.impl.*; 
import org.openxmlformats.schemas.drawingml.x2006.picture.*; 
import org.openxmlformats.schemas.drawingml.x2006.picture.impl.*; 
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.*; 
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl.*; 
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.*; 
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.impl.*; 
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.*; 
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.impl.*; 
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.*; 
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.*; 
import org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.*; 
import org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.impl.*; 
import org.openxmlformats.schemas.officeDocument.x2006.relationships.*; 
import org.openxmlformats.schemas.officeDocument.x2006.relationships.impl.*; 
import org.openxmlformats.schemas.presentationml.x2006.main.*; 
import org.openxmlformats.schemas.presentationml.x2006.main.impl.*; 
import org.openxmlformats.schemas.spreadsheetml.x2006.main.*; 
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.*; 
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*; 
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.*; 
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.*; 
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.impl.*; 
import org.w3.x2000.x09.xmldsig.*; 
import org.w3.x2000.x09.xmldsig.impl.*; 
import schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078.*; 
import schemaorg_apache_xmlbeans.system.sD023D6490046BA0250A839A9AD24C443.*; 
import org.apache.poi.extractor.ole2.*; 
import org.apache.poi.hdgf.*; 
import org.apache.poi.hdgf.chunks.*; 
import org.apache.poi.hdgf.dev.*; 
import org.apache.poi.hdgf.exceptions.*; 
import org.apache.poi.hdgf.extractor.*; 
import org.apache.poi.hdgf.pointers.*; 
import org.apache.poi.hdgf.streams.*; 
import org.apache.poi.hemf.draw.*; 
import org.apache.poi.hemf.record.emf.*; 
import org.apache.poi.hemf.record.emfplus.*; 
import org.apache.poi.hemf.usermodel.*; 
import org.apache.poi.hmef.*; 
import org.apache.poi.hmef.attribute.*; 
import org.apache.poi.hmef.dev.*; 
import org.apache.poi.hmef.extractor.*; 
import org.apache.poi.hpbf.*; 
import org.apache.poi.hpbf.dev.*; 
import org.apache.poi.hpbf.extractor.*; 
import org.apache.poi.hpbf.model.*; 
import org.apache.poi.hpbf.model.qcbits.*; 
import org.apache.poi.hslf.blip.*; 
import org.apache.poi.hslf.dev.*; 
import org.apache.poi.hslf.exceptions.*; 
import org.apache.poi.hslf.extractor.*; 
import org.apache.poi.hslf.model.*; 
import org.apache.poi.hslf.model.textproperties.*; 
import org.apache.poi.hslf.record.*; 
import org.apache.poi.hslf.usermodel.*; 
import org.apache.poi.hslf.util.*; 
import org.apache.poi.hsmf.*; 
import org.apache.poi.hsmf.datatypes.*; 
import org.apache.poi.hsmf.dev.*; 
import org.apache.poi.hsmf.exceptions.*; 
import org.apache.poi.hsmf.extractor.*; 
import org.apache.poi.hsmf.parsers.*; 
import org.apache.poi.hssf.converter.*; 
import org.apache.poi.hwmf.draw.*; 
import org.apache.poi.hwmf.record.*; 
import org.apache.poi.hwmf.usermodel.*; 
import org.apache.poi.hwpf.converter.*; 
import org.apache.poi.hwpf.dev.*; 
import org.apache.poi.hwpf.extractor.*; 
import org.apache.poi.hwpf.model.*; 
import org.apache.poi.hwpf.model.io.*; 
import org.apache.poi.hwpf.model.types.*; 
import org.apache.poi.hwpf.sprm.*; 
import org.apache.poi.hwpf.usermodel.*; 
import com.zaxxer.sparsebits.*; 
import twitter4j.*; 
import twitter4j.auth.*; 
import twitter4j.api.*; 
import twitter4j.util.*; 
import twitter4j.util.function.*; 
import twitter4j.management.*; 
import twitter4j.json.*; 
import twitter4j.conf.*; 
import twitter4j.examples.directmessage.*; 
import twitter4j.examples.*; 
import twitter4j.examples.oauth.*; 
import twitter4j.examples.mute.*; 
import twitter4j.examples.stream.*; 
import twitter4j.examples.async.*; 
import twitter4j.examples.suggestedusers.*; 
import twitter4j.examples.geo.*; 
import twitter4j.examples.favorite.*; 
import twitter4j.examples.user.*; 
import twitter4j.examples.search.*; 
import twitter4j.examples.tweets.*; 
import twitter4j.examples.friendsandfollowers.*; 
import twitter4j.examples.savedsearches.*; 
import twitter4j.examples.json.*; 
import twitter4j.examples.trends.*; 
import twitter4j.examples.list.*; 
import twitter4j.examples.lambda.*; 
import twitter4j.examples.account.*; 
import twitter4j.examples.timeline.*; 
import twitter4j.examples.friendship.*; 
import twitter4j.examples.help.*; 
import twitter4j.examples.block.*; 
import twitter4j.examples.spamreporting.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_191112a extends PApplet {

PVector m = new PVector(0,0);
PVector n = new PVector(0,0);
PVector sub = new PVector(0,0);
int kk;
//PGraphics pg;
int gridrows = 100;
PApplet app = this;
//Human xxx = new Human(width/2,height/2);
String []kemp;
BMScontrols BMS = new BMScontrols(this);;
//PVector norm = new PVector(0,0);
float norm;
float theta = 0;
_tri tri1 = new _tri(200,200,10,20);
//Table t = new Table(300,600,200,200,2,2);
Html webpage = new Html("https://www.google.com/") ;

String []text;
String sentence = "This is a sentence!";

vectorText words;





//------------------apache word files-----



//-------------hashmap---------------
//import java.util.Hashtable;
//import java.util.Map;
//import java.util.List;
//import java.util.Map.Entry;
//-------------------clipboard---------
//import java.awt.*;





//-----------webcam------------------


//----------reflections-----------------





//import java.awt.*;
//import java.lang.reflect.*;

//---------twitter----------------------
 
 
 
  
TwitterStream twitterStream;
//JSONArray data;
 
boolean k1 = false;
PImage img;
//SetFieldValueExample n = new SetFieldValueExample();

public void settings(){
  //Terrain3d = true;
  //size(W,H,JAVA2D);
 
  if(BMS.terrain3d){
  size(W,H,P3D);
  }else{
    size(W,H,FX2D);
    //size(W,H,P2D);
  }
  
};

public void setup(){
  //surface.setResizable(true);
  frame.setTitle("Neural Playground");
  //surface.setUndecorated();
  //Lines = loadStrings("http://www.gutenberg.org/files/61075/61075-h/61075-h.htm");
  //Lines = loadStrings("test.txt");
  //kemp = loadStrings("i.txt");
  BMS.begin();
  img = loadImage("tri.png");
  //text = loadStrings("example.txt");
  //words = new vectorText(text);
  //Spawn("human",200);
  //Spawn("plant",100);
  
}

public void draw(){
  //webpage.getString();
  
  fill(255);
  background(bgcol);
  text(frameRate,50,100);
   kk = 0;
  //text(main.Boundaries.size(),100,150);
  //btn1.draw();
  //webpage.readString();
  //webpage.getLinks();
  //webpage.displayLinks();
  
  //words.classText();
  debug();
  //if(gcam!=null)gcam.cam_functions();
  gimg.img_functions();
  BMS.run();
  Reset();
  
};


public void keyPressed(){
  if(keyCode == 88)xdown = true;
  else xdown = false;
  if(keyCode == 89)ydown = true;
  else ydown = false;
  if (keyCode== 17){
    clipboard_toggle=1;
    ctrl = 1;
  }
  if(key=='A' && ctrl==1){
    selectAll = true;
  }
    
  if (key== 'V'&& clipboard_toggle==1&&!copy_clipboard) {
    k1 = true;
    copy_clipboard = true;
    pastedown = true;
  }else{
    k1 = false;
    copy_clipboard = false;
  }
};

public void debug(){
  fill(255);
  //if(btn2.toggle==1)text("plot",200,460);
  //if(file.pos())text("file",200,470);
  //if(open_menus)text("menuall",200,480);
  //if(btn57.toggle==1)text("camera",200,500);
  //if(gcam.cam!=null)text(gcam.camsquares.size(),200,510);
  //if(btn61.toggle==1)text("image",200,520);
  //if(gimg.convolved)text("convolved",200,530);
  //if(btn55.toggle==1)text("terrain",200,540);
  //if(g.toggle)text(g.squares.size(),200,550);
  //text(frameRate,1000,560);
  //if(clipboard_toggle==1)text("ctrl",100,100);
  //if(k1)text("copy",100,100);
};



public void mousePressed(){
  for(Menu menu : BMS.menus)menu.click();
};

public void mouseReleased(){
  
}

public void keyReleased(){
  clipboard_toggle = 0;
  if(keyCode==88)xdown = false;
  if(keyCode==89)ydown = false;
  if (keyCode== 17)clipboard_toggle = 0;copy_clipboard = false;ctrl=0;
  if(key=='V'){ copy_clipboard = false;textb1.copied = false;clipboard_toggle=0;}
  if(key=='A'){selectAll = false;}
}
public void mouseClicked(){
  BMS.click();
};

public void mouseDragged(){
  
  file.dpos();
  BMS.slider_functions();
}

public void openTwitter(){
  ConfigurationBuilder cb = new ConfigurationBuilder();
  cb.setOAuthConsumerKey("2Z674FTQPomH4YbajPzLjBqQQ");
  cb.setOAuthConsumerSecret("Tf7QLmQWpJjBLHwUgFP8fUlncO5bYpI2XSFHMHoTn5Ph4uQwp8");
  cb.setOAuthAccessToken("3399736859-NH842wgutewgcAEox6RuHtVAOYFHWdKC50BmMUp");
  cb.setOAuthAccessTokenSecret("bmNK9MX2BTqoLGWPT6qICqLobQYpR4NbtWSPpEX9YY47G");
  
  twitterStream = new TwitterStreamFactory(cb.build()).getInstance();
  
  FilterQuery filtered = new FilterQuery();
  
  String [] Keywords = twitterKeywords.getKeywords();
  
  filtered.track(Keywords);
  
  twitterStream.addListener(listener);
  
  if(Keywords.length==0) twitterStream.sample();
  else twitterStream.filter(filtered);
};

StatusListener listener = new StatusListener(){
  
  //override 
  public void onStallWarning(StallWarning warning){
    
    if(twitterKeywords.toggle)System.out.println("Got stall warning " + warning);
    
  };
  
  public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice){
    if(twitterKeywords.toggle)System.out.println("Deleted " + statusDeletionNotice);
  };
  
  
  public void onException(java.lang.Exception ex){
    if(twitterKeywords.toggle)System.out.println("Exception");
  };
  
  public void onTrackLimitationNotice(int numberOfLimitedStatuses){
    if(twitterKeywords.toggle)System.out.println("Get track limitation notices " + numberOfLimitedStatuses);
  };
  
  public void onScrubGeo(long userId,long upToStatusId){
    if(twitterKeywords.toggle)System.out.println(" Get scrub notice" + userId + "up to " + upToStatusId);
  }
  
  public void onStatus(Status status){
    if(twitterKeywords.toggle)System.out.println(status.getUser().getScreenName() + status.getText());
  };
};
class Attractor{
  
  int id,type;
  float x,y,w,h,intensity,mass = 200;
  String label;
  boolean drag,resize;
  public boolean toggle,show,move = true,mdown,mup;
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  ArrayList<Attractor> attractors = new ArrayList<Attractor>();
  
  Attractor(float xx, float yy, float Intensity){
    
    x = xx;
    y = yy;
    intensity = Intensity;
  };
  
  Attractor(){
    
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void draw(){
    if(show){
    stroke(0);
    //text(attractors.size(),100,100);
    for(int i=0;i<attractors.size();i++){
      Attractor a = attractors.get(i);
      fill(0);
      strokeWeight(1);
      if(a.intensity>0)fill(255);
      if(move)mouse_move(a);
      int size = 10;  
      if(a.mdown){size = 16;}
      ellipse(a.x,a.y,size,size);
    }}
  };
  
  public void functions(){
    add();
    draw();
  };
  
  public void animate(){
    
  };
  
  public void mouseReleased(){
    //mdown = false;
  };
  
  public void mouse_move(Attractor a){
      if(mousePressed&&!a.pos()){a.mup = true;}
      if(mousePressed&&a.pos()&&!a.mup){a.mdown = true;}
      if(a.mdown){a.x = mouseX;a.y = mouseY;}
      if(a.mdown&&!mousePressed){a.mdown = false;a.mup = false;}
      if(!mousePressed){a.mup = false;}
  };
  
  public void add(){    
    if(toggle&&!open_menus){
    if(mousePressed&& mouseButton == LEFT && !mdown){
      attractors.add(new Attractor(mouseX,mouseY,1));
      mdown = true;
    }
    if(mousePressed&& mouseButton == RIGHT && !mdown){
      attractors.add(new Attractor(mouseX,mouseY,-1));
      mdown = true;
    }
    if(!mousePressed){ mdown = false;}
    }
  };
  
  public boolean pos(){
    float X = mouseX;
    float Y = mouseY;
    return X > x && X < x + 10 && Y > y && Y < y + 10; 
  }
  
};
class BMScontrols{
  
  int Mcount;
  HashMap<Object,String> booleans = new HashMap<Object,String>();
  PApplet applet = null;
  public boolean gridOpen,gridSeeded,autoSave,autoControl,camOpen,terrain3d;
  boolean updated;
  String[] Lines;
  float seed;
  Button checkbox;
  public float autoSaveTimeout = 30;
  ArrayList<Slider> Sliders = new ArrayList<Slider>();
  ArrayList<sliderBox> sliderBoxes = new ArrayList<sliderBox>();
  ArrayList<TextBox> textBoxes = new ArrayList<TextBox>();
  ArrayList<TextArea> textAreas = new ArrayList<TextArea>();
  ArrayList<Button> buttons = new ArrayList<Button>();
  ArrayList<Menu> menus = new ArrayList<Menu>();
  ArrayList<Grid> grids = new ArrayList<Grid>();
  ArrayList<Cam> cams = new ArrayList<Cam>();
  ArrayList<GridImg> gridOfImages = new ArrayList<GridImg>();
  ArrayList<ImgGrid> imagesToGrid = new ArrayList<ImgGrid>();
  ArrayList<tab> tabs = new ArrayList<tab>();
  Boundary bb;
  
  String[] cameras = Capture.list();
  
  Capture Cam;
  Dropdown dd;
  
  BMScontrols(PApplet Applet){
    applet = Applet;
    //startCam();
    Cam = new Capture(app,cameras[0]);
  };
  
  public void add(Object o,String globalVar,boolean localVar){
    Field field = null;
    
    booleans.put(o,globalVar);
  
};

public void draw(){
  // fill(255);
  
  // text("hello",100,100);
};

public void begin(){
  
  setupTwitter();
  setupWindows();
  setupMenus();
  setupRGB();
  setupPlots();
  setupReset();
  setupOthers();
  attractors = new Attractor();
  setupTabs();
  setupButtons();
  openTwitter();
  checkbox = new Button(25,25,20,20,"checkbox");
  checkbox.radio = true;
  tabsetup();
  spawnRaces("human",3,100);
  String [] ddLabels = {"hello"};
  //dd = new Dropdown(100,200,90,"Select",ddLabels,0);
  bb = new Boundary(0,0,W,H);
};

public void setupButtons(){
  //Button b = new Button(100,200,50,20,"terrain");
  //b.togglebox = true;
  //buttons.add(b);
};

public void setupTwitter(){
  
  String [] keywords = { "corona virus","uk" ,"United Kingdom", "China"};
  twitterKeywords = new TwitterKeyword(keywords);
};

public void setupWindows(){
  main = new Window(23,20,W-46,H-70-20);
  main.fill = false;
  main.border = true;
  Boundary b = new Boundary(main.x+1,main.y+1,main.w-2,main.h-2,4);
  //b.cohesionBoundary = true;
  //b.avoidBoundary = true;
  b.state = 1;
  b.visible = false;
  main.Boundaries.add(b);
  
  header = new Window(0,0,W,20);
  windows.add(header);
  
  footer = new Window(0,H-50,W,50);
  windows.add(footer);
  
  header.border = false;
  footer.border = true;
  footer.col = 0;
  
  fmenu = new Window(200,200,200,200,"C:\\Users\\paul goux\\");
};

public void setupMenus(){
  // file----------------------------------------------
  
  
  String [] flabels = {"Open","Save","Grid","Plot 2D","Plot 3D","Attractor","Reset"};
  file = new Menu(0,0,30,20,"File",flabels,0);
  
  menus.add(file);
  //----------------------file -----------------------------------
  if(file!=null){
  String []glabels = {"Terrain","Img","Cam","Plain","Set Image Workflow","Change Image Workflow"};
  file.items.get(2).submenu  = new Menu(file.items.get(2).x+file.items.get(2).w,file.items.get(2).y,70,glabels,0);
  file.set_link(2);
  String [] attractor_labels = {"Show/Hide","On/Off"};
  file.items.get(5).submenu = new Menu(file.items.get(5).x+file.items.get(5).w,file.items.get(5).y,100,attractor_labels,0);
  file.set_link(5);
  }
  //-------------------------------------------------------------------
  String [] shapesLabels = {"Line drawing","Connected Lines","Ellipse","Rectangle","Tri","Poligon","C Poligon","Bezier","Spline","none","Arc","Path Straight","Path Corner"};
  shapes = new Menu(file.x + file.w,0,50,20,"Shapes",shapesLabels,0);
  menus.add(shapes);

  //-------------------------------------------------------------------------------------------
  //physics------------------------------------------------------------------------
  String [] physicsLabels = {"Physics","Gravity","Electromagnetism","Strong","Weak"};
  physics = new Menu(shapes.x + shapes.w,0,50,20,"Physics",physicsLabels,0);
  menus.add(physics);
  //Map--------------------------------------------------------------------
  
  String []mapLabels = {"Humans","Plants","Animals","Minerals","Metals"};
  
  mapMenu = new Menu(physics.x+physics.w,0,40,20,"Maps",mapLabels,0);
  menus.add(mapMenu);

  //---------------------------------------------------------------------------
  
  String [] neuralNetworkMenuLabels = {"Open","Close"};
  //file.horizontal = false;
  neuralNetworkMenu = new Menu(mapMenu.x+mapMenu.w,mapMenu.y,90,20,"Neural Network",neuralNetworkMenuLabels,0);
  menus.add(neuralNetworkMenu);
  String [] twitterMenuLabels = {"Stream","Show Keywords","Add Keyword","Stream To File","Open Saved Stream"};
  //file.horizontal = false;
  twitter = new Menu(neuralNetworkMenu.x+neuralNetworkMenu.w,neuralNetworkMenu.y,60,20,"Twitter",twitterMenuLabels,0);
  menus.add(twitter);
  
  // grids---------------------------------------------------------------------------------------------
  
  //images.add(loadImage("leaves.jpg"));
  images.add(loadImage("C:\\Users\\admin\\Desktop\\b.jpeg"));
  images.add(loadImage("btfly.jpeg"));
  gimg = new GridImg(W/2-600,H/2-300,1000,660,images);
  gplain = new Grid(W/2-600,H/2-300,1000,780,70,50,6);
  gplain.visible = true;
  //if(BMS.camOpen)gcam = new Cam(W/2-600,H/2-300,1000,660);
  if(BMS.gridOpen){
  g = new Grid(23,H/2-310,1000,500,50);
  
  g.visible = true;
  g.entities = true;
  g.terrain2d = true;
  g.perlheight = true;
  g.trackmouse = true;
  g.border = false;
  g.lim = 4;
  g.forward = true;
  g.trackmouse = true;
  g.elasticity = 0.7f;
  g.fill = true;
  g.hover = true;
  g.circle = false;
  g.bounce = true;
  g.attractor = true;
  }
  file.set(6,0);
  
  //---------------------Entities-----------------------------------
  
  String[] Entities_sub_Labels = {"Show","Add Human","Avoid Bound","Follow Bound","Pause",
                                  "Debug","Adjust","Separation","Cohesion","Alignment","Sync Vel","Sliders",
                                  "Births","Deaths","Reset"};
  
  Entities_sublist = new Menu(W-90,H/2-40,90,Entities_sub_Labels,0);
  Entities_sublist.draggable = true;
  
  Button debug = Entities_sublist.items.get(5);
  
  String [] debuglist = {"Family Ties", "CZone","Target A", "Target B","Heading","Eyes","info","Hide Sliders","QuadP","Field","Limit",};
  
  Entities_sublist.items.get(5).submenu = new Menu(debug.x-80,debug.y,90,debuglist,0);
  Entities_sublist.items.get(5).submenu.parentRight = true;
  Entities_sublist.items.get(5).submenu.draggable = true;
  //Entities_debug.parentRight = true;
  String[] Labelsf = {"Total","FrameRate","B room","Cohesion","Separation","Alignment","Max Force","Max Speed","Wanderm","SceneW", "SceneH","B Cohesion","B Separ.","B room B","Tscale","C Cohesion","C Separ.","C Align","Friction","Min","D Sep"};
  fRate = new sliderBox(90,350,90,5,Labelsf);
  fRate.menu.visible = false;
  fRate.menu.draggable = true;
  /*----------------------------------------------------------------------
  ---img sliders------------------------------------------------------------*/
  
  String [] imgsliderMenu_Labels = {"Conv up","Conv right","Conv  down","Conv left",
                                    "Threshold","conv","mdist","convvp","convvn",
                                    "convhp","convhn"};
                                    
  imgsliderMenu = new Menu(70,400,170,0);
  imgsliderList = new sliderBox(imgsliderMenu.x,imgsliderMenu.y,90,10,imgsliderMenu,imgsliderMenu_Labels);
  
};

public void setupRGB(){
  //rgb_slider = new rgb_Slider(500,200,90,40,15);
  //rgb_slider.display("vertical");
  //rgb_slider.set("color");
  //rgb_slider.set("radio");
};

public void setupPlots(){
  plot = new Plot_2D(main.x,main.y,main.w,main.h,29,30);
  plot.col = color(0,255,0);
  plot.line = true;
};

public void setupReset(){
  reset_dialogue = new Menu(W/2 - 136,H/2 - 22,275,45,"Are you sure you want to exit?");
  reset_dialogue.highlightable = false;
  reset_dialogue.free = true;
  yes = new Button(W/2 - 135 ,H/2 - 20 +30,140,20,"Yes");
  yes.border = false;
  no = new Button(W/2 +5,H/2 - 20 +30,134,20,"No");
  no.border = false;
  
  reset_dialogue.items.add(yes);
  reset_dialogue.items.add(no);
  yes.parent = reset_dialogue;
  no.parent = reset_dialogue;
};

public void setupOthers(){
   textb1 = new TextArea(200,300,200,40,20,4,Lines);
   //textb1.border = true;
   textboxes.add(textb1);
   //textb1.parent = mapMenu;
   txtb1 = new TextBox(200+200,300,200,40,20,"Type text here!");
   txtb1.border = true;
   textb.add(txtb1);
};

public void setupTabs(){
  String [] tabnames = {"Project","Data :","Processing :","Weights :","Bias :","Activation :","Outputs :"};
  tab = new horizontaltabs(100,100,135,200,tabnames);
  
  String [] options = {"Video","Images","Audio","Text","Humans","Plants","Animals","Mazecrawler","Energy","Celluloid"};
  String [] images = {"Feature Extraction","Facial Recognition","Text analysis","Handwriting Detection","Facial Recognition","Facial Mimicry"};
  String [] audio = {"Speech Synthesis","Language Translator","Voice Detection"};
  String [] text = {"Text Analysis","sentiment Analysis","Text writer"};
  String [] livingCreatures = {"Lifespan","Velocity","Connections","Activities","Skill"};
  
  Dropdown dmenu = new Dropdown(5,tab.h - 150,tab.w - 55,"Start",options,0);
  tab tab0 = tab.tabs.get(0);
  
  String []s3 = {"Train", "Test"};
  Dropdown d2 = new Dropdown(5,tab0.h - 70,tab0.w - 55,"Train/Test",s3,0);
  
  tab0.add(0,d2);
  tab0.add(0,dmenu);
  
  tab tab1 = tab.tabs.get(1);
      
  tab1.addState(10);
  String []submenuLabels = {"Open Window","From ClipBoard","Search Web","Record"};
  Dropdown dmenu1 = new Dropdown(5,tab1.h - 150,tab1.w - 55,"Locate",submenuLabels,0);
  Button b = new Button(5,tab1.h - 70,tab1.w - 55,20,"Next -->");
  //tab1.clear();
  tab1.setTitle(0,"Data : Video");
  tab1.add(0,dmenu1);
  tab1.add(0,b);
  
  String []s2 = {"From File","From ClipBoard","Search Web"};
  Dropdown d1 = new Dropdown(5,tab1.h - 150,tab1.w - 55,"Locate",s2,0);
  
  tab1.setTitle(1,"Data : Image");
  tab1.add(1,d1);
  tab1.add(1,b);
  
  String []s5 = {"From File","From ClipBoard","Search Web","Record"};
  dmenu1 = new Dropdown(5,tab1.h - 150,tab1.w - 55,"Locate",s5,0);
  b = new Button(5,tab1.h - 70,tab1.w - 55,20,"Next -->");
  
  tab1.setTitle(2,"Data : Audio");
  tab1.add(2,dmenu1);
  tab1.add(2,b);
  
  String []s6 = {"From File","From ClipBoard","Search Web","Record"};
  dmenu1 = new Dropdown(5,tab1.h - 150,tab1.w - 55,"Locate",s6,0);
  b = new Button(5,tab1.h - 70,tab1.w - 55,20,"Next -->");
  
  tab1.setTitle(3,"Data : Text");
  tab1.add(3,dmenu1);
  tab1.add(3,b);
  
  String []s4 = {"Position","Velocity","Lifespan","Offspring","Happiness","Carrying Capacity","Rest","Dexterity","Strength","Health"};
  Dropdown d3 = new Dropdown(5,tab1.h - 150,tab1.w - 55,"Locate",s4,0);
  
  tab1.setTitle(4,"Data : Entities");
  tab1.add(4,d3);
  tab1.add(4,b);
  
  tab tab2 = tab.tabs.get(2);
  
  String [] submenuLabels2 = {"Load From File","K-clustering","Blur","Line detect","Threshold","Pooling","Flatten","Max Pooling", "Ave Pooling","Dot Pooling","DropOut","FFT"};
  dmenu1 = new Dropdown(5,tab2.h - 150,tab2.w - 55,"Convolution",submenuLabels2,5);
  b = new Button(5,tab2.h - 70,tab2.w - 55,20,"Next -->");
  
  tab2.buttons.add(b);
  tab2.dmenus.add(dmenu1);
  
  tab tab3 = tab.tabs.get(3);
  
  String [] submenuLabels3 = {"From File :","Randomize","Manually"};
  b = new Button(5,tab3.h - 70,tab3.w - 55,20,"Next -->");
  d1 = new Dropdown(5,tab3.h - 150,tab3.w - 55,"Assign",submenuLabels3,5);
  
  tab3.dmenus.add(d1);
  tab3.buttons.add(b);
  
  tab tab4 = tab.tabs.get(4);
  
  d1 = new Dropdown(5,tab4.h - 150,tab4.w - 55,"Assign",submenuLabels3,0);
  b = new Button(5,tab4.h - 70,tab4.w - 55,20,"Next -->");
  
  tab4.dmenus.add(d1);
  tab4.buttons.add(b);
  
  tab tab5 = tab.tabs.get(5);
  
  String [] submenuLabels5 = {"Sigmoid","Tan-h","Relu","Threshold","Binary Step","Linear"};  
  d1 = new Dropdown(5,tab5.h - 150,tab5.w - 55,"Assign",submenuLabels5,5);
  b = new Button(5,tab5.h - 70,tab5.w - 55,20,"Next -->");
  
  tab5.dmenus.add(d1);
  tab5.buttons.add(b);
  
  tab tab6 = tab.tabs.get(6);
  String [] submenuLabels6 = {"Random","Manual"};
  
  d1 = new Dropdown(5,tab6.h - 150,tab6.w - 55,"Assign",submenuLabels6,5);
  b = new Button(5,tab6.h - 70,tab6.w - 55,20,"Finish:");
  
  tab6.dmenus.add(d1);
  tab6.buttons.add(b);
  
  tab.toggle = true;
  
  String [] a = {"hello","goodbye","hello1","goodbye1","hello2","goodbye2"};
  d1 = new Dropdown(200,200,200, a);
  d1.draggable = true;
};

public void loadImg(){
    
};

public void run(){
  globalLogic();
  manageGrid();
  displayButtons();
  mainFunctions();
  menuFunctions();
  //bb.draw3();
  //dd.displayDropdown();
  //checkbox.draw();
};

public void displayButtons(){
  for(int i=0;i<buttons.size();i++){
    Button b = buttons.get(i);
    
    b.draw();
    b.highlight();
  };
};



public void mainFunctions(){
  frameRate(fRate.get(1));
  fill(255);
  plot.draw();
  //textbox(btn40,humans);
  manageClipBoard();
  attractors.functions();
  gplain.grid_functions();
  displayTextBoxes();
  main.render();
  displayEntities();
  fmenu.display();
  //fmenu.display_grid();
  tab.displayTabs();
  tabfunctions();
};

public void displayEntities(){
  for(int i=entities.size()-1;i>-1;i--){
    Entity e = entities.get(i);
    
    e.runh();
    e.life();
  }
};

public void displayTextBoxes(){
  for(TextArea textb : textboxes){
    //textb.draw();
  }
  
  for(TextBox textb : textb){
    //textb.draw();
  }
};

public void manageClipBoard(){
  if(getTextFromClipboard ()!=clipBoard)clipBoard = getTextFromClipboard ();
};

public void click(){
  //reload();
  grid();
  buttons();
  fill(0);
  if(terrain3d)text("terrain",100,120);
};

public void reload(){
  if(buttons.get(0).toggle==1&&!updated){
    frameCount = -1;
    updated = true;
  }
};

public void buttons(){
  
  file.self_toggle(6);
  file.toggle(3,plot,"toggle");
  file.toggle(0,fmenu,"toggle");
  yes.self_Toggle();
  no.self_Toggle();
  String [] gridm = {"forward","backward","pause"};
  Menu grid = file.items.get(2).submenu;
  Menu attractor = file.items.get(5).submenu;
  //grid.toggle(0,g,"toggle");
  if(file.index==2){
  grid.toggle(0,BMS,"gridOpen");
  grid.toggle(1,gimg,"toggle");
  grid.toggle(2,BMS,"camOpen");
  grid.toggle(3,gplain,"toggle");
  grid.toggle(4,gimg,"imgworkflow");
  }
  
  attractor.toggle(0,attractors,"show");
  attractor.toggle(1,attractors,"toggle");
  
  String [] time_bool = {"forward","backward","pause"};
  //----------entities map menu------------------------
  mapMenu.toggle(0,entities.get(0),"toggle");
  //mapmenu.toggle(1,entities.get(1),"toggle");
  //mapmenu.toggle(2,entities.get(2),"toggle");
  //mapmenu.toggle(3,entities.get(3),"toggle");
  //mapmenu.toggle(4,entities.get(4),"toggle");
  //mapmenu.toggle2(5,g,"toggle");
  //mapmenu.toggle(6,g,"toggle");
  
  //----------Shapes------------------------
  String [] shapes_bool = {"toggle","connectedlines","circle","square","tri","bezier","none"};
  
  shapes.sptoggle(0,main,"toggle",shapes_bool);
  shapes.sptoggle(1,main,"connectedlines",shapes_bool);
  shapes.sptoggle(2,main,"circle",shapes_bool);
  shapes.sptoggle(3,main,"square",shapes_bool);
  shapes.sptoggle(4,main,"tri",shapes_bool);
  shapes.sptoggle(5,main,"poligon",shapes_bool);
  shapes.sptoggle(6,main,"complex",shapes_bool);
  shapes.sptoggle(7,main,"bezier",shapes_bool);
  shapes.sptoggle(8,main,"spline",shapes_bool);
  shapes.sptoggle(9,main,"none",shapes_bool);
  shapes.sptoggle(11,main,"path",shapes_bool);
  
  String [] ld = {"draw","edit"};
  
  main.pallete.toggle(0,main,"fill");
  main.pallete.toggle(1,main,"gravity");
  main.pallete.toggle(2,main,"friction");
  main.pallete.toggle(3,main,"velocity");
  main.pallete.toggle(4,main,"connect");
  main.pallete.toggle(5,main,"amendBoundary");
  main.pallete.toggle(6,main,"amendInnerBoundary");
  main.pallete.toggle(7,main,"amendAvoidance");
  main.pallete.toggle(8,main,"amendCohesion");
  main.pallete.toggle(9,main,"followBoundary");
  main.pallete.toggle(10,main,"follow");
  main.pallete.toggle(11,main,"dashed");
  main.pallete.toggle(12,main,"border");
  main.pallete.toggle(13,main,"amendAvoidance");
  main.pallete.toggle(14,main,"showgrid");
  main.pallete.toggle(15,main,"hidemenu");
  main.pallete.sptoggle(16,main,"edit",ld);
  main.pallete.toggle(17,main,"reset");
  //main.complexsub.toggle(0,main,"cfinish");
  
  //----------Entities-----------------
  
  Entities_sublist.toggle(0,entities.get(0),"visible");
  Entities_sublist.toggle(1,entities.get(0),"addh");
  Entities_sublist.toggle(2,entities.get(0),"boundary");
  Entities_sublist.toggle(3,entities.get(0),"followb");
  Entities_sublist.toggle(4,entities.get(0),"pause");
  Entities_sublist.toggle(6,entities.get(0),"dynamic");
  Entities_sublist.toggle(7,entities.get(0),"separationManager");
  Entities_sublist.toggle(8,entities.get(0),"cohesionManager");
  Entities_sublist.toggle(9,entities.get(0),"alignmentManager");
  Entities_sublist.toggle(10,entities.get(0),"showsliders");
  Entities_sublist.toggle(11,entities.get(0),"Birth");
  Entities_sublist.toggle(12,entities.get(0),"Death");
  Entities_sublist.click(13,entities.get(0),"reset");
  
  Menu debug = Entities_sublist.items.get(5).submenu;
  
  debug.toggle(0,entities.get(0),"familyties");
  debug.toggle(1,entities.get(0),"showbroom");
  debug.toggle(2,entities.get(0),"showta");
  debug.toggle(3,entities.get(0),"showtb");
  debug.toggle(4,entities.get(0),"showheading");
  debug.toggle(5,entities.get(0),"showview");
  debug.toggle(6,entities.get(0),"info");
  debug.toggle(7,entities.get(0),"hidesliders");
  debug.toggle(8,entities.get(0).scene,"showq");
  debug.toggle(9,entities.get(0).scene,"showf");
  
  neuralNetworkMenu.toggle(0,tab,"toggle");
  neuralNetworkMenu.toggle2(1,tab,"toggle");
  
  twitter.toggle(0,twitterKeywords,"toggle");
  
  Menu options = plot.options;
  
  options.toggle(0,plot,"grid");
  options.toggle(1,plot,"axis");
  options.toggle(2,plot,"showMouse");
  options.toggle(3,plot,"labels");
  options.toggle(4,plot,"showTab");
  options.toggle(5,plot,"loadRdata1");
  options.toggle(6,plot,"loadRdata2");
  options.toggle(9,plot,"clear");
  options.toggle(10,plot,"toggle");
  
};

public void grid(){
  //-------------pallete-------------------------
  String [] timebool = {"forward","backward","pause"};
  if(g!=null){
  g.pallete.draggable = true;
  g.pallete.toggle(0,g,"circle");
  g.pallete.toggle(1,g,"visible");
  g.pallete.toggle(2,g,"graph");
  g.pallete.toggle(3,g,"attractor");
  g.pallete.sptoggle(4,g,"forward",timebool);
  g.pallete.sptoggle(5,g,"backward",timebool);
  g.pallete.sptoggle(6,g,"pause",timebool);
  g.pallete.toggle(7,g,"heading");
  g.pallete.toggle(8,g,"save");
  g.pallete.toggle(9,g,"load");
  g.pallete.toggle(10,g,"contour");
  g.pallete.toggle(11,g,"mouse");
  g.pallete.toggle(12,g,"reset");
  g.pallete.toggle(13,g,"populateBoundaries");
  g.pallete.toggle(14,g,"PopulateSpecies");
  g.pallete.toggle(15,g,"debug");
  }
};

public void slider_functions(){
  
  //--------img-------------------------------
  
  imgsliderList.set(0,1,-1,gimg,"convup");
  imgsliderList.set(1,1,-1,gimg,"convright");
  imgsliderList.set(2,1,-1,gimg,"convdown");
  imgsliderList.set(3,1,-1,gimg,"convleft");
  imgsliderList.set(4,-100,300,gimg,"threshold");
  imgsliderList.set(5,1,-1,gimg,"conv");
  imgsliderList.set(6,20,300,gimg,"mdist");
  imgsliderList.set(7,1,-1,gimg,"convvp");
  imgsliderList.set(8,1,-1,gimg,"convvn");
  imgsliderList.set(9,1,-1,gimg,"convhp");
  imgsliderList.set(10,1,-1,gimg,"convhn");
  
  //----------Entities------------
  
  fRate.setint(0,1,4,entities.get(0).scene,"limit");
  fRate.set(1,0,60);
  fRate.set(2,0,200,entities.get(0),"breathingroom");
  fRate.set(3,-100,100,entities.get(0),"cohesion");
  fRate.set(4,-100,100,entities.get(0),"separation");
  fRate.set(5,-100,100,entities.get(0),"alignment");
  fRate.set(6,-50,50,entities.get(0),"alimit");
  fRate.set(7,-50,50,entities.get(0),"vlimit");
  fRate.set(8,0,5,entities.get(0),"wanderm");
  fRate.set(9,50,1200,entities.get(0),"w");
  fRate.set(10,50,600,entities.get(0),"h");
  fRate.set(11,-100,100,entities.get(0),"cohesionb");
  fRate.set(12,-100,100,entities.get(0),"separationb");
  fRate.set(13,0,200,entities.get(0),"breathingroomb");
  fRate.set(14,0,0.5f,entities.get(0),"tscale");
  fRate.set(16,-50,50,entities.get(0),"separationc");
  fRate.set(15,-50,50,entities.get(0),"cohesionc");
  fRate.set(17,-50,50,entities.get(0),"alignmentc");
  fRate.set(18,0,1,entities.get(0),"mu");
  fRate.set(19,0,200,entities.get(0),"min");
  fRate.set(20,-100,100,entities.get(0),"separationd");
  
  //---------grid-------------------
  
  if(g!=null){
    //sliderMenu.set(0,-1,1,g,"zoom","sdown");
    //sliderMenu.set(1,0,255,g,"sealevel","sdown");
    //sliderMenu.set(2,0,255,g,"groundlevel2","sdown");
    //sliderMenu.set(3,0,255,g,"grasslevel","sdown");
    //sliderMenu.set(4,0,255,g,"mountainlevel","sdown");
    //sliderMenu.set(5,-200,200,g,"distance","sdown");
    //sliderMenu.set(6,-200,200,g,"vdistance","sdown");
    //sliderMenu.set(7,-200,200,g,"hdistance","sdown");
    //sliderMenu.set(8,-360,360,g,"xrot","sdown");
    //sliderMenu.set(9,-360,360,g,"yrot","sdown");
    //sliderMenu.set(10,-360,360,g,"zrot","sdown");
    //sliderMenu.set(11,0,1,g,"xvar","sdown");
    //sliderMenu.set(12,0,2,g,"noise""sdown");
    
    g.sliderMenu.set(0,-1,1,g,"zoom");
    g.sliderMenu.set(1,0,2,g,"sealevel");
    g.sliderMenu.set(2,0,2,g,"groundlevel");
    g.sliderMenu.set(3,0,2,g,"grasslevel");
    g.sliderMenu.set(4,0,2,g,"mountainlevel");
    g.sliderMenu.set(5,0,0.05f,g,"scale1");
    g.sliderMenu.set(6,0,0.05f,g,"scale2");
    g.sliderMenu.set(7,0,0.05f,g,"scale3");
    g.sliderMenu.set(8,0,1,g,"amp1");
    g.sliderMenu.set(9,0,1,g,"amp2");
    g.sliderMenu.set(10,0,1,g,"amp3");
    g.sliderMenu.set(11,1,4,g,"freq1");
    g.sliderMenu.set(12,1,4,g,"freq2");
    g.sliderMenu.set(13,1,4,g,"freq3");
    g.sliderMenu.set(14,-100000,100000,g,"seed");
  }
};

public void manageGrid(){
  if(gridOpen&&g==null){
  g = new Grid(23,H/2-310,1000,500,5);
  g.pallete.items.get(1).toggle = 1;
  g.toggle=true;
  gridSeeded = false;
  }
  if(gridOpen&&g!=null){
    if(g!=null)g.grid_functions();
    }
  if(!gridOpen){
    g = null;
    if(!gridSeeded)gridSeeded = true;
    
  }
  
  if(BMS.camOpen){
    if(gcam==null){
    gcam = new Cam(W/2-600,H/2-300,1000,660);
    gcam.toggle = true;
    gcam.normal_cam = true;
    BMS.Cam.start();
    
  }else gcam.cam_functions();
   }else if(gcam != null){
     gcam = null;
     BMS.Cam.stop();
   }
};

public void menuFunctions(){
  
  Mcount = 0;
  
  for(int i=0;i<BMS.menus.size();i++){
    
    Menu m = BMS.menus.get(i);
    m.draw();
    
    if(m.parent==null&&(m.pos()||m.toggle==1)){Mcount++;}
    else if(m.parent!=null&&m.items.size()>0&&m.parent.toggle==1){
      for(int j=0;j<m.items.size();j++){
        Button b = m.items.get(j);
        if(b.pos())Mcount++;
      }}
      else if(m.sliders.size()>0&&m.parent.toggle==1){
      for(int j=0;j<m.sliders.size();j++){
        Slider b = m.sliders.get(j);
        if(b.pos())Mcount++;
      }
  }
  
  if(Mcount>0)open_menus = true;
  else open_menus = false;
  }
};

public void boundariesNscenes(){
  
  //------------------------------------------------------
  //Boundaries--------------------------------------------
};

public void startCam(){
  Cam.start();
};

public void autoSave(){
  
  if(autoSave){
    saveText();
  }
  
};

public void load(){
  
};

public void saveText(){
  
  for(int i=0;i<textBoxes.size();i++){
    TextBox t = textBoxes.get(i);
    
    t.save();
  }
  
  for(int i=0;i<textAreas.size();i++){
    TextArea t = textAreas.get(i);
    
    t.save();
  }
};

public void saveSliderBox(){
  
  for(int i=0;i<sliderBoxes.size();i++){
    sliderBox s = sliderBoxes.get(i);
    
    s.save();
  }
};

public void saveButtons(){
  
  for(int i=0;i<buttons.size();i++){
    Button b = buttons.get(i);
    
    b.save();
  }
};

public void saveMenu(){
  
  for(int i=0;i<menus.size();i++){
    Menu m = menus.get(i);
    
    m.save();
  }
  
  for(int i=0;i<textAreas.size();i++){
    TextArea t = textAreas.get(i);
    
    t.save();
  }
};

public void saveGrid(){
  
  for(int i=0;i<grids.size();i++){
    Grid g = grids.get(i);
    
    g.save();
  }
  
  for(int i=0;i<cams.size();i++){
    Cam c = cams.get(i);
    
    c.save();
  }
};

public void saveTabs(){
  
  for(int i=0;i<tabs.size();i++){
    tab t = tabs.get(i);
    
    t.save();
  }
  
  for(int i=0;i<tabs.size();i++){
    tab t = tabs.get(i);
    
    t.save();
  }
};

public void saveImgp(){
  
  for(int i=0;i<textBoxes.size();i++){
    TextBox t = textBoxes.get(i);
    
    t.save();
  }
};

public void save(){
  
};

public void start(Object o,boolean localVar){
    Field field = null;
    
    String s = "hello";
    
    try{
      //field = o.getClass().getfield(s);
      field = applet.getClass().getField(s); 
      }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }}
    
    public void eventListener(){
  
};

public void toggle(Object o,String globalVar,boolean localVar){
    Field field = null;
    
    try{
      
      field = applet.getClass().getField(globalVar);
      
      
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }
  
};

public void globalLogic(){
  if(mousePressed) globaldown = true;
  else globaldown = false;
};
  
};
 class Boundary{
  
  float x1,x2,y1,y2,w,h,x3,y3,size = 1,x4,y4,D1,D2,T1,T2,collision_index,menux,menuy,deltamx,deltamy,tacx,tacy,dir;
  float x,y,bx = x,by = y;
  public float mass,vx,vy,ax,ay,density,friction_u,momentum,bax ,bay,pathWidth=20,
               gconst = 0.1f,floor = 590,rtheta = 0,avoidance,cohesion,broom;
  PVector p1,midpoint1,midpoint2,midpoint3,m = new PVector(0,0);
  PVector p2,p3,p4,center = new PVector(-1,-1),vel,ac,rotatep;
  int key1,key2,type,t,t2,vert,vert1,vert3,trit,id,index,lindex,sindex,ccount,sid,vcount,hcount,uindex = -1,counter,tpoints,mcount,sides,shapeIndex,lineIndex,lcount,pcount
      ,options = -1,numm,state,state1=1,gid;
  public int cols = 40,rows = 25;
  public boolean toggle = false,mdown,mup = true,circle,square,bezier,tri,c_poligon,poligon,drag,none,spline,hover,hover2,point1,point2,point3,point4,gravity,hidemenu,clear,
                 edit,complex,cstart,showgrid,cfinish = false,border,fill,hidden,connectedlines,path,avoidBoundary,cohesionBoundary,amendBoundary,amendInnerBoundary,
                 amendCohesion,amendAvoidance,dashed;
  boolean linedown = false,sdown,rtoggle,click,open,dynamic = true,falling = true,rotating,update,lock,pdown,updatep,updateg,tdown,trow,menudown,pointadded,converted,rdown,phover,
          lhover,contextClick,visible = true;
  float dx,dy,Theta,Norm;
  int col = color(255),bg = color(0,180);
  ArrayList<Integer> indices = new ArrayList<Integer>();
  ArrayList<Button> Buttons = new ArrayList<Button>();
  ArrayList<Boundary> Boundaries = new ArrayList<Boundary>();
  ArrayList<Boundary> innerBoundaries = new ArrayList<Boundary>();
  ArrayList<Boundary> outerBoundaries = new ArrayList<Boundary>();
  ArrayList<PVector> points = new ArrayList<PVector>();
  ArrayList<PVector> rotation_points = new ArrayList<PVector>();
  Scene scene;
  ArrayList<Scene> scenes = new ArrayList<Scene>();
  Boundary parent;
  Boundary child;
  PShape bpath;
  ArrayList<PShape> paths = new ArrayList<PShape>();
  ArrayList<Float[]> velocity = new ArrayList<Float[]>();
  ArrayList<PVector> velocitypv = new ArrayList<PVector>();
  ArrayList<Boundary> Quadrants = new ArrayList<Boundary>();
  ArrayList<PVector> Midpoints = new ArrayList<PVector>();
  ArrayList<PVector> collision_array = new ArrayList<PVector>();
  //ArrayList<PVector> Midpoints = new ArrayList<PVector>();
  
  String []contextlabels = {"Undo","Redo"};
  String []contextDellabels = {"Delete Point","Cancel","Shape"};
  String []palletelabels = {"Fill","Gravity","Friction","Velocity","Connect","Amend B","Amend iB","Avoid","Seek",
                            "Follow","Dashed","Border","Clear","Visible","Grid","Hide","Edit","Reset"};
  String []complexmenu = {"Finish"};
  String []convertmenu = {"Convert","Delete Shape","Shape"};
  String []connectedlMenul = {"Convert","Delete Line","Delete Shape","Shape"};
  
  Menu palletehide,context,contextDel,pallete,complexsub,convertToPath,connectedlMenu;
  String [] settingsLabel = {"Cohesion","Separation","B room"};
  sliderBox settings;
  
  TextBox Sides = new TextBox (W-200,H-200,20,20,5,"Sides");
  ArrayList<Float> norm = new ArrayList<Float>();
  ArrayList<Float[]> mdist = new ArrayList<Float[]>();
  ArrayList<Float[]> pdist = new ArrayList<Float[]>();
  ArrayList<Float> dist = new ArrayList<Float>();
  ArrayList<Integer> types = new ArrayList<Integer>();
  ArrayList<Float> theta = new ArrayList<Float>();
  ArrayList<Float> mtheta = new ArrayList<Float>();
  ArrayList<PVector> temp = new ArrayList<PVector>();
  ArrayList<ArrayList> polytemp = new ArrayList<ArrayList>();
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  
  PVector polymidpoint = new PVector(0,0);
  Grid gridlayout;
  ArrayList<Point> grid = new ArrayList<Point>();
  ArrayList<Point> ugrid = new ArrayList<Point>();
  ArrayList<Point> ogrid = new ArrayList<Point>();
  
  tab palleteTab;
  Boundary(){
    
    palletehide = new Menu(0,200+300/2 - 100,20,50);
    context = new Menu(mouseX,mouseY,90,contextlabels);
    contextDel = new Menu(mouseX,mouseY,90,contextDellabels);
    pallete = new Menu(0,200,90,palletelabels,0);
    complexsub = new Menu(W-200,H-200,90,complexmenu);
    convertToPath = new Menu(mouseX,mouseY,90,convertmenu);
    connectedlMenu = new Menu(mouseX,mouseY,90,connectedlMenul);
    settings = new sliderBox(mouseX,mouseY,90,5,settingsLabel);
    settings.menu.draggable = false;
    settings.tooltip.visible = false;
    type = -1;
    
    setupPallete();
    
  };
  
  Boundary(float X1, float Y1,float X2, float Y2){
    
    x1 = X1;
    y1 = Y1;
    x2 = X2;
    y2 = Y2;
    type = 2;
    p1 = new PVector(x1,y1);
    p2 = new PVector(x2,y2);
    center = new PVector((x1+x2)/2,(y1+y2)/2);
    
  };
  
  Boundary(float X1, float Y1,float ww,float hh,int Type){
    
    float t1 = 0;
    x1 = X1;
    y1 = Y1;
    w = ww;
    h = hh;
    
    Float [] d1 = {0.0f,0.0f};
    Float [] vel = {0.0f,0.0f};
    
    if(Type==0){
    
    x1 = X1;
    y1 = Y1;
    w = ww;
    h = hh;
    x2 = x1 + ww;
    y2 = y1 + hh;
    
    type = 0;
    center = new PVector((x1+x2)/2,(y1+y2)/2);
    d1[0] = center.x - x1;
    d1[1] = center.y - y1;
    pdist.add(d1);
    t1 = atan2(y1-center.y,x1-center.x);
    theta.add(t1);
    d1[0] = center.x - x2;
    d1[1] = center.y - y2;
    pdist.add(d1);
    t1 = atan2(y2-center.y,x2-center.x);
    theta.add(t1);
    
    }
    
    if(Type==2){
    x1 = X1;
    y1 = Y1;
    x2 = ww;
    y2 = hh;
    
    type = 2;
    center = new PVector((x1+x2)/2,(y1+y2)/2);
    Boundaries.add(new Boundary(x1,y1,x2,y2));
    d1[0] = center.x - x1;
    d1[1] = center.y - y1;
    pdist.add(d1);
    t1 = atan2(y1-center.y,x1-center.x);
    theta.add(t1);
    d1[0] = center.x - x2;
    d1[1] = center.y - y2;
    pdist.add(d1);
    t1 = atan2(y2-center.y,x2-center.x);
    theta.add(t1);
    velocity.add(vel);
    create_rotation_points(Boundaries);
    create_points(Boundaries);
    
    }
    
    if(Type==0||Type==2){
      center = new PVector((x1+x2)/2,(y1+y2)/2);
    }
    
    if(Type==3){
    
    w = dist(x1,y1,ww,hh);
    h = dist(x1,y1,ww,hh);
    
    Norm = -atan2(x1 - ww,y1 - hh);
    
    x2 = ww + w/1.5f * cos(Norm);
    y2 = hh + h/1.5f * sin(Norm);
    x3 = ww - w/1.5f * cos(Norm);
    y3 = hh - h/1.5f * sin(Norm);
    
    center = new PVector((x1+x2+x3)/3,(y1+y2+y3)/3);
    Boundaries.add(new Boundary(x1,y1,x2,y2));
    velocity.add(vel);
      d1[0] = center.x - x1;
      d1[1] = center.y - y1;
      pdist.add(d1);
      t1 = atan2(y1-center.y,x1-center.x);
      theta.add(t1);
    midpoint1 = new PVector((x1 + x2)/2,(y1 + y2)/2);
    Boundaries.add(new Boundary(x2 , y2 ,x3 , y3));
     d1[0] = center.x - x2;
     d1[1] = center.y - y2;
     pdist.add(d1);
     t1 = atan2(y2-center.y,x2-center.x);
     theta.add(t1);
    midpoint2 = new PVector((x2 + x3)/2,(y2 + y3)/2);
    velocity.add(vel);
    Boundaries.add(new Boundary(x3, y3,x1,y1 ));
      d1[0] = center.x - x3;
      d1[1] = center.y - y3;
      pdist.add(d1);
      t1 = atan2(y3-center.y,x3-center.x);
      theta.add(t1);
    velocity.add(vel);
    midpoint3 = new PVector((x3 + x1)/2,(y3 + y1)/2);
    type = 3;
    create_rotation_points(Boundaries);
    create_points(Boundaries);
    
    }
    
    if(Type==4){
      
    x2 = x1 + ww;
    y2 = y1;
    x3 = x1 + ww;
    y3 = y1 + hh;
    x4 = x1;
    y4 = y1 + hh;
    
    center = new PVector((x1+x2+x3+x4)/4,(y1+y2+y3+y4)/4);
    Boundaries.add(new Boundary(x1,y1,x2,y2));
    velocity.add(vel);
      d1[0] = center.x - x1;
      d1[1] = center.y - y1;
      pdist.add(d1);
      t1 = atan2(y1-center.y,x1-center.x);
      theta.add(t1);
    Boundaries.add(new Boundary(x2,y2,x3,y3));
    velocity.add(vel);
      d1[0] = center.x - x2;
      d1[1] = center.y - y2;
      pdist.add(d1);
      t1 = atan2(y2-center.y,x2-center.x);
      theta.add(t1);
    Boundaries.add(new Boundary(x3,y3,x4,y4));
    velocity.add(vel);
      d1[0] = center.x - x3;
      d1[1] = center.y - y3;
      pdist.add(d1);
      t1 = atan2(y3-center.y,x3-center.x);
      theta.add(t1);
    Boundaries.add(new Boundary(x4,y4,x1,y1));
    velocity.add(vel);
      d1[0] = center.x - x4;
      d1[1] = center.y - y4;
      pdist.add(d1);
      t1 = atan2(y4-center.y,x4-center.x);
      theta.add(t1);

    center = new PVector((x1+x2+x3+x4)/4,(y1+y2+y3+y4)/4);
    type = 4;
    }
    
    if(Type==103){
      
    Norm = -atan2(x1 - ww,y1 - hh);
    
    x2 = x1 + w/2 ;
    y2 = y1 + h ;
    x3 = x1 - w/2 ;
    y3 = y1 + h ;
    center = new PVector((x1+x2+x3)/3,(y1+y2+y3)/3);
    Boundaries.add(new Boundary(x1,y1,x2,y2));
    velocity.add(vel);
      d1[0] = center.x - x1;
      d1[1] = center.y - y1;
      pdist.add(d1);
      t1 = atan2(y1-center.y,x1-center.x);
      theta.add(t1);
    midpoint1 = new PVector((x1 + x2)/2,(y1 + y2)/2);
    Boundaries.add(new Boundary(x2 , y2 ,x3 , y3));
     d1[0] = center.x - x2;
     d1[1] = center.y - y2;
     pdist.add(d1);
     t1 = atan2(y2-center.y,x2-center.x);
     theta.add(t1);
    midpoint2 = new PVector((x2 + x3)/2,(y2 + y3)/2);
    velocity.add(vel);
    Boundaries.add(new Boundary(x3, y3,x1,y1 ));
      d1[0] = center.x - x3;
      d1[1] = center.y - y3;
      pdist.add(d1);
      t1 = atan2(y3-center.y,x3-center.x);
      theta.add(t1);
    velocity.add(vel);
    midpoint3 = new PVector((x3 + x1)/2,(y3 + y1)/2);
    type = 3;
    create_points(Boundaries);
    
    }
    
    type = Type;
    create_points(Boundaries);
    create_dist();
    create_angles(Boundaries);
    create_rotation_points(Boundaries);
  };
  
  Boundary (float X1, float Y1,float X2,float Y2,float X3, float Y3){

    x1 = X1;
    y1 = Y1;
    x2 = X2;
    y2 = Y2;
    x3 = X3;
    y3 = Y3;
    type = 3;
  };
  
  Boundary(PVector A, PVector B,PVector C){

    p1 = A;
    p2 = B;
    p3 = C;
    x1 = p1.x;
    y1 = p1.y;
    x2 = p2.x;
    y2 = p2.y;
    type = 3;
  };
  
  Boundary(PVector A, PVector B){

    p1 = A;
    p2 = B;
    x1 = p1.x;
    y1 = p1.y;
    x2 = p2.x;
    y2 = p2.y;
  };
  
  Boundary(ArrayList<Point> A){
  
   center = new PVector (0,0);
    for(int i=0;i<A.size();i++){
      
      Point a = A.get(i);
      Point b = A.get(i);
      
      if(i<A.size()-1)b = A.get(i+1);
      else b = A.get(0);
      Boundary B = new Boundary(a.x,a.y,b.x,b.y,2);
      Boundaries.add(B);
      
    }
    
      calc_center();
      create_points(Boundaries);
      create_dist();
      create_angles(Boundaries);
      create_rotation_points(Boundaries);
      type = 105;
  };
  
  Boundary(ArrayList<Point> A,int k){
  
   center = new PVector (0,0);
    for(int i=0;i<A.size();i++){
      
      Point a = A.get(i);
      Point b = null;
      Point c = null;
      
      if(i+2<A.size()){
       b = A.get(i+1);
       c = A.get(i+2);
      
      if(((b.x==a.x)&&(c.x==a.x)||b.y==a.y&&(c.y==a.y))){
        A.remove(i+1);
        i--;
        
      }else{
        Boundary B = new Boundary(a.x,a.y,b.x,b.y,2);
        Boundaries.add(B);
      }}else if(i+1<A.size()){
        b = A.get(i+1);
        Boundary B = new Boundary(a.x,a.y,b.x,b.y,2);
        Boundaries.add(B);
      }}
    
      calc_center();
      create_points(Boundaries);
      create_dist();
      create_angles(Boundaries);
      create_rotation_points(Boundaries);
      type = 106;
  };
  
  Boundary(Boundary B){
   
   //Boundaries = B.Boundaries;
   
   if(B.type==106){
     
   float pw = pathWidth; 
   
   center = new PVector (0,0);
   
   Boundary b0 = B.Boundaries.get(0);
   
   PVector p0 = new PVector(b0.x1,b0.y1);
   PVector p1 = new PVector(b0.x2,b0.y2);
   
   float t = -atan2(p0.x-p1.x,p0.y-p1.y);
   
   PVector p2 =  new PVector(p0.x+pw*cos(t),p0.y+pw*sin(t));
   PVector p3 =  new PVector(p0.x-pw*cos(t),p0.y-pw*sin(t));
   
   Boundary b = new Boundary(p1,p2);
   
   Boundaries.add(b);
   
    for(int i=1;i<B.Boundaries.size()-1;i++){
      
      b = B.Boundaries.get(i);
      
      Boundary b1 = B.Boundaries.get(i-1);
      Boundary b2 = B.Boundaries.get(i+1);
      
      p0 = new PVector(b.x1,b.y1);
      p1 = new PVector(b1.x2,b1.y2);
      
      p2 = new PVector(b2.x2,b2.y2);
      p3 = new PVector();
      
      float t1 = atan2(p0.y-p1.y,p0.x-p1.x);
      float t2 = atan2(p0.y-p2.y,p0.x-p2.x);
      
      t = -1/((t1+t2)/2);
      
      PVector p4 = new PVector(p0.x+pw*cos(t),p0.y+pw*sin(t));
      PVector p5 = new PVector(p1.x+pw*cos(t),p1.y+pw*sin(t));
      
      Boundaries.add(new Boundary(p4.x,p4.y,p5.x,p5.y));
      
      }
      
      b0 =  B.Boundaries.get(B.Boundaries.size()-1);
      p0 = new PVector(b0.x1,b0.y1);
     
      t = radians(90);
      p1 =  new PVector(p0.x+pw*cos(t),p0.y+pw*sin(t));
      p2 =  new PVector(p0.x-pw*cos(t),p0.y-pw*sin(t));
     
      b = new Boundary(p1,p2);
     
      Boundaries.add(b);
      
      for(int i=B.Boundaries.size()-1;i>-1;i--){
      
      b = B.Boundaries.get(i);
      Boundary b1 = B.Boundaries.get(i-1);
      Boundary b2 = B.Boundaries.get(i+1);
      
      p0 = new PVector(b.x1,b.y1);
      p1 = new PVector(b1.x2,b1.y2);
      
      p2 = new PVector(b2.x2,b2.y2);
      p3 = new PVector();
      
      float t1 = atan2(p0.y-p1.y,p0.x-p1.x);
      float t2 = atan2(p0.y-p2.y,p0.x-p2.x);
      
      t = -1/((t1+t2)/2);
      
      PVector p4 = new PVector(p0.x-pw*cos(t),p0.y-pw*sin(t));
      PVector p5 = new PVector(p1.x-pw*cos(t),p1.y-pw*sin(t));
      
      Boundaries.add(new Boundary(p4.x,p4.y,p5.x,p5.y));
      
      }
    
      calc_center();
      create_points(Boundaries);
      create_dist();
      create_angles(Boundaries);
      create_rotation_points(Boundaries);
      type = 107;
      
   }else if(B.type!=0){
     
     float pw = pathWidth; 
   
      center = B.center;
      calcInner(B);
      calcOuter(B);
    
      create_points(innerBoundaries);
      create_points(outerBoundaries);
      create_angles(innerBoundaries);
      create_angles(outerBoundaries);
      create_rotation_points(innerBoundaries);
      create_rotation_points(outerBoundaries);
      type = 107;
   }else {
     
   }
  };
  
  public Point getNextPoint(ArrayList<Point> a,Point b){
    Point c = null;
    for(int i=0;i<a.size();i++){
      Point d = a.get(i);
      if(d.x!=b.x&&d.y!=b.y)c = d; 
    }
    
    return c;
  };
  
  public void debug(){
    fill(255);
  };
  
  public void calcInner(Boundary a){
    if(a.type==0){
      
    }else if(a.type!=0&&a.type!=106){
      
      float pw = a.pathWidth;
      
    for(int i=0;i<a.Boundaries.size();i++){
      Boundary b = a.Boundaries.get(i);
      Boundary b1 = a.Boundaries.get(i);
      
      if(i<a.Boundaries.size()-1)b1 = a.Boundaries.get(i+1);
      else b1 = a.Boundaries.get(0);
      
      PVector p = new PVector(b.x1,b.y1);
      PVector p1 = new PVector(b.x2,b.y2);
      
      float t = atan2(a.center.y-p.y,a.center.x-p.x);
      float d = dist(p.x,p.y,a.center.x,a.center.y);
      
      float t1 = atan2(a.center.y-p1.y,a.center.x-p1.x);
      float d1 = dist(p1.x,p1.y,a.center.x,a.center.y);
      
      PVector p2 = new PVector(a.center.x+(d-pw)*cos(t),a.center.y+(d-pw)*sin(t));
      PVector p3 = new PVector(a.center.x+(d1-pw)*cos(t1),a.center.y+(d1-pw)*sin(t1));
      
      
      //a.innerBoundaries.add(new Boundary(p2.x,p2.y,p3.x,p3.y));
      //a.outerBoundaries.add(new Boundary(p2.x,p2.y,p3.x,p3.y));
    }a.type = 107;}else{
      
    }
    
  };
  
  public void calcOuter(Boundary a){
    if(a.type==0){
      
    }else if(a.type!=0&&a.type!=106){
      
      float pw = a.pathWidth;
      
    for(int i=0;i<a.Boundaries.size();i++){
      Boundary b = a.Boundaries.get(i);
      Boundary b1 = a.Boundaries.get(i);
      
      if(i<a.Boundaries.size()-1)b1 = a.Boundaries.get(i+1);
      else b1 = a.Boundaries.get(0);
      
      PVector p = new PVector(b.x1,b.y1);
      PVector p1 = new PVector(b1.x1,b1.y1);
      
      float t = atan2(a.center.y-p.y,a.center.x-p.x)-PI;
      float d = dist(p.x,p.y,a.center.x,a.center.y);
      
      float t1 = atan2(a.center.y-p1.y,a.center.x-p1.x)-PI;
      float d1 = dist(p1.x,p1.y,a.center.x,a.center.y) ;
      
      PVector p2 = new PVector(a.center.x+(d+pw)*cos(t),a.center.y+(d+pw)*sin(t));
      PVector p3 = new PVector(a.center.x+(d1+pw)*cos(t1),a.center.y+(d1+pw)*sin(t1));
      
      PVector p4 = new PVector(a.center.x+(d)*cos(t) - pw*cos(t),a.center.y+(d)*sin(t) - pw*sin(t));
      PVector p5 = new PVector(a.center.x+(d1)*cos(t1) - pw*cos(t),a.center.y+(d1)*sin(t1) - pw*sin(t));
      
      a.innerBoundaries.add(new Boundary(p4.x,p4.y,p5.x,p5.y));
      a.outerBoundaries.add(new Boundary(p2.x,p2.y,p3.x,p3.y));
    }a.type = 107;}else{
      
    }
  };
  
  public void setupPallete(){
    if(type==-1){
    palleteTab = new tab(25,H-70,W-50,70,this);
    palleteTab.scrollable = true;
    palleteTab.states.get(0).scrollable = true;
    palleteTab.toggle=true;
    palleteTab.visible = true;
    palleteTab.sliderh.visible = false;
    palleteTab.sliderv.valuex = 0;
    palleteTab.sliderv.h +=20;
    //palleteTab.states.remove(1);
    }
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void draw(){
      if((open||none))palleteTab.displayTab();
      
      
     hcount = 0;lcount = 0;pcount = 0;
     boolean lineHover = false;
     int k = -1;
     fill(255);
     
     if(mouseX>0)m.x = mouseX;
     if(mouseY>0)m.y = mouseY;
    if(!clear){
    //for(int i=Boundaries.size()-1;i>-1;i--){
      for(int i=1;i<Boundaries.size();i++){
      Boundary b = Boundaries.get(i);
      
      b.id = i;
      if(!b.visible&&pos(b,m)){
        if(visible&&mousePressed&&mouseButton==LEFT)b.visible = true;
      }
      if(b.visible){
      if((edit&&!settings.visible)||(settings.visible&&!settings.pos())){
      if(b.type!=2&&!point1&&!point2&&!linedown&&!rdown)mtranslate(b,m);
      if(!point1&&!point2&&!tdown&&!rdown)move(b,m);
      if((b.type!=0)&&!linedown&&!tdown&&!rdown)pospoint(b);
      if(!point1&&!point2&&!linedown&&!tdown)pos_rotationpoint(b);
      b.update(b);
      }
      
      if(!pospoint(b,0))pcount++;
      
      if(gravity)b.gravity = true;
      else b.gravity = false;
      
      strokeWeight(1);
      if(pos(b,m)){
        //if(
        if(!visible&&mousePressed)b.visible = false;
        if(mousePressed)lineIndex = -1;
        if(amendBoundary){
          fill(255);
          text(b.state,b.x1,b.y1);
                if(mousePressed){
                if(amendCohesion&&amendAvoidance)b.state = 1;
                else if(amendCohesion&&!amendAvoidance)b.state = 2;
                else if(!amendCohesion&&amendAvoidance)b.state = 3;
                else if(!amendCohesion&&!amendAvoidance)b.state = 4;
         }}
        indices.add(i);
        if(indices.size()>2)indices.remove(0);
      }
      if(!pos(b,m))hcount ++;
        
        if(b.type==0){
          stroke(0);
          fill(0,50);strokeWeight(1);
          if(pos(b,m)){
            shapeIndex=i;
            fill(255,50);
          }
          ellipseMode(CENTER);
          ellipse(b.center.x,b.center.y,b.w,b.h);
        }else if(b.type!=107){
          
          if(b.type!=106)fill(0,50);
          else noFill();
          if(pos(b,m)){
            shapeIndex=i; 
            fill(255,50);
            if(mousePressed)lineIndex = -1;
          }
          stroke(0);
          beginShape();
          
          for(int j=0;j<b.Boundaries.size();j++){
            Boundary c = b.Boundaries.get(j);
            
            vertex(c.x1,c.y1);
            vertex(c.x2,c.y2);
          }}}
          if(b.type==106)endShape();
          else if(b.type!=107)endShape(CLOSE);
          
          if(b.type==107){
            
            //if(!b.converted){
              
          b.bpath = createShape();
          //---------------begin shape------------------------------------
          beginShape();
          fill(0,150);
          stroke(0);
          strokeWeight(1);
          //-------------exterior------------------------------------
          
          for(int j=0;j<b.outerBoundaries.size()-1;j++){
            
            Boundary c = b.outerBoundaries.get(j);
            Boundary c1 = b.outerBoundaries.get(j+1);
            
            vertex(c.x1,c.y1);
            vertex(c1.x1,c1.y1);
            
            
            
            if(pos(c,m)){
              if(amendInnerBoundary){
                if(mousePressed){
                     lineIndex = -1;
                     if(amendCohesion&&amendAvoidance)c.state1 = 1;
                else if(amendCohesion&&!amendAvoidance)c.state1 = 2;
                else if(!amendCohesion&&amendAvoidance)c.state1 = 3;
                else if(!amendCohesion&&!amendAvoidance)c.state1 = 4;
              }}
              if(c.state1==3)stroke(255,0,0);
              else if(c.state1==2)stroke(0,0,255);
              else if(c.state1==1)stroke(0,255,0);
              line(c.x1,c.y1,c.x2,c.y2);
              lineHover = true;
              k = j;
          }}
          //------------interior------------------------------------
          beginContour();
          
          for(int j=b.innerBoundaries.size()-1;j>0;j--){
            
            Boundary c = b.innerBoundaries.get(j);
            Boundary c1 = b.innerBoundaries.get(j-1);
            
            vertex(c.x1,c.y1);
            vertex(c1.x1,c1.y1);
            if(pos(c,m)){
              if(amendInnerBoundary){
                if(mousePressed){
                     lineIndex = -1;
                     if(amendCohesion&&amendAvoidance)c.state1 = 1;
                else if(amendCohesion&&!amendAvoidance)c.state1 = 2;
                else if(!amendCohesion&&amendAvoidance)c.state1 = 3;
                else if(!amendCohesion&&!amendAvoidance)c.state1 = 4;
              }}
              if(c.state1==3)stroke(255,0,0);
              else if(c.state1==2)stroke(0,0,255);
              else if(c.state1==1)stroke(0,255,0);
              line(c.x1,c.y1,c.x2,c.y2);
              lineHover = true;
              k = j;
          }}
          //for(int j=0;j<b.innerBoundaries.size()-1;j++){
            
          //  Boundary c = b.innerBoundaries.get(j);
          //  Boundary c1 = b.innerBoundaries.get(j+1);
            
          //  vertex(c.x1,c.y1);
          //  vertex(c.x2,c.y2);
          //  //vertex(c1.x1,c.y1);
          //}
            endContour();
            //----------end shape------------------------------------
            endShape(CLOSE);
            //b.converted = true;
            //shape(b.bpath);
          //}
            //else shape(b.bpath);
          }
        if(!clear){
          
          for(int j=0;j<b.Boundaries.size();j++){
        
            Boundary c = b.Boundaries.get(j);
            lineHover = false;
            
            if(pos(c,m)){
              lineIndex = j;
              
              if(amendInnerBoundary){
                if(mousePressed){
                     if(amendCohesion&&amendAvoidance)c.state1 = 1;
                else if(amendCohesion&&!amendAvoidance)c.state1 = 2;
                else if(!amendCohesion&&amendAvoidance)c.state1 = 3;
                else if(!amendCohesion&&!amendAvoidance)c.state1 = 4;
              }}
              if(c.state1==3)stroke(255,0,0);
              else if(c.state1==2)stroke(0,0,255);
              else if(c.state1==1)stroke(0,255,0);
              line(c.x1,c.y1,c.x2,c.y2);
              lineHover = true;
              k = j;
          }}
          lindex = k;
          
          if(lineHover&&shapeIndex==-1)shapeIndex = i;
          else lcount++;
        }}
          if(hcount>0) hover2 = true;
          else hover2  = false;
    }
    rmenu();
    int n = Boundaries.size();
    if(pcount==0)phover = false;
    if(lcount==0){lhover = false;lineIndex = -1;}
    if(hcount==n&&lcount==n&&pcount==n)shapeIndex=-1;
    if(clear)clear();
    
    
  };
  
  public void clear(){
    //Boundary a = Boundaries.get(0);
      //Boundaries = new ArrayList<Boundary>();
      //Boundaries.add(a);
      lineIndex = -1;
      shapeIndex = -1;
      palleteTab = null;
      setupPallete();
      for (int i=Boundaries.size()-1;i>0;i--)Boundaries.remove(i);
      clear = false;
  };
  
  public void draw2(){
    logic();
    debug();
    
    strokeWeight(1);
    for(int i=0;i<Boundaries.size();i++){
      Boundary b = Boundaries.get(i);
      b.id = i;
      move(b,m);
      beginShape();
      stroke(0);
      vertex(b.x1,b.y1);
      vertex(b.x2,b.y2);
      endShape(CLOSE);
    }
  };

  public void draw3(){
    strokeWeight(1);
    stroke(col);
    // for(int i=0;i<Boundaries.size();i++){
    //   Boundary b = Boundaries.get(i);
    //   b.id = i;
    //   line(b.x1,b.y1,b.x2,b.y2);
    // }
    // vertex(x1,y1);
    // vertex(x2,y2);
    line(x1,y1,x2,y2);
  };

  public void drawLine(){
    strokeWeight(1);
    stroke(0);
    line(x1,y1,x2,y2);
  };
  
  public void trace(){
    
    //scene.draw(9);
    
  };
  
  public void rmenu(){
    logic();
    
    if(clear){
       shapeIndex = -1;
       lineIndex = -1;
     }
      if((open||none)){
        
        
        
         settings.visible = false;
       pallete.draw();
       if(showgrid){
         gridlayout.toggle=true;
         gridlayout.grid_functions();
         gridlayout.terrain2d = true;
         }
       else if(type==-2)gridlayout.toggle=false;
       
       //if(mousePressed&&mouseButton == RIGHT&&!rtoggle){rtoggle = true;}
         //-----------------------------------------------------------------------------
         
         if(mousePressed&&mouseButton==RIGHT&&!rtoggle&&!contextClick)rtoggle=true;
         
         
         if(rtoggle&&edit){
           
         contextDel.visible = false;
         convertToPath.visible = false;
         context.visible = false;
         connectedlMenu.visible = false;
         
         if(shapeIndex==-1)options = 0;
         else {
           if(Boundaries.get(shapeIndex).type==106){
             numm = shapeIndex;
               if(pcount==1)options = 5;
               else if(lcount==pcount) options = 1;
              //else if((pcount<lcount))options = 1;
              //else options = 5;
         }else {
               if(pcount==lcount&&pcount>0)options = 3;
              else if(pcount>lcount)options = 2;
              else if((pcount<lcount))options = 1;
              else options = 4;
         }}
         if(!edit||Boundaries.size()==0)options=4;
         context.x = mouseX;
         context.y = mouseY;
         
         connectedlMenu.x = mouseX;
         connectedlMenu.y = mouseY;
         
         contextDel.x = mouseX;
         contextDel.y = mouseY;
         
         convertToPath.x = mouseX;
         convertToPath.y = mouseY;
         
         
         if(options==1)contextDel.items.get(0).label = "Delete Point";
         else if(options==2)contextDel.items.get(0).label = "Delete Line";
         
         contextDel.items.get(2).label = "Shape : " + shapeIndex + ", " + lineIndex;
         convertToPath.items.get(2).label = "Shape : " + shapeIndex + ", " + lineIndex;
         connectedlMenu.items.get(2).label = "Shape : " + shapeIndex + ", " + lineIndex;
         
         if(!mousePressed){
           contextClick = true;
           rtoggle=false;
         }}
         //------------------------------------------------------------------------------------
         //if(mousePressed&&mouseButton==LEFT)options = 4;
         if(options==0){
           contextDel.visible = false;
           convertToPath.visible = false;
           context.visible = true;
           connectedlMenu.visible = false;
           settings.x = context.x;
           settings.y = context.y+context.h;
           settings.visible = true;
         }
         else if(options==1||options==2){
             contextDel.visible = true;
             convertToPath.visible = false;
             context.visible = false;
             connectedlMenu.visible = false;
             settings.x = contextDel.x;
             settings.y = contextDel.y+contextDel.h;
             settings.visible = true;
           }else if(options==3){
             contextDel.visible = false;
             convertToPath.visible = true;
             context.visible = false;
             connectedlMenu.visible = false;
             settings.x = convertToPath.x;
             settings.y = convertToPath.y+convertToPath.h;
             settings.visible = true;
           }else if(options==4){
             contextDel.visible = false;
             convertToPath.visible = false;
             context.visible = false;
             connectedlMenu.visible = false;
             settings.x = mouseX;
             settings.y = mouseY;
             settings.visible = true;
           }else if(options==5){
             connectedlMenu.visible = true;
             contextDel.visible = false;
             convertToPath.visible = false;
             context.visible = false;
             settings.x = connectedlMenu.x;
             settings.y = connectedlMenu.y+connectedlMenu.h;
             settings.visible = true;
           }
           
         if(contextClick){
         if(contextDel.visible){
           contextDel.draw();
         if(mousePressed&&!contextDel.items.get(0).pos()&&!contextDel.items.get(1).pos()&&!settings.pos()){
                rtoggle=false;
                contextClick=false;
                settings.visible = false;
           }}
         else if(context.visible){
           context.draw();
           if(mousePressed&&!context.items.get(0).pos()&&!context.items.get(1).pos()&&!settings.pos()){
                rtoggle=false;
                contextClick=false;
                settings.visible = false;
           }}
         else if(convertToPath.visible){
            convertToPath.draw();
            //if(mousePressed&&mouseButton==LEFT){
              if(mousePressed&&convertToPath.items.get(1).pos()){
                if(shapeIndex>-1)Boundaries.remove(shapeIndex);
                rtoggle=false;
                contextClick=false;
                settings.visible = false;
           }else if(mousePressed&&convertToPath.items.get(0).pos()){
                calcInner(Boundaries.get(shapeIndex));
                calcOuter(Boundaries.get(shapeIndex));
                
                rtoggle=false;
                contextClick=false;
                settings.visible = false;
           }else if(mousePressed&&!convertToPath.items.get(0).pos()&&!convertToPath.items.get(1).pos()&&!settings.pos()){
                rtoggle=false;
                contextClick=false;
                settings.visible = false;
           }}
           else if(connectedlMenu.visible){
             connectedlMenu.draw();
             
             if(mousePressed&&connectedlMenu.items.get(2).pos()){
                if(numm>-1)Boundaries.remove(numm);
                rtoggle=false;
                contextClick=false;
                settings.visible = false;
           }else if(mousePressed&&connectedlMenu.items.get(0).pos()){
                calcInner(Boundaries.get(numm));
                calcOuter(Boundaries.get(numm));
                
                rtoggle=false;
                contextClick=false;
           }}
         else if (mousePressed&&!settings.pos()){
           contextClick = false;
           rtoggle = false;
       }}}
         
         if(contextClick&&!contextDel.pos()&&context.pos()&&!settings.pos()&&!convertToPath.pos()&&mousePressed){
           contextClick=false;
           rtoggle = false;
         }
       
           
  };
  
  public void update(Boundary a){
    float midx = 0;
    float midy = 0;
    
    float aa = 0.05f;
    vcount = 0;
    
    //dir = atan2(a.Boundaries.get(0).y1 - center.y,a.Boundaries.get(0).x1 - center.x);
    //line(Boundaries.get(0).x1,Boundaries.get(0).y1,center.x,center.y);
    if(type!=0){
      
      if(!mousePressed){trow = true;}
      
      if(gravity){
        
        //updateg = true;
        if(falling){
          vy += gconst;
          if(vy>=4)vy = 4.0f;
          if(vy<=-4)vy = -4.0f;
          if(vy>=4)vy = 4.0f;
          if(vy<=-4)vy = -4.0f;
          center.y += vy;
        }
        if(type!=2){
        update_Boundaries();
        a.update_angles();
        create_rotation_points(Boundaries);
        }else{
          //center.x = (x1+x2)/2;
          //center.y = (y1+y2)/2;
          a.update_line();
        }
        

 }else updateg = false;
    
    for(int i=0;i<Boundaries.size();i++){
      
      Boundary b = Boundaries.get(i);
      
      if(b.y1>=floor)vcount++;rotatep = (new PVector(b.x1,b.y1));
      if(b.y2>=floor)vcount++;rotatep = (new PVector(b.x2,b.y2));
    }
    
    if(vcount>0) falling = false;
    if(vcount>0) rotating = true;
    
    }
    
    if(type==0){
      if(gravity){
        
        if(center.y<floor){
          vy += ay;
          center.y += vy;
       }}}
    
    strokeWeight(20);
    stroke(255);
    point(center.x,center.y);
    strokeWeight(1);
    
      if(!mousePressed)sdown = false;linedown = false;
      if(mousePressed&&!linedown)linedown = true;
      
      if(!mousePressed&&!a.point1&&!a.point2&&!a.point3&&a.updatep&&a.uindex==id&&a.type!=2){
        
        calc_center();
        update_dist(Boundaries);
        a.create_rotation_points(Boundaries);
        a.update_angles();
        a.updatep = false;
      }
  };
  
  public void create_points(ArrayList<Boundary> a){
    for(int i=0;i<a.size();i++){
      
      Boundary b = a.get(i);
      if(points.size()==i)points.add(new PVector(b.x1,b.y1));
      }
  };
  
  public void create_angles(ArrayList<Boundary> a){
    for(int i=0;i<a.size();i++){
      
      Boundary b = Boundaries.get(i);
      
      float t1 = atan2(b.y1 - center.y,b.x1 - center.x);
      
      if(theta.size()<a.size())theta.add(t1);
      else theta.set(i,t1);
    }
  };
  
  public void update_points(ArrayList<Boundary> a){
    
    
    for(int i=0;i<a.size();i++){
      
      PVector b = points.get(i);
      
      float d1 = dist(b.x,b.y,center.x,center.y);
      
      float t1 = theta.get(i);;
      
      float ax = center.x + (d1) * cos(t1);
      float ay = center.y + (d1) * sin(t1);
      
      if(points.size()<a.size())points.add(new PVector(ax,ay));
      else rotation_points.set(i,new PVector(ax,ay));
    }
  };
  
  public void create_dist(){
    for(int i=0;i<Boundaries.size();i++){
      
      Boundary b = Boundaries.get(i);
      
      dist.add(dist(center.x,center.y,b.x1,b.y1));
    }
  };
  
  public void update_Boundaries(){
    
    for(int i=0;i<Boundaries.size();i++){
      
      Boundary b = Boundaries.get(i);
      
      float t = theta.get(i);
      Float d = dist.get(i);
      
      float t1 = 0;
      Float d1 = dist.get(i);
      
      if(i<Boundaries.size()-1){
        t1 = theta.get(i+1);
        d1 = dist.get(i+1);
      }else if(type!=106){
        t1 = theta.get(0);
        d1 = dist.get(0);
      }
      strokeWeight(10);
      stroke(0);
      
      b.x1 = center.x + d * cos(t);
      b.y1 = center.y + d * sin(t);
      if(type!=106){
      b.x2 = center.x + d1 * cos(t1);
      b.y2 = center.y + d1 * sin(t1);
      }else {
        
      }
      strokeWeight(1);
    }
  };
  
  public void update_line(){
    
    Boundary a = Boundaries.get(0);
    
    float b = theta.get(0);
    Float d = dist.get(0);
    
    a.x1 = center.x - d * cos(b) ;
    a.y1 = center.y - d * sin(b) ;
    
    a.x2 = center.x + d * cos(b) ;
    a.y2 = center.y + d * sin(b) ;
  };
  
  public void update_Boundaries(Boundary a){
    
    for(int i=0;i<a.Boundaries.size();i++){
      
      Boundary b = a.Boundaries.get(i);
      
      float t = a.theta.get(i);
      Float d = a.dist.get(i);
      
      float t1 = 0;
      Float d1 = a.dist.get(i);
      
      if(i<Boundaries.size()-1){
        t1 = a.theta.get(i+1);
        d1 = a.dist.get(i+1);
      }else if(a.type!=106){
        t1 = a.theta.get(0);
        d1 = a.dist.get(0);
      }
      strokeWeight(10);
      stroke(0);
      
      b.x1 = center.x + d * cos(t);
      b.y1 = center.y + d * sin(t);
      if(a.type!=106){
      b.x2 = center.x + d1 * cos(t1);
      b.y2 = center.y + d1 * sin(t1);
      }
      strokeWeight(1);
    }
  };
  
  public void rotate(float t){
    
    for(int i=0;i<Boundaries.size();i++){
      
      Boundary b = Boundaries.get(i);
      float t2 = theta.get(i);
      float d2 = dist.get(i);
      
      if(i<theta.size()-1){
        t2 = theta.get(i+1);
        d2 = dist.get(i+1);
      }else if(type!=106){
        t2 = theta.get(0);
        d2 = dist.get(0);
      }
      
      b.x1 = center.x + dist.get(i) * cos(theta.get(i)+radians(t));
      b.y1 = center.y + dist.get(i) * sin(theta.get(i)+radians(t));
      
      b.x2 = center.x + d2 * cos(t2+radians(t));
      b.y2 = center.y + d2 * sin(t2+radians(t));
    }
    
  };
  public void rotate2(float t){
    
    float t3 = radians(90);
    for(int i=0;i<Boundaries.size();i++){
      
      Boundary b = Boundaries.get(i);
      float t2 = theta.get(i);
      float d2 = dist.get(i);
      
      if(i<theta.size()-1){
        t2 = theta.get(i+1);
        d2 = dist.get(i+1);
      }else if(type!=106){
        t2 = theta.get(0);
        d2 = dist.get(0);
      }
      
      b.x1 = center.x + dist.get(i) * cos(theta.get(i)+(t)+t3);
      b.y1 = center.y + dist.get(i) * sin(theta.get(i)+(t)+t3);
      
      b.x2 = center.x + d2 * cos(t2+(t)+t3);
      b.y2 = center.y + d2 * sin(t2+(t)+t3);
    }
    
  };
  
  public void update_angles(){
    for(int i=0;i<Boundaries.size();i++){
      
      Boundary b = Boundaries.get(i);
      
      float t = atan2(b.y1 - center.y,b.x1 - center.x);
      if(i<theta.size())theta.set(i,t);
      else theta.add(t);
    }
  };
  
  public void angular_vel(float a, float u){
    
    
    
  };
  
  public void create_rotation_points(ArrayList<Boundary>a){
    
    float d = 10;
    
    for(int i=0;i<a.size();i++){
      
      Boundary b = a.get(i);
      
      float d1 = dist(b.x1,b.y1,center.x,center.y);
      
      float t1 = atan2(b.y1 - center.y,b.x1 - center.x);
      
      float ax = center.x + (d1+d) * cos(t1);
      float ay = center.y + (d1+d) * sin(t1);
      
      if(rotation_points.size()<a.size())rotation_points.add(new PVector(ax,ay));
      else rotation_points.set(i,new PVector(ax,ay));
    }
    
  };
  
  public void rotate_about(PVector a,Float v){
    
    for(int i=0;i<Boundaries.size();i++){
      
      Boundary b = Boundaries.get(i);
      
      float d1 = dist(b.x1,b.y1,center.x,center.y);
      float d2 = dist(b.x2,b.y2,center.x,center.y);
      float t1 = atan2(b.y2 - b.y1,b.x2 - b.x1);
      float t2 = atan2(b.y1 - b.y2,b.x1 - b.x2);
      
      b.x1 = center.x + d1 * cos(t1+v);
      b.y1 = center.y + d1 * sin(t1+v);
      b.x2 = center.x + d2 * cos(t2+v);
      b.y2 = center.y + d2 * sin(t2+v);
    }
    
  };
  
  public void pos_rotationpoint(Boundary a){
    
    float X = mouseX;
    float Y = mouseY;
    
    t2 = 0;
    float t0 = 0;
    
    boolean k = false;
    
    for(int i=0;i<a.rotation_points.size();i++){
      PVector b = a.rotation_points.get(i);
      
      float d1 = dist(b.x,b.y,X,Y);
      
    if(d1<5){
      strokeWeight(5);
      stroke(255);
      point(b.x,b.y);
      if(mousePressed&&!point3){
        point3 = true;
        vert = i;
        index = a.id;
        rdown = true;
      }}}
      
      if(point3&&mousePressed&&index == a.id&&!point1&&!point2&&!linedown){
        rdown = true;
        float t2 = atan2(a.center.y -  mouseY,a.center.x - mouseX);
        
        for(int i=0;i<a.Boundaries.size();i++){
          
          Boundary b = a.Boundaries.get(i);
          
          PVector c = a.rotation_points.get(i);
          PVector d = null;
          
          float d1 = dist(c.x,c.y,a.center.x,a.center.y)-10;
          float t1 = atan2(a.center.y - c.y,a.center.x - c.x);
          
          float d2 = 0,t3 = 0;
          
          if(i<a.Boundaries.size()-1)d = a.rotation_points.get(i+1);
          else if(a.type!=106)d = a.rotation_points.get(0);
          
          if(d!=null){
          d2 = dist(d.x,d.y,a.center.x,a.center.y)-10;
          t3 = atan2(a.center.y - d.y,a.center.x - d.x);
          }
          b.x1 = a.center.x + d1 * cos(t1 + t2);
          b.y1 = a.center.y + d1 * sin(t1 + t2);
          
          b.x2 = a.center.x + d2 * cos(t3 + t2);
          b.y2 = a.center.y + d2 * sin(t3 + t2);
        }}
        
      if(!mousePressed&&point3){
        vert = -1;
        vert1 = -1;
        index = -1;
        rdown = false;
        point3 = false;
        a.update_dist(a.Boundaries);
        a.create_rotation_points(a.Boundaries);
        uindex = a.id;
        updatep = true;
      }
   };
  
  public void calc_center(){
    
    float midx = 0;
    float midy = 0;
    
    for(int i=0;i<Boundaries.size();i++){
      Boundary b = Boundaries.get(i);
      midx += (b.x1 + b.x2)/2;
      midy += (b.y1 + b.y2)/2;
    }
    
    midx /= Boundaries.size();
    midy /= Boundaries.size();
    
    center = new PVector(midx,midy);
  };
  
  public void logic(){
    if((tri||toggle||circle||bezier||square||spline||poligon||c_poligon||connectedlines||path)){ open = true;}
    if(mousePressed&&open_menus)menudown = true;
    else menudown = false;
    if(none)open = false;
    if(pallete!=null)pallete.click(12,main,"clear");
    if(hidemenu){
      
      if(pallete.x+pallete.w>=0){
      //if(type==0)palletelist.menu.x -= 2;
      pallete.x -= 6;
      for(int i=0;i<pallete.items.size();i++){
        Button a = pallete.items.get(i);
        a.x = pallete.x;
      }
      rect(pallete.x,pallete.y,pallete.w,pallete.h);
      }else if(pallete.x+pallete.w<0){
      palletehide.draw();
      
      if(palletehide.pos()&&mousePressed){
        hidemenu = false;
        pallete.items.get(10).toggle=0;
      }
    }}else if(pallete!=null&&pallete.x<0){
      main.pallete.items.get(15).toggle=0;
      pallete.x += 6;
      for(int i=0;i<pallete.items.size();i++){
        Button a = pallete.items.get(i);
        a.x = pallete.x;
      }
      rect(pallete.x,pallete.y,pallete.w,pallete.h);
    }
    
    
    if(type==-1&&clear){
      Boundaries = new ArrayList<Boundary>();
      ArrayList<Float[]> velocity = new ArrayList<Float[]>();
      ArrayList<PVector> velocitypv = new ArrayList<PVector>();
      ArrayList<Boundary> Quadrants = new ArrayList<Boundary>();
      ArrayList<PVector> Midpoints = new ArrayList<PVector>();
      clear = false;
    }
  };
  
  public void mtranslate(Boundary b ,PVector m){
    
    float mx = m.x;
    float my = m.y;
    
    if(!point1&&!point2&&!point3&&!linedown&&!rdown&&type!=2){
      if(pos(b,m)&&mousePressed&&!tdown){
         index = b.id;
         deltamx = (b.center.x - mx);
         deltamy = (b.center.y - my);
         
         b.tdown = true;
         tdown = true;
    }}
    
    
    if(b.tdown&&index == b.id&&type!=2){
      if(index>=0){
        
      Boundary c = Boundaries.get(index);
      b.center.x = mx + deltamx;
      b.center.y = my + deltamy;
      b.create_rotation_points(b.Boundaries);
      //b.update_angles();
      b.update_Boundaries();
      }}
    
    if(!mousePressed&&type!=2){
      if(index>=0){
        Boundary c = Boundaries.get(index);
        index = -1;
        deltamx = 0;deltamy = 0;
        uindex = c.id;
        updatep = true;
        b.tdown = false;
        tdown = false;
      
    }}
    
  };
  
  public void mtranslate(PVector m){
    
    float mx = m.x;
    float my = m.y;
    
   if(mousePressed&&!mdown){
    mdown = true; 
    dx = center.x - mx;
    dy = center.y - my;
   }
    
   if(mdown){
     center.x = mx + dx;
     center.y = my + dy;
   }
     update_Boundaries();
   if(!mousePressed){
     mdown = false;
     
   }
   
  };
  
  public void functions(){
      debug();
      if(!edit&&!open_menus&&!pallete.pos()&&open&&!palletehide.pos()){
    if (toggle)create();
    else if (square)create_rect();
    else if(circle)create_circle();
    else if(tri)create_tri();
    else if(bezier)create_bezier();
    else if(poligon)create_poligon();
    else if(complex)create_complex_poligon();
    else if(connectedlines)connectedLines();
    else if(path)drawPath();
    else if(spline){
      
    }}
  
  };
  
    public boolean pos(Boundary a,PVector p){
      float X = p.x;
      float Y = p.y;
      boolean k = false;
      trit = 0;
      if(a.type==0){
            
            float mx = abs((a.x2-a.x1))/2;
            float my = abs((a.y2-a.y1))/2;
            
            float A = sq(X - a.center.x);
            float B = sq(Y - a.center.y);
            
            float C = sq(mx);
            float D = sq(my);
            return A/C + B/D <1;
            
        } if(a.type==2){
        return check_lineP(new PVector(a.x1,a.y1),new PVector(a.x2,a.y2),new PVector(X,Y));
      }
       if(a.type==4||a.type==3||a.type==103||a.type==201){
        
        for(int i=0;i<a.Boundaries.size();i++){
          
          Boundary b = a.Boundaries.get(i);
          
          Boundary A = new Boundary((b.x1 + b.x2)/2,(b.y1 + b.y2)/2,X,Y);
          
          for(int j=0;j<a.Boundaries.size();j++){
            
            Boundary C = a.Boundaries.get(j);
            
            PVector i1 = check_intersect(A,C);
            
            if(i1!=null&&i!=j){
              trit++;
              
            }}}
            if(trit>0)k = false;
            else k = true;
        }
      return k;
      
    };
    
    public boolean check_lineP(PVector a, PVector b,PVector c){
    
    boolean k = false;
    float d1 = dist(a.x,a.y,b.x,b.y);
    float d2 = dist(a.x,a.y,c.x,c.y);
    float d3 = dist(b.x,b.y,c.x,c.y);
    float d4 = d2 + d3;
    
    if(d4 <= d1 + 0.05f && d4 >= d1 - 0.05f){
      k = true;
    }
    return k;
  };
  
  public boolean check_lineP(float x1, float y1,float x2,float y2, PVector c){
    
    boolean k = false;
    float d1 = dist(x1,y1,x2,y2);
    float d2 = dist(x1,y1,c.x,c.y);
    float d3 = dist(x2,y2,c.x,c.y);
    float d4 = d2 + d3;
    
    if(d4 <= d1 + 0.05f && d4 >= d1 - 0.05f){
      k = true;
    }
    return k;
  };
  
  public void drag(){
  };
  
  public boolean pospoint(Boundary a,int n){
    float X = mouseX;
    float Y = mouseY;
    
    boolean k = false;
    
    for(int i=0;i<a.Boundaries.size();i++){
      Boundary b = a.Boundaries.get(i);
      
      float d1 = dist(b.x1,b.y1,X,Y);
      float d2 = dist(b.x2,b.y2,X,Y);
      
    if(d1<5){
      k = true;
    }
      
      if(d2<5){
        k = true;
    }}
    return k;
    };
  
  public void pospoint(Boundary a){
    float X = mouseX;
    float Y = mouseY;
    
    t = 0;
    
    boolean k = false;
    //if(!a.linedown){
    for(int i=0;i<a.Boundaries.size();i++){
      Boundary b = a.Boundaries.get(i);
      
      float d1 = dist(b.x1,b.y1,X,Y);
      float d2 = dist(b.x2,b.y2,X,Y);
      
    if(d1<5){
      strokeWeight(5);
      stroke(255);
      point(b.x1,b.y1);
      if(mousePressed&&!point1&&!a.point1){
        
        t++;
        vert = i;
        index = a.id;
        point1 = true;
        a.point1 = true;
        a.pdown = true;
        pdown = true;
      }}
      
      if(d2<5){
      strokeWeight(5);
      stroke(255);
      point(b.x2,b.y2);
      if(mousePressed&&!point2&&!a.point2){
        
        t++;
        vert1 = i;
        index = a.id;
        point2 = true;
        a.point2 = true;
        a.pdown = true;
        pdown = true;
      }}
      if(point1&&vert>=0&&index==a.id){
        Boundary c = a.Boundaries.get(vert);
        c.x1 = X;
        c.y1 = Y;
      }
      if(point2&&vert1>=0&&index==a.id){
        Boundary c = a.Boundaries.get(vert1);
        c.x2 = X;
        c.y2 = Y;
      }
      if(a.type==2){
        a.x1 = b.x1;a.y1 = b.y1;
        a.x2 = b.x2;a.y2 = b.y2;
      }
      if(a.type==4){
        
          if(vert==0)a.x1 = b.x1;
          if(vert==1)a.x2 = b.x1;
          if(vert==2)a.x3 = b.x1;
          if(vert==3)a.x4 = b.x1;
          
          if(vert1==0)a.x2 = b.x2;
          if(vert1==1)a.x3 = b.x2;
          if(vert1==2)a.x4 = b.x2;
          if(vert1==3)a.x1 = b.x2;
        }
      if(a.type==3||a.type==103){
        if(vert==0)a.x1 = b.x1;a.y1 = b.y1;
        if(vert==1)a.x2 = b.x1;a.y2 = b.y1;
        if(vert==2)a.x3 = b.x1;a.y3 = b.y1;
        
        if(vert1==0)a.x2 = b.x2;a.y2 = b.y2;
        if(vert1==1)a.x3 = b.x2;a.y3 = b.y2;
        if(vert1==2)a.x1 = b.x2;a.y1 = b.y2;
     
    }}
      
    if(t>0){
      k = true;
      hover = true;
    }
    if(!mousePressed){
      a.update_dist(a.Boundaries);
      a.calc_center();
      a.create_rotation_points(a.Boundaries);
      a.update_angles();
    }
    if(!mousePressed){
      
      vert = -1;
      vert1 = -1;
      index = -1;
      point1 = false;
      point2 = false;
      a.point2 = false;
      a.point1 = false;
      uindex = a.id;
      updatep = true;
      a.pdown = false;
      pdown = false;
      
    }
  };
  
  public void update_dist(ArrayList<Boundary> a){
   
    
    for(int i=0;i<a.size();i++){
      
      Boundary b = a.get(i);
      int id = b.id;
      //float Dist = dist.get
      float dx = (b.x1 - center.x);
      float dy = (b.y1 - center.y);
      float d  = dist(b.x1,b.y1,center.x,center.y);
      Float [] d1 = {dx,dy};
      
      if(dist.size()==Boundaries.size()){dist.set(i,d);}
      else {dist.add(d);}
      if(pdist.size()==Boundaries.size()*2)pdist.set(i,d1);
      else pdist.add(d1);
    }
  };
  
  public void move(Boundary a,PVector p){
    float mx = p.x;
    float my = p.y;
    
    boolean down = false;
    
    for (int i=0;i<a.Boundaries.size();i++){
      
      Boundary b = a.Boundaries.get(i);
      
     float d1 = dist(b.x1,b.y1,mx,my);
     float d2 = dist(b.x2,b.y2,mx,my);
     
    boolean k = check_lineP(b.x1,b.y1,b.x2,b.y2,new PVector(mx,my));
    if(k&&!linedown&&d1>6&&d2>6&&!point1&&!point2&&mousePressed&&!a.linedown){
      vert3 = i;
      sid = a.id;
      D1 = d1;
      D2 = d2;
      T1 = atan2(b.y2 - b.y1,b.x2 - b.x1);
      T2 = atan2(b.y1 - b.y2,b.x1 - b.x2);
      
      linedown = true;
      a.linedown = true;
    }}
    
    if(linedown && sid==a.id && a.linedown&&a.Boundaries.size()>0){
      
      Boundary b   = a.Boundaries.get(vert3);
      Boundary b_1 = a.Boundaries.get(0);
      Boundary bp1 = a.Boundaries.get(0);
      
      if(vert3>0)b_1 = a.Boundaries.get(vert3-1);
      else if(a.type!=106)b_1 = a.Boundaries.get(a.Boundaries.size()-1);
      if(vert3<a.Boundaries.size()-1)bp1 = a.Boundaries.get(vert3+1);
      else if(a.type!=106)bp1 = a.Boundaries.get(0);
      
      stroke(255,0,0);
      PVector p1 = new PVector( mx + D2 * cos(T1),my + D2 * sin(T1));
      PVector p2 = new PVector( mx + D1 * cos(T2),my + D1 * sin(T2));
      //line(p1.x,p1.y,p2.x,p2.y);
      
      b.x2 = p1.x;
      b.y2 = p1.y;
      b.x1 = p2.x;
      b.y1 = p2.y; 
      
      b_1.x2 = p2.x;
      b_1.y2 = p2.y;
      bp1.x1 = p1.x;
      bp1.y1 = p1.y;
      
    }
    
    if(!mousePressed&&a.linedown){
      D1 = 0;D2 = 0;T1 = 0;T2 = 0;vert3 = -1;sid = -1;down = false;
      a.update_dist(a.Boundaries);
      uindex = a.id;
      updatep = true;
      linedown = false;
      a.linedown = false;
    }
  };
  
  public void create_circle(){
    float ax = mouseX;
    float ay = mouseY;
    
    Boundary n;
    if (circle&&!menudown&&mousePressed&&mouseButton == LEFT){
       
      mdown = true;
      ax = mouseX;
      ay = mouseY;
       
      temp.add(new PVector(ax,ay));
      dx = ax - temp.get(0).x;
      dy = ay - temp.get(0).y;
       
      strokeWeight(1);
      stroke(col);
      ellipseMode(CORNER);
      ellipse(temp.get(0).x,temp.get(0).y,dx,dy);
      }
      if(mdown&&!mousePressed&&!point1&&!point2){
        
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
      Boundary a = new Boundary(temp.get(0).x,temp.get(0).y,dx,dy,0);
      a.id = Boundaries.size();
      Boundaries.add (a);
      //scene.Boundaries.add (a);
      theta.add(atan2((temp.get(0).y + dy) - temp.get(0).y,(temp.get(0).x + dx) - temp.get(0).x));
      norm.add(atan2((temp.get(0).x + dx) - temp.get(0).x, (temp.get(0).y + dy) - temp.get(0).y));
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      temp = new ArrayList<PVector>();
      mdown = false;
      
      updateSliderMenu(a);
      
      }}
  };
  
  public void updateSliderMenu(Boundary a){
    
      settings = new sliderBox(X, 10,90,5,settingsLabel,palleteTab);
      settings.visible = true;
      settings.parentCanvas = true;
      palleteTab.addState(1);
      palleteTab.states.get(palleteTab.states.size()-1).sliderBoxes.add(settings);
  }
  
  public void create(){
    
    float ax = mouseX;
    float ay = mouseY;
    
    Boundary n;
    
    
      if (toggle&&!menudown&&mousePressed&&!open_menus&&mouseButton == LEFT){
       
      mdown = true;
      ax = mouseX;
      ay = mouseY;
      
      temp.add(new PVector(ax,ay));
      
      line(temp.get(0).x,temp.get(0).y,temp.get(temp.size()-1).x,temp.get(temp.size()-1).y);
      }
      if(mdown&&!mousePressed&&!point1&&!point2){
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
      n = new Boundary(temp.get(0).x,temp.get(0).y,temp.get(temp.size()-1).x,temp.get(temp.size()-1).y,2);
      n.id = Boundaries.size();
      Boundaries.add (n);
      theta.add(atan2(temp.get(temp.size()-1).y - temp.get(0).y,temp.get(temp.size()-1).x - temp.get(0).x));
      norm.add(atan2(temp.get(temp.size()-1).x - temp.get(0).x, temp.get(temp.size()-1).y - temp.get(0).y));
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      temp = new ArrayList<PVector>();
      
      }mdown = false;
    }
  };
  
  public void create_tri(){
    
    float ax = mouseX;
    float ay = mouseY;
    
    Boundary n;
    float d;
    
    if (tri&&mousePressed&&!open_menus&&shapes.toggle==0&&mouseButton == LEFT){
       
      mdown = true;
      ax = mouseX;
      ay = mouseY;
      
      temp.add(new PVector(ax,ay));
      d = dist(ax,ay,temp.get(0).x,temp.get(0).y);
      
      float Norm = -atan2(temp.get(0).x - ax,temp.get(0).y - ay);
      
      float X2 = ax + d/1.5f * cos(Norm);
      float Y2 = ay + d/1.5f * sin(Norm);
      float X3 = ax - d/1.5f * cos(Norm);
      float Y3 = ay - d/1.5f * sin(Norm);
      
      beginShape();
      stroke(255);
      fill(0);
      
      vertex(temp.get(0).x,temp.get(0).y);
      vertex(X2,Y2);
      vertex(X3,Y3);
      endShape(CLOSE);
      }
      if(mdown&&!mousePressed&&!point1&&!point2){
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
      n = new Boundary(temp.get(0).x,temp.get(0).y,ax,ay,3);
      n.id = Boundaries.size();
      Boundaries.add (n);
      theta.add(atan2(temp.get(temp.size()-1).y - temp.get(0).y,temp.get(temp.size()-1).x - temp.get(0).x));
      norm.add(atan2(temp.get(temp.size()-1).x - temp.get(0).x, temp.get(temp.size()-1).y - temp.get(0).y));
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      temp = new ArrayList<PVector>();
      updateSliderMenu(n);
      }mdown = false;
      
      
    }
  };
  
  public void create_rect(){
    
    float ax = mouseX;
    float ay = mouseY;
    
    if (square&&!menudown&&mousePressed&&!open_menus&&shapes.toggle==0&&mouseButton == LEFT){
      
      mdown = true;
      ax = mouseX;
      ay = mouseY;
       
      temp.add(new PVector(ax,ay));
      dx = ax - temp.get(0).x;
      dy = ay - temp.get(0).y;
       
      strokeWeight(20);
      stroke(0);
      point(ax,ay);
      strokeWeight(1);
      stroke(col);
      rect(temp.get(0).x,temp.get(0).y,dx,dy);
      }
      if(mdown&&!mousePressed&&!point1&&!point2){
        
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
      Boundary a = new Boundary(temp.get(0).x,temp.get(0).y,dx,dy,4);
      a.id = Boundaries.size();
      Boundaries.add (a);
      theta.add(atan2((temp.get(0).y + dy) - temp.get(0).y,(temp.get(0).x + dx) - temp.get(0).x));
      norm.add(atan2((temp.get(0).x + dx) - temp.get(0).x, (temp.get(0).y + dy) - temp.get(0).y));
      temp = new ArrayList<PVector>();
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      mdown = false;
      updateSliderMenu(a);
      }
    }
  };
  
  public void create_poligon(){
    float ax = mouseX;
    float ay = mouseY;
    
    Boundary n;
    
    Sides.draw();
    sides = PApplet.parseInt(Sides.value);
    if(sides>0){
      
    if (mousePressed&&mcount==0&&!complexsub.pos()){
      
      mdown = true;
      ax = mouseX;
      ay = mouseY;
       
      temp.add(new PVector(ax,ay));
      dx = ax - temp.get(0).x;
      dy = ay - temp.get(0).y;
       
      strokeWeight(20);
      stroke(0);
      point(ax,ay);
      strokeWeight(1);
      stroke(col);
      beginShape();
      
      float X = (temp.get(0).x + ax)/2;
      float Y = (temp.get(0).y + ay)/2;
      
      for(int i=0;i<sides;i++){
       
        float theta = radians(360/sides*i);
        
        float w = abs((temp.get(0).x - ax))/2;
        float h = abs((temp.get(0).y - ay))/2;
        
        PVector a = new PVector(X + w * cos(theta),Y + h * sin(theta));
        vertex(a.x,a.y);
        
        //vertex(X + w * cos(theta2),Y + h * sin(theta2));
        
      }
      endShape(CLOSE);
      }
      if(mdown&&!mousePressed){
        
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
        n = new Boundary(temp.get(0).x,temp.get(0).y,ax,ay,201);
        float X = (temp.get(0).x + ax)/2;
        float Y = (temp.get(0).y + ay)/2;
        n.center = new PVector(X,Y);
      
      for(int i=0;i<sides;i++){
       
        float theta = radians(360/sides*i);
        float theta2 = radians(360/sides*(i+1));
        
        float w = abs((temp.get(0).x - ax))/2;
        float h = abs((temp.get(0).y - ay))/2;
        
        PVector a = new PVector(X + w * cos(theta),Y + h * sin(theta));
        PVector b = new PVector(X + w * cos(theta2),Y + h * sin(theta2));
        //vertex(a.x,a.y);
        n.Boundaries.add(new Boundary(a.x,a.y,b.x,b.y));
        
      }
      
      n.id = Boundaries.size();
      Boundaries.add (n);
      theta.add(atan2((temp.get(0).y + dy) - temp.get(0).y,(temp.get(0).x + dx) - temp.get(0).x));
      norm.add(atan2((temp.get(0).x + dx) - temp.get(0).x, (temp.get(0).y + dy) - temp.get(0).y));
      temp = new ArrayList<PVector>();
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      mdown = false;
      updateSliderMenu(n);
      }}}else {
        fill(255);
        noStroke();
        rect(100,100,200,15);
        text("Please define number of sides",100,100);
        
      }
  };
  
  public void create_bezier(){
    
  };
  
  public void create_complex_poligon(){
    //mcount = 0;
    float mx = mouseX;
    float my = mouseY;
    
    float sw = w/cols, sh = h/rows;
    if(!mousePressed){mcount = 0;}
    //text(x + "         " + scene.x + "          " + scene.w,100,110);
    if(complex){
      
      complexsub.draw();
      
      for(int i=0;i<ogrid.size();i++){
          Point a = ogrid.get(i);
          
          a.draw();
        }
      
      if(mousePressed&&mcount==0&&!complexsub.pos())mdown = true;
      else mdown = false;
      if(mdown) mcount++;
      if(mousePressed&&complexsub.pos())cfinish = true;
      else if(!mousePressed)cfinish = false;
      
      if(mdown){
        
        counter++;
        if(!complexsub.pos())grid.add(new Point(floor(mx/sw)*sw,floor(my/sh)*sh,counter));
        polymidpoint = new PVector(0,0);
        ogrid = new ArrayList<Point>();
        for(int i=0;i<grid.size();i++){
          Point a = grid.get(i);
          boolean b = ugrid.contains(a);
          
          if(!b){
            ugrid.add(a);
            polymidpoint.x += a.x;
            polymidpoint.y += a.y;
          }}polymidpoint.div(grid.size());}
          
            sortpoints(grid,ugrid,ogrid,polymidpoint);
  
        if(ogrid.size()>1&&!cfinish){
          for(int i=0;i<ogrid.size();i++){
          Point a = ogrid.get(i);
          int pos = 0;
            
          if(i<ogrid.size()-1){
            pos = i+1;
          }
          else{
            pos = 0;
          }
          
          Point b = ogrid.get(pos);
          stroke(0);
          strokeWeight(1);
          line(b.x,b.y,a.x,a.y);
          
        }}
        
        strokeWeight(20);
        stroke(0);
        point(polymidpoint.x,polymidpoint.y);
        strokeWeight(1);
        }
        
        if(cfinish){
          
          Boundaries.add(new Boundary(ogrid));
          
          ogrid = new ArrayList<Point>();
          grid = new ArrayList<Point>();
          ugrid = new ArrayList<Point>();
          
          cfinish = false;
        }
    
  };
  
  public void connectedLines(){
    //mcount = 0;
    float mx = mouseX;
    float my = mouseY;
    
    float sw = w/cols, sh = h/rows;
    if(!mousePressed){
      mcount = 0;
      pointadded = false;
    }
    if(connectedlines){
      complexsub.draw();
      
      if(mousePressed&&mcount==0&&!complexsub.pos())mdown = true;
      else mdown = false;
      if(mousePressed&&complexsub.pos())cfinish = true;
      else if(!mousePressed)cfinish = false;
      
      if(mdown){
        
        if(!complexsub.pos()){
          Point a = new Point(floor(mx/sw)*sw,floor(my/sh)*sh,grid.size());
          Point b;
          boolean k = grid.contains(a);
          if(grid.size()==0)grid.add(a);
          else{
            b = grid.get(grid.size()-1);
            if(b.x!=a.x||b.y!=a.y)grid.add(a);
          }}
        //pointadded = true;
      }
        for(int i=grid.size()-1;i>-1;i--){
          Point a = grid.get(i);
          
          a.draw();
          
        if(grid.size()>1&&!cfinish){
          int pos = 0;
            
          if(i<grid.size()-1)pos = i+1;
          
          Point b = grid.get(pos);
          stroke(0);
          strokeWeight(1);
          if(i<grid.size()-1)line(b.x,b.y,a.x,a.y);
          
        }}
        
        if(cfinish){
          
          Boundary a = new Boundary(grid,0);
          
          if(grid.size()>0)Boundaries.add(a);
          
          grid = new ArrayList<Point>();
          updateSliderMenu(a);
          cfinish = false;
          mdown = false;
        }}
        strokeWeight(1);
  };
  
  public void drawPath(){
    //mcount = 0;
    float mx = mouseX;
    float my = mouseY;
    
    float sw = w/cols, sh = h/rows;
    if(!mousePressed){
      mcount = 0;
      pointadded = false;
    }
    if(path){
      complexsub.draw();
      
      if(mousePressed&&mcount==0&&!complexsub.pos())mdown = true;
      else mdown = false;
      if(mousePressed&&complexsub.pos())cfinish = true;
      else if(!mousePressed)cfinish = false;
      
      if(mdown){
        
        if(!complexsub.pos()){
          Point a = new Point(floor(mx/sw)*sw,floor(my/sh)*sh,grid.size());
          Point b;
          boolean k = grid.contains(a);
          if(grid.size()==0)grid.add(a);
          else{
            b = grid.get(grid.size()-1);
            if(b.x!=a.x||b.y!=a.y)grid.add(a);
          }}
        //pointadded = true;
      }
        for(int i=grid.size()-1;i>-1;i--){
          Point a = grid.get(i);
          
          a.draw();
          
        if(grid.size()>1&&!cfinish){
          int pos = 0;
            
          if(i<grid.size()-1)pos = i+1;
          
          Point b = grid.get(pos);
          stroke(0);
          strokeWeight(1);
          if(i<grid.size()-1)line(b.x,b.y,a.x,a.y);
          
        }}
        
        if(cfinish){
          
          if(grid.size()>0)Boundaries.add(new Boundary(grid,0));
          
          grid = new ArrayList<Point>();
          
          cfinish = false;
          mdown = false;
        }}
        strokeWeight(1);
  };
  
  public void create_free(){
    
  };
  
  public Boolean posWindow(){
    
    float mx = mouseX;
    float my = mouseY;
    
    return(mx>x1&&mx<x2&&my>y1&&my<y2);
    
  };
  
  public void mass_Center(){
    
    ccount = 0;
    PVector Center = new PVector(0,0);
    if(center == null|| center !=Center){
    for(int i=0;i<Boundaries.size();i++){
      
      Boundary a = Boundaries.get(i);
      PVector midp = new PVector((a.x1+a.x2)/2,(a.y1+a.y2)/2);
      Center.add(midp);
      Midpoints.add(midp);
      ccount++;
    }
  if(ccount==Boundaries.size())center = Center;
  }
};
    
};

  public PVector check_intersect(Boundary a, Boundary b){

    float a1 = a.y2 - a.y1;
    float b1 = a.x1 - a.x2;
    float c1 = a1 * a.x1 + b1 * a.y1;
    float a2 = b.y2 - b.y1;
    float b2 = b.x1 - b.x2;
    float c2 = a2 * b.x1 + b2 * b.y1;
    float denom = a1 * b2 - a2 * b1;
    
    if((a.x1==b.x1||a.x2==b.x2)&&(a.y1==b.y1||a.y2==b.y2)){
      
      return null;
    }
     else{
        
    Float X = (b2 *c1 - b1 * c2) / denom;
    Float Y = (a1 *c2 - a2 * c1) / denom;
    
    PVector p = new PVector(X,Y);   
      boolean Linea = ((p.x<a.x1&&p.x>a.x2)||(p.x>a.x1&&p.x<a.x2))||((p.y<a.y1&&p.y>a.y2)||(p.y>a.y1&&p.y<a.y2));
      boolean Lineb = ((p.x<b.x1&&p.x>b.x2)||(p.x>b.x1&&p.x<b.x2))||((p.y<b.y1&&p.y>b.y2)||(p.y>b.y1&&p.y<b.y2));
      boolean Linec = (p.x!=a.x1&&p.x!=a.x2)&&(p.y!=a.y1&&p.y!=a.y2);
      
      Linec = (dist(p.x,p.y,a.x1,a.y1)>0.5f&&dist(p.x,p.y,a.x1,a.y1)>0.5f);
        if(Linec&&Linea&&Lineb){
            //strokeWeight(20);
            //  stroke(0);
            //  point(p.x,p.y);
            //  strokeWeight(1);
        return p;
      }
      else{
      return null;
      }}
  };
  
  public PVector check_intersect2(Boundary a, Boundary b){

    float a1 = a.y2 - a.y1;
    float b1 = a.x1 - a.x2;
    float c1 = a1 * a.x1 + b1 * a.y1;
    float a2 = b.y2 - b.y1;
    float b2 = b.x1 - b.x2;
    float c2 = a2 * b.x1 + b2 * b.y1;
    float denom = a1 * b2 - a2 * b1;
    
    Float X = (b2 *c1 - b1 * c2) / denom;
    Float Y = (a1 *c2 - a2 * c1) / denom;
    
    PVector p = new PVector(X,Y);   
      boolean Linea = ((p.x<=a.x1&&p.x>=a.x2)||(p.x>=a.x1&&p.x<=a.x2))||((p.y<=a.y1&&p.y>=a.y2)||(p.y>=a.y1&&p.y<=a.y2));
      boolean Lineb = ((p.x<=b.x1&&p.x>=b.x2)||(p.x>=b.x1&&p.x<=b.x2))||((p.y<=b.y1&&p.y>=b.y2)||(p.y>=b.y1&&p.y<=b.y2));
      boolean Linec = (p.x==a.x1||p.x==a.x2)||(p.y==a.y1||p.y==a.y2);
      boolean Lined = (p.x==b.x1||p.x==b.x2)&&(p.y==b.y1||p.y==b.y2);
        if(Linea&&Lineb||Linec){
        return p;
      }
      else{
      return null;
      }
  };
  
  class Connection{
    float d,e,x,y;
    //ArrayList<Integer[]> vertex = new ArrayList<Integer[]>();
    PVector c;
    
    Connection(PVector C){
      c = C;
      x = c.x;
      y = c.y;
      
    };
    
    
  };
  
  
  class _rect{
    
    float x,y,w,h,mass,density,viscoscity,friction,moment,vx,vy,ax,ay;
    boolean border, dashed,connected;
    PVector pos,vel,ac;
    int bg,str;
    Boundary rect;
    
    _rect(float xx,float yy,float ww,float hh){
      x = xx;
      y = yy;
      h = hh;
      w = ww;
      
      rect = new Boundary(xx,yy,ww,hh,4);
    };
    
    public void draw(){
      
    }
    
  };
  
  class _tri{
    
    float x,y,w,h,mass,density,viscoscity,friction,moment,vx,vy,ax,ay;
    boolean border, dashed,connected,fill = true;
    PVector pos,vel,ac;
    int bg = color(0,180),str = color(0);
    Boundary tri;
    Human parent;
    
    _tri(float xx,float yy,float ww,float hh){
      x = xx;
      y = yy;
      h = hh;
      w = ww;
      
      tri = new Boundary(x,y,10,20,103);
    };
    _tri(){
    };
    
    public void draw(){
      beginShape();
      stroke(str);
      if(!border)noStroke();
      fill(bg);
      if(parent!=null)fill(parent.col);
      if(!fill)noFill();
      
      for(int i=0;i<tri.Boundaries.size();i++){
        Boundary b = tri.Boundaries.get(i);
        vertex(b.x1,b.y1);
        //vertex(b.x1,b.y1);
      }
      endShape(CLOSE);
    }
    public void update(){
    for(int i=0;i<tri.Boundaries.size();i++){
        Boundary b = tri.Boundaries.get(i);
        
        b.create_rotation_points(tri.Boundaries);
        b.update_dist(tri.Boundaries);
        b.update_angles();
        b.create_angles(tri.Boundaries);
      }
  };
  
  public boolean pos(PVector a){
    boolean k = false;
    
    if(tri.pos(tri,a))k = true;
    return k;
  }
  };
  
  
  
   class _ellipse{
    
    float x,y,w,h,mass,density,viscoscity,friction,moment,vx,vy,ax,ay;
    boolean border, dashed,connected;
    PVector pos,vel,ac;
    int bg,str;
    Boundary ellipse;
    
    _ellipse(float xx,float yy,float ww,float hh){
      x = xx;
      y = yy;
      h = hh;
      w = ww;
      
      ellipse = new Boundary(xx,yy,ww,hh,2);
    };
    
    public void draw(){
      
    }
    
  };
  
  class Point{
  
  float x,y;
  int id;
  
  Point(float X, float Y,int Id){
    
    x = X;
    y = Y;
    id = Id;
  }
  
  public void draw(){
    
    strokeWeight(8);
    stroke(0);
    point(x,y);
    //float t1 = atan2(y-H/2,x-W/2);
    //float t1 = atan2(y-Boundary.midpoint.y,x-midpoint.x);
    
  }
}

public void sortpoints(ArrayList<Point> grid,ArrayList<Point> ugrid,ArrayList<Point> ogrid,PVector midpoint){
  
  if(ogrid.size()!=grid.size()){
    if(ugrid.size()>0){
    
    Point next = closest(ugrid,midpoint);
    
    if(next!=null){
      
      next.id = ogrid.size();
      
      boolean c = ogrid.contains(next);
      
      if(!c){
      int k = ugrid.indexOf(next);
      ogrid.add(next);
      ugrid.remove(k);
    
  }}}}};
  
  public Point closest(ArrayList<Point> a,PVector midpoint){
    
  Point k = a.get(0);
  int c = 1;
  for(int i=c;i<a.size();i++){
    
    Point b = a.get(i);
    
    float t1 = atan2(k.y-midpoint.y,k.x-midpoint.x);
    float t2 = atan2(b.y-midpoint.y,b.x-midpoint.x);
    t1 = map(t1,-PI,PI,PI,0);
    t2 = map(t2,-PI,PI,PI,0);
    
    if(t1<t2){
      k = b;
    }}
  
  return k;
  };
  
 class Polygon extends Boundary{
    
    Polygon(float xx,float yy,float ww,float hh,int _sides){
      
    sides = _sides;
    x1 = xx;
    y1 = yy;
    w = ww;
    h = hh;
    ax = xx + ww;
    ay = yy + hh;
    
    Boundary n;
    
    Sides.draw();
    sides = PApplet.parseInt(Sides.value);
    
        n = new Boundary(xx,yy,ax,ay,201);
        
        float X = (xx + w)/2;
        float Y = (yy + h)/2;
        
        n.center = new PVector(X,Y);
      
      for(int i=0;i<sides;i++){
       
        float theta = radians(360/sides*i);
        float theta2 = radians(360/sides*(i+1));
        
        PVector a = new PVector(X + w * cos(theta),Y + h * sin(theta));
        PVector b = new PVector(X + w * cos(theta2),Y + h * sin(theta2));
        //vertex(a.x,a.y);
        n.Boundaries.add(new Boundary(a.x,a.y,b.x,b.y));
        
      }
      
      n.id = Boundaries.size();
      Boundaries.add (n);
      
      theta.add(atan2((y1 + hh) - y1,(x1 + ww) - x1));
      norm.add(atan2((x1 + ww) - x1, (y1 + hh) - y1));
      
      temp = new ArrayList<PVector>();
      Float [] vel = {0.0f,0.0f};
      
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      mdown = false;
      
      }
      
    };
class Button{
  
  public float x,y,bx = x,by = y,w,h,size,textsize = 12,xoff,yoff,bsize,tsize = 12,tyoff,txoff,tmax = 2;
  int id,toggle,toggle2,type;
  float scalew,scaleh;
  
  public String label,blabel;
  PImage img;
  boolean drag,resize, radio,update,border = true,vertical,horizontal,gif,Img,value,textright,textbtm,textleft,textup,texttoggle,animate = true,toggleb,mdown,sdown,visible = true
          ,up,right,down,togglebar,togglebox,mdown2,textcheck,parentCanvas,subLeft;
  int fcol = color(255,80),bcol = color(0,100),hcol = color(255,50),col = fcol,tcol = color(255);
  Menu parent;
  Menu submenu;
  Window subwindow;
  listBox sublist;
  ArrayList<Button> buttons = new ArrayList<Button>();
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  String Text = "";
  TextBox textbox;
  PVector mouse;
  tab parentTab;
  Dropdown dMenu;
  
  Button(float xx, float yy, float ww, float hh, String Label){
    
    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = hh;
    label = Label;
    blabel = label;
    size = 1;
    textsize = 12;
    bsize = tsize;
    
  }
  
  Button(float xx, float yy, float ww, float hh){
    
    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = hh;
    size = 1;
    textsize = 12;
    bsize = tsize;
  }
  
  Button(float xx, float yy, float ww, float hh,int Cols){
    
    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = hh;
    size = 1;
    tsize = 12;
    bsize = tsize;
    value = true;
    textbox = new TextBox(x,y,ww+1,hh,Cols);
  }
  
  Button(float xx, float yy, float ww, float hh,int Cols, String Label){
    
    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = hh;
    size = 1;
    tsize = 12;
    bsize = tsize;
    label = Label;
    blabel = label;
    value = true;
    textbox = new TextBox(x,y,ww+1,hh,Cols,Label);
  }
  
  public Button(){
    
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void btn(){
    if(!radio&&!togglebar){
      stroke(255);
      strokeWeight(size);
      if(!border)noStroke();
      if(parent!=null&&type!=0){
        x = parent.x;
        //y = parent.y;
      }
      
      fill(50);
      rect(x,y,w,h);
      fill(col);
      rect(x ,y,w,h);
      
      textSize(textsize);
      
      if(label!=null){
        
      if(scaleh>0){
        pushMatrix();
        translate(0,y*scaleh+h/2);
        scale(1,scaleh);
      }
      if(scalew>0){
        pushMatrix();
        translate(x*scalew,0);
        scale(scalew,1);
      }
      
        fill(tcol);
        textSize(bsize);
        // if(!textbtm&&!textright&&!textup)text(label,x+5+txoff,y+13+tyoff+5);
        // if(textbtm)text(label,x+xoff,y+h+yoff+tsize);
        textSize(12);
        if(scaleh>0){
          scale(1,1/scaleh);
          popMatrix();
        }
        if(scalew>0){
          scale(-scalew,1/scalew);
          popMatrix();
        }
        
      }
      if(value){
        
        if(textup)textbox.y     = y - h;
        if(textbtm)textbox.y    = y + h;
        if(textleft) textbox.x  = x - w;
        if(textright) textbox.x = x + w;
        Text = textbox.textBox;
        
        if(pos()||textbox.pos()||textbox.toggle==1)texttoggle=true;
        else texttoggle = false;
        if(texttoggle)textbox.draw();
        //if(textbox.pos()&&mousePressed&&parent!=null){ parent.draw();}
        //else parent.toggle=0;
      }
      if(img!=null){
        image(img,x,y+1,w,h);
      }}
  };
  
  public void toggleBar(){
    
  };
  
  //void radio(){
    
  //};
  
  public void draw(){
    logic();
    textSize(12);
    
    btn();
    if(radio){
      fill(0);
      stroke(col);
      if(!border)noStroke();
      
      if(w>h){
      fill(fcol);
      rect(x +textWidth(label)+20,y,w,h);
      if(label!=null){
        textSize(tsize);
        if(up)text(label,x,y-3);
        if(right)text(label,x+w+2,y);
        if(down)text(label,x,y+tsize*2+2);
        else text(label,x +5 + txoff,y + tsize + tyoff);
        textSize(12);
      }
      fill(bcol);if(toggle==1)fill(255);
      ellipse(x+w/2 +textWidth(label)+20,y+h/2,w-8,h-8);
    }
    else if(w==h){
      fill(fcol);
      rect(x + textWidth(label)+5,y,w,h);
      if(label!=null){
        textSize(tsize);
        if(up)text(label,x,y-3);
        if(right)text(label,x+w+2,y);
        if(down)text(label,x,y+tsize*2+2);
        else text(label,x + 5 +txoff,y+w/2+tsize/2+tyoff);
        textSize(12);
      }
      fill(bcol);if(toggle==1)fill(255);
      ellipse(x+w/2 + textWidth(label)+5,y+h/2,w-8,h-8);
    }}
    
    if(togglebar){
      fill(0);
      stroke(col);
      if(!border)noStroke();
      
      if(w>h){
      fill(fcol);
      rect(x + textWidth(label)+5,y,w,h);
      if(label!=null){
        textSize(tsize);
        if(up)text(label,x,y-3);
        if(right)text(label,x+w+2,y);
        if(down)text(label,x,y+tsize*2+2);
        else text(label,x + 5 + txoff,y+tsize + tyoff + 4);
        textSize(12);
      }
      fill(bcol);
      if(toggle==0){rect(x +textWidth(label)+5+ w/2,y,w/2,h);text("OFF",x+textWidth(label)+w+10+txoff,y+tsize+tyoff+4);}
      else{ rect(x+textWidth(label)+5,y,w/2,h);text("ON",x+textWidth(label)+w+10+txoff,y+tsize+tyoff+4);}
    }
    else{
      fill(fcol);
      rect(x+textWidth(label),y,w,h);
      if(label!=null){
        textSize(tsize);
        if(up)text(label,x,y-3);
        if(right)text(label,x+w+2,y);
        if(down)text(label,x,y+tsize*2+2);
        else text(label,x + 5 +txoff,y+w/2+tsize/2+tyoff);
        textSize(12);
      }
      fill(fcol);
      if(toggle==0){rect(x+textWidth(label)+h/2,y,w,h/2);text("OFF",x+textWidth(label)+txoff,y+h+2+tyoff+4);}
      else{ rect(x + textWidth(label),y,w,h/2);text("ON",x+textWidth(label)+txoff,y+h+2+tyoff+4);}
    }}
    else if(togglebox){
      fill(0);
      stroke(col);
      if(!border)noStroke();
      
      if(w>h){
      fill(fcol,0);
      if(toggle==1)fill(bcol);
      rect(x,y,w,h);
      if(label!=null){
        fill(tcol);
        textSize(tsize);
        if(up)text(label,x,y-3);
        if(right)text(label,x+w+2,y+tyoff);
        if(down)text(label,x,y+tsize*2+2+tyoff);
        else text(label,x +5 + txoff,y+tsize + tyoff + 4);
        textSize(12);
      }}
    else{
      fill(fcol);
      if(toggle==1)fill(bcol);
      if(!border)noStroke();
      rect(x,y,w,h);
      if(label!=null){
        textSize(tsize);
        if(up)text(label,x,y-3);
        if(right)text(label,x+w+2,y);
        if(down)text(label,x,y+tsize*2+2);
        else text(label,x + 5 +txoff,y+w/2+tsize/2+tyoff);
        textSize(12);
      }}}
    
    if(subpos())toggle2 = 1;
    else toggle2 = 0;
    
    strokeWeight(1);
  };
  
  
  
  public void logic(){
    if(animate){
      if(pos()||toggle==1){
        if(bsize<tsize+tmax) bsize += 0.5f;
      }else if(bsize>tsize)bsize -= 0.5f;
      }
      
      if(radio||togglebar){
        if(pos2()||toggle==1)bcol = hcol;
        else bcol = color(0,100);
      }
      
  };
  
  public void logic(PVector m){
    if(animate){
      if(pos(m)||toggle==1){
        if(bsize<tsize+tmax) bsize += 0.5f;
      }else if(bsize>tsize)bsize -= 0.5f;
      }
      
      if(radio||togglebar){
        if(pos2(m)||toggle==1)bcol = hcol;
        else bcol = color(0,100);
      }
      
  };
  
  public void draw(PGraphics canvas){
    logic(mouse);
    canvas.textSize(12);
    if(subpos(mouse)){
      //toggle = 1;
    }
    float X = 0;
    float Y = 0;
    if(parent!=null){
      X = parent.x;
      Y = parent.y;
    }
    
    if(!radio&&!togglebar){
      canvas.stroke(255);
      canvas.strokeWeight(size);
      if(!border)canvas.noStroke();
      if(parent!=null&&type!=0){
        x = parent.x;
        //y = parent.y;
      }
      
      canvas.fill(50);
      canvas.rect(x,y,w,h);
      canvas.fill(col);
      canvas.rect(x ,y,w,h);
      
      canvas.textSize(textsize);
      
      if(label!=null){
        
      if(scaleh>0){
        canvas.pushMatrix();
        canvas.translate(0,y*scaleh+h/2);
        canvas.scale(1,scaleh);
      }
      if(scalew>0){
        canvas.pushMatrix();
        canvas.translate(x*scalew,0);
        canvas.scale(scalew,1);
      }
      
        canvas.fill(tcol);
        canvas.textSize(bsize);
        if(!textbtm&&!textright&&!textup)canvas.text(label,x+5+txoff,y+13+tyoff+5);
        if(textbtm)text(label,x+xoff,y+h+yoff+tsize);
        canvas.textSize(12);
        if(scaleh>0){
          canvas.scale(1,1/scaleh);
          canvas.popMatrix();
        }
        if(scalew>0){
          canvas.scale(-scalew,1/scalew);
          canvas.popMatrix();
        }
        
      }
      if(value){
        
        if(textup)textbox.y     = y - h;
        if(textbtm)textbox.y    = y + h;
        if(textleft) textbox.x  = x - w;
        if(textright) textbox.x = x + w;
        Text = textbox.textBox;
        
        if(pos(mouse)||textbox.pos(mouse)||textbox.toggle==1)texttoggle=true;
        else texttoggle = false;
        if(texttoggle)textbox.draw();
        //if(textbox.pos()&&mousePressed&&parent!=null){ parent.draw();}
        //else parent.toggle=0;
      }
      if(img!=null)canvas.image(img,x,y+1,w,h);
      }
    
    if(radio){
      canvas.fill(0);
      canvas.stroke(col);
      if(!border)canvas.noStroke();
      
      if(w>h){
      canvas.fill(fcol);
      canvas.rect(x ,y,w,h);
      if(label!=null){
        canvas.textSize(tsize);
        if(up)canvas.text(label,x,y-3);
        if(right)canvas.text(label,x+w+2,y);
        if(down)canvas.text(label,x,y+tsize*2+2);
        else canvas.text(label,x - canvas.textWidth(label) - 4 + txoff,y+tsize + tyoff);
        canvas.textSize(12);
      }
      canvas.fill(bcol);if(toggle==1)canvas.fill(255);
      canvas.ellipse(x+w/2 ,y+w/2,w-8,h-8);
    }
    else{
      canvas.fill(fcol);
      canvas.rect(x,y,h,h);
      if(label!=null){
        canvas.textSize(tsize);
        if(up)canvas.text(label,x,y-3);
        if(right)canvas.text(label,x+w+2,y);
        if(down)canvas.text(label,x,y+tsize*2+2);
        else text(label,x - textWidth(label) - 4 +txoff,y+tsize+tyoff);
        canvas.textSize(12);
      }
      canvas.fill(fcol);if(toggle==1)canvas.fill(255);
      canvas.ellipse(x+h/2,y+h/2,w-8,h-8);
    }}
    
    if(togglebar){
      canvas.fill(0);
      canvas.stroke(col);
      if(!border)canvas.noStroke();
      
      if(w>h){
      canvas.fill(fcol);
      canvas.rect(x ,y,w,h);
      if(label!=null){
        canvas.textSize(tsize);
        if(up)canvas.text(label,x,y-3);
        if(right)canvas.text(label,x+w+2,y);
        if(down)canvas.text(label,x,y+tsize*2+2);
        //else text(label,x - textWidth(label) - 4 + txoff,y+tsize + tyoff + 4);
        canvas.textSize(12);
      }
      canvas.fill(bcol);
      if(toggle==0){canvas.rect(x + w/2,y,w/2,h);canvas.text("OFF",x+w+2+txoff,y+tsize+tyoff+4);}
      else{ canvas.rect(x,y,w/2,h);canvas.text("ON",x+w+2+txoff,y+tsize+tyoff+4);}
    }
    else{
      canvas.fill(fcol);
      canvas.rect(x,y,w,h);
      if(label!=null){
        canvas.textSize(tsize);
        if(up)canvas.text(label,x,y-3);
        if(right)canvas.text(label,x+w+2,y);
        if(down)canvas.text(label,x,y+tsize*2+2);
        else text(label,x - textWidth(label) - 4 +txoff,y+w/2+tsize/2+tyoff);
        canvas.textSize(12);
      }
      canvas.fill(fcol);
      if(toggle==0){canvas.rect(x+h/2,y,w,h/2);canvas.text("OFF",x+txoff,y+h+2+tyoff+4);}
      else{ canvas.rect(x,y,w,h/2);canvas.text("ON",x+txoff,y+h+2+tyoff+4);}
    }}
    else if(togglebox){
      canvas.fill(0);
      canvas.stroke(col);
      if(!border)canvas.noStroke();
      
      if(w>h){
      canvas.fill(fcol,0);
      if(toggle==1)canvas.fill(bcol);
      canvas.rect(x ,y,w,h);
      if(label!=null){
        canvas.textSize(tsize);
        if(up)canvas.text(label,x,y-3);
        if(right)canvas.text(label,x+w+2,y+tyoff);
        if(down)canvas.text(label,x,y+tsize*2+2+tyoff);
        else text(label,x - textWidth(label) - 4 + txoff,y+tsize + tyoff + 4);
        canvas.textSize(12);
      }}
    else{
      canvas.fill(fcol);
      if(toggle==1)canvas.fill(bcol);
      if(!border)canvas.noStroke();
      canvas.rect(x,y,w,h);
      if(label!=null){
        canvas.textSize(tsize);
        if(up)canvas.text(label,x,y-3);
        if(right)canvas.text(label,x+w+2,y);
        if(down)canvas.text(label,x,y+tsize*2+2);
        else canvas.text(label,x + 4 +txoff,y+w/2+tsize/2+tyoff);
        canvas.textSize(12);
      }}}
    
    if(subpos(mouse))toggle2 = 1;
    else toggle2 = 0;
    
    canvas.strokeWeight(1);
  };
  
  public void radio(){
    
    radio = true;
  };
  
  public void func(Grid a){
    
      a.draw_2d();
    
  };
  public void func(Plot_2D a){
    
      a.draw();
    
  };
  
  public void labelcheck(float a){
    
    if(textWidth(label)>a){
    for(int i=10;i<label.length();i++){
      float lw = textWidth(label.substring(0,i)+ " ...");
      if(lw>a){
        label = label.substring(0,i-1) + "...";
        textcheck = true;
        break;
      }
    }}
    else textcheck = true;
    
  };
  
  public boolean pos(){
    
    return x  < mouseX && mouseX < x + w && y < mouseY && mouseY < y + h+2;
  };
  
  public boolean pos(PVector m){
    
    return x  < m.x && m.x < x + w && y < m.y && m.y < y + h+2;
  };
  public boolean pos(PGraphics m){
    
    return x  < mouse.x && mouse.x < x + w && y < mouse.y && mouse.y < y + h+2;
  };
  
  public boolean pos2(){
    
    return x < mouseX && mouseX < x + w + textWidth(label)+5 && y < mouseY && mouseY < y + h+2;
  };
  
  public boolean pos2(PVector m){
    
    return x < m.x && m.x < x + w + textWidth(label)+5 && y < m.y && m.y < y + h+2;
  };
  
  public boolean pos3(){
    
    return x + textWidth(label)+5 < mouseX && mouseX < x + w + textWidth(label)+5 && y < mouseY && mouseY < y + h+2;
  };
  
  public boolean pos3(PVector m){
    
    return x + textWidth(label)+5 < m.x && m.x < x + w + textWidth(label)+5 && y < m.y && m.y < y + h+2;
  };
  
  public void getValue(){
    //if(key='ENTER')
  };
  
  public void setName(String a){
    label = a;
  };
  
  public String getName(){
    String a = "";
    if (label!=null) a = label;
    
    return a;
  };
  
  public void self_toggle(){
    if(parent==null){
      if(pos()){
      toggle++;
    }
    if(toggle==2){
     toggle=0; 
    }}else{
    if(pos()&&parent.toggle==1){
      toggle++;
    }
    if(toggle==2){
     toggle=0; 
    }}
  };
  
  public void self_click(){
    if(!pos()&&parent!=null&&parent.toggle==1&&mousePressed){mdown = true;}
    //else if(!pos()&&parent==null&&toggle==1&&mousePressed){mdown = false;}
    if(pos()&&parent!=null&&parent.toggle==1&&!mdown){
      mdown = true;
    }
    else if(pos()&&parent==null&&!mdown){
      mdown = true;
    }
    if(mdown)toggle = 1;
    else toggle = 0;
    if(mdown && !mousePressed){mdown = false;}
  };
  
  public void self_click2(){
     if(pos()&&parent==null&&mousePressed&&toggle==0&&!mdown){
      toggle++;
      col = hcol;
      mdown = true;
    }
    
    if(pos()&&parent==null&&mousePressed&&toggle>0&&!mdown){
      toggle=0;
      col = fcol;
      mdown = true;
    }
    
    if(!mousePressed)mdown = false;
  };
  
  public void self_click2(PVector m){
     if(pos(m)&&parent==null&&mousePressed&&toggle==0&&!mdown){
      toggle++;
      col = hcol;
      mdown = true;
    }
    
    if(pos(m)&&parent==null&&mousePressed&&toggle>0&&!mdown){
      toggle=0;
      col = fcol;
      mdown = true;
    }
    
    if(!mousePressed)mdown = false;
  };
  
  public void self_click3(){
     if(pos()&&parent==null&&mousePressed&&toggle==0&&!mdown){
      toggle++;
      col = hcol;
      mdown = true;
    }
    
    if(!mdown){
      toggle=0;
      col = fcol;
      mdown = true;
    }
    
    if(!mousePressed)mdown = false;
  };
  
  public void self_click4(){
    boolean k = false;
     if(pos()&&parent==null&&mousePressed&&toggle==0&&!mdown){
      toggle++;
      col = hcol;
      mdown = true;
    }
    
    if(mdown)k = true;
    
    if(k){
      toggle=0;
      col = fcol;
      mdown = false;
    }
    
    if(!mousePressed)mdown = false;
  };
  
  public void click(Object a,String b){
    
    if(parent!=null){
    //if(!pos()&&parent.toggle==1&&mousePressed)mdown = true;
    if(pos()&&parent.toggle==1&&mousePressed&&!mdown)mdown = true;
    
    if(mdown)toggle = 1;
    else toggle = 0;
    if(!mousePressed){mdown = false;}
    
    Field field = null;
    
    try{
         field = a.getClass().getField(b); 
        
         if(mdown){
           field.set(a, true); 
         }else {
           field.set(a, false);
         }
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}
    else{
      if(pos()&&mousePressed&&!mdown)mdown = true;
    
    if(mdown)toggle = 1;
    else toggle = 0;
    if(mousePressed){mdown = false;}
    
    Field field = null;
    
    try{
         field = a.getClass().getField(b); 
        
         if(mdown){
           field.set(a, true); 
         }else {
           field.set(a, false);
         }
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }
    }
  };
  
  public void latch(Object a,String b){
    PVector n = new PVector(mouseX,mouseY);
    if(mouse!=null)n = mouse;
    boolean mousedown = false;
    if(parent!=null){
    if(pos(n)&&parent.toggle==1&&mousePressed&&toggle==0)toggle++;
    if(!mousePressed&&toggle>0){mdown = true;toggle = 0;}
    
    Field field = null;
    
    try{
         field = a.getClass().getField(b); 
        
         if(mdown)field.set(a, true); 
         //else field.set(a, false); 
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }if(!mousePressed)mdown = false;}
    else{
      if(pos(n)&&mousePressed&&toggle==0)toggle++;
      if(!mousePressed&&toggle>0){mdown = true;toggle = 0;}
      
    
    Field field = null;
    
    try{
         field = a.getClass().getField(b); 
        
         if(mdown){
           field.set(a, true); 
         }
         //else field.set(a, false); 
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }
  if(!mousePressed)mdown = false;
}
  };
  
  public void reverseclick(Object a,String b){
    if(parent!=null){
    //if(!pos()&&parent.toggle==1&&mousePressed)mdown = true;
    if(pos()&&parent.toggle==1&&mousePressed&&!mdown)mdown = true;
    
    if(mdown)toggle = 1;
    else toggle = 0;
    if(mdown && !mousePressed){mdown = false;}
    
    Field field = null;
    
    try{
         field = a.getClass().getField(b); 
        
         if(mdown)field.set(a, true); 
         else field.set(a, false);
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}
    else{
      if(pos()&&mousePressed&&!mdown)mdown = true;
    
    if(mdown)toggle = 1;
    else toggle = 0;
    if(mdown && !mousePressed){mdown = false;}
    
    Field field = null;
    
    try{
         field = a.getClass().getField(b); 
        
         if(!mdown)field.set(a, true); 
         else field.set(a, false);
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }
    }
  };
  
   public void self_Toggle(){
   if(parent!=null){
    if(pos() && parent.toggle==1){
      toggle ++;
    
    if(toggle==2){
      toggle = 0;
    }}}else {
      if(pos()){
      toggle ++;
    
    if(toggle==2){
      toggle = 0;
    }}
    }
    
  };
  
  public void toggle( String b){
    if(parent!=null){
    if(pos() && parent.toggle==1){
      toggle ++;
      
      if(toggle==2){
        toggle=0;
    }}
    if(pos() && parent.toggle==1){
        
    
         //if(toggle==1)field.set(a, true); 
         //else if(toggle==0)field.set(a, false);
        }}
    
    else{
      
    }
  };
  
  public void toggle(Object a, String b){
    if(parent!=null){
    if(pos() && parent.toggle==1){
      toggle ++;
      
      if(toggle==2)toggle=0;
    }
    if(pos() && parent.toggle==1){
        
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1)field.set(a, true); 
         else if(toggle==0)field.set(a, false);
         
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}}else{
      
      if(pos()){
      toggle ++;
      if(toggle==2)toggle=0;
    }
    if(pos()&&toggle==1){
        
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1)field.set(a, true); 
         else if(toggle==0)field.set(a, false);
         
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}}
  };
  
  public void toggle(PApplet a, String b){
    if(parent!=null){
    if(pos() && parent.toggle==1){
      toggle ++;
      
      if(toggle==2){
        toggle=0;
    }}
    if(pos() && parent.toggle==1){
        
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1)field.set(a, true); 
         else if(toggle==0)field.set(a, false);
         
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}}
    
    else{
      
    }
  };
  
  
  public void toggle2(Object a, String b){
    
    
    if(parent!=null){
    if(pos()&&parent.toggle==1&&mousePressed&&toggle==0&&!mdown){
      toggle=1;
      mdown = true;
    }
    
    if(pos()&&parent.toggle==1&&mousePressed&&toggle>0&&!mdown){
      toggle=0;
      mdown = true;
    }
    if(!mousePressed)mdown = false;
    
    if(pos() && parent.toggle==1){
        
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1)field.set(a, true); 
         else field.set(a, false);
         
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}}
    else {
      
    if(pos()&&mousePressed&&toggle==0&&!mdown){
      toggle++;
      mdown = true;
    }
    
    else if(pos()&&mousePressed&&toggle>0&&!mdown){
      toggle=0;
      mdown = true;
    }
    if(!mousePressed)mdown = false;
    
    if(mdown){
        
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1){
           field.set(a, true); 
         }else {
           field.set(a, false);
         }
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}if(!mousePressed)toggle = 0;}
  };
  
  public void toggle4(Object a, String b){
    
    
    if(parent!=null){
    if(pos()&&parent.toggle==1&&mousePressed&&toggle==0&&!mdown){
      toggle=1;
      mdown = true;
    }
    
    if(pos()&&parent.toggle==1&&mousePressed&&toggle>0&&!mdown){
      toggle=0;
      mdown = true;
    }
    if(!mousePressed)mdown = false;
    
    if(pos() && parent.toggle==1){
        
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1){
           field.set(a, true); 
         }else {
           field.set(a, false);
         }
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}}
    else {
      
    if(pos()&&mousePressed&&toggle==0&&!mdown){
      toggle++;
      mdown = true;
    }
    
    else if(pos()&&mousePressed&&toggle>0&&!mdown){
      toggle=0;
      mdown = true;
    }
    if(!mousePressed)mdown = false;
    
    if(mdown){
        
    Field field = null;
    
    //try{
      
    //     field = a.getClass().getField(b); 
        
    //     if(toggle==1&&field){
    //     }else if(toggle==1&&!field){
    //       field.set(a, true);
    //     }else if(toggle==0&&!field){
    //     }else if(toggle==0&&field){
    //       field.set(a, false);
    //     }
    //}catch (NullPointerException e) {
    //}catch (NoSuchFieldException e) {
    //}catch (IllegalAccessException e) {
    //}
  }
  }
  };
  
  public void toggled(Object a,String b){
    //if(dclick)
    if(pos()&&mousePressed&&toggle==0&&!mdown){
      toggle++;
      mdown = true;
    }
    
    else if(pos()&&mousePressed&&toggle>0&&!mdown){
      toggle=0;
      mdown = true;
    }
    if(!mousePressed)mdown = false;
    
    if(mdown){
        
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1){
           field.set(a, true); 
         }else {
           field.set(a, false);
         }
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}
  
  };
  
   public void sptoggle(Object a, String b,String [] c){
    if(pos() && parent.toggle==1){
      toggle ++;
      
      if(toggle==2){
        toggle=0;
    }}
    if(pos() && parent.toggle==1){
        
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
         
         if(toggle==1){
           field.set(a, true); 
         }else {
           field.set(a, false);
         }}catch (NoSuchFieldException e) {
          }catch (NullPointerException e) {
          }catch (IllegalAccessException e) {
          }
          
        for(int i=0;i<c.length;i++){
           String next = c[i];
           if(next!=b){
             try{
             field = a.getClass().getField(next); 
             field.set(a, false); 
             }catch (NullPointerException e) {
             }catch (NoSuchFieldException e) {
             }catch (IllegalAccessException e) {
             }
           }}}
  };
  
  public void toggle3(Object a, String b){
    
    if(mousePressed&&pos()){
      toggle++;
    }
    
    if(toggle>2)toggle=0;
    
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1){
           field.set(a, true); 
         }else {
           field.set(a, false);
         }
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }
  };
  
  public void highlight2(){
    col = color(255,50);
  }
  
  public void highlight3(){
    if(pos()){
    col = color(255,255,255,80);
    }
    else{
      col = color(255,255,255,50);
    }
  };
  
  public void highlight(){
    if(toggle==1){
      col = hcol;
    }
    else{ col = fcol;}
    if(buttons.size()==0){
    if(pos())col = hcol;
    else col = fcol;
    }else{
      if(pos())col = hcol;
      else col = fcol;
    }
  };
  
  public void highlight(PVector m){
    if(toggle==1)col = hcol;
    else col = fcol;
    
    if(buttons.size()==0){
    if(pos(m))col = hcol;
    else col = fcol;
    }else{
      if(pos(m))col = hcol;
      else col = fcol;
    }
  };
  
  public boolean subpos(){
     float X = 0;
     float Y = 0;
      if(parent!=null){
        X = parent.x;
        Y = parent.y;
      }
    
      return mouseX> x + w-20+xoff&& mouseX < x + w&& mouseY > y&& mouseY < y + h;
    
  };
  
  public boolean subpos(PVector m){
     float X = 0;
     float Y = 0;
      if(parent!=null){
        X = parent.x;
        Y = parent.y;
      }
    
      return m.x> x + w-20+xoff&& m.x < x + w&& m.y > y&& m.y < y + h;
    
  };
  
  public boolean subposLeft(){
     float X = 0;
     float Y = 0;
      if(parent!=null){
        X = parent.x;
        Y = parent.y;
      }
    
      return mouseX> x&& mouseX < x + 20&& mouseY > y&& mouseY < y + h;
    
  };
  
  public boolean subposLeft(PVector m){
    
      return m.x> x&& m.x < x + 20&& m.y > y&& m.y < y + h;
    
  };
};

class ButtonGrid{
  
};

class listBox{
  
  float x,y,w,h,vspacing,hspacing;
  ArrayList<Button> buttons = new ArrayList<Button>();
  String type;
  boolean vertical, horizontal,Menu,toggle;
  Menu menu;
  Menu mlist;
  
  listBox(float xx, float yy,float ww,int num){
    
    x = xx;
    y = yy;
    w = ww;
    h = (20) * num;
    Menu = true;
    
    menu = new Menu(x,y,w,h,"none");
    
    for(int i=0;i<num;i++){
      float ypos = y+(20) *i;
      Button a =  new Button(x ,ypos,w,20);
      //a.id = i;
      a.border = false;
      a.parent = menu;
      buttons.add(a);
      menu.items.add(a);
    }
    menus.add(menu);
  };
  
  listBox(int xx, int yy,int ww,int hh,int num){
    
    x = xx;
    y = yy;
    w = ww;
    h = (20) * num;
    Menu = true;
    
    menu = new Menu(x,y,w,h,"none");
    
    for(int i=0;i<num;i++){
      float ypos = y+(20) *i;
      Button a =  new Button(x ,ypos,w,20);
      //a.id = i;
      a.border = false;
      a.parent = menu;
      buttons.add(a);
      menu.items.add(a);
    }
    menus.add(menu);
  };
  
  listBox(float xx, float yy,float ww,int num,Menu m){
    
    x = xx;
    y = yy;
    w = ww;
    h = (20) * num;
    
    menu = new Menu(x,y,w,h);
    menu.listbox = true;
    
    for(int i=0;i<num;i++){
      float ypos = y+(20) *i;
      Button a =  new Button(x ,ypos,w,20);
      //a.id = i;
      a.border = false;
      a.parent = menu;
      buttons.add(a);
      menu.items.add(a);
    }
    //menus.add(menu);
  };
  
  listBox(int xx, int yy,int ww,int num,Menu m){
    
    x = xx;
    y = yy;
    w = ww;
    h = (20) * num;
    
    menu = m;
    menu.listbox = true;
    
    for(int i=0;i<num;i++){
      float ypos = y+(20) *i;
      Button a =  new Button(x ,ypos,w,20);
      //a.id = i;
      a.border = false;
      a.parent = menu;
      buttons.add(a);
      menu.items.add(a);
    }
    //menus.add(menu);
  };
  
  listBox(float xx, float yy,float ww,int num,Menu m,String[] list){
    
    x = xx;
    y = yy;
    w = ww;
    h = (20) * num;
    
    menu = m;
    menu.h = m.h;
    
    for(int i=0;i<num;i++){
      
      float ypos = y+(20) *i;
      Button a =  new Button(x ,ypos,w,20);
      //a.id = i;
      if(i<list.length){
        String label = list[i];
        a.label = label;
      }
      a.border = false;
      a.parent = menu;
      buttons.add(a);
      menu.items.add(a);
    }
      
      
  };
  
  listBox(float xx, float yy,float ww,Menu m,String[] list){
    
    x = xx;
    y = yy;
    w = ww;
    h = m.h;
    
    menu = m;
    //menu.listbox = true;
    menu.h = list.length*20;
    
    for(int i=0;i<list.length;i++){
      
      float ypos = y+(20) *i;
      Button a =  new Button(x ,ypos,w,20);
      //a.id = i;
      if(i<list.length){
        String label = list[i];
        a.label = label;
      }
      a.border = false;
      a.parent = menu;
      buttons.add(a);
      menu.items.add(a);
    }
  };
  
  listBox(float xx, float yy,float ww,Menu m,String[] list,int k){
    
    x = xx;
    y = yy;
    w = ww;
    h = m.h;
    
    menu = m;
    menu.h = list.length*20;
    //menu.listbox = true;
    
    for(int i=0;i<list.length;i++){
      
      float ypos = y+(20) *i;
      Button a =  new Button(x ,ypos,w,20);
      //a.id = i;
      if(i<list.length){
        String label = list[i];
        a.label = label;
      }
      a.border = false;
      a.parent = menu;
      a.togglebox = true;
      buttons.add(a);
      //menu.w = textWidth(a.label);
      menu.items.add(a);
    }
  ////if(menu.label!=null)menus.add(menu);
  if(menu.label!=null)menus.add(this.menu);
    
  };
  
  public void draw(){
    if(Menu){
      if(toggle)menu.draw();
    }else{
    menu.draw();
    }
  }
  
  public void display(String a){
    
    if(a=="vertical"|| a== "Vertical"){
      float k = 0;
      menu.vertical = true;
      
      k = menu.h;
      menu.h = menu.w ;
      h = w;
      menu.w = k;
      w = k;
      
      for(int i=0;i<menu.items.size();i++){
        
        Button b = menu.items.get(i);
      b.horizontal = false;
      k = b.w;
      b.w = b.h;
      b.h = k;
      }
    }
    
  };
  
  public void set(int b, String a){
    
    menu.items.get(b).label = a;
  };
  
  public void set(int a, String b, String c){
    
  };
  
  public void toggle(int i,Object o,String b){
    Button a = new Button();
    menu.items.get(i).toggle(o,b);
  };
  
  public void click(int i,Object a,String b){
    Button k = menu.items.get(i);
    k.click(a,b);
    
      try{
      
         Field field = a.getClass().getField(b); 
         
         if(k.toggle==1){
           field.set(a, true); 
         }else {
           field.set(a, false);
           }
          }catch (NullPointerException e) {
          }catch (NoSuchFieldException e) {
          }catch (IllegalAccessException e) {
          }
  };
  
  
  public void set(int c, Grid_space a, String b,float d, float e){
    //sliders.get(c).slide(float d,float e, 
  };
  
  public void set(Entity a, String b){
    
  };
  
  public void set(Window a, String b){
    
  };
  
  public void set(Menu a, String b){
    
  };
  
  public void set(Boundary a, String b){
    
  };
  
  public void set(Plot_2D a, String b){
    
  };
  
  public void setbg(){
    
  };
  
  
};
  float minageh = 100;
  float maxageh = 200;

  class Entity{

  int id,xp,yp,txtb_value,vcount,polarity = floor(random(-2,2)),pos,race,ent,function = floor(random(0,6)),eIndex1 = -1,eIndex2 = -1,cIndex1,cIndex2,aIndex1,aIndex2,hRaces,acount,scount,alcount,mcount;

  public float x,y,z,w,h,intensity,mass = random(1,2),radius = random(10,30), lifespan,intelligence,dexterity,endurance,piety,vision,health,speed,selfp,charisma,agility,reputation,sanity,humanity,faith,fresistance;

  public float homex,homey,homew,homeh,birthrate = 2000;
  public float memory,movement,respiration,sensitivity,growth,regulation,nutrition,synthesis,transportation,reparation,size,tscale = 0.3f,ssize = 1,hunger,h_cooldown,i_cooldown;

  public float age = 0,bscale = 0.2f,time,delay,r,skill,vlimit,vlimitb = vlimit,fov = 20,eating_time = random(10,20),breathingroom,breathingroomb,breathingroomb1 = breathingroom,breathingroomb2 = breathingroomb,alimit,mult1,mult2,mu,min,minb;

  float  bdir = 0,inc = 0,countdown = random(10),countdownb = countdown,offset = 100,valueOffset = random(-offset/2,offset/2),Friction;

  public float avoidance = random(0,5),cohesion = random(0,5),cohesionb,alignment,neg = 0,wandertheta = 0,wanderm = 0.2f,wandermb = wanderm,cohesionb1 = cohesion,cohesionb2 = cohesionb,separationc=1,cohesionc=1,separation = random(0,15),separationb = random(0,15),alimitb = alimit, alignmentb = alignment,avoidanceb = avoidance,alignmentc = 1,separationd = 20,separationdb,
  separationb1 = separation,separationb2 = separationb,seekN,avoidN,alignN,seekN2,avoidN2,Avoid,Cohesion,Align;

  public int carrying_capacity,boundaryspace = 30,drawtotalh;
  float vx,vy,vz,ax = 0.02f,ay = 0.02f,az = 0.1f,dir = random(-2*PI,2*PI),sumvx,sumvy,tgdist;
  public String label;
  String arrays,floats,bools;
  float a1,a2,a3,a4,a5;
  PVector p, vel = new PVector(0,0), ac,target,center = new PVector(x,y),centervel,fp = new PVector(0,0),tp = new PVector(0,0),targetb,fp2 = new PVector(0,0),centerf = new PVector(x,y),centervelf,fpf = new PVector(0,0),velf = new PVector(0,0),friction = new PVector(0,0);
  int col = color(random(255),random(255),random(255));
  int col2 = col,cols,colb = col,hcol = color(255),col3 = color(0);
  _tri tri_boundary = null;
  _tri tri_boundaryf = null;
  _tri tri_boundaryp = null;
  _rect squ_boundary;
  _ellipse ellipse_boundary;
  Boundary current_boundary;
  Boundary Boundary;
  Plant targetfruit;
  Human leader,parent,desired,owner,obstructionh;
  Species species;
  public Scene scene;

  String type;
  boolean seek,avoid,align,avoid2;
  public boolean drag,resize,seek_food,fight,mate,work,bond,hide,mazecrawler,human,plant,animal,element,real = true,dead,birth,move,toggle,idle,familyties,addh,Birth,Death;
  boolean locked,setvel,highlight,updategenes,e1down,e2down,mdown,paused;
  public boolean trackmouse,pause,dynamic,debug,boundary,reset,followb,showbroom,showta,showtb,showheading,showsliders,showview,info,merge,stop,turn,turnh,hidesliders,visible,separationManager,cohesionManager,alignmentManager,save;
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  HashMap<Integer,Float> neighbourVariables = new HashMap<Integer,Float>();
  ArrayList<Float> seekNeighbour = new ArrayList<Float>();
  ArrayList<Float> avoidNeighbour = new ArrayList<Float>();
  ArrayList<Float> alignNeighbour = new ArrayList<Float>();
  ArrayList<Float> seekNeighbour_ = new ArrayList<Float>();
  ArrayList<Float> avoidNeighbour_ = new ArrayList<Float>();
  ArrayList<Float> alignNeighbour_ = new ArrayList<Float>();
  ArrayList<Float> oscilators = new ArrayList<Float>();
  ArrayList<Float> oscilatorCounters = new ArrayList<Float>();

  //---------------Spatial partititoning variables----------------

  PVector a,v,part;
  boolean collide = false, update = false, ext = false;
  ArrayList<Integer> iid = new ArrayList<Integer>();
  ArrayList<Integer> iid2 = new ArrayList<Integer>();
  ArrayList<Quad> Neighbours = new ArrayList<Quad>();
  int t,c,t2 = 0;

  //---------------ArrayLists-------------------------

  ArrayList<ArrayList> Entities = new ArrayList<ArrayList>();
  ArrayList<Boundary> boundariesAvoid = new ArrayList<Boundary>();
  ArrayList<Boundary> boundariesFollow = new ArrayList<Boundary>();
  ArrayList<Boolean> walls = new ArrayList<Boolean>();
  ArrayList<ArrayList<Human>> Humans = new ArrayList<ArrayList<Human>>();
  public ArrayList<ArrayList<Plant>> Plants = new ArrayList<ArrayList<Plant>>();
  ArrayList<ArrayList<Animal>> Animals = new ArrayList<ArrayList<Animal>>();
  ArrayList<ArrayList<Mineral>> Minerals = new ArrayList<ArrayList<Mineral>>();
  ArrayList<ArrayList<Metal>> Metals = new ArrayList<ArrayList<Metal>>();
  ArrayList<ArrayList<Celluloid>> Celluloids = new ArrayList<ArrayList<Celluloid>>();
  ArrayList<ArrayList<Particle>> Particles = new ArrayList<ArrayList<Particle>>();
  ArrayList<Entity> neighbours = new ArrayList<Entity>();
  ArrayList<ArrayList<mazeCrawler>> Mazecrawlers = new ArrayList<ArrayList<mazeCrawler>>();

  //ArrayList<Integer> genes = new ArrayList<Integer>();
  boolean births,try_,conception;
  int child;
  float dice;

  ArrayList<Human> Children = new ArrayList<Human>();
  ArrayList<Human> family = new ArrayList<Human>();
  ArrayList<Human> avoidh = new ArrayList<Human>();
  ArrayList<Human> proximity = new ArrayList<Human>();
  ArrayList<Human> prox = new ArrayList<Human>();
  ArrayList<ArrayList<Human>> prox2 = new ArrayList<ArrayList<Human>>();
  ArrayList<ArrayList<Human>> proximity2 = new ArrayList<ArrayList<Human>>();
 
  HashMap<String,Float>genes = new HashMap<String,Float>();
  HashMap<String,Float>sgenes = new HashMap<String,Float>();
  ArrayList<String> Genes = new ArrayList<String>();
  ArrayList<String> desired_traits = new ArrayList<String>();
  ArrayList<String> desired_skill = new ArrayList<String>();

  Float [] avoid_angles = {radians(0),radians(45),radians(-45),radians(90),radians(-90),radians(135),radians(-135),radians(180)};
  Float [] avoid_angles2 = {radians(90),radians(-90),radians(135),radians(-135),radians(180)};

  String []oscilatorLabels = { "vlimit","alimit","cohesion","alignment","separation","breathingroom","separationc","cohesionc"};
  
  Entity(){

  };

  Entity(float xx, float yy,float ww,float hh){

    homex = xx;
    homey = yy;
    homew = xx + ww;
    homeh = yy + hh;
    w = ww;
    h = hh;
    //Boundary = new Boundary();
    scene = new Scene(xx,yy,w,h);
  };


  Entity(float xx, float yy,int Type){

    x = xx;
    y = yy;

  };

  public void save(){
    if(save){
      for(int i=0;i<Humans.size();i++){
        
      }
    }
  };

  public void load(){

  };

  public void Reset(){
    if(reset){
      Humans = new ArrayList<ArrayList<Human>>();
      entities.remove(ent);
      spawnRaces("human",1,200);
      btn35.toggle = 0;
      Entities_sublist.toggle = 0;
      reset = false;
    }
  };

  public void move(){

    x += random(-vx,vx);
    y += random(-vy,vy);

  };

  public void create_genes(){

  };

  public void update_Genes(){
    if(updategenes){

      for ( String key : genes.keySet() ) {

          try{
         Field field = key.getClass().getField(key);
         Float strValue = (Float) field.getFloat(key);
           genes.replace(key,strValue);

         }catch (NoSuchFieldException e) {
           }catch (IllegalAccessException e) {
         }}
      updategenes = false;
    }

    //for(int i=0;i<
  };

  public void info(){
    fill(255);
    textSize(20);
    //if(lines.scene.boundary!=null)text(lines.scene.boundary.type,100,80);
    text(Humans.size(),100,100);
    text(Plants.size(),100,120);
    text(Animals.size(),100,140);
    textSize(12);
  };
  
  public PVector futurep(){
    fp = PVector.add(p,vel.get().normalize().mult(vlimit));
    return fp;
  };

  public PVector futurep(float czone){

    return p.add(vel.normalize().mult(czone/2));
  };

  public PVector futurep(PVector a, PVector b, float c){

    return a.add(b.normalize().mult(c/2));
  };

  public PVector futurep(Human h,float czone){

    return h.p.add(h.vel.normalize().mult(czone/2));
  };

  public PVector futurep(Animal a,float czone){

    return a.p.add(vel.normalize().mult(czone/2));
  };

  public PVector futurep(Boundary b,float czone){

    return p.add(vel.normalize().mult(czone/2));
  };

  public PVector seek(PVector a){

    PVector d = PVector.sub(a,p);
    d.setMag(vlimit);

    PVector s = PVector.sub(d,vel);
    s.limit(alimit);
    return s;
  };

  public void quadPos(){

    float sw = scene.fields.get(0).w;
    float sh = scene.fields.get(0).h;

    float X = scene.x;
    float Y = scene.y;

    x = p.x;
    y = p.y;
    int xpos = floor((x-X)/sw);
    int ypos = floor((y-Y)/sh);
     pos = PApplet.parseInt(xpos + ypos * (scene.cols));
    //fill(255);
    //text(pos,p.x,p.y);

    if(iid.size()==2&&iid.get(0)!=iid.get(1))update = true;
    else update = false;

    if(iid.size()==0)iid.add(pos);
    else if(iid.get(iid.size()-1)!=pos)iid.add(pos);

    if(iid.size()>2)iid.remove(0);


  };

  public void update_qgrid(){

    //updates the corresponding qgrid array's children with the last id in the iid arraylist

    // iid is either of length 1 at the start or of length 2 any time after. If iid is size 2 then you need to check if the perticle crosses a border at anytime by comparing iid(0)
    // and iid(1), if they are different then the particle has crossed a border. Therefore update the corresponding previous grid space by removing this id, and update the new grid
    // space by adding the id.

    ArrayList<Quad> qgrid = scene.fields;
    if(iid.size()==2){
      boolean a = true;
      if(iid.get(1)<qgrid.size()-1&&iid.get(1)>=0){
     a = qgrid.get(iid.get(1)).children.contains(this);
      }
      boolean b = false;
      if(iid.get(0)<qgrid.size()-1&&iid.get(0)>=0){
     b = qgrid.get(iid.get(0)).children.contains(this);
      }
    if(!a){
      qgrid.get(iid.get(1)).children.add(this);
      //qgrid.get(iid.get(1)).fillc();
      }
    if (b){
      int k = qgrid.get(iid.get(0)).children.indexOf(this);
      qgrid.get(iid.get(0)).children.remove(k);
    }}
    if(iid.size()==1){
      if(iid.get(0)<qgrid.size()&&iid.get(0)>=0){
    boolean a = qgrid.get(iid.get(0)).children.contains(this);
    if(!a){
      //qgrid.get(iid.get(0)).fillc();
      qgrid.get(iid.get(0)).children.add(this);
    }}}
  };

  public void separationLogic(){
    Entity e = entities.get(ent);

    int k = -1;
    int col = 255;
    float d1 = 0;
    for(int i=0;i< e.Humans.size();i++){

      float xx = W/2;
      float yy = H/2;
      float theta = radians(360/e.Humans.size());
      float r = 200;

      float x1 = xx + r * cos(theta*i);
      float y1 = yy + r * sin(theta*i);

      fill(e.Humans.get(i).get(0).col);
      float d = dist(mouseX,mouseY,x1,y1);
       d1 = dist(mouseX,mouseY,xx,yy);

      if(d<10){
        fill(255);
        k = i;
      }

      int count = 0;
      for(int j=0;j< e.Humans.size();j++){
        float cc = e.Humans.get(i).get(0).avoidNeighbour.get(j);
        if(cc>-1)count++;
      }

      text(i,x1,y1-20);
      text(eIndex1,x1+20,y1);
      text(eIndex2,x1+20,y1+10);
      text(count,x1-40,y1+10);
      ellipse(x1,y1,20,20);
      ellipse(xx,yy,30,30);
    }

      for(int i=0;i< e.Humans.size();i++){

      float xx = W/2;
      float yy = H/2;
      float theta = radians(360/e.Humans.size());
      float r = 200;

      float x1 = xx + r * cos(theta*i);
      float y1 = yy + r * sin(theta*i);


      for(int j=0;j<e.Humans.get(i).get(0).avoidNeighbour.size();j++){

        float p1 = e.Humans.get(i).get(0).avoidNeighbour.get(j);

        float x2 = xx + r * cos(theta*j);
        float y2 = yy + r * sin(theta*j);
        if(p1>0){
        stroke(0);
        ellipse(x2,y2,5,5);
        
        line(x1,y1,x2,y2);
      }}}

    if(k>-1){
      if(mousePressed&&mouseButton==RIGHT){
        for(int j=0;j< e.Humans.size();j++)e.Humans.get(k).get(0).avoidNeighbour.set(j,PApplet.parseFloat(-1));
        eIndex1 = -1;
        eIndex2 = -1;
      }
    else if(mousePressed&&!e1down&&!e2down&&!mdown){
          eIndex1 = k;
          e1down = true;
          mdown = true;
          
        }else if(mousePressed&&!e2down&&!mdown&&e1down){
          eIndex2 = k;
          e2down = true;
          mdown = true;
          e.Humans.get(eIndex1).get(0).avoidNeighbour.set(eIndex2,random(r*2,50));
          }}else {
            if(mousePressed&&mouseButton==LEFT&&!mdown&&d1<15){
              mdown = true;
              for(int i=0;i< e.Humans.size();i++){
                for(int j=0;j< e.Humans.size();j++){

                if(j!=i)e.Humans.get(i).get(0).avoidNeighbour.set(j,random(r*2,50));

              }}}else if(mousePressed&&mouseButton==RIGHT&&!mdown&&d1<15){
                mdown = true;
                for(int i=0;i< e.Humans.size();i++){
                for(int j=0;j< e.Humans.size();j++){

                e.Humans.get(i).get(0).avoidNeighbour.set(j,PApplet.parseFloat(-1));

              }}}}

        if(!mdown&&mousePressed){
            e1down = false;
            e2down = false;
            mdown = true;
          }
      if(!mousePressed)mdown = false;
      if(!mousePressed&&e2down&&e1down){
        e1down = false;
        e2down = false;
      }
  };

  public void cohesionLogic(){
    Entity e = entities.get(ent);

    int k = -1;
    int col = 255;
    float d1 = 0;
    

    for(int i=0;i< e.Humans.size();i++){

      float xx = W/2;
      float yy = H/2;
      
      float theta = radians(360/e.Humans.size());
      float r = 200;

      float x1 = xx + r * cos(theta*i);
      float y1 = yy + r * sin(theta*i);

      fill(e.Humans.get(i).get(0).col);
      float d = dist(mouseX,mouseY,x1,y1);
       d1 = dist(mouseX,mouseY,xx,yy);

      if(d<10){
        fill(255);
        k = i;
      }
      int count = 0;
      for(int j=0;j< e.Humans.size();j++){
        float cc = e.Humans.get(i).get(0).seekNeighbour.get(j);
        if(cc>-1)count++;
      }

      text(cIndex1,x1+20,y1);
      text(cIndex2,x1+20,y1+10);
      text(count,x1-40,y1+10);
      ellipse(x1,y1,20,20);
      ellipse(xx,yy,30,30);
    }

      for(int i=0;i< e.Humans.size();i++){

      float xx = W/2;
      float yy = H/2;
      float theta = radians(360/e.Humans.size());
      float r = 200;

      float x1 = xx + r * cos(theta*i);
      float y1 = yy + r * sin(theta*i);


      for(int j=0;j<e.Humans.get(i).get(0).seekNeighbour.size();j++){

        float p1 = e.Humans.get(i).get(0).seekNeighbour.get(j);

        float x2 = xx + r * cos(theta*j);
        float y2 = yy + r * sin(theta*j);


        if(p1>0){
        stroke(0);
        ellipse(x2,y2,5,5);
        line(x1,y1,x2,y2);
      }}}

    if(k>-1){
      if(mousePressed&&mouseButton==RIGHT){
        for(int j=0;j< e.Humans.size();j++)e.Humans.get(k).get(0).seekNeighbour.set(j,PApplet.parseFloat(-1));

        cIndex1 = -1;
        cIndex2 = -1;
      }
    else if(mousePressed&&!e1down&&!e2down&&!mdown){
          cIndex1 = k;
          e1down = true;
          mdown = true;
        }else if(mousePressed&&!e2down&&!mdown&&e1down){
          cIndex2 = k;
          e2down = true;
          mdown = true;
          e.Humans.get(cIndex1).get(0).seekNeighbour.set(cIndex2,random(5,40));
          if(cIndex1==cIndex2)e.Humans.get(cIndex1).get(0).seekNeighbour.set(cIndex2,random(r*2,50));
          }}else {
            if(mousePressed&&mouseButton==LEFT&&!mdown&&d1<15){
              mdown = true;
              for(int i=0;i< e.Humans.size();i++){
                for(int j=0;j< e.Humans.size();j++){

                if(j!=i)e.Humans.get(i).get(0).seekNeighbour.set(j,random(r*2,50));

              }}}else if(mousePressed&&mouseButton==RIGHT&&!mdown&&d1<15){
                mdown = true;
               for(int i=0;i< e.Humans.size();i++){
                for(int j=0;j< e.Humans.size();j++){

                e.Humans.get(i).get(0).seekNeighbour.set(j,PApplet.parseFloat(-1));

              }}}}

        if(!mdown&&mousePressed){
            e1down = false;
            e2down = false;
            mdown = true;
          }
      if(!mousePressed)mdown = false;
      if(!mousePressed&&e2down&&e1down){
        e1down = false;
        e2down = false;
      }
  };

  public void drawArrangement(ArrayList a){

  };

  public void alignmentLogic(){
    Entity e = entities.get(ent);

    int k = -1;
    int col = 255;
    float d1 = 0;
    for(int i=0;i< e.Humans.size();i++){

      float xx = W/2;
      float yy = H/2;
      float theta = radians(360/e.Humans.size());
      float r = 200;

      float x1 = xx + r * cos(theta*i);
      float y1 = yy + r * sin(theta*i);

      fill(e.Humans.get(i).get(0).col);
      float d = dist(mouseX,mouseY,x1,y1);
       d1 = dist(mouseX,mouseY,xx,yy);

      if(d<10){
        fill(255);
        k = i;
      }

      int count = 0;
      for(int j=0;j< e.Humans.size();j++){
        float cc = e.Humans.get(i).get(0).alignNeighbour.get(j);
        if(cc>-1)count++;
      }

      text(i,x1,y1-20);
      text(aIndex1,x1+20,y1);
      text(aIndex2,x1+20,y1+10);
      text(count,x1-40,y1+10);
      ellipse(x1,y1,20,20);
      ellipse(xx,yy,30,30);

      for(int j=0;j<e.Humans.get(i).get(0).alignNeighbour.size();j++){
        
        float p1 = e.Humans.get(i).get(0).alignNeighbour.get(j);

        float x2 = xx + r * cos(theta*j);
        float y2 = yy + r * sin(theta*j);

        if(p1>0){
        stroke(0);
        ellipse(x2,y2,5,5);
        line(x1,y1,x2,y2);
      }}}

    if(k>-1){
      if(mousePressed&&mouseButton==RIGHT){
        for(int j=0;j< e.Humans.size();j++)e.Humans.get(k).get(0).alignNeighbour.set(j,PApplet.parseFloat(-1));

        aIndex1 = -1;
        aIndex2 = -1;
      }
    else if(mousePressed&&!e1down&&!e2down&&!mdown){
          aIndex1 = k;
          e1down = true;
          mdown = true;
        }else if(mousePressed&&!e2down&&!mdown&&e1down){
          aIndex2 = k;
          e2down = true;
          mdown = true;
            e.Humans.get(aIndex1).get(0).alignNeighbour.set(aIndex2,random(r*2,50));
          }}else {
            if(mousePressed&&mouseButton==LEFT&&!mdown&&d1<15){
              mdown = true;
              for(int i=0;i< e.Humans.size();i++){
                for(int j=0;j< e.Humans.size();j++){

                if(j!=i)e.Humans.get(i).get(0).alignNeighbour.set(j,random(r*2,50));

              }}}else if(mousePressed&&mouseButton==RIGHT&&!mdown&&d1<15){
                mdown = true;
                for(int i=0;i< e.Humans.size();i++){
                for(int j=0;j< e.Humans.size();j++){

                e.Humans.get(i).get(0).alignNeighbour.set(j,PApplet.parseFloat(-1));

              }}}}

        if(!mdown&&mousePressed){
            e1down = false;
            e2down = false;
            mdown = true;
          }
      if(!mousePressed)mdown = false;
      if(!mousePressed&&e2down&&e1down){
        e1down = false;
        e2down = false;
      }
  };

  public void manageBoundaries(){

    for(int i=0;i<main.Boundaries.size();i++){
      Boundary b = main.Boundaries.get(i);

      //if(b.mtranslate()&&mousePressed&&)
    }

  };

  public PVector seek2(PVector a){

    PVector desired = PVector.sub(a,p);  // A vector pointing from the position to the target

    // Normalize desired and scale to maximum speed
    desired.normalize();
    desired.mult(vlimit);
    // Steering = Desired minus Velocity
    PVector steer = PVector.sub(desired,vel);
    return steer.limit(alimit);  // Limit to maximum steering force

    //ac.add(steer);
  };

  public void applyFriction(){
    //Friction = mu*mass*-1;
    friction = vel.get();
    friction.mult(-1); 
    friction.normalize();
    friction.mult(mu*alimit*50);
    PVector n = PVector.div(friction,mass);
    //friction.setMag(mu*mass*-1);
    ac.add(n);
    //vel.limit(vlimit);
    // friction.setMag(mu*mass*-1);
    // vel.x *= friction.x;
    // vel.y *= friction.y;
  };

  public PVector separate(){

    float desiredseparation = breathingroom;
    PVector steer = new PVector(0,0);
    int count = 0;
    float t = 0;
    // For every Human in the system, check if it's too close
    Entity e = entities.get(ent);
    for (int j=0;j<proximity.size();j++) {

      Entity other = proximity.get(j);

      float d = PVector.dist(p,other.p);
      // If the distance is greater than 0 and less than an arbitrary amount (0 when you are yourself)

      if (d<(radius+other.radius)/2) {
        // Calculate vector pointing away from neighbor
        PVector diff = PVector.sub(p,other.p);
        diff.normalize();
        diff.div(radius);        // Weight by distance
        steer.add(diff);
        count++;            // Keep track of how many
        //t+= e.Humans.get(race).get(0).avoidNeighbour.get(other.race);
      }
      // if (race==other.race) {
      //   // Calculate vector pointing away from neighbor
      //   PVector diff = PVector.sub(p,other.p);
      //   diff.normalize();
      //   diff.div(radius);        // Weight by distance
      //   steer.add(diff);
      //   count++;            // Keep track of how many
      //   //t+= e.Humans.get(race).get(0).avoidNeighbour.get(other.race);
      // }
      
      }
    // Average -- divide by how many
    if (count > 0) {
      steer.div((float)count);
      // Implement Reynolds: Steering = Desired - Velocity
      steer.normalize();
      steer.mult(vlimit);
      steer.sub(vel);
      steer.limit(alimit);
    }
    return steer;
  };

public PVector separate_(){

    PVector steer = new PVector(0,0);
    int count = 0;
    int count1 = 0;
    // For every Human in the system, check if it's too close
    for (int j=0;j<prox.size();j++) {

      Entity other = prox.get(j);

      float d = PVector.dist(p,other.p);
      // If the distance is greater than 0 and less than an arbitrary amount (0 when you are yourself)

      if (d<(radius+other.radius)/2) {
        // Calculate vector pointing away from neighbor
        PVector diff = PVector.sub(p,other.p);
        diff.normalize();
        diff.div((radius+other.radius)/2);        // Weight by distance
        steer.add(diff);
        count++;            // Keep track of how many
      }
    }
    // Average -- divide by how many//

     if (count > 0) {
      steer.div((float)count);
      // Implement Reynolds: Steering = Desired - Velocity
      steer.normalize();
      steer.mult(100);
      steer.sub(vel);
      steer.limit(100);
      }
    return steer;
};

public PVector separate2_(){

    PVector steer = new PVector(0,0);
    int count = 0;
    int count1 = 0;
    Entity e = entities.get(ent);
    // For every Human in the system, check if it's too close
    for (int j=0;j<prox.size();j++) {

      Entity other = prox.get(j);

      float d = PVector.dist(p,other.p);
      // If the distance is greater than 0 and less than an arbitrary amount (0 when you are yourself)

      if (d<min&&e.Humans.get(race).get(0).avoidNeighbour.get(other.race)>0) {
        // Calculate vector pointing away from neighbor
        PVector diff = PVector.sub(p,other.p);
        diff.normalize();
        diff.div((radius+other.radius)/2);        // Weight by distance
        steer.add(diff);
        count++;            // Keep track of how many
      }}
    if (count > 0) {
      steer.div((float)count);
      // Implement Reynolds: Steering = Desired - Velocity
      steer.normalize();
      steer.mult(vlimit);
      steer.sub(vel);
      steer.limit(alimit);
    }
    return steer;
};

  public PVector separate2(ArrayList<Human> a){

    PVector steer = new PVector(0,0);
    int count = 0;
    // For every Human in the system, check if it's too close
    for (int j=0;j<a.size();j++) {

      Entity other = a.get(j);

      float d = PVector.dist(p,other.p);
      // If the distance is greater than 0 and less than an arbitrary amount (0 when you are yourself)
      
     if (other.avoid2) {
        // Calculate vector pointing away from neighbor
        PVector diff = PVector.sub(p,other.p);
        diff.normalize();
        diff.div((radius+other.radius)/2);        // Weight by distance
        steer.add(diff);
        count++;            // Keep track of how many
      }}
    // Average -- divide by how many
    if (count > 0) {
      steer.div((float)count);
      // Implement Reynolds: Steering = Desired - Velocity
      steer.normalize();
      steer.mult(vlimit);
      steer.sub(vel);
      steer.limit(alimit);
    }
    return steer;
    
  };

  public void repel(ArrayList<Human> a){

     separate2(a);
     cohesion2(a);

  };

  public PVector separateBoundary(Window s){

    float desiredseparation = breathingroomb;

    PVector steer = new PVector(0,0);
     mult1 = 1;
    int count = 0;
    // For every Human in the system, check if it's too close

    for ( int i=0;i<s.Boundaries.size();i++) {
      
      Boundary C = s.Boundaries.get(i);

      if(C.state==1||C.state==3){
        
    
      for(int j=0;j<C.Boundaries.size();j++){

          Boundary B = C.Boundaries.get(j);

          if(B.state1==1||B.state1==3){

          PVector a = new PVector(B.x1,B.y1);
          PVector b = new PVector(B.x2,B.y2);

          PVector c = find_normal(fp,a,b);
          float d = PVector.dist(fp,c);

        // If the distance is greater than 0 and less than an arbitrary amount (0 when you are yourself)
        if ((d > 10) && ((d < desiredseparation+B.broom))&&check_lineP(a,b,c)) {
          
          // Calculate vector pointing away from neighbor
           mult1 += B.avoidance;
          PVector diff = PVector.sub(p,c);
          diff.normalize();
          diff.div(d);        // Weight by distance
          steer.add(diff);
          count++;            // Keep track of how many
        }}}}}
    // Average -- divide by how many
    if (count > 0) {
      steer.div((float)count);
      // Implement Reynolds: Steering = Desired - Velocity
      mult1 /=count;
      steer.normalize();
      steer.mult(vlimit);
      steer.sub(vel);
      steer.limit(alimit);
    }
    return steer;
  };

  public PVector cohesionf() {

    float neighbordist = breathingroom;
    PVector sum = new PVector(0,0);   // Start with empty vector to accumulate all pitions
    int count = 0;

    Entity e = entities.get(ent);

    for (int j=0;j<proximity.size();j++) {

      Entity other = proximity.get(j);

      float d = PVector.dist(p,other.p);
      float d2 = radius + other.radius;

      if (d>breathingroom&&e.Humans.get(race).get(0).seekNeighbour.get(other.race)>0) {
        sum.add(other.p); // Add pition
        count++;
      }}
    if (count > 0) {
      sum.div((float)count);
      return seek(sum);  // Steer towards the pition
    }
    return sum;
  };

  public PVector cohesionf_() {

    PVector sum = new PVector(0,0);   // Start with empty vector to accumulate all pitions
    int count = 0;

    for (int j=0;j<prox.size();j++) {

      Entity other = prox.get(j);

      float d = PVector.dist(p,other.p);

      if (d>(radius+other.radius)/2&&other.race==race) {
        sum.add(other.p); // Add pition
        count++;
      }
    }
    if (count > 0) {
      sum.div((float)count);
      return seek(sum);  // Steer towards the pition
    }
    return sum;
  };

  public PVector cohesion2(ArrayList<Human> a) {

    PVector sum = new PVector(0,0);   // Start with empty vector to accumulate all pitions
    int count = 0;

    for (int j=0;j<a.size();j++) {

      Entity other = a.get(j);

      float d = PVector.dist(p,other.p);

      if (other.seek) {
        sum.add(other.p); // Add pition
        count++;
      }}
    if (count > 0) {
      sum.div((float)count);
      return seek(sum);  // Steer towards the pition
    }
    return sum;
  };

public PVector cohesionfBoundary(Window s) {

    float neighbordist = breathingroomb;
    PVector sum = new PVector(0,0);   // Start with empty vector to accumulate all pitions
     mult2 = 1;
    int count = 0;

    for ( int i=0;i<s.Boundaries.size();i++) {

      Boundary C = s.Boundaries.get(i);

      if(C.state==1||C.state==2){

      for(int j=0;j<C.Boundaries.size();j++){

          Boundary B = C.Boundaries.get(j);

          if(B.state1==1||B.state1==2){

          PVector a = new PVector(B.x1,B.y1);
          PVector b = new PVector(B.x2,B.y2);

          PVector c = find_normal(p,a,b);
          float d = PVector.dist(p,c);
      if ((d > radius) && (d < neighbordist+B.broom)&&check_lineP(a,b,c)){
              mult2 += B.cohesion;
              sum.add(c); // Add position
              count++;
      }}}}}
    if (count > 0) {
      mult2 /= count;
      sum.div((float)count);
      return seek(sum);  // Steer towards the position
    }
    return sum;

};

public PVector align() {
    float neighbordist = breathingroom;
    PVector steer = new PVector();
    int count = 0;
    Entity e = entities.get(ent);
    for (int j=0;j<proximity.size();j++) {

      Entity other = proximity.get(j);

      if (e.Humans.get(race).get(0).alignNeighbour.contains(other.race)) {
        steer.add(other.vel);
        count++;
      }}
    if (count > 0) {
      steer.div((float)count);
      // Implement Reynolds: Steering = Desired - Velocity
      steer.normalize();
      steer.mult(vlimit);
      steer.sub(vel);
      steer.limit(alimit);
    }
    return steer;
  };

  public PVector align2(ArrayList<Human> h) {
    
    PVector steer = new PVector();
    int count = 0;

    for (int j=0;j<h.size();j++) {

      Entity other = h.get(j);

      if (other.align) {
        steer.add(other.vel);
        count++;
      }}
    if (count > 0) {
      steer.div((float)count);
      // Implement Reynolds: Steering = Desired - Velocity
      steer.normalize();
      steer.mult(vlimit);
      steer.sub(vel);
      steer.limit(alimit);
    }
    return steer;
  };

  public PVector align_() {
    float neighbordist = breathingroom;
    PVector steer = new PVector();
    int count = 0;
    Entity e = entities.get(ent);
    for (int j=0;j<family.size();j++) {

      Entity other = family.get(j);
      float d = dist(x,y,other.x,other.y);

      if (other.race==race) {
        steer.add(other.vel);
        count++;
      }}
    if (count > 0) {
      steer.div((float)count);
      // Implement Reynolds: Steering = Desired - Velocity
      steer.normalize();
      steer.mult(50);
      steer.sub(vel);
      steer.limit(50);
    }
    return steer;
  };


  public void flockBoundary(){
    PVector sepB = separateBoundary(main);   // Separation
    PVector cohB = cohesionfBoundary(main);
    PVector wan = wander(); //wander

    cohB.mult(cohesionb*50);
    sepB.mult(separationb*50);
    wan.mult(wanderm);


    ac.add(sepB);
    ac.add(cohB);
    ac.add(wan);
    //update();
  };
  
  public void flockNeer(){

    PVector sep = new PVector();   // Separation
    //PVector sep2 = new PVector();
    PVector coh = new PVector();   // Cohesion
    //PVector ali = new PVector();   // Alignment

    if(prox.size()>0){
      sep = separate_();
      //sep2 = separate2_();
       coh = cohesionf_();
      // ali = align_();

      coh.mult(cohesionc);
      sep.mult(separationc*(vlimit/50)*50);
      //sep2.mult(separation);
      //ali.mult(alignmentc);
      coh.limit(vlimit);
      sep.limit(vlimit);
      //applyFriction();
      ac.add(sep);
       ac.add(coh);
      // //ac.add(sep2);
      // ac.add(ali);
    }
    //ac.add(ali);
  };

  public void flock(){

    Quad field = null;
    futurep();
    if(pos>0&&pos<scene.cols*scene.rows)field = scene.fields.get(pos);
    if(proximity.size()>0)flockSep();
    if(prox2.size()>0)flockSP();
    
    if(prox.size()>0)flockNeer();
    flockBoundary();
  };

  public void oscilator(){

    if(id==0){
      //noStroke();
      noFill();

      
    
    for(int i=0;i<oscilatorLabels.length;i++){

      String a = oscilatorLabels[i];
      
      float c = oscilatorCounters.get(i) + 0.01f;

      oscilatorCounters.set(i ,c);

      float b = oscilators.get(i) + 2*sin(c);
      oscilators.set(i,b);
      
      
      Field field = null;

      try{
         field = this.getClass().getField(a); 
           field.set(this, field.getFloat(this) + 5*sin(c)); 
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}
      //ellipse(p.x,p.y,50,50);
      
    }
  };

  public void flockSep() {
    
    Quad field = null;

    PVector sep = new PVector();

    sep = separate();   // Separation
    sep.mult(separationd);
    //sep.limit(vlimit)
    sep.limit(vlimit);
    //  ali.mult(alignment*(field.dens+1));
    //  coh.mult(cohesion*(field.dens+1));
    applyFriction();
    ac.add(sep);
  };


  public void flockSP(){

    PVector sep = new PVector();
    PVector sep2 = new PVector();
    PVector coh = new PVector();
    PVector ali = new PVector();

    Entity e = entities.get(ent);
    
    if(prox2.size()>0){
    for(int i=0;i<prox2.size();i++){

      ArrayList< Human> h = prox2.get(i);
      ArrayList< Human> h1 = proximity2.get(i);
      

      if(h.size()>0){
        float avoid_ = e.Humans.get(race).get(0).avoidNeighbour.get(i);
        float seek_ = e.Humans.get(race).get(0).seekNeighbour.get(i);
        float align_ = e.Humans.get(race).get(0).alignNeighbour.get(i);

        // if(id==0)text(race + " Scount " + scount + " " + seek_,100,300+40*race+10*i);
        // if(id==0)text(race +" Acount " + acount + " " + avoid_,250,300+40*race+10*i);
        // if(id==0)text(race + " Alcount " + alcount + " " + align_,400,300+40*race+10*i);

        if(scount>0&&seek_>-1)
        coh.add(cohesion2(h).mult(seek_+cohesion));
        if(acount>0&&avoid_>-1)
        sep.add(separate2(h).mult(avoid_+separation));
        if(alcount>0&&align_>-1)
        ali.add(align2(h).mult(align_+alignment));
        if(mcount>0&&avoid_>-1)
        sep2.add(separate2(h).mult((avoid_+separationd)*50));
        //update2();
    }}}
    coh.limit(vlimit);
    sep.limit(vlimit);
    ali.limit(vlimit);
    sep2.limit(vlimit);
    applyFriction();
    ac.add(coh);
    ac.add(sep);
    ac.add(sep2);
    ac.add(ali);
    //update();

  };

  public void flockFamily(){

    if(family.size()>0){
    
      PVector sep2 = new PVector();   // Separation
      PVector coh2 = new PVector();      // Alignment
      
        sep2 = separate2(family);
        coh2 = cohesion2(family);
        //PVector ali = align_();

        coh2.mult(cohesionc);
        sep2.mult(separationc);
        //ali.mult(1);

        ac.add(sep2);
        ac.add(coh2);
    }
    //update2();
    
  };


  public PVector wander() {

    float wanderR = 25;         // Radius for our "wander circle"
    float wanderD = 80;         // Distance for our "wander circle"
    float change = 0.3f;
    wandertheta += random(-wanderm,wanderm);     // Randomly change wander theta

    // Now we have to calculate the new position to steer towards on the wander circle
    PVector circlepos = vel.get();    // Start with velocity
    circlepos.normalize();            // Normalize to get heading
    circlepos.mult(wanderD);          // Multiply by distance
    circlepos.add(p);               // Make it relative to boid's position

    float h = vel.heading2D();        // We need to know the heading to offset wandertheta

    PVector circleOffSet = new PVector(wanderR*cos(wandertheta+h),wanderR*sin(wandertheta+h));
    PVector t = PVector.add(circlepos,circleOffSet);
    //if(debug) drawWanderStuff(p,circlepos,t,wanderR);
    return seek2(t);

    // Render wandering circle, etc.

  };

  public void drawWanderStuff(PVector position, PVector circle, PVector target, float rad) {
  stroke(0);
  noFill();
  ellipseMode(CENTER);
  ellipse(circle.x,circle.y,rad*2,rad*2);
  ellipse(target.x,target.y,4,4);
  line(p.x,p.y,circle.x,circle.y);
  line(circle.x,circle.y,target.x,target.y);
};

public void collisions(ArrayList<Human> a){

  for(int i=0;i<a.size();i++){

    Entity h =  a.get(i);

    checkCollision(h);
  }

};

public void checkCollision(Entity other) {
    
    // Get distances between the balls components
    PVector distanceVect = PVector.sub(other.p, p);

    // Calculate magnitude of the vector separating the balls
    float distanceVectMag = distanceVect.mag();

    // Minimum distance before they are touching
    float minDistance = radius + other.radius;

    if (distanceVectMag < minDistance) {
      float distanceCorrection = (minDistance-distanceVectMag)/2.0f;
      PVector d = distanceVect.copy();
      PVector correctionVector = d.normalize().mult(distanceCorrection);
      PVector o = other.p.copy();
      o.add(correctionVector);
      o.sub(correctionVector);

      // get angle of distanceVect
      float theta  = distanceVect.heading();
      // precalculate trig values
      float sine = sin(theta);
      float cosine = cos(theta);

      /* bTemp will hold rotated ball positions. You 
       just need to worry about bTemp[1] position*/
      PVector[] bTemp = {
        new PVector(), new PVector()
      };

      /* this ball's position is relative to the other
       so you can use the vector between them (bVect) as the 
       reference point in the rotation expressions.
       bTemp[0].position.x and bTemp[0].position.y will initialize
       automatically to 0.0, which is what you want
       since b[1] will rotate around b[0] */
      bTemp[1].x  = cosine * distanceVect.x + sine * distanceVect.y;
      bTemp[1].y  = cosine * distanceVect.y - sine * distanceVect.x;

      // rotate Temporary velocities
      PVector[] vTemp = {
        new PVector(), new PVector()
      };

      vTemp[0].x  = cosine * vel.x + sine * vel.y;
      vTemp[0].y  = cosine * vel.y - sine * vel.x;
      vTemp[1].x  = cosine * other.vel.x + sine * other.vel.y;
      vTemp[1].y  = cosine * other.vel.y - sine * other.vel.x;

      /* Now that velocities are rotated, you can use 1D
       conservation of momentum equations to calculate 
       the final velocity along the x-axis. */
      PVector[] vFinal = {  
        new PVector(), new PVector()
      };

      // final rotated velocity for b[0]
      vFinal[0].x = ((mass - other.mass) * vTemp[0].x + 2 * other.mass * vTemp[1].x) / (mass + other.mass);
      vFinal[0].y = vTemp[0].y;

      // final rotated velocity for b[1]
      vFinal[1].x = ((other.mass - mass) * vTemp[1].x + 2 * mass * vTemp[0].x) / (mass + other.mass);
      vFinal[1].y = vTemp[1].y;

      // hack to avoid clumping
      bTemp[0].x += vFinal[0].x;
      bTemp[1].x += vFinal[1].x;

      /* Rotate ball positions and velocities back
       Reverse signs in trig expressions to rotate 
       in the opposite direction */
      // rotate balls
      PVector[] bFinal = { 
        new PVector(), new PVector()
      };

      bFinal[0].x = cosine * bTemp[0].x - sine * bTemp[0].y;
      bFinal[0].y = cosine * bTemp[0].y + sine * bTemp[0].x;
      bFinal[1].x = cosine * bTemp[1].x - sine * bTemp[1].y;
      bFinal[1].y = cosine * bTemp[1].y + sine * bTemp[1].x;

      // update balls to screen position
      other.p.x = p.x + bFinal[1].x;
      other.p.y = p.y + bFinal[1].y;

      p.add(bFinal[0]);

      // update velocities
      vel.x = cosine * vFinal[0].x - sine * vFinal[0].y;
      vel.y = cosine * vFinal[0].y + sine * vFinal[0].x;
      other.vel.x = cosine * vFinal[1].x - sine * vFinal[1].y;
      other.vel.y = cosine * vFinal[1].y + sine * vFinal[1].x;
    }
  };

  public void assignVectors(){

    futurep();
    p = new PVector(x,y);
    vel = new PVector(vx,vy);

  };

  public void steer_awayIntersection(ArrayList<Human> H,float czone){

    ArrayList<PVector> temp = new ArrayList<PVector>();

    for(int i=0;i<H.size();i++){

      Human h = H.get(i);

      Boundary b1 = new Boundary(x,y,fp.x,fp.y);
      Boundary b2 = new Boundary(h.x,h.y,h.fp.x,h.fp.y);

      PVector i1 = check_intersect(b1,b2);

      if(i1!=null){

        for(int j=0;j<avoid_angles.length;j++){

          float t1 = avoid_angles[j];
          float t2 = atan2(i1.y-y,i1.x-x);

          PVector next = new PVector(x + czone/2 * cos(t1+t2),y + czone/2 * sin(t1+t2));

          PVector ap = futurep(h,czone/2);

          Boundary b3 = new Boundary(x,y,next.x,next.y);
          Boundary b4 = new Boundary(h.x,h.y,ap.x,ap.y);

          PVector i2 = check_intersect(b3,b4);

          if(i2==null){
            temp.add(next);
          }
            if(temp.size()>0){
            //if (target ==null&&targetb==null&&!familyties)      seekddw(greatestTo(temp,center));
            //else if (target ==null&&targetb==null&&familyties)  seekddw(greatestTo(temp,center));
            //else if (target !=null&&targetb==null&&!familyties) seekddw(greatestTo(temp,target));
            //else if (target ==null&&targetb!=null&&!familyties) seekddw(greatestTo(temp,targetb));
        }}}}
  };

  public boolean check_lineP(PVector a, PVector b,PVector c){

    boolean k = false;
    float d1 = dist(a.x,a.y,b.x,b.y);
    float d2 = dist(a.x,a.y,c.x,c.y);
    float d3 = dist(b.x,b.y,c.x,c.y);
    float d4 = d2 + d3;

    if(d4 <= d1 + 0.05f && d4 >= d1 - 0.05f)k = true;
    
    return k;
  };

  public void steer_awayIntersection(ArrayList<Boundary> H){

    ArrayList<PVector> temp = new ArrayList<PVector>();

    for(int i=0;i<H.size();i++){

      Boundary C = H.get(i);

      for(int j=0;j<C.Boundaries.size();j++){

      Boundary h = C.Boundaries.get(j);

      Boundary b1 = new Boundary(x,y,fp.x,fp.y);
      Boundary b2 = new Boundary(h.x1,h.y1,h.x2,h.y2);

      PVector i1 = check_intersect2(b1,b2);


      if(i1!=null&&!stop&&dist(i1.x,i1.y,x,y)<breathingroom/2){

        fill(col);
        ellipse(i1.x,i1.y,10,10);
        stop = true;
        for(int k=0;k<avoid_angles2.length;k++){

          float t1 = avoid_angles[k];
          float t2 = atan2(i1.y-y,i1.x-x);

          PVector next = new PVector(x + breathingroom/2 * cos(t1+dir),y + breathingroom/2 * sin(t1+dir));

          Boundary b3 = new Boundary(x,y,next.x,next.y);

          PVector i2 = check_intersect2(b3,b2);

          if(i2==null){
            temp.add(next);
          }
            if(temp.size()>0){
            //if (target ==null&&targetb==null&&!familyties)      seekddw(shortestTo(temp,fp));
            //else if (target ==null&&targetb==null&&familyties)  seekddw(shortestTo(temp,center));
            //else if (target !=null&&targetb==null&&!familyties) seekddw(shortestTo(temp,target));
            //else if (target ==null&&targetb!=null&&!familyties) seekddw(shortestTo(temp,targetb));
        }}}}}
  };

  public void steer_awayZone(ArrayList<Human> H,float czone){

    ArrayList<PVector> temp = new ArrayList<PVector>();

    for(int i=0;i<H.size();i++){

      Human h = H.get(i);

      float d1 = dist(x,y,h.x,h.y);

      if(d1<czone/2+h.breathingroom/2){

        float t1 = atan2(h.y-y,h.x-x);

        for(int j=0;j<avoid_angles.length;j++){

          float t2 = avoid_angles[j];

          PVector next = new PVector(x + czone/2 * cos(t2+t1),y + czone/2 * sin(t2+t1));

          float d2 = dist(next.x,next.y,h.x,h.y);

          if(d2>czone/2+h.breathingroom/2){
            temp.add(next);
          }
          if(temp.size()>0){
            //if (target ==null&&targetb==null&&!familyties)      seekddw(greatestTo(temp,center));
            //else if (target ==null&&targetb==null&&familyties)  seekddw(greatestTo(temp,center));
            //else if (target !=null&&targetb==null&&!familyties) seekddw(greatestTo(temp,target));
            //else if (target ==null&&targetb!=null&&!familyties) seekddw(greatestTo(temp,targetb));
        }}}}
  };

  public PVector greatestTo(ArrayList<PVector> d,PVector h){

    PVector k = d.get(0);

    for(int i=0;i<d.size();i++){

      PVector a = d.get(i);

      float d1 = dist(a.x,a.y,h.x,h.y);
      float d2 = dist(k.x,k.y,h.x,h.y);

      if(d1>d2) k = a;
    }

    return k;
  };

  public PVector shortestTo(ArrayList<PVector> d,PVector h){

    PVector k = d.get(0);

    for(int i=0;i<d.size();i++){

      PVector a = d.get(i);

      float d1 = dist(a.x,a.y,h.x,h.y);
      float d2 = dist(k.x,k.y,h.x,h.y);

      if(d1<d2) k = a;
    }

    return k;
  };

  public void seek_boundary(Scene s){

    for(int i=0;i<s.Boundaries.size();i++){

      Boundary C = s.Boundaries.get(i);

      for(int j=0;j<C.Boundaries.size();j++){

        Boundary B = C.Boundaries.get(j);

        PVector a = new PVector(B.x1,B.y1);
        PVector b = new PVector(B.x2,B.y2);

        PVector v = PVector.sub(p,a);
        PVector v2 = PVector.sub(b,a);

        v2.normalize();
        v2.mult(v.dot(v2));
        v2 = v2.add(a);

        //line(x,y,v2.x,v2.y);
        //if(dist(x,y,v2.x,v2.y)>=breathingroom) seekddw(v2);
    }}
  };

  public void seek_boundary(ArrayList<Boundary> s){

    for(int i=0;i<s.size();i++){


      Boundary C = s.get(i);

      for(int j=0;j<C.Boundaries.size();j++){

        Boundary B = C.Boundaries.get(j);

        PVector a = new PVector(B.x1,B.y1);
        PVector b = new PVector(B.x2,B.y2);

        PVector v = PVector.sub(p,a);
        PVector v2 = PVector.sub(b,a);

        v2.normalize();
        v2.mult(v.dot(v2));
        v2 = v2.add(a);

        //line(x,y,v2.x,v2.y);
        //if(dist(x,y,v2.x,v2.y)>=breathingroom) seekddw(v2);
    }}
  };

  public void avoid_boundary(Scene s){

        Boundary A = shortestToCenter(s.Boundaries);
        Boundary B = shortestToCenter(A.Boundaries);

        PVector a = new PVector(B.x1,B.y1);
        PVector b = new PVector(B.x2,B.y2);

        PVector v = PVector.sub(p,a);
        PVector v2 = PVector.sub(b,a);

        PVector v3 = PVector.sub(fp,a);
        PVector v4 = PVector.sub(b,a);

        v2.normalize();
        v2.mult(v.dot(v2));
        v2 = v2.add(a);

        v4.normalize();
        v4.mult(v3.dot(v4));
        v4 = v4.add(a);

        float d1 = dist(fp.x,fp.y,v4.x,v4.y);
        float d2 = dist(x,y,B.x1,B.y1);
        float d3 = dist(x,y,B.x2,B.y2);

        stroke(col);
        line(x,y,v2.x,v2.y);
        ellipse(v2.x,v2.y,10,10);

        //if(d1<=breathingroom)avoiddw(v4);
        //else if(d2<=breathingroom)avoiddw(new PVector(B.x1,B.y1));
        //else if(d3<=breathingroom)avoiddw(new PVector(B.x2,B.y2));


  };

  public void avoid_boundary2(Scene s){

    for(int i=0;i<s.Boundaries.size();i++){

      Boundary C = s.Boundaries.get(i);

      for(int j=0;j<C.Boundaries.size();j++){

        Boundary B = C.Boundaries.get(j);

        PVector a = new PVector(B.x1,B.y1);
        PVector b = new PVector(B.x2,B.y2);

        PVector v = PVector.sub(p,a);
        PVector v2 = PVector.sub(b,a);

        v2.normalize();
        v2.mult(v.dot(v2));
        v2 = v2.add(a);

        PVector v3 = PVector.sub(fp,a);
        PVector v4 = PVector.sub(b,a);

        v4.normalize();
        v4.mult(v3.dot(v4));
        v4 = v4.add(a);

        float d0 = dist(x,y,v2.x,v2.y);
        float d1 = dist(fp.x,fp.y,v4.x,v4.y);
        float d2 = dist(x,y,B.x1,B.y1);
        float d3 = dist(x,y,B.x2,B.y2);

        //stroke(col);
        //line(x,y,v2.x,v2.y);
        //ellipse(v2.x,v2.y,10,10);

        //if(d1<=breathingroom/2)avoiddw(v4);
        //else if(d0<=breathingroom/2)avoiddw(v2);
        //else if(d2<=breathingroom/2)avoiddw(new PVector(B.x1,B.y1));
        //else if(d3<=breathingroom/2)avoiddw(new PVector(B.x2,B.y2));
    }}

  };

  public void avoid_boundary(ArrayList<Boundary> s){

    for(int i=0;i<s.size();i++){

      Boundary C = s.get(i);

      for(int j=0;j<C.Boundaries.size();j++){

        Boundary B = C.Boundaries.get(j);

        PVector a = new PVector(B.x1,B.y1);
        PVector b = new PVector(B.x2,B.y2);

        PVector v = PVector.sub(p,a);
        PVector v2 = PVector.sub(b,a);

        v2.normalize();
        v2.mult(v.dot(v2));
        v2 = v2.add(a);

        //line(x,y,v2.x,v2.y);
        //if(dist(x,y,v2.x,v2.y)<=30) avoid(v2);
    }}
  };

  public void follow_boundary(ArrayList<Boundary> s, float radius){

    if(s.size()>0){

       Boundary B = shortestTo(s);

       Boundary b1 = shortestTo(B.Boundaries);

       PVector a = new PVector(b1.x1,b1.y1);
       PVector b = new PVector(b1.x2,b1.y2);

       PVector n = find_normal(p,a,b);

       float d1 = dist(x,y,n.x,n.y);
       float d2 = dist(x,y,a.x,a.y);
       //float d2 = dist(x,y,a.x,a.y);

       if(d1>radius){
         targetb = n;
       }else {
         targetb = b;
       }

       //seekddw(targetb);
     }
  };

  public void follow_boundary(Scene s,float radius){

     Boundary B = shortestTo(s.Boundaries.get(0).Boundaries);

     PVector a = new PVector(B.x1,B.y1);
     PVector b = new PVector(B.x2,B.y2);

     PVector n = find_normal(p,a,b);

     float d1 = dist(x,y,n.x,n.y);
     float d2 = dist(x,y,a.x,a.y);

     if(d1>radius){
       targetb = n;
     }else {
       targetb = b;
     }

     //seekddw(targetb);
  };

  public Boundary shortestTo(ArrayList<Boundary> B){

     Boundary k = null;

    if(B.size()>0){

      k = B.get(0);;

    for(int i=1;i<B.size();i++){

      Boundary A = B.get(i);
      PVector a = new PVector(A.x1,A.y1);

      float d1 = dist(a.x,a.y,x,y);
      float d2 = dist(k.x1,k.y1,x,y);

      if(d1<d2) k = A;
    }}

    return k;

  };

  public Boundary shortestToCenter(ArrayList<Boundary> B){

     Boundary k = null;

    if(B.size()>0){

      k = B.get(0);;

    for(int i=1;i<B.size();i++){

      Boundary A = B.get(i);
      PVector a = new PVector(A.center.x,A.center.y);

      float d1 = dist(a.x,a.y,x,y);
      float d2 = dist(k.center.x,k.center.y,x,y);

      if(d1<d2) k = A;
    }}

    return k;

  };

  public PVector  find_normal(PVector p, PVector a, PVector b){

        PVector v = PVector.sub(p,a);
        PVector v2 = PVector.sub(b,a);

        v2.normalize();
        v2.mult(v.dot(v2));
        v2 = v2.add(a);

        return v2;
  };

  public PVector[] sum(ArrayList<Human>a){

    PVector v = new PVector(0,0);
    PVector p = new PVector(0,0);

    for(int i=0;i<a.size();i++){

      Human e = a.get(i);

        p.add(e.p);
        v.add(e.vel);
    }
    p.div(family.size());
    v.div(family.size());

    PVector []sum = {p,v};

   return sum;

  };

  public void eyes(){

    fill(col3,20);
    noStroke();
    arc(p.x + 10 * cos(dir),p.y + 10 * sin(dir),200,200,dir - radians(fov),dir + radians(fov));
    //line(x + 10 * cos(dir),y + 10 * sin(dir),x + 110 * cos(dir-radians(fov)),y + 110 * sin(dir-radians(fov)));
    //line(x + 10 * cos(dir),y + 10 * sin(dir),x + 110 * cos(dir+radians(fov)),y + 110 * sin(dir+radians(fov)));

  };

  public void eye(ArrayList<Human> a){

     float d = 0;
     vcount = 0;

    for(int i=0;i<a.size();i++){

      Human e = a.get(i);
      float d1 = dist(p.x,p.y,e.x,e.y);
      if(e!=this&&d1<breathingroom){
        d = atan2(p.y - e.y,p.x - e.x) + PI;
        if(d>=abs(dir)-radians(fov)&&d<=abs(dir)+radians(fov))vcount++;

    }}
    if(vcount>0){
      highlight = true;
      col3 = hcol;
    }
    else {
      highlight = false;
      col3 = colb;
  }
  };

  public void eyes(PVector m){

    float d1 = dist(x,y,m.x,m.y);
    float t1 = atan2(p.y - m.y, p.x - m.x) + PI;
    //float t2 = atan2(m.y - p.y, m.x - p.x) + PI;

    if(d1<200&&t1>dir-radians(fov) && t1 < dir + radians(fov)){highlight = true;}
    else {highlight = false;}
  };

  public void highlight(){
    if(highlight) col3 = hcol;
    else col3 = colb;
  };

  public void rotate(){
    dir+=0.1f;
  };

  public void wander(float a){

    float t2 = 0;
    assignVectors();

    if(!turn&&!turnh){
      dir += radians(random(-10,10));
      fp = futurep();
      tri_boundaryf.tri.center = fp;
      tri_boundaryf.tri.rotate2(dir);
      PVector desired = new PVector(p.x + vel.x * cos(dir), p.y + vel.y * sin(dir));
      seek(desired);
      //fill(col);
      //ellipse(fp.x,fp.y,10,10);
    }
    if(!turn&&!turnh){
    if(!check_inter(lines.scene.Boundaries,fp)){
      if(proximity.size()==0||!check_interh(proximity,fp)){


    }else{ turnh = true;bdir = dir;}}else{ turn = true;bdir = dir;}}
    if(turn||turnh){
      inc ++;
      neg = pow(-1,inc);

      dir = bdir + (radians(10+inc)*neg)+ (radians((id+1)+inc)*neg);
      fp = futurep();
      tri_boundaryf.tri.center = fp;
      tri_boundaryf.tri.rotate2(dir);

      PVector desired = new PVector(p.x + vel.x * cos(dir), p.y + vel.y * sin(dir));

    if(!check_inter(lines.scene.Boundaries,fp2)){
      if(!check_interh(proximity,fp2)){

      seek(desired);
      turn = false;
      turnh = false;
    }}else{
    }}
  };

  public Boolean check_inter(ArrayList<Boundary> B,PVector a){

    boolean k = false;

    for(int i=0;i<B.size();i++){

      Boundary C = B.get(i);

      for(int j=0;j<C.Boundaries.size();j++){

      Boundary h = C.Boundaries.get(j);

      Boundary b1 = new Boundary(p.x,p.y,a.x,a.y);
      Boundary b2 = new Boundary(h.x1,h.y1,h.x2,h.y2);

      PVector i1 = check_intersect2(b1,b2);

      if(a.x==h.x1||a.x==h.x2){
        current_boundary = h;
        k = true;
        turn = true;
        return true;
        }

      else if(i1!=null&&dist(i1.x,i1.y,p.x,p.y)<dist(a.x,a.y,p.x,p.y)){
        current_boundary = h;
        k = true;
        turn = true;

        return true;
      }}}

      return k;

  };

  public Boolean check_inter(Boundary B,PVector a){

    boolean k = false;

      Boundary h = B;

      Boundary b1 = new Boundary(p.x,p.y,a.x,a.y);
      Boundary b2 = new Boundary(h.x1,h.y1,h.x2,h.y2);

      PVector i1 = check_intersect(b1,b2);

      if(a.x==h.x1||a.x==h.x2||a.y == h.y1||a.y == h.y2||i1!=null){

        k = true;
        return true;
      }
      return k;

  };

  public Boolean check_interh(ArrayList<Human> B,PVector a){

    boolean k = false;

    for(int i=0;i<B.size();i++){

      Human h = B.get(i);
      float d1 = dist(p.x,p.y,a.x,a.y);
      float d2 = dist(h.p.x,h.p.y,a.x,a.y);
      float d3 = dist(h.p.x,h.p.y,p.x,p.y);
      if(h!=this){
      //fp = new PVector(x+vlimit*cos(dir),x+vlimit*sin(dir));
      Boundary b1 = new Boundary(p.x,p.y,a.x,a.y);
      Boundary b2 = new Boundary(h.p.x,h.p.y,h.p.x + h.vlimit * cos(h.dir),h.p.y + h.vlimit*sin(h.dir));

      PVector i1 = check_intersect2(b1,b2);

       if(i1!=null&&dist(i1.x,i1.y,x,y)<20){
        stroke(col);
        fill(col);
        line(p.x,p.y,i1.x,i1.y);
        ellipse(i1.x,i1.y,10,10);
        k = true;
        turnh = true;
      }else
      if(tri_boundaryf.pos(new PVector(h.fp.x + 10 * cos(h.dir),h.fp.y + 10 * sin(h.dir)))||
          tri_boundaryf.pos(new PVector(h.fp.x + 10 * cos(dir+radians(120)),h.fp.y + 10 * sin(dir+radians(120))))||
          tri_boundaryf.pos(new PVector(h.fp.x + 10 * cos(dir-radians(120)),h.fp.y + 10 * sin(dir-radians(120))))||
          h.tri_boundaryf.pos(new PVector(fp.x + 10 * cos(dir),fp.y + 10 * sin(dir)))||
          h.tri_boundaryf.pos(new PVector(fp.x + 10 * cos(dir+radians(120)),fp.y + 10 * sin(dir+radians(120))))||
          h.tri_boundaryf.pos(new PVector(fp.x + 10 * cos(dir-radians(120)),fp.y + 10 * sin(dir-radians(120))))){
        stroke(col);
        noFill();
        line(p.x,y,p.x+vlimit*cos(dir),p.y+vlimit*sin(dir));
        ellipse(p.x+vlimit*cos(dir),p.y+vlimit*sin(dir),10,10);
        turnh = true;
        k = true;
        }}}

      return false;

  };

  public Boolean check_interh(Human B,PVector a){

    boolean k = false;
      Human h = B;

      Boundary b1 = new Boundary(p.x,p.y,a.x,a.y);
      Boundary b2 = new Boundary(h.p.x,h.p.y,h.fp.x,h.fp.y);

      PVector i1 = check_intersect2(b1,b2);
      if(a.x==h.x||a.x==h.x){
        //turn = true;
        //k = true;
        //return true;
        }

      else if(i1!=null&&dist(i1.x,i1.y,p.x,p.y)<dist(x,y,fp.x,fp.y)){
        fill(col);
        stroke(col);
        line(p.x,p.y,i1.x,i1.y);
        ellipse(i1.x,i1.y,10,10);
        k = true;
        turn = true;

      }else obstructionh = null;

      return k;

  };


  public void draw_future(){
    stroke(col);
    fill(col);

    if(fp.x!=0&&fp.y!=0)line(x,y,fp.x,fp.y);
    ellipse(fp.x,fp.y,10,10);

  };

  public void arrive(PVector a){

    x = lerp(p.x,a.x,0.5f);
    y = lerp(p.y,a.y,0.5f);
    dir = atan2(a.y-p.y,a.x-p.x);
  };

  public PVector [] sumf(ArrayList<Human> a){

    float sumx = 0;
    float sumy = 0;
    float sumd = 0;
    int total = 0;

    PVector c = new PVector(0,0);
    PVector c2 = new PVector(0,0);

    for(int i=0;i<a.size();i++){

      Human e = a.get(i);
        e.p.x = e.x;
        e.p.y = e.y;

        c.add(e.p);
        c2.add(e.vel);
    }

    c.div(a.size());
    c2.div(a.size());

    centerf = new PVector(c.x,c.y);
    centervelf = new PVector(c2.x,c2.y);

    velf = centervel;
    PVector c3 = new PVector(dir,dir);
    PVector [] temp = {c,c2,c3};

    return temp;

  };

  public PVector [] sumv(ArrayList<Human> a){

    PVector c = new PVector(0,0);
    PVector c2 = new PVector(0,0);

    for(int i=0;i<a.size();i++){

      Human e = a.get(i);

        e.p.x = e.x;
        e.p.y = e.y;
        c.add(e.p);
        c2.add(e.vel);
    }

    c.div((a.size()-1));
    c2.div((a.size()-1));

    center = c;
    centervel = c2;


      float dx = abs(x - center.x);
      float dy = abs(y - center.y);

      vel = new PVector(vx,vy);

    PVector c3 = new PVector(dir,dir);
    PVector [] temp = {c,c2,c3};

    return temp;

  };

  public void logic(){

    if(dir>=2*PI) dir = dir%(2*PI);
    if(dir<=-2*PI) dir = dir%(-2*PI);
  };

  public void draw_broom(){
    stroke(col);
    noFill();
    ellipse(p.x,p.y,breathingroom,breathingroom);
  };

  public void fties(){
    stroke(col);
    if(centerf.x!=0&&centerf.y!=0)line(p.x,p.y,centerf.x,centerf.y);
    fill(col);
    ellipse(centerf.x,centerf.y,20,20);

  };

  public float limit(float a, float l){
    if(a>=l) a = l;
    if(a<=-l)a = -l;

    return a;
  };

  public void update_boundary(){
    if(tri_boundary!=null){
      tri_boundary.tri.update_points(tri_boundary.tri.Boundaries);
    }
  };


  public void showtargeta(){
    if(target!=null){
      text("T",x+25,y);
      Plant P = targetfruit;
      stroke(col);
      line(P.x,P.y,p.x,p.y);
    }
  };
  public void showtargetb(){
    if(targetb!=null){
      PVector P = targetb;
      stroke(col);
      line(p.x,p.y,P.x,P.y);
    }
  };

  public void wrap2(){

    if(p.x>scene.x+scene.w) p.x=scene.x+1;
    if(p.x<scene.x) p.x = scene.x+scene.w-1;
    if(p.y>scene.y+scene.h) p.y = scene.y+1;
    if(p.y<+scene.y) p.y = scene.y+scene.h-1;
  };

  public void wrap(){
    if(p.x >= W) p.x = 1;
    if(p.x <= 0) p.x = W - 1;
    if(p.y >= H) p.y = 1;
    if(p.y <= 0) p.y = H - 1;
  };

  public void boundary_functions(){

      tri_boundary.draw();
      //tri_boundaryf.draw();

      tri_boundary.tri.center = p;

      tri_boundary.tri.rotate2(dir);

      tri_boundaryf.tri.center = fp;

      tri_boundaryf.tri.rotate2(dir);

      tri_boundary.bg = col;
      tri_boundaryf.bg = col;

  };

  public void fboundary_functions(){

      tri_boundaryf.tri.center.x = fp.x;
      tri_boundaryf.tri.center.y = fp.y;
      tri_boundaryf.tri.rotate2(dir);
      tri_boundaryf.bg = col;
  };


  public void p_update(){

  };

  public void update() {
    // Update velocity
    vel.add(ac);
    
    // Limit speed
    
    vel.limit(vlimit);
    dir = atan2(vel.y,vel.x) - PI;
    p.add(vel);
    // Reset accelertion to 0 each cycle

    ac.mult(0);
  }
  public void update2() {
    // Update velocity
    vel.add(ac);
    // Limit speed
    vel.limit(vlimit);
    dir = atan2(vel.y,vel.x) - PI;
    p.add(vel);
    // Reset accelertion to 0 each cycle

  }

  public void runh(){

    a1 += 0.2f;
    a2 += 0.5f;
    a3 += 0.9f;
    a4 += 1.2f;
    a5 += 1.5f;

    if(a1>=5)a1=0;
    if(a2>=10)a2=0;
    if(a3>=12)a3=0;
    if(a4>=14)a4=0;
    if(a5>=15)a5=0;

    PVector m = new PVector(mouseX,mouseY);
    
    if(toggle){
      Entity e = entities.get(ent);
      if(entities.size()>=ent&&e.Humans.size()>0)text(e.Humans.get(0).size(),100,100);
      e.scene.w = e.w;
      e.scene.h = e.h;
      if(!pause)e.scene.field();

      Entities_sublist.draw();

      if(cohesionManager)cohesionLogic();
      if(separationManager)separationLogic();
      if(alignmentManager)alignmentLogic();

      if(!dynamic)drawtotalh = entities.get(ent).Humans.size()-1;
      if(!Entities_sublist.pos())new_human(m);

      

    for ( int i=0;i<e.Humans.size();i++) {
      ArrayList<Human> H = e.Humans.get(i);

      for(int j=H.size()-1;j>-1;j--){

        
        Human h = H.get(j);
        
        h.proximity2 = new ArrayList<ArrayList<Human>>();
        h.family = new ArrayList<Human>();
        h.prox = new ArrayList<Human>();
        h.prox2 = new ArrayList<ArrayList<Human>>();

        for (int l=0;l<hRaces;l++){
          h.prox2.add(new ArrayList<Human>());
          h.proximity2.add(new ArrayList<Human>());
        }
        
        h.scene = e.scene;
        h.alcount = 0;h.acount = 0;h.scount = 0;h.mcount=0;
        
          
        for ( int k=0;k<e.Humans.size();k++) {

          ArrayList<Human> H1 = e.Humans.get(k);
          
          for(int l=H1.size()-1;l>-1;l--){

            Human h1 = H1.get(l);

            float d = dist(h.x,h.y,h1.x,h1.y);

            //if(d<h.breathingroom&&h1!=h)h.proximity.add(h1);
            h1.avoid = false;
            h1.seek = false;
            h1.align = false;
            h1.avoid2 = false;
              
            if(d<h.radius+h1.radius&&h1!=h&&h.race==h1.race)h.family.add(h1);

            if(h1!=h){
            if(
                e.Humans.get(h.race).get(0).alignNeighbour.get(h1.race)>-1
                //&&d>h.min
                &&d<e.Humans.get(h.race).get(0).alignNeighbour.get(h1.race)+h.breathingroom){
                if(!h.prox2.get(h1.race).contains(h1))h.prox2.get(h1.race).add(h1);
                h.alcount++;
                h1.align = true;
              }
              

            if( (e.Humans.get(h.race).get(0).seekNeighbour.get(h1.race)>-1
                //&&d>h.min
                &&d<e.Humans.get(h.race).get(0).seekNeighbour.get(h1.race)+h.breathingroom)){
                if(!h.prox2.get(h1.race).contains(h1))h.prox2.get(h1.race).add(h1);
                h.scount++;
                h1.seek = true;
              }

            if(
                e.Humans.get(h.race).get(0).avoidNeighbour.get(h1.race)>-1
                //&&d>h.min
                &&d<e.Humans.get(h.race).get(0).avoidNeighbour.get(h1.race)+h.breathingroom){
                if(!h.prox2.get(h1.race).contains(h1))h.prox2.get(h1.race).add(h1);
                h.acount++;
                h1.avoid = true;
            }
             if(e.Humans.get(h.race).get(0).avoidNeighbour.get(h1.race)>-1&&d<h.min&&h.min>=0
                &&d<e.Humans.get(h.race).get(0).avoidNeighbour.get(h1.race)+h.breathingroom
                //&&!h.prox2.get(h1.race).contains(h1)
                &&h.race!=h1.race
                ){
                if(!h.proximity2.get(h1.race).contains(h1))h.proximity2.get(h1.race).add(h1);
                h.mcount ++;
                h1.avoid2 = true;
            }}
            if(d<h.min&&h1!=h)h.prox.add(h1);

              }}
        //if(info){
          
        //h.life(h.proximity);
        assignVariable(h);

        if(!pause){
        //h.wander();
        h.quadPos();
        h.update();
        h.applyFriction();
        h.wrap2();
        h.update_qgrid();
        //h.collisions(h.proximity);
        h.flock();
        
        // if(h.id==0)text(h.friction.x,200,150+10*h.race);
        // if(h.id==0)text(h.scount,250,150+10*h.race);
        // h.oscilator();
        
        }
        h.dir = atan2(h.vel.y,h.vel.x);
        if(visible)h.boundary_functions();
        else {
          fill(h.col);
          noStroke();
          ellipse(h.p.x,h.p.y,h.radius,h.radius);
        }

    }
    if(info)
    for(int j=e.Humans.size()-1;j>-1;j--){

      Human h = e.Humans.get(i).get(0);

      float cc = e.Humans.get(i).get(0).seekNeighbour.get(j);
      int count = 0;

      for(int k=0;k<e.Humans.get(i).get(0).prox2.get(j).size();k++){
        Human h1 = e.Humans.get(i).get(0).prox2.get(j).get(k);
        count++;
        //if(j==0)line(h.p.x,h.p.y,h1.p.x,h1.p.y);
      }
      
      text(i,150+100*i,100);
      text(count,130+100*i,110+20*j);
      text("race: " + j + " " + cc,150+100*i,120+10*j);
      text("Vlimit: " + h.vlimit,150+100*i,160);
      text("Alimit: " + h.alimit,150+100*i,170);
      text("Coh: " + h.cohesion,150+100*i,180);
      text("Sep: " + h.separation,150+100*i,190);
    }
    }Reset();
      //if(!hidesliders)
      fRate.draw();
    }
    //else fRate.menu.toggle=0;
  };

  

  public void assignVariable(Entity h){
    if(dynamic){
          h.vlimit = h.vlimitb+vlimit;
          h.alimit = h.alimitb+alimit;
          h.cohesion = h.cohesionb1+cohesion;
          h.cohesionb = h.cohesionb2+cohesion;
          h.alignment = h.alignmentb+alignment;
          h.separation = h.separationb1+separation;
          h.separationb = h.separationb2 + separationb;
          h.separationd = h.separationdb + separationd;
          h.wanderm = h.wandermb+wanderm;
          h.breathingroom = h.breathingroomb1+breathingroom;
          h.breathingroomb = h.breathingroomb2+breathingroomb;
		      h.tscale = tscale;
          
          
        }else {
          h.alimit = h.alimitb;
		      h.vlimit = h.vlimitb;
          h.cohesion = h.cohesionb1;
          h.cohesionb = h.cohesionb2;
          h.alignment = h.alignmentb;
		      h.separation = h.separationb1;
          h.separationb = h.separationb2;
          h.wanderm = h.wandermb;
          h.breathingroom = h.breathingroomb1;
          h.breathingroomb = h.breathingroomb2;
		      h.tscale = h.tscale;
          h.separationb = separationb;
          h.separationd = h.separationdb;
        }
          h.separationc = separationc;
          h.cohesionc = cohesionc;
          h.alignmentc = -alignmentc;
          h.mu = mu;
          h.min = h.minb +min;
          
          //h.prox = h.proximity;
  };

  public void runh(Scene s){

    a1 += 0.2f;
    a2 += 0.5f;
    a3 += 0.9f;
    a4 += 1.2f;
    a5 += 1.5f;

    if(a1>=5)a1=0;
    if(a2>=10)a2=0;
    if(a3>=12)a3=0;
    if(a4>=14)a4=0;
    if(a5>=15)a5=0;

    PVector m = new PVector(mouseX,mouseY);

    if(toggle){

      Entity e = entities.get(ent);
      if(entities.size()>=ent&&e.Humans.size()>0)text(e.Humans.get(0).size(),100,100);
      //e.scene.w = e.w;
      //e.scene.h = e.h;
      s.field();
      
      Entities_sublist.draw();
      //if(!hidesliders)
      fRate.draw();
      if(!dynamic)drawtotalh = entities.get(ent).Humans.size()-1;
      if(!Entities_sublist.pos())new_human(m);

    for ( int i=0;i<e.Humans.size();i++) {
      ArrayList<Human> H = e.Humans.get(i);

      for(int j=H.size()-1;j>-1;j--){

        Human h = H.get(j);
        h.proximity = new ArrayList<Human>();
        h.scene = s;


        for(int k=0;k<e.Humans.size();k++){
          ArrayList<Human> HH = e.Humans.get(k);
          for(int l=0;l<HH.size();l++){

            Human h2 = HH.get(l);
            float d = dist(h.x,h.y,h2.x,h2.y);

            if(d<h.breathingroom/2&&h2!=h)h.proximity.add(h2);

        }}
        h.dir = atan2(h.vel.y,h.vel.x);
        h.wander();
        h.quadPos();
        h.update();
        h.wrap2();
        h.update_qgrid();
        if(!pause)h.flock();
        if(!hidesliders&&dynamic){
          h.vlimit = vlimit;
          h.alimit = alimit;
          h.cohesion = cohesion;
          h.alignment = alignment;
          h.separation = separation;
          h.wanderm = wanderm;
          h.breathingroom = breathingroom;
        }
        //h.prox = h.proximity;
        
        
        if(visible)h.boundary_functions();

    }}Reset();}
  };

  public void runp(){

  };

  public void draw(){
    tri_boundary.draw();
  };

  public void draw2(){
    //flock();
  };

  public void desired_trait(){
    for(int i=0;i<3;i++){

    int r = floor(random(Genes.size()-1));
      desired_traits.add(Genes.get(r));
    }
  };

  public void mate(){

  };

  public void new_human(PVector m){

    if(toggle&&addh&&mousePressed){

      int Race = floor(random(Humans.size()));
      //int Ent = ent;
      int ID = Humans.get(Race).size()-1;

      Human entity = new Human(m.x,m.y,ID,Race,ent);

        entity.lifespan = random(minageh,maxageh);
        entity.carrying_capacity = floor(random(0,6));

      Humans.get(Race).add(entity);
    }

  };

  public void life(){
    //boolean retry = false;
    //boolean try_ = false

    Entity e = entities.get(ent);

    if((real&&!pause)&&(Death||Birth)){

    for ( int i=0;i<e.Humans.size();i++) {
      ArrayList<Human> H = e.Humans.get(i);

      for(int j=H.size()-1;j>-1;j--){

       Human h = H.get(j);

       h.col2 = PApplet.parseInt(map(h.age,0,h.lifespan,0.0f,255));

       if(Birth){
       Boolean k = h.births;

       h.age += h.tscale;
       h.w += h.tscale/2;
       h.h += h.tscale/2;
       h.dice = 0;

       if(h.age>=h.lifespan/4&&h.age<=h.lifespan-h.lifespan/4&&h.child<h.carrying_capacity)h.births = true;
       if(h.child > h.carrying_capacity) h.births = false;

       if(h.births) h.delay ++;
       else h.delay = 0;

       if(h.delay > h.lifespan*0.9f){h.try_ = true;}
       else h.try_ = false;h.conception = false;

       if(h.try_)h.dice = random(0.001f,10);
       fill(255);
       text(h.prox.size(),x+20,y);
       if(h.dice>0&&h.dice<h.carrying_capacity/(h.prox.size()+1) && h.delay >0&&(h.age > random(h.lifespan*1/4,h.lifespan*3/4)))
       {h.conception = true;h.delay = 0; h.dice = 0 ;}
       else h.conception = false;

       if(h.conception){

         Human entity = new Human(h.x + random(-20,20),h.y + random(-20,20),Humans.get(h.race).size(),h.race,h.ent);
         entity.parent = h;
         h.Children.add(entity);
         h.child ++;
         Humans.get(h.race).add(entity);
         h.conception = false;

       }}

       if((h.age>h.lifespan||h.health<=0)&&Death){


       Humans.get(h.race).remove(i);

     }}}}


  };



  public void fam(){

  };

  public void updateplants(){

  };

  public void seek_food(){
    if(hunger>90 && !idle){

    }
    if(hunger>50 && idle){

    }

  };

  public void seek(){

  };

  public void p_in_space(){

  };


  public void add(){

    if(mousePressed){

    }
  };

  public boolean p(){
    float X = mouseX;
    float Y = mouseY;
    return X > x -w/2 && X < x + w/2 && Y > y -h/2 && Y < y + h/2;
  };

  public void create(int n,int type){

    for(int i=0;i<n;i++){

      float x = random(0,W);
      float y = random(0,H);
      int k = entities.get(ent).Mazecrawlers.get(race).size()-1;
      if(type==0){
        entities.get(ent).Humans.get(race).add(new Human(x,y,k,species.id,ent));
      }else if(type==1){

        entities.get(ent).Animals.get(race).add(new Animal(x,y,k,species.id,ent));
      }else if(type==2){
        entities.get(ent).Plants.get(race).add(new Plant(x,y,k,species.id,ent));
      }else if(type==3){

        entities.get(ent).Mazecrawlers.get(race).add(new mazeCrawler(x,y,k,species.id,ent));
      }
    }

  };



};

class Species{
  float x,y,vx,vy;
  int id;
  public boolean toggle;
  public float intelligence;
  float skill;

  Species(float X, float Y){
    x = X;
    y = Y;
    vx = 2;
    vy = 2;
  };

  Species(){

  };

};

class rSpecies{
  float x,y,vx,vy;
  int type;
  public boolean toggle;
  public float intelligence;
  float skill;

  rSpecies(float X, float Y){
    x = X;
    y = Y;
    vx = 2;
    vy = 2;
  };

  rSpecies(){

  };

};

class Particle extends Entity{

  public boolean toggle;
  public float intelligence;
  float skill;

  Particle(float X, float Y){
    x = X;
    y = Y;
    vx = 2;
    vy = 2;
  };

};

class Human extends Entity{

  ArrayList<Integer> connections = new ArrayList<Integer>();

  Human(float X, float Y){

    x = X;
    y = Y;
    vx = 2;
    vy = 2;

    init();
  }

  Human(float X, float Y,int i,int j,int E){

    x = X;
    y = Y;
    vx = 2;
    vy = 2;
    id = i;
    race = j;
    ent = E;

    init();
  }

  Human(float X, float Y,int i,int j,int E,int c){

    x = X;
    y = Y;
    vx = 2;
    vy = 2;
    id = i;
    race = j;
    ent = E;

    col = c;

    init();
  }

  public void init(){
    p = new PVector(x,y);
    vel = new PVector(random(-1,1),random(-1,1));
    ac = new PVector(0.1f,0.1f);
    lifespan = random(200,250);
    movement = random(40,100);
    intelligence = random(40,100);
    dexterity = random(40,100);
    speed = random(40,100);
    charisma = random(40,100);
    vision = random(40,100);
    health = random(200,250);
    endurance = random(40,100);
    selfp = random(40,100);
    agility = random(40,100);
    reputation = random(40,100);
    sanity = random(40,100);
    humanity = random(40,100);
    size = random(10,20);
    skill = random(0,10);
    w = size;
    h = size;
    center = new PVector(0,0);
    centervel = new PVector(0,0);
    breathingroom = random(50,100);

    tri_boundary = new _tri(x,y,10,20);
    tri_boundary.parent = this;
    tri_boundary.tri.center.x = tri_boundary.tri.x1;
    tri_boundary.tri.center.y = tri_boundary.tri.y1;
    tri_boundary.bg = col;
    tri_boundary.tri.update_Boundaries(tri_boundary.tri);
    tri_boundary.tri.create_rotation_points(tri_boundary.tri.Boundaries);
    tri_boundary.tri.update_dist(tri_boundary.tri.Boundaries);
    // previous boundary
    tri_boundaryp = new _tri(x,y,10,20);
    tri_boundaryp.parent = this;
    tri_boundaryp.tri.center.x = tri_boundaryp.tri.x1;
    tri_boundaryp.tri.center.y = tri_boundaryp.tri.y1;
    tri_boundaryp.bg = col;
    tri_boundaryp.tri.update_Boundaries(tri_boundaryp.tri);
    tri_boundaryp.tri.create_rotation_points(tri_boundaryp.tri.Boundaries);
    tri_boundaryp.tri.update_dist(tri_boundaryp.tri.Boundaries);

    // future boundary

    tri_boundaryf = new _tri(x,y,10,20);
    tri_boundaryf.parent = this;
    tri_boundaryf.tri.center.x = tri_boundaryf.tri.x1;
    tri_boundaryf.tri.center.y = tri_boundaryf.tri.y1;
    tri_boundaryf.bg = col;
    tri_boundaryf.tri.update_Boundaries(tri_boundaryf.tri);
    tri_boundaryf.tri.create_rotation_points(tri_boundaryf.tri.Boundaries);
    tri_boundaryf.tri.update_dist(tri_boundaryf.tri.Boundaries);
    fov = random(30,40);
    //ac.x = map(speed,0,100,0,0.01);
    //ac.y = map(speed,0,100,0,0.01);

    //vlimit = random(4,100);
    lifespan = random(minageh,maxageh);
    carrying_capacity = floor(random(0,6));
    genes.put("mass", 200.0f);
    genes.put("lifespan",0.0f);
    genes.put("intelligence",0.0f);
    genes.put("dexterity",0.0f);
    genes.put("endurance",0.0f);
    genes.put("piety",0.0f);
    genes.put("vision,",0.0f);
    genes.put("health",0.0f);
    genes.put("speed",0.0f);
    genes.put("selfp",0.0f);
    genes.put("charisma",0.0f);
    genes.put("agility",0.0f);
    genes.put("reputation",0.0f);
    genes.put("sanity",0.0f);
    genes.put("humanity",0.0f);
    genes.put("faith",0.0f);
    genes.put("fresistance",0.0f );

    for (String key : genes.keySet()) {
        Genes.add(key);
     }
     desired_trait();

     
  };

  public void draw(){
    strokeWeight(ssize);
    stroke(cols);
    fill(col2);
    ellipse(x,y,w,h);
  };



  public void interact(){

  };

  public void reproduce(){

  }

  public void collide(){

  }

  public void ears(){

  };

  public void gene(){

  };

};

class Plant extends Entity{

  int col = color(0,255,0);

  Plant(float X, float Y){
    x = X;
    y = Y;
    vx = 2;
    vy = 2;
    init();
  };

  Plant(float X, float Y,int i,int j,int E){
    x = X;
    y = Y;
    vx = 2;
    vy = 2;
    id = i;
    ent = E;
    species = new Species(ent,i);
    init();

  };

  public void init(){
    p = new PVector(x,y);
    vel =new PVector(0,0);
    ac =new PVector(0,0);
    lifespan = random(40,100);
    movement = random(40,100);
    intelligence = random(40,100);
    dexterity = random(40,100);
    speed = random(40,100);
    charisma = random(40,100);
    vision = random(40,100);
    health = random(40,100);
    endurance = random(40,100);
    selfp = random(40,100);
    agility = random(40,100);
    reputation = random(40,100);
    sanity = random(40,100);
    humanity = random(40,100);
    size = random(5,10);
    skill = random(0,10);
    w = size;
    h = size;
    lifespan = random(500,1000);
    carrying_capacity = floor(random(0,6));
  }

  public void draw(){
    stroke(col);
    fill(col,100);
    ellipse(x,y,w/(frameCount/60)*2,h/(frameCount/60)*2);
  };

};

class Animal extends Entity{

  Animal(float X, float Y){
    x = X;
    y = Y;

  }

  Animal(float X, float Y,int i,int j,int E){
    x = X;
    y = Y;
    id = i;
    species = new Species(ent,i);
    ent = E;

  }

  public void draw(){
    stroke(0);
    fill(0);
    ellipse(x,y,20,20);
  };

};

class Mineral extends Entity{

  Mineral(float X, float Y){
    x = X;
    y = Y;

  }

  Mineral(float X, float Y,int i,int j,int E){
    x = X;
    y = Y;
    id = i;
    species = new Species(ent,i);
    ent = E;

  }

  public void draw(){
    stroke(0);
    ellipse(x,y,size,size);
  };

};

class Metal extends Entity{

  Metal(float X, float Y){
    x = X;
    y = Y;
  }

  Metal(float X, float Y,int i,int j,int E){
    x = X;
    y = Y;
    id = i;
    species = new Species(ent,i);
    ent = E;
  }

  public void draw(){
    stroke(0);
    ellipse(x,y,size,size);
  };
};

class mazeCrawler extends Entity{
  float x,y;
  boolean toggle;
  Entity target;

  mazeCrawler(float X, float Y){
    x = X;
    y = Y;
  }

  mazeCrawler(float X, float Y,int i,int j,int E){
    x = X;
    y = Y;
    id = i;
    species = new Species(ent,i);
    ent = E;

  }

  public void draw(){
    stroke(0);
    ellipse(x,y,size,size);
  };

  public void seek(){

  };
};

class Celluloid extends Entity{
  float x,y;
  boolean toggle;
  Entity target;
  Species species;

  Celluloid(float X, float Y){
    x = X;
    y = Y;

    //species
  }

  Celluloid(float X, float Y,int i,int j,int E){
    x = X;
    y = Y;
    id = i;
    species = new Species(ent,i);
    ent = E;

  }

  public void draw(){
    stroke(0);
    ellipse(x,y,size,size);
  };

  public void seek(){

  };
};

class Energy{

  Energy(){

  }

};

class Cycle{

  public float len = 120,start,inc;
  float current;
  Cycle(float Start,float Inc){
    start = Start;
    inc = Inc;
  }

  public void run(){

    start += inc;
    current = sin(inc);

  }

};
class Grid_space{
  
  int id,iid,pid,row,t,toggle,steps = 10000,psteps,counter = 0,index,t2,xpos,ypos,sides,currentId,totalChildren,popCount,
      popId=-1;
  float x,y,w,h,vx,vy,ax,ay,elasticity,lim,mass = 10,type,dx,dy;
  String label;
  boolean drag,resize,collide,forward = true,backward = false, pause = false,graph,visible,field,neighboured,convolved = false,image,webcam,attractor,findHeading;
  boolean popVisited,popVisited1,popVisited2,counted,grid,border,visited,visited1,visited3,visited4,updated,
          active = true,corrected,popVerified,histVerified,popClosed,wVisited,walled,popColChecked,compared,debug;
  
  PVector heading ;
  float incidence;
  float reflection ;
  float norm;
  Grid parent;
  Grid_space leader = this,next = null,transfer;
  PImage img,shade;
  
  Shape shape;
  ArrayList<PVector> pos = new ArrayList<PVector>();
  ArrayList<PVector> vel = new ArrayList<PVector>();
  ArrayList<PVector> headings = new ArrayList<PVector>();
  
  ArrayList<Grid_space> Neighbours = new ArrayList<Grid_space>();
  ArrayList<Grid_space> visitedBy = new ArrayList<Grid_space>();
  ArrayList<Grid_space> modifiedAgents = new ArrayList<Grid_space>();
  ArrayList<Grid_space> Neighbours2 = new ArrayList<Grid_space>();
  ArrayList<Grid_space> Neighbours3 = new ArrayList<Grid_space>();
  ArrayList<Grid_space> Neighbours_8 = new ArrayList<Grid_space>();
  ArrayList<Grid_space> Neighbours_4 = new ArrayList<Grid_space>();
  ArrayList<Grid_space> NeighboursWalls = new ArrayList<Grid_space>();
  ArrayList<Boundary> Boundaries = new ArrayList<Boundary>();
  ArrayList<Boundary> Boundaries2 = new ArrayList<Boundary>();
  ArrayList<Grid_space> history = new ArrayList<Grid_space>();
  ArrayList<PVector> Vertices = new ArrayList<PVector>();
  
  Grid_space []Neighbours_a;
  Grid_space []Neighbours_b;
  
  ArrayList<Boolean> Walls_a = new ArrayList<Boolean>();
  ArrayList<Boolean> Walls_b = new ArrayList<Boolean>();
  
  ArrayList<PVector[][]> walls = new ArrayList<PVector[][]>();
  
  PVector temp = new PVector(0,0);
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  
  int col = color(255);
  int col2 = -10000,col3,col4,col5,col6,col7,popCol;
  
  Grid_space[][] kernel2d =   {{null , null, null }, 
                               {null , this, null }, 
                               {null , null, null }}; 
  Grid_space[] kernel1d =      {null,null,null,
                                null,this,null,
                                null,null,null};  
  
  //Grid_space(float xx,float yy, float ww, float hh, int Id,int I, int J){
  
  //  x = xx;
  //  y = yy;
  //  w = ww;
  //  h = hh;
  //  xpos = I;
  //  ypos = J;
  //  id = Id;
  //  iid = id;
  //  ax = 0.02;
  //  ay = 0.02;
    
  //  Neighbours_a = new Grid_space[8];
  //  Neighbours_b = new Grid_space[4];
  //  for(int i = 0; i<Neighbours_a.length;i++){
  //    Walls_a.add(true);
  //  }
  //  for(int i = 0; i<Neighbours_b.length;i++){
  //    Walls_b.add(true);
  //  }
    
  //  for(int i = 0; i<Neighbours_a.length;i++){
  //    Boundaries.add(new Boundary(0,0,0,0));
  //  }
  //  for(int i = 0; i<Neighbours_b.length;i++){
  //    Boundaries.add(new Boundary(0,0,0,0));
  //  }
  //  //shade = new PImage(w,h);
    
  //};
  
  Grid_space(float xx,float yy, float ww, float hh, int Id,int I, int J){
  
    x = xx;
    y = yy;
    w = ww;
    h = hh;
    xpos = I;
    ypos = J;
    id = Id;
    iid = id;
    ax = 0.02f;
    ay = 0.02f;
    
    Neighbours_a = new Grid_space[8];
    Neighbours_b = new Grid_space[4];
    for(int i = 0; i<Neighbours_a.length;i++){
      Walls_a.add(true);
    }
    for(int i = 0; i<4;i++){
      Walls_b.add(true);
    }
    Boundary a1,a2,a3,a4;
    a1 = new Boundary(x,y,x+w,y);
    a2 = new Boundary(x+w, y, x+w, y+h);
    a3 = new Boundary(x+w, y+h, x, y+h);
    a4 = new Boundary(x, y+h, x, y);

    Boundaries.add(a1);
    Boundaries.add(a4);
    Boundaries.add(a2);
    Boundaries.add(a3);
   
    //shade = new PImage(w,h);
    
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void init(){
    
  };
  
  public void draw(){
    
  };

  public void drawBoundaries(){

   for(int i=0;i<Walls_b.size();i++){
     Boundary b = Boundaries.get(i);
     b.col = color(red(col)+30,green(col)+30,blue(col)+30);
     if(Walls_b.get(i)) b.draw3();
   }
  };

  public void drawBoundaries2(){

   for(int i=0;i<Boundaries.size();i++){
     Boundary b = Boundaries.get(i);
     b.col = color(red(col)+30,green(col)+30,blue(col)+30);
     stroke(b.col);
     if(Walls_b.get(i)){
       line(b.x1,b.y1,b.x2,b.y2);
     } 
     //b.draw3();
   }
  };
  
  public void move(){
    
    float a = 5;
    
    vx += random(-a,a);
    vy += random(-a,a);
    
  }
  
  public boolean pos(){
    
    return mouseX>=x&&mouseX<=x+w&&mouseY>=y&&mouseY<=y+h;
  }
  
  public void update(){
    steps = pos.size()-1;
    if(forward){
      
      if(index==0){
        if(pos.size()>0)counter = pos.size()-1;
        
    //if(lim>0){
    //  vx += Limit(vx,lim);
    //  vy += Limit(vy,lim);
    //}else{
    
    if(vx>4)vx = 4;
    if(vx<-4)vx = -4;
    if(vy>4)vx = 4;
    if(vy<-4)vx = -4;
    if(boundaries())reflect();
    
      x += vx;
      y += vy;
    
      
      if(attractors.attractors.size()>0){
        //if(findHeading)find_heading();
        pos.add(new PVector(x,y));
        vel.add(new PVector(vx,vy));
      }}
    else if(index ==1){
      vx = vel.get(counter).x;
      vy = vel.get(counter).y;
      x = pos.get(counter).x;
      y = pos.get(counter).y;
      counter++;
      if(counter == pos.size()){
        index = 0;
      }}}
    else if(backward){
      if(counter>0){
        index = 1;
        vx = vel.get(counter).x;
        vy = vel.get(counter).y;
        x = pos.get(counter).x;
        y = pos.get(counter).y;
        counter --;
      if(counter==0){
        pos = new ArrayList<PVector>();
        vel = new ArrayList<PVector>();
        //pos.remove(pos.size()-1);
      }
      if(counter == 0)index = 0;
      
      //steps = counter;
    }}
    else if(pause){
      
    }
    
    if(graph)graph();
    
  };
  
  public void mouse(){
    if(forward){
    float t1 = atan2(mouseY - y, mouseX - x);
    
    vx += ax * cos(t1);
    vy += ay * sin(t1);
    }
  };
  
  
  public Grid_space getNewBorder(){
    
    Grid_space g = null;
    
    ArrayList<Grid_space> neighbours = new ArrayList<Grid_space>();
    
    for(int i=0;i<Neighbours2.size();i++){
      
     Grid_space a = Neighbours2.get(i);
     
     if(a.col2!=col2)neighbours.add(a);
    }
    
    if(neighbours.size()>0)g = neighbours.get(floor(random(neighbours.size())));
    return g;
  };
  
  public Grid_space getNewNeighbour(){
    
    Grid_space g = null;
    
    ArrayList<Grid_space> neighbours = new ArrayList<Grid_space>();
    
    for(int i=0;i<Neighbours2.size();i++){
      
     Grid_space a = Neighbours2.get(i);
     
     if(!a.popVisited&&a.col2==col2)neighbours.add(a);
    }
    
    if(neighbours.size()>0)g = neighbours.get(floor(random(neighbours.size())));
    return g;
  };
  
  public Grid_space getNewNeighbour_(Grid g1,Grid_space k){
    
    Grid_space g = null;
    
    ArrayList<Grid_space> neighbours = new ArrayList<Grid_space>();
    
    for(int i=0;i<Neighbours2.size();i++){
      
     Grid_space a = Neighbours2.get(i);
     
     if(!a.popVisited&&a.col2==col2){
       a.pid = k.pid;
       a.popId = k.popId;
       a.popCol = k.popCol;
       g1.popHist.add(new ArrayList<Grid_space>());
       g1.popStack.add(new ArrayList<Grid_space>());
       g1.agents.add(a);
       g1.agentsBackup.add(a);
       
       neighbours.add(a);
    }}
    
    if(neighbours.size()>0)g = neighbours.get(floor(random(neighbours.size())));
    return g;
  };
  
public ArrayList getNewNeighbour1(Grid g){
    
    ArrayList<Grid_space> neighbours = new ArrayList<Grid_space>();
    
    for(int i=0;i<Neighbours2.size();i++){
      
     Grid_space a = Neighbours2.get(i);
     //if(Walls_b.get(i)){
     if(a.popVisited
        &&a.popId!=popId
        &&a.pid!=pid
        &&a.col2==col2
        //&&a.popCol!=popCol
        //&&g.agentsConst.get(a.pid).popCol!=g.agentsConst.get(pid).popCol
        //&&g.agentsConst.get(a.pid)!=g.agentsConst.get(popId)
        //&&!Walls_b.get(i)
        &&g.agentsConst.get(a.popId).col2==g.agentsConst.get(popId).col2
        &&g.agentsBackup.get(popId).steps>g.agentsBackup.get(a.popId).steps
        &&!g.agentsConst.get(popId).modifiedAgents.contains(g.agentsConst.get(a.popId))
        &&!g.agentsConst.get(a.popId).visitedBy.contains(g.agentsConst.get(popId))
        )neighbours.add(a);
     
     if(a.popVisited&&a.popId!=popId&&a.col2==col2&&a.popCol!=popCol){
     
     if(!g.agentsConst.get(popId).modifiedAgents.contains(g.agentsConst.get(a.popId))){
      g.agentsConst.get(popId).modifiedAgents.add(g.agentsConst.get(a.popId));
      if(a.pid!=a.popId){
        g.agentsConst.get(popId).modifiedAgents.add(g.agentsConst.get(a.pid));
        if(pid!=popId)g.agentsConst.get(pid).modifiedAgents.add(g.agentsConst.get(a.pid));
      }
      if(pid!=popId){
        g.agentsConst.get(pid).modifiedAgents.add(g.agentsConst.get(a.popId));
        if(a.pid!=a.popId)g.agentsConst.get(pid).modifiedAgents.add(g.agentsConst.get(a.pid));
      }}
     if(!g.agentsConst.get(a.popId).visitedBy.contains(g.agentsConst.get(popId)))
         g.agentsConst.get(a.popId).visitedBy.add(g.agentsConst.get(popId));
     }}
    if(neighbours.size()==0)neighbours=null;
    return neighbours;
  };
  
  public ArrayList getNewNeighbour4(Grid g){
    
    ArrayList<Grid_space> neighbours = new ArrayList<Grid_space>();
    
    for(int i=0;i<Neighbours2.size();i++){
      
     Grid_space a = Neighbours2.get(i);
     //if(Walls_b.get(i)){
     if(a.popVisited
        &&a.popId!=popId
        &&a.col2==col2
        &&a.popCol!=popCol
        //&&!Walls_b.get(i)
        &&g.agentsConst.get(a.popId).col2==g.agentsConst.get(popId).col2
        &&g.agentsBackup.get(popId).steps>g.agentsBackup.get(a.popId).steps
        &&!g.agentsConst.get(popId).modifiedAgents.contains(g.agentsConst.get(a.pid))
        &&!g.agentsConst.get(a.popId).visitedBy.contains(g.agentsConst.get(popId))
        )neighbours.add(a);
     
     }
    if(neighbours.size()==0)neighbours=null;
    return neighbours;
  };
  
  public ArrayList getNewNeighbour2(Grid g){
    
    ArrayList<Grid_space> neighbours = new ArrayList<Grid_space>();
    
    for(int i=0;i<Neighbours2.size();i++){
      
     Grid_space a = Neighbours2.get(i);
     
     if(a.popVisited&&a.pid!=pid&&a.col2==col2&&a.leader.steps>leader.steps){
       neighbours.add(a);
       if(!a.visitedBy.contains(this.leader))a.visitedBy.add(this.leader);
     }
     
     if(a.popVisited&&a.col2==col2&&a.pid!=pid
         &&a.popId>-1&&popId>-1&&!g.agents.get(popId).modifiedAgents.contains(g.agents.get(a.popId))
         &&g.agentsConst.get(popId).steps<g.agentsConst.get(a.popId).steps)neighbours.add(a);
         
         if(a.popVisited&&a.col2!=col2
         &&!g.agents.get(pid).modifiedAgents.contains(g.agents.get(a.pid))
         &&g.agentsConst.get(popId).steps<g.agentsConst.get(a.popId).steps){
         a.popCol=popCol;
         neighbours.add(a);}
   
     }
    if(neighbours.size()==0)neighbours=null;
    return neighbours;
  };
  
  public Grid_space getNewNeighbour3(Grid g){
    
    Grid_space k = null;
    
    ArrayList<Grid_space> neighbours = new ArrayList<Grid_space>();
    
    for(int i=0;i<Neighbours2.size();i++){
      
     Grid_space a = Neighbours2.get(i);
     
     if(a.popVisited&&a.col2==col2
         &&!g.agents.get(popId).modifiedAgents.contains(g.agents.get(a.popId))
         &&g.agentsConst.get(popId).steps<g.agentsConst.get(a.popId).steps)neighbours.add(a);
         
         if(a.popVisited&&a.col2!=col2
         &&!g.agents.get(pid).modifiedAgents.contains(g.agents.get(a.pid))
         &&g.agentsConst.get(popId).steps<g.agentsConst.get(a.popId).steps)neighbours.add(a);
    }
    
    
    if(neighbours.size()>0)k = neighbours.get(floor(random(neighbours.size())));
    return k;
  };
  
public Grid_space getNewWallNeighbour(Grid k){
  
  Grid_space g = null;
  
  ArrayList<Grid_space> neighbours = new ArrayList<Grid_space>();
  
  for(int i=0;i<Neighbours.size();i++){
     
     Grid_space a = Neighbours.get(i);
     if(k.wallSquares.contains(a)){
     for(int j=0;j<a.Walls_b.size();j++){
       
       if((a.Walls_b.get(j)&&a.col2==col2)&&!a.wVisited){
         if(!neighbours.contains(a))neighbours.add(a);
         else i++;
       }}}}
   
    
    if(neighbours.size()>0)g = neighbours.get(floor(random(neighbours.size())));
    return g;
  
};


  
public Grid_space sort(ArrayList<Grid_space> a){
  
  Grid_space g = a.get(0);
  
  for(int i=1;i<a.size();i++){
    Grid_space g1 = a.get(i);
    
    if(g.steps<g1.steps)g = g1;
  }
  
  return g;
};
  
  public void find_heading(){
    
    heading = new PVector(x,y);
    
    if(pos.size()>0){
      
        PVector p = pos.get(pos.size()-1);
        PVector c = new PVector(x,y);
        
        //PVector p = new PVector(x + vx,y +vy);;
        //PVector c = new PVector(x,y);
        
        int mult = 10;
        float dx = c.x - p.x;
        float dy = c.y - p.y;
        
        float theta = atan2(dy,dx);
        incidence = theta;
        
        if(dx>0)heading.x = x + dx * mult * cos(theta);
        else heading.x = x - dx * mult * cos(theta);
        if(dy>0)heading.y = y + dy * mult * sin(theta);
        else heading.y = y - dy * mult * sin(theta);
        
        heading.x += vx;
        heading.y += vy;
      
    }
        
        
  };
  
  public void attractors(){
    if(forward&&attractor){
    if(attractors.attractors.size()>0){
    for(int i=0;i<attractors.attractors.size();i++){
      
      Attractor a = attractors.attractors.get(i);
      
      float t1 = atan2(a.y - y, a.x - x);
    
      float d = dist(x,y,a.x,a.y);
      if(a.type == 0){
      ax = (a.mass + mass)/(d*d)*9.81f*a.intensity;
      ay = (a.mass + mass)/(d*d)*9.81f*a.intensity;
      }
       else if( a.type == 1){
      ax = a.intensity;
      ay = a.intensity;
      vx -=  a.intensity * dx; ;
      vy -=  a.intensity * dy; ;
      }
      vx -= ax * cos(t1);
      vy -= ay * sin(t1);
      
    }}}
  };
  
  public void reflect(){
    if(collide){
      vx = -ax  * cos(reflection);
      vy = -ay  * sin(reflection);
    }
    
  };

  public void popBoundaries(){
    for(int i=0;i<walls.size();i++){

    }
  };
  
  public boolean boundaries(){
    t2 = 0;
    boolean k = false;
    //float incidence = 0;
    //PVector temp = new PVector(0,0);
    //if(forward){
    //if(lines.Boundaries.size()>0){
      
    //for(int i=0;i<lines.Boundaries.size();i++){
      
    //  Boundary a = lines.Boundaries.get(i);
    //  float n = lines.norm.get(i);
      
    //  PVector a1 = new PVector(a.x1,a.y1); 
    //  PVector a2 = new PVector(a.x2,a.y2); 
      
    //  boolean k2 = check_lineP(a1,a2,new PVector(x,y));
    //  //norm.set(0,a.norm);
    //  norm = n;
    //  if(k2){
    //    t2++;
    //  }}}}
    
    //if(t2>0){
    //  k = true;
    //  collide = true;
    //}
    //else{
    //  collide = false;
    //}
    
    //reflection = norm + (norm + incidence);
    return k;
  };
  
  
  public boolean check_lineP(PVector a, PVector b,PVector c){
    
    boolean k = false;
    float d1 = dist(a.x,a.y,b.x,b.y);
    float d2 = dist(a.x,a.y,c.x,c.y);
    float d3 = dist(b.x,b.y,c.x,c.y);
    float d4 = d2 + d3;
    
    
    //if(d5>=inc/2&&d6>=inc/2){
    if(d4 <= d1 + 0.05f && d4 >= d1 - 0.05f)k = true;
    
    return k;
  };
  
  public float Limit(float a,float b){
    if(a>0)if(a > b) a = b;
    
    if(a<0)if(a < -b) a = b;
    
    return a;
  };
  
  public void wrap(){
    
      if(x>W)x=1;
      if(x<0)x=W;
      if(y>H)y=1;
      if(y>H)x=1;
      if(y<0)y=H;
  };
  
  public void graph(){
    stroke(col);
    int max = 10;
    if(forward){
      if(index==0){
        
    if(pos.size()>max&& pos.size()>2){
      for( int i=pos.size()-max;i<pos.size()-1;i++){
        
        PVector a = pos.get(i);
        PVector b = pos.get(i+1);
        
        line(a.x,a.y,b.x,b.y);
        
      }} else{
      for( int i=0;i<pos.size()-1;i++){
        
        PVector a = pos.get(i);
        PVector b = pos.get(i+1);
        
        line(a.x,a.y,b.x,b.y);
        
      }}}
    else if(index==1){
          if(counter>max&& pos.size()>2){
      for( int i=counter-max;i<counter;i++){
        PVector a = pos.get(i);
        PVector b = pos.get(i+1);
        
        line(a.x,a.y,b.x,b.y);
        
      }}else{
      for( int i=counter-max;i<counter;i++){
        PVector a = pos.get(i);
        PVector b = pos.get(i+1);
        
        line(a.x,a.y,b.x,b.y);
        
      }}}}
    else if(backward){
      if(counter>max&& pos.size()>2){
      for( int i=counter-max;i<counter;i++){
        PVector a = pos.get(i);
        PVector b = pos.get(i+1);
        
        line(a.x,a.y,b.x,b.y);
      }}else{
      for(int i=0;i<counter;i++){
        PVector a = pos.get(i);
        PVector b = pos.get(i+1);
        
        line(a.x,a.y,b.x,b.y);
      }}}
  };
  
  public void bounce(){
    if(forward){
    float e = elasticity;
    if(elasticity!=0){
    if(x >= W )vx = - vx;
    if(x <= 0)vx = - vx;
    if(y >= H )vy = - vy;
    if(y <= 0 )vy = - vy;
    }
    
    else{
      if(x >= W )vx = - vx * (1 - e);
      if(x <= 0)vx = - vx * (1 - e);
      if(y >= H )vy = - vy * (1 - e);
      if(y <= 0 )vy = - vy * (1 - e);
    }}
  };
  
  
  public void get_neighbours(GridImg img){
    if(!neighboured){
    
    
    ArrayList<Grid_space> n = new ArrayList<Grid_space>();
    ArrayList<Grid_space> n2 = new ArrayList<Grid_space>();
    int cell = id;
    
    Grid_space b = img.imsquares.get(cell);
  
    Grid_space topl,top,topr,right,btmr,btm,btml,left;
    
       topl = index2(PApplet.parseInt(xpos) - 1, PApplet.parseInt(ypos) - 1,img);
       top = index2(PApplet.parseInt(xpos) , PApplet.parseInt(ypos) - 1,img);
       topr = index2(PApplet.parseInt(xpos) + 1, PApplet.parseInt(ypos) - 1,img);
       right = index2(PApplet.parseInt(xpos) + 1, PApplet.parseInt(ypos),img);
       btmr = index2(PApplet.parseInt(xpos) + 1, PApplet.parseInt(ypos) + 1,img);
       btm = index2(PApplet.parseInt(xpos) , PApplet.parseInt(ypos) + 1,img);
       btml = index2(PApplet.parseInt(xpos) - 1, PApplet.parseInt(ypos) + 1,img);
       left = index2(PApplet.parseInt(xpos) - 1, PApplet.parseInt(ypos) ,img);
    
    if(topl!=null){
      n.add(topl);
      Neighbours_a[0] = topl;
      kernel1d[0] = topl;
    }
    if(top!=null){
      n.add(top);
      n2.add(top);
      Neighbours_a[1] = top;
      Neighbours_b[0] = top;
      kernel1d[1] = top;
    }
    if(topr!=null){
      n.add(topr);
      Neighbours_a[2] = topr;
      kernel1d[2] = topr;
    }
    if(right!=null){
      n.add(right);
      n2.add(right);
      Neighbours_a[3] = right;
      Neighbours_b[1] = right;
      kernel1d[3] = right;
    }
    if(btmr!=null){
      n.add(btmr);
      Neighbours_a[4] = btmr;
      kernel1d[5] = btmr;
    }
    if(btm!=null){
      n.add(btm);
      n2.add(btm);
      Neighbours_a[5] = btm;
      Neighbours_b[2] = btm;
      kernel1d[6] = btm;
    }
    if(btml!=null){
      n.add(btml);
      Neighbours_a[6] = btml;
      kernel1d[7] = btml;
    }
    if(left!=null){
      n.add(left);
      n2.add(left);
      Neighbours_a[7] = left;
      Neighbours_b[3] = left;
      kernel1d[8] = left;
    }
    Neighbours = n;
    Neighbours2 = n2;
    neighboured = true;
    }
  };
  
  public void compareNeighbours(){

    if(!compared){
    for(int i=0;i<Neighbours_b.length;i++){
      Grid_space g = Neighbours_b[i];
      //Grid_space g = Neighbours_b.get(i);
      if(g!=null){
        if(g.col==col)Walls_b.set(i,false);
        else Walls_b.set(i,true);
      }
      else Walls_b.set(i,true);
      //fill(255);
      
      if(pos()&&debug){
            fill(0);
            stroke(0);
            ellipse(x+w/2,y+h/2,10,10);
            if(g!=null&&g.col!=col)line(x+w/2,y+h/2,g.x+w/2,g.y+h/2);
            if(g!=null)text(i,g.x+w/2+10,g.y+h/2);
          }
    }}
  };

  public void get_neighbours(Grid g){
    
    if(!neighboured){
      
    ArrayList<Grid_space> n = new ArrayList<Grid_space>();
    ArrayList<Grid_space> n2 = new ArrayList<Grid_space>();
    ArrayList<Grid_space> n3 = new ArrayList<Grid_space>();
    int cell = id; 
    
    Grid_space b = g.squares.get(cell);
    
    Grid_space topl,top,topr,right,btmr,btm,btml,left;
    
       topl = index2(PApplet.parseInt(xpos) - 1, PApplet.parseInt(ypos) - 1,g);
       top = index2(PApplet.parseInt(xpos) , PApplet.parseInt(ypos) - 1,g);
       topr = index2(PApplet.parseInt(xpos) + 1, PApplet.parseInt(ypos) - 1,g);
       right = index2(PApplet.parseInt(xpos) + 1, PApplet.parseInt(ypos),g);
       btmr = index2(PApplet.parseInt(xpos) + 1, PApplet.parseInt(ypos) + 1,g);
       btm = index2(PApplet.parseInt(xpos) , PApplet.parseInt(ypos) + 1,g);
       btml = index2(PApplet.parseInt(xpos) - 1, PApplet.parseInt(ypos) + 1,g);
       left = index2(PApplet.parseInt(xpos) - 1, PApplet.parseInt(ypos) ,g);
    
    if(topl!=null){
      n.add(topl);
      Neighbours_a[0] = topl;
      kernel1d[0] = topl;
      n3.add(topl);
    }else{
      n3.add(null);
    }
    if(top!=null){
      n.add(top);
      n2.add(top);
      Neighbours_a[1] = top;
      Neighbours_b[0] = top;
      kernel1d[1] = top;
      n3.add(top);
    }else{
      n3.add(null);
      //Walls_b.set(0,null);
    }
    if(topr!=null){
      n.add(topr);
      Neighbours_a[2] = topr;
      kernel1d[2] = topr;
      n3.add(topr);
    }else{
      n3.add(null);
    }
    if(right!=null){
      n.add(right);
      n2.add(right);
      Neighbours_a[3] = right;
      Neighbours_b[1] = right;
      kernel1d[3] = right;
      n3.add(right);
    }else{
      n3.add(null);
      //Walls_b.set(1,null);
    }
    if(btmr!=null){
      n.add(btmr);
      Neighbours_a[4] = btmr;
      kernel1d[5] = btmr;
      n3.add(btmr);
    }else{
      n3.add(null);
    }
    if(btm!=null){
      n.add(btm);
      n2.add(btm);
      Neighbours_a[5] = btm;
      Neighbours_b[2] = btm;
      kernel1d[6] = btm;
      n3.add(btm);
    }else{
      n3.add(null);
      //Walls_b.set(2,null);
    }
    if(btml!=null){
      n.add(btml);
      Neighbours_a[6] = btml;
      kernel1d[7] = btml;
      n3.add(btml);
    }else{
      n3.add(null);
    }
    if(left!=null){
      n.add(left);
      n2.add(left);
      Neighbours_a[7] = left;
      Neighbours_b[3] = left;
      kernel1d[8] = left;
      n3.add(left);
    }else{
      n3.add(null);
      //Walls_b.set(3,null);
    }
    
    
    Neighbours = n;
    Neighbours2 = n2;
    Neighbours3 = n3;
    
    neighboured = true;
    }
  };

  public void getNeighbours4(int n){

  for(int i=ypos -n;i<ypos +n;i++){
    for(int j=xpos -n;j<xpos +n;j++){

      Grid_space g = null;
      int p = j + i * (2 * n +1);

      if(j==xpos||j<parent.cols||j<parent.cols)j++;
      if(i==ypos||i<parent.cols||j>parent.cols)i++;
      if(j!=xpos&&i!=ypos){
        g = parent.squares.get(p);

        if(g.col==col);
      }
      
  }}

};

public void getNeighbours4(Grid a){

  if(!neighboured){
    // fill(255);
    // text(Neighbours_b.length,x,y+h/2);
    for(int i= ypos-1;i<ypos+2;i++){
      
      for(int j= xpos-1;j<xpos+2;j++){

        Grid_space g = null;
        int p = (j) + (i) * a.cols;

        if(p>=0&&p<a.squares.size()
            &&j>=0&&j<a.cols
            &&i>=0&&i<a.rows
            &&g!=this){
          g = a.squares.get(p);
          if(!Neighbours_8.contains(g))Neighbours_8.add(g);
          }else if(Neighbours_8.size()<8) Neighbours_8.add(null);
          //count ++;
        }}

      for(int i=1;i<Neighbours_8.size();i+=2){

        Grid_space g = null;
        if(Neighbours_8.get(i)!=null)g = Neighbours_8.get(i);
        //Neighbours_a[i] = g;

          if(Neighbours_4.size()<4&&g==null)
          if(!Neighbours_4.contains(g))Neighbours_4.add(g);
          Neighbours_b[floor(i/2)] = g;
        
      }
  neighboured = true;
}

};
  
};




public Grid_space index2(int xpos,int ypos,Grid a){
  
  Grid_space b = null;
  if(a.toggle){
    if(xpos<0||xpos>a.cols-1||ypos<0||ypos>a.rows-1) return null;
    else b = a.squares.get(xpos + (ypos * PApplet.parseInt(a.cols)));
      }else{
        if(xpos<0||xpos>a.cols-1||ypos<0||ypos>a.rows-1)return null;
        else b = a.squares.get(xpos + (ypos * PApplet.parseInt(a.cols)));
      }
  return b;
};

public Grid_space index2(int xpos,int ypos,GridImg a){
  Grid_space b = null;
  if(a.toggle){
    if(xpos<0||xpos>a.img.width-1||ypos<0||ypos>a.img.height-1)return null;
    else b = a.imsquares.get(xpos + (ypos * PApplet.parseInt(a.img.width)));
      }else{
      if(xpos<0||xpos>a.cols-1||ypos<0||ypos>a.rows-1)return null;
      else b = a.imsquares.get(xpos + (ypos * PApplet.parseInt(a.cols)));
    }
  return b;
};
class Html{
  
  String html = "",url;
  ArrayList<String> lines = new ArrayList<String>();
  ArrayList<String> links = new ArrayList<String>();
  boolean stop = false,textScanned;
  
  int counter;
  
  Html(String Url){
    url = Url;
    
    
    String line, result = "";
      if(!stop){
      try {
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("GET");
        setRequestHeaders(conn);
        BufferedReader rd = new BufferedReader
          (new InputStreamReader(conn.getInputStream()));
        while ( (line = rd.readLine ()) != null) {
          result += line;
          lines.add(line);
          html += line;
        }
        rd.close();stop = true;
      } 
      catch (Exception e) {
        e.printStackTrace();
      }}
  };
  
  public void getString(){
    
  String html = getHTML(url);
  //println(html);
  }

    public String getHTML(String url) {
      
      String line, result = "";
      if(!stop){
    
      try {
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("GET");
        setRequestHeaders(conn);
        BufferedReader rd = new BufferedReader
          (new InputStreamReader(conn.getInputStream()));
        while ( (line = rd.readLine ()) != null) {
          result += line;
          lines.add(line);
          html += line;
        }
        rd.close();stop = true;
      } 
      catch (Exception e) {
        e.printStackTrace();
      }}
    
      return html;
    }

    public void setRequestHeaders(HttpURLConnection conn)
    {
      String ua = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/536.5 (KHTML, like Gecko) Chrome/19.0.1084.56 Safari/536.5";
      conn.setRequestProperty("User-Agent", ua);
      conn.setRequestProperty("Accept-Language", "en-US,en;q=0.8");
      conn.setRequestProperty("Accept-Charset", "ISO-8859-1,utf-8;q=0.7,*;q=0.3");
      conn.setRequestProperty("Connection", "keep-alive");
      conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
    }
    
    public void readString(){
      
      //for(int i=0;i<html
      
      fill(255);
      for(int i=0;i<lines.size();i++){
        String s = lines.get(i);
        
        text(s,40,40+10*i);
      }
      
    };
    
    public void getLinks(){
      counter = 0;
      if(!textScanned){
      for(int i=0;i<html.length() - 4;i++){
        char h = html.charAt(i);
        char t = html.charAt(i+1);
        char t_ = html.charAt(i+2);
        char p = html.charAt(i+3);
        
        if(h=='h'&&t=='t'&&t_=='t'&&p=='p'){
          counter = i;
          
          findEnd(i);
          }
          if(i==html.length() - 5) textScanned = true;
      }}
      
      if(textScanned)println(links.size());
      
      
      
    };
    
    public void findEnd(int i){
      
      for(int j=i+3;j<html.length();j++){
            char end = html.charAt(j);
            if(end=='>'){
              links.add(html.substring(counter,j));break;
            }}
    };
    
    public void displayLinks(){
      
      for(int i=0;i<links.size();i++){
        String s = links.get(i);
        fill(255);
        text(s,10,50 + 10 * i);
      }
      
    };
  
};



class Image extends Grid {

  ArrayList<PImage> images = new ArrayList<PImage>();
  ArrayList<ArrayList<PImage>> segmentations = new ArrayList<ArrayList<PImage>>();
  boolean dotp, maxp, minp, kmeans, colour, bw, rgb;
  HashMap<Integer, Integer> processCount = new HashMap<Integer, Integer>();
  PImage image;

  Image(ArrayList<PImage> image, float threshold) {

    for (int i=0; i<image.size(); i++) {
      images.add(image.get(i));
    }
  };

  Image(PImage image ) {
    images.add(image);
  };

  public void init() {
    if (!init) {
      for (int i=0; i<image.height; i++) {
        for (int j=0; j<image.width; j++) {
        }
      }
    }
  };

  public void rescale() {
  };

  public void process(Float[]Kernel) {

    int ky = Kernel.length;


    for (int i=0; i<images.size(); i++) {

      PImage p = images.get(i);
      p.loadPixels();

      for (int y=0; y<p.height; y++) {
        for (int x=0; x<p.width; x++) {
        }
      }
      p.updatePixels();
    }
  };

  public void process(float[][]Kernel) {

    for (int i=0; i<images.size(); i++) {

      PImage p = images.get(i);
      PImage p2 =  createImage(p.width, p.height, RGB);
      p2.loadPixels();
      for (int y=0; y<p.height; y++) {
        for (int x=0; x<p.width; x++) {

          if (bw)pixels[x+y*image.width] = convolveB(x, y, Kernel);
          else if (rgb)pixels[x+y*image.width] = convolveRGB(x, y, Kernel);
          else if (kmeans)pixels[x+y*image.width] = kmeans(x, y, Kernel);
          else if (maxp)pixels[x+y*image.width] = maxPooling(x, y, Kernel);
          else if (minp)pixels[x+y*image.width] = minPooling(x, y, Kernel);
          else if (dotp)pixels[x+y*image.width] = dotPooling(x, y, Kernel);
        }
      }

      p2.updatePixels();
      ArrayList<PImage> convolution = new ArrayList<PImage>();

      if (segmentations.size()<i) {
        convolution.add(p2);
        segmentations.add(convolution);
      } else segmentations.set(i, convolution);

      if (processCount.get(i)==null)processCount.put(i, segmentations.get(i).size());
      else processCount.replace(i, segmentations.get(i).size());
    }
  };

  public int kmeans(int x, int y, float[][] kernel) {
    int sy = y-floor(kernel.length/2);
    int sx = x-floor(kernel[0].length/2);

    int ey = y+floor(kernel.length/2); 
    int ex = x+floor(kernel[0].length/2);

    int c = color(0);

    for (int i=sy; i<ex; i++) {
      for (int j=sx; j<ey; j++) {

        //if(brightness(image.pixels[i+j*image.width])>c)c = brightness(image.pixels[i+j*image.width]);
      }
    }

    return c;
  };

  public int maxPooling(int x, int y, float[][] kernel) {
    int sy = y-floor(kernel.length/2);
    int sx = x-floor(kernel[0].length/2);

    int ey = y+floor(kernel.length/2); 
    int ex = x+floor(kernel[0].length/2);

    int c = color(0);

    for (int i=sy; i<ex; i++) {
      for (int j=sx; j<ey; j++) {

        if (brightness(image.pixels[i+j*image.width])>c)c = PApplet.parseInt(brightness(image.pixels[i+j*image.width]));
      }
    }

    return c;
  };

  public int minPooling(int x, int y, float[][] kernel) {

    int sy = y-floor(kernel.length/2);
    int sx = x-floor(kernel[0].length/2);

    int ey = y+floor(kernel.length/2); 
    int ex = x+floor(kernel[0].length/2);

    int c = color(255);
    int count = 0;

    for (int i=sy; i<ex; i++) {
      for (int j=sx; j<ey; j++) {

        if (brightness(image.pixels[i+j*image.width])<c)c = PApplet.parseInt(brightness(image.pixels[i+j*image.width]));
      }
    }

    c /= count;

    return c;
  };

  public int avPooling(int x, int y, float[][] kernel) {
    int sy = y-floor(kernel.length/2);
    int sx = x-floor(kernel[0].length/2);

    int ey = y+floor(kernel.length/2); 
    int ex = x+floor(kernel[0].length/2);

    int c = color(0);
    int count = 0;

    for (int i=sy; i<ex; i++) {
      for (int j=sx; j<ey; j++) {

        c+= brightness(image.pixels[i+j*image.width]);
      }
    }

    c /= count;

    return c;
  };

  public int dotPooling(int x, int y, float[][] kernel) {

    int sy = y-floor(kernel.length/2);
    int sx = x-floor(kernel[0].length/2);

    int ey = y+floor(kernel.length/2); 
    int ex = x+floor(kernel[0].length/2);

    int c = color(0);

    for (int i=sy; i<ex; i++) {
      for (int j=sx; j<ey; j++) {

        c+= brightness(image.pixels[i+j*image.width]);
      }
    }

    return c;
  };

  public int convolveB(int x, int y, float[][] kernel) {

    int sy = y-floor(kernel.length/2);
    int sx = x-floor(kernel[0].length/2);

    int ey = y+floor(kernel.length/2); 
    int ex = x+floor(kernel[0].length/2);

    int c = color(0);

    for (int i=sy; i<ex; i++) {
      for (int j=sx; j<ey; j++) {

        c+= brightness(image.pixels[i+j*image.width]);
      }
    }

    return c;
  };

  public int convolveRGB(int x, int y, float[][] kernel) {

    int sy = y-floor(kernel.length/2);
    int sx = x-floor(kernel[0].length/2);

    int ey = y+floor(kernel.length/2); 
    int ex = x+floor(kernel[0].length/2);

    int c = color(0);

    for (int i=sy; i<ex; i++) {
      for (int j=sx; j<ey; j++) {

        c+= image.pixels[i+j*image.width];
      }
    }

    return c;
  };

  public int hog(int x, int y, float[][] kernel) {

    int sy = y-floor(kernel.length/2);
    int sx = x-floor(kernel[0].length/2);

    int ey = y+floor(kernel.length/2); 
    int ex = x+floor(kernel[0].length/2);

    int c = color(0);

    for (int i=sy; i<ex; i++) {
      for (int j=sx; j<ey; j++) {

        c+= image.pixels[i+j*image.width];
      }
    }

    return c;
  };
};
class GridImg extends Grid {

  String []imgboxLabels = {"Normal", "Hide", "Graph", "Attractor", "Forward", "Backwards", 
    "Pause", "Heading", "Save", "Load", "Contour", "Mouse", "Reset", 
    "Populate Boundaries", "Spawn Entities", "Debug"};
  Menu imgbox;

  GridImg() {
  };

  GridImg(float xx, float yy, int ww, int hh, ArrayList<PImage> Images) {

    x = xx;
    y = yy;
    xback = x;
    yback = y;
    w = ww;
    h = hh;
    rows = ww;
    cols = hh;
    bordersize = 1;
    images = Images;
    Cols = cols;
    Rows = rows;
    img = images.get(0);
    squares2 = new Grid_space[rows][cols];

    imgbox = new Menu(W-90, H/2, 70, imgboxLabels);
    imgbox.draggable = true;

    Button btn73 = imgbox.items.get(9);

    imgbox.items.get(9).submenu = new Menu(btn73.x, btn73.y, btn73.w, btn73.h);

    for (int i=0; i<images.size(); i++) {

      Button a =  new Button(btn73.x-btn73.w, btn73.y - 20 * i, imgbox.w, 20, str(i));
      a.id = i;
      a.parent = imgbox.items.get(9).submenu;
      buttons.add(a);
      a.parent = imgbox.items.get(9).submenu;
      imgbox.items.get(9).submenu.items.add(a);
    }
    //search = new Window( 50,50,200,100,"C:\\Users\\paul goux\\");
    //search.launchable = false;
  };

  public void save() {
  };

  public void load() {
  };

  public void img_init() {

    if (img!=null&&!init) {
      imrows = img.height;
      rows = img.height;
      cols = img.width;
      imcols = img.width;
      imw = img.width;
      imh = img.height;
      totalpixels = imrows*imcols;
    }
    if (toggle&&img!=null) {

      if (imsquares.size()<rows*cols) {
        for (int yy = 0; yy < img.height; yy++) {
          for (int xx = 0; xx< img.width; xx++) {

            int num = xx + yy * img.width;

            Grid_space a = new Grid_space(x+xx, y+yy, 1, 1, num, xx, yy);
            a.col = img.pixels[xx + yy * img.width];
            a.col2 = a.col;
            a.col3 = a.col;
            a.col4 = a.col;
            a.col5 = a.col;
            a.parent = this;
            a.image = true;
            imsquares.add(a);
          }
        }
      } else init = true;
    }

    if (imreset) init = false;
  };

  public void img_functions() {

    fill(255);
    kernel_modifier();
    //imgopen();
    img_init();
    img_draw();
  };

  public void img_draw() {

    if (img!=null&&toggle) {
      imgbox.draw();
      imgsliderList.draw();
      imgreset = false;
      if (normal_img) draw_img();
      if (mouse_img) draw_imgmouse();
      imgreset = false;
      if (blur_img) draw_imgblur();
      imgreset = false;
      if (linedetect_img) draw_imglinedetect();
      imgreset = false;
      if (dot_img) draw_imgdot();
      imgreset = false;
      if (bright) draw_brightness();
      imgreset = false;
      if (sharp) draw_sharpness();
      imgreset = false;
      if (!normal_img&&!mouse_img&&!blur_img&&!linedetect_img&&!dot_img&&!bright&&!sharp||!imtoggle) convolved = false;
      if (imgsliderList.menu.sltoggle) convolved = false;
    }
  };

  public void draw_img() {

    float count = 0;
    if (!reset) {
      img.loadPixels();
      for (int i=1; i<imsquares.size(); i++) {
        Grid_space a = imsquares.get(i);
        img.pixels[a.id] = color(a.col);

        if (count == imsquares.size()-1) reset = true;
      }
      img.updatePixels();
    }

    image(img, 23, y, img.width, img.height);
  };

  public void move() {
  }

  public void draw_imgblur() {
  };

  public void set(PImage a) {

    img = a;
    img1 = a;
  };

  public void draw_imgmouse() {
    img.loadPixels();
    //img1.loadPixels();
    for (int i=1; i<imsquares.size(); i++) {
      Grid_space a = imsquares.get(i);

      float d = dist(a.x, a.y, mouseX, mouseY);
      float m = map(d, 0, mdist, 255, 0);

      float r = red(a.col2);
      float g = green(a.col2);
      float b = blue(a.col2);
      img.pixels[a.id] = color(r, g, b, m);
      //img1.pixels[a.id] = a.col2;
    }
    img.updatePixels();
    //img1.updatePixels();
    image(img, x, y, imw, imh);
  };

  public void draw_imglinedetect() {
    int count = 0;
    if (imgsliderList.menu.sltoggle) convolved = false;  
    if (!convolved) {
      img.loadPixels();
      //img1.loadPixels();
      fill(255);
      text(hkernel1d[0], 1000, 600);
      for (int i=0; i<imsquares.size(); i++) {

        Grid_space a = imsquares.get(i);

        float temp_color = 0;

        if (!a.neighboured)a.get_neighbours(this);

        for (int j=0; j<a.kernel1d.length; j++) {

          Grid_space a1 = a.kernel1d[j];
          float c = hkernel1d[j];
          float d = vkernel1d[j];
          float left = difflkernel1d[j];
          float right = diffrkernel1d[j];
          float up = diffukernel1d[j];
          float down = diffdkernel1d[j];

          if (a1!=null) {
            temp_color += c * color(a1.col3);
            temp_color += d * color(a1.col3);
            temp_color += left * color(a1.col3);
            temp_color += right * color(a1.col3);
            temp_color += down * color(a1.col3);
            temp_color += up * color(a1.col3);
          }
        }
        count ++;

        temp_color /=5;

        if (temp_color>threshold) {
          img.pixels[a.id] = color(255);
        } else {
          img.pixels[a.id] = color(0);
        }
        //img1.pixels[a.id] = a.col3;
        if (count==totalpixels)convolved = true;
      }
      img.updatePixels();
      //img1.updatePixels();
    }
    image(img, x, y, img.width, img.height);
  };

  public void img_workflow() {

    if(workflow!=null)workflow.displayList();
    if (workflow.done) {
      for (int i=0; i<workflow.tasks.size(); i++) {

        String task = workflow.tasks.get(i);

        Class  aClass = Grid.class;
        Method method = null;
        try {

          method = aClass.getMethod("task", null);
        }
        catch (NullPointerException e) {
        }
        catch (NoSuchMethodException e) {
        }
      }
    }
  };

  public void imgopen() {
    if (menu) {

      //search.toggle=true;
      //search.display_grid();
      if (mousePressed)link = search.currentf;
      if (link!=null) {

        if (link.endsWith("jpg")|| link.endsWith("jpeg") ||link.endsWith("png")||link.endsWith("bmp")||
          link.endsWith("gif")||link.endsWith("JPG")||link.endsWith("JPEG")||link.endsWith("PNG")||
          link.endsWith("BMP")||link.endsWith("GIF")) {

          //if (imgtemp==null||updateimage)
          img = loadImage(link);

          //image(img,100,200);
          imsquares = new ArrayList<Grid_space>();
          im_init = false;
          link = null;
        }
      }
    } 
    //else search.toggle=false;
  };

  public void draw_brightness() {
    int count = 0;
    if (!convolved) {
      img.loadPixels();
      for (int i=0; i<imsquares.size(); i++) {

        Grid_space a = imsquares.get(i);

        float temp_color = 0, bright = 255;

        float r = red(a.col4);
        float g = green(a.col4);
        float b = blue(a.col4);

        if (!a.neighboured)a.get_neighbours(this);
        if (count==0)a.convolved = false;
        //if(!a.convolved){

        for (int j=0; j<a.kernel1d.length; j++) {

          Grid_space a1 = a.kernel1d[j];
          float left = difflkernel1d[j];
          float right = diffrkernel1d[j];
          float up = diffukernel1d[j];
          float down = diffdkernel1d[j];

          if (a1!=null) {
            bright += brightness(a1.col4)*left;
            bright += brightness(a1.col4)*right;
            bright += brightness(a1.col4)*up;
            bright += brightness(a1.col4)*down;
          }
        }
        count ++;
        if (bright>threshold)img.pixels[a.id] = color(255);
        else img.pixels[a.id] = color(0);
        if (count==imsquares.size()-1)convolved = true;
      }

      img.updatePixels();
    }
    image(img, x, y, img.width, img.height);
  };

  public void draw_sharpness() {
    int count = 0, c2 = 0;
    if (!convolved) {
      img.loadPixels();

      for (int i=0; i<imsquares.size(); i++) {

        Grid_space a = imsquares.get(i);

        float r = 0, g =0, b = 0;

        //float r = red(a.col5),g = green(a.col5),b = blue(a.col5);

        if (!a.neighboured)a.get_neighbours(this);
        if (count==totalpixels)convolved = true;
        for (int j=0; j<a.kernel1d.length; j++) {

          Grid_space a1 = a.kernel1d[j];
          float c = hkernel1d[j];
          float d = vkernel1d[j];

          if (a1!=null) {
            r += c*red(a1.col5);
            r += d*red(a1.col5);
            g += c*green(a1.col5);
            g += d*green(a1.col5);
            b += c*blue(a1.col5);
            b += d*blue(a1.col5);
            c2 ++;
          }
          count ++;
        }
        img.pixels[a.id] = color(r, g, b);
        if (count==totalpixels)convolved = true;
      }

      img.updatePixels();
    }
    image(img, x, y, img.width, img.height); 
    if (imgsliderList.menu.sltoggle) convolved = false;
  };

  public void img_refresh() {
    if (!refreshed) {
      img.loadPixels();
      for (int i=1; i<imsquares.size(); i++) {
        Grid_space a = imsquares.get(i);
        //img.pixels[a.id] = a.col;
      }
      img.updatePixels();
      refreshed = true;
    }
  };

  public void draw_imgdot() {

    img.loadPixels();
    for (int i=0; i<imsquares.size(); i++) {
      Grid_space a = imsquares.get(i);
      img.pixels[a.id] = a.col;
      noStroke();
      fill(a.col);
      rect(a.x, a.y, 1, 1);
    }
    img.updatePixels();
  };
};
class Matrix{
  
  int i,j;
  //ArrayList<float> m1,m2;
  float [][] m1,m2,tpose;
  float [] m3,m4;
  
  ArrayList<Matrix> matrices = new ArrayList<Matrix>();
  //ArrayList<Float[]> matrices = new ArrayList<Matrix>();
  float [][]matrix;
  
  
  Matrix(float [][] a){
    m1 = a;
    
  };
  
  Matrix(int xx,int yy,boolean c){
    
    matrix = new float[yy][xx];
    
    if(c){
    for(int i=0;i<yy;i++){
      for(int j=0;j<xx;j++){
        
        matrix[xx][yy] = random(-1,1);
        
    }}}
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  //---------------------------dot product------------------
  public float[][] dot(float [][] a,float [][]  b){
    
      int x = a.length;
      int y = b.length;
      int z = b[0].length;
      float [][]temp = new float[x][z];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
               for (int k=0;k<z;k++){
                   
      temp[i][j] += a[i][k] * b[j][k];
               }}}
      m1 = temp;
      return m1;
  };
  
  public float[] dot(float [] a,float []  b){
    
      int x = a.length;
      int y = b.length;
      float []temp = new float[x];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
                   
               }}
               
      m3 = temp;
      return m4;
  };
  
  public PVector dot(PVector t, PVector u){
      
      float [][]a = {{t.x,t.y,t.z}};
      float [][]b = {{u.x,u.y,u.z}};
    
      int x = a.length;
      int y = b.length;
      int z = b[0].length;
      float [][]temp = new float[x][z];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
               for (int k=0;k<z;k++){
                   
      temp[i][j] += a[i][k] * b[j][k];
               }}}
      m1 = temp;
      PVector result = new PVector(m1[0][0],m1[0][1],m1[0][2]);
      return result;
  };
  
  
  //--------------------cross product-----------------------
  public float[][] cross(float [][] a,float [][]  b){
    
    return a;
  };
  
  //-------------matrix multiplyer------------------
  public float[][] mult(float [][] a,float [][]  b){
      int x = a.length;
      int y = b[0].length;
      float [][]temp = new float[x][y];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
                   
      temp[i][j] += a[i][j] * b[i][j];
               }}
      m1 = temp;
      return m1;
  };
  
  public float mult(float a, float b){
    a = a * b;
    return a;
  };
  
  public float[][] mult(float[][] a, float b){
      int x = a.length;
      int y = a[0].length;
      float [][]temp = new float[x][y];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
                   
      temp[i][j] += a[i][j] * b;
               }}
      m1 = temp;
      return m1;
  };
  
  public float[][] add(float [][] a,float [][]  b){
    int x = a.length;
      int y = a[0].length;
      float [][]temp = new float[x][y];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
                   
      temp[i][j] += a[i][j] + b[i][j];
               }}
      m1 = temp;
      return m1;
  };
  
  //------------------------------------------
  public float[][] add(float [][] a,float  b){
    int x = a.length;
      int y = a[0].length;
      float [][]temp = new float[x][y];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
                   
      temp[i][j] += a[i][j] + b;
               }}
      m1 = temp;
      return m1;
  };
  
  public float[][] translate(float [][] a,float b){
    
      int x = a.length;
      int y = a[0].length;
      float [][]temp = new float[x][y];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
                   
      temp[i][j] += a[i][j] + b;
               }}
      m1 = temp;
      return m1;
  };
  
  public float[][] transpose(float[][] a){
      int x = a.length;
      int y = a[0].length;
      float [][]temp = new float[y][x];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
                   
      temp[i][j] += a[j][i] ;
               }}
      tpose = temp;
      return tpose;
  };

  public void transposeFlat(){




  };
  
  public void determinant(){
    
    //return a;
  }
  
  public float[][] substract(float [][] a,float [][]  b){
    int x = a.length;
      int y = a[0].length;
      float [][]temp = new float[x][y];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
                   
      temp[i][j] += a[i][j] - b[i][j];
               }}
      m1 = temp;
      return m1;
  };
  
  public float[][] randomize(float[][] a){
    
    return a;
  };
  
};
class Menu {

  int id, item, t, toggle, toggle2, type = 0, index =-1, subindex = -1, t2, sindex=-1, counter, slcount,nindex = -1;
  public float x, y, bx = x, by = y, w, h, xoff, yoff, window = 0, htotal, Yoff, xpos, ypos, tsize = 12, bsize, spacing, twidth;
  PVector mouse,mousePos =new PVector(0,0);
  public String label, blabel;
  float dx,dy;
  boolean drag = false, resize = false, slide = false, visible = true, border = false, menu, menuhover = false, highlightable = true, animate, vertical, horizontal = false, dmenu,show = true;
  boolean mdown, mup, smdown, smup, listbox, open_menu, sltoggle, free,parentRight,draggable,parentCanvas;
  ArrayList<Button> items = new ArrayList<Button>();
  ArrayList<Slider> sliders = new ArrayList<Slider>();
  ArrayList<Dropdown> dMenus = new ArrayList<Dropdown>();
  ArrayList<Boolean> child = new ArrayList<Boolean>();
  ArrayList<String> labels = new ArrayList<String>();
  HashMap<String, Boolean> values ;
  Window mWindow = null;
  Button parent;
  tab tab;
  PGraphics localCanvas;
  tab parentTab;
  //Menu dmenu;
  Dropdown dMenu;

  Menu link;
  int col = color(0,150), bcol, tcol = color(255), fcol = color(255, 80), hcol = color(255, 50);

  public Menu() {
  };

  Menu(float xx, float yy, float ww, float hh, String Label) {
    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = hh;
    label = Label;
    xoff = 0;
    yoff = 0;
    toggle =0;
    bcol = col;
    bsize = tsize;
  }

  Menu(float xx, float yy, float ww, float hh) {
    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = hh;
    xoff = 0;
    yoff = 0;
    toggle =0;
    bcol = col;
    bsize = tsize;
  }

  Menu(float xx, float yy, float ww, float hh, String Label, String [] list) {

    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = hh;
    xoff = 0;
    yoff = 0;
    label = Label;
    toggle =0;
    bcol = col;
    bsize = tsize;
    slide = true;
    float bwidth = 0;

    for (int i =0; i<list.length; i++) {
      String l = list[i];

      if (textWidth(l)+20>bwidth)bwidth = textWidth(l)+20;
      Button a = new Button( x, y + 20 *(i+1), bwidth, h, l);
      a.border = false;
      a.parent = this;
      items.add(a);
    }
    twidth = bwidth*items.size();
  };

  Menu(float xx, float yy, float ww, float hh, String Label, String [] list, int n) {
    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = hh;
    xoff = 0;
    yoff = 0;
    label = Label;
    toggle =0;
    bcol = col;
    bsize = tsize;
    slide = true;
    float bwidth = 0;
    spacing = 0;
    for (int i =0; i<list.length; i++) {
      String l = list[i];

      if (textWidth(l)+20>bwidth)bwidth = textWidth(l)+20;
    }
    
    if(w>bwidth)bwidth = w;

    for (int i =0; i<list.length; i++) {
      String l = list[i];

      Button a = new Button( x, y + 20 *(i+1), bwidth, h, l);
      a.border = false;
      a.parent = this;
      a.togglebox = true;
      items.add(a);
    }

    twidth = bwidth*items.size();
  };

  Menu(float xx, float yy, float ww, String [] list) {
    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;

    h = list.length*20;
    xoff = 0;
    yoff = 0;
    toggle =0;
    bcol = col;
    bsize = tsize;
    //slide = true;

    float bwidth = 0;

    for (int i =0; i<list.length; i++) {
      String l = list[i];

      if (textWidth(l)+20>bwidth)bwidth = textWidth(l)+20;
    }

    for (int i =0; i<list.length; i++) {
      String l = list[i];
      Button a = new Button( x, y + 20 *(i), bwidth, 20, l);
      a.border = false;
      a.parent = this;
      a.togglebox = true;
      items.add(a);
    }

    twidth = bwidth*items.size();
    w = bwidth;
  };



  Menu(float xx, float yy, float ww, ArrayList<String> list) {
    x = xx;
    y = yy;
    w = ww;

    h = list.size()*20;
    xoff = 0;
    yoff = 0;
    toggle =0;
    bcol = col;
    bsize = tsize;
    //slide = true;

    float bwidth = 0;

    for (int i =0; i<list.size(); i++) {
      String l = list.get(i);

      if (textWidth(l)+20>bwidth)bwidth = textWidth(l)+20;
    }

    for (int i =0; i<list.size(); i++) {
      String l = list.get(i);

      Button a = new Button( x, y + 20 *(i), bwidth, 20, l);
      a.border = false;
      a.parent = this;
      a.togglebox = true;
      items.add(a);
    }

    twidth = bwidth*items.size();
    w = bwidth;
  };

  Menu(float xx, float yy, float ww, String [] list, float k) {

    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = list.length*(20+k) - k;
    xoff = 0;
    yoff = 0;
    toggle =0;
    bcol = col;
    bsize = tsize;
    spacing = k;

    float bwidth = 0;

    for (int i =0; i<list.length; i++) {
      String l = list[i];

      if (textWidth(l)+20>bwidth)bwidth = textWidth(l)+20;
    }

    for (int i =0; i<list.length; i++) {
      String l = list[i];
      Button a = new Button( x, y + (20+k) *(i), bwidth, 20, l);
      a.border = false;
      a.parent = this;
      a.togglebox = true;
      items.add(a);
    }

    twidth = bwidth*items.size();
    w = bwidth;
  };

  Menu(float xx, float yy, String [] list) {
    
    x = xx;
    y = yy;
    bx = x;
    by = y;
    h = list.length*(20);
    xoff = 0;
    yoff = 0;
    toggle =0;
    bcol = col;
    bsize = tsize;

    float bwidth = 0;

    for (int i =0; i<list.length; i++) {
      String l = list[i];

      if (textWidth(l)+20>bwidth)bwidth = textWidth(l)+20;
    }

    for (int i =0; i<list.length; i++) {
      String l = list[i];
      Button a = new Button( x, y + (20) *(i), bwidth, 20, l);
      a.border = false;
      a.parent = this;
      a.togglebox = true;
      items.add(a);
    }

    twidth = bwidth*items.size();
    w = bwidth;
  };

  Menu(String k, float xx, float yy, float ww, String dir) {
    if (k=="dir"|| k=="DIR"||k=="Dir") {
      x = xx;
      y = yy;
      bx = x;
      by = y;
      w = ww;

      xoff = 0;
      yoff = 0;
      toggle =0;
      bcol = col;
      bsize = tsize;

      String []list = listFileNames(dir);

      for (int i =0; i<list.length; i++) {

        String l = list[i];
        for (int j=0; j<list[i].length(); j++) {
          Button a = new Button( x, y + 20 *(i), w, 20, l);
          a.border = false;
          a.togglebox = true;
          a.parent = this;
          items.add(a);
        }
      }
    }

    h = items.size()*20;
    Slider s = new Slider(x, y, 20, 20);
    s.vertical = true;
    sliders.add(s);
  };

  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void setParentCanvas(PGraphics canvas){
    parentCanvas = true;
    localCanvas = canvas;
    
  };

  public void draw() {
    logic();
    if(show)trace();
    
  };
  
  public void draw(PGraphics canvas) {
    logic(mouse);
    if(show)trace();
    
  };

  public void drawWindow() {
  }

  public void trace() {
    t2 = 0;
    slcount = 0;

    if(!parentCanvas)getState();
    else getState(mouse);

    drawButtons();
    drawDmenu();
    drawSliders();

    if (draggable) {
      if(!parentCanvas){
        stroke(0);
        fill(0,266,0,150);
        rect(x,y-5, w, 5);
      }else{
        localCanvas.stroke(0);
        localCanvas.fill(0,150);
        localCanvas.rect(x,y-5, w, 5);
      }
    }
  };

  public void getState() {

    stroke(0);
    if (!border)noStroke();

    //if(toggle==1){
      fill(bgcol);
      if (visible)rect(x, y, w, h);
      fill(col);
      if (visible)rect(x, y, w, h);
      fill(0);
    //}

    if(label!=null) {
      fill(tcol);
      textSize(bsize);
      text(label, x+xoff, y+yoff + 18);
      textSize(12);
      //fill(col);
    } else {
      toggle = 1;
    }

    
  };
  
  public void getState(PVector m) {
    while (items.size()!=child.size()) {
      child.add(false);
    }
    localCanvas.stroke(0);
    if (!border)localCanvas.noStroke();

    localCanvas.fill(bgcol);
    if (visible)localCanvas.rect(x, y, w, h);
    localCanvas.fill(col);
    if (visible)localCanvas.rect(x, y, w, h);
    localCanvas.fill(0);

    if(label!=null) {
      localCanvas.fill(tcol);
      localCanvas.textSize(bsize);
      localCanvas.text(label, x+xoff, y+yoff + 18);
      localCanvas.textSize(12);
      //fill(col);
    } else {
      toggle = 1;
    }
  };

  public void drawButtons() {
    
    float speed = 2;
    if (items.size()>0) {
      for (int i=0; i<items.size(); i++) {

        Button a = items.get(i);
        a.id = i;

        if(parentCanvas)mousePos = mouse;
        if(parentTab!=null)a.parentTab = parentTab;
        
        if (a.parent!=null&&label==null&&!horizontal){
          a.y = a.parent.y + i * (a.h + spacing);
          a.x = a.parent.x;
        }
        
        if (a.parent!=null&&label!=null&&!horizontal&&!free){
          a.y = a.parent.y + 20 + i * (a.h + spacing);
          a.x = a.parent.x;
        }
        
        if (a.parent!=null&&label==null&&horizontal) {
          a.x = a.parent.x + (a.parent.w + spacing) + i * a.w;
          a.y = y;
        }
        if(a.submenu!=null){
          if(!a.submenu.parentRight){
            a.submenu.x = a.x + a.w;
            a.submenu.y = a.y;
          }else{
            a.submenu.x = a.x - a.submenu.w;
            a.submenu.y = a.y;
          }
        }

        if(a.dMenu!=null){
          a.dMenu.x = a.x + a.w;
          a.dMenu.y = a.y;
        }

        if (toggle==1) {
          if (a.pos(mousePos)&&i>=0) {
            t2 ++;
            index = i;
          }
          if (a.subpos(mousePos)&&i>=0) {
            t2 ++;
            subindex = a.id;
          }}

        if (!slide) {
          if (toggle==1)window = y+20*(items.size()+1);
          else window = 0;
        } else {
          if (toggle==1) {
            window += speed;

            if (!horizontal) {
              if (window>y + 20*items.size()) window = y+20*items.size();
            } else {
              if (window>x + a.w*items.size())window = x+a.w*items.size();
            }} else {
            window -= speed;
            if (window<0)window = 0;
          }}

        if (!horizontal) {
          if (y + window >= a.y) {
            if (a.visible){
            if(!parentCanvas)a.draw();
            else {
              a.mouse = mouse;
              a.draw(localCanvas);
            }}
            a.highlight();
            if (a.pos(mousePos)&&!parentCanvas)leftdown = true;
            if (parentCanvas&&a.pos(mousePos))leftdown = true;
            else leftdown = false;
          }
        } else {
          if (x + window >= a.x) {
            if (a.visible){
            if(!parentCanvas)a.draw();
            else {
              a.mouse = mouse;
              a.draw(localCanvas);
            }
            }
            a.highlight();
            if (a.pos(mousePos)&&!parentCanvas)leftdown = true;
            if (parentCanvas&&a.pos(mousePos))leftdown = true;
            else leftdown = false;
          }}}}
    
  };

  public void drawDmenu() {
    float speed = 2;
    if (dMenus.size()>0) {
      
      }
  };
  
  public void add(Slider s,float spacing){
    
    sliders.add(s);
    
    if(items.size()==0)h = (s.h+spacing)*sliders.size();
    else h = (items.get(0).h+spacing)*items.size()+(s.h+spacing)*sliders.size();
  };
  
  public void add(Slider s){
    
    sliders.add(s);
    
    if(items.size()==0)h = (s.h+spacing)*sliders.size();
    else h = (items.get(0).h+spacing)*items.size()+(s.h+spacing)*sliders.size();
  };
  
  public void add(Button b){
    
    items.add(b);
    
    if(sliders.size()==0)h = (b.h+spacing)*items.size();
    else h = (sliders.get(0).h+spacing)*sliders.size()+(b.h+spacing)*items.size();
  };

  public void drawSliders() {
    float speed = 2;
    
    if (sliders.size()>0) {

      if (pos4()) {
        //toggle=1;
        //menuhover = true;
      } else menuhover = false;
      
      for (int i=0; i<sliders.size(); i++) {

        Slider a = sliders.get(i);
        if(parentCanvas)a.mouse = mouse;
        if(parentTab!=null)a.parentTab = parentTab;
        //else a.mouse = new PVector(mouseX,mouseY);
        if (a.toggle||a.mdown) slcount ++;
        a.parent = this;
        if (a.id==-1)a.id = i;
        if (horizontal) { 
          a.vertical = true; 
          a.y = y; 
          a.x = x + a.w + spacing * i;
        }else{
          a.y = y + (a.h + spacing) * i; 
          a.x = x;
        }
        if(!parentCanvas){
        if ((a.pos()||a.btnpos())&&!smdown) {
          smdown = true;
          sindex = i;
          a.mdown = true;
        }}else if ((a.pos(mouse)||a.btnpos(mouse))&&!smdown) {
          smdown = true;
          sindex = i;
          a.mdown = true;
        }
        if(sindex!=i)a.mdown = false;
        if (!mousePressed&&smdown) { 
          smdown = false;
          a.mdown = false;
        }
        if (!slide) {
          if (toggle==1) {
            if (vertical)window = y + spacing * (sliders.size());
            else window = x + spacing * (sliders.size());
          }} else {
          if (toggle==1) {
            window += speed;
            if (vertical) {
              if (window>y + 20 * sliders.size()) {
                window = y + 20 * sliders.size();
              }} else {
              if (window>x + 20 * sliders.size()) {
                window = x + 20 * sliders.size();
              }}} else {
            window -= speed;
            if (window<=0) window = 0;
            
          }}
        if (vertical) {
          
          if (y + window >= a.y){
            
            if (a.visible){
            if(!parentCanvas)a.draw();
            else a.draw(localCanvas);
            }}} else {
          if (x + window >= a.x){

            if (a.visible){
            if(!parentCanvas)a.draw();
            else a.draw(localCanvas);
            }}}}
    }
    if (slcount>0) sltoggle = true;
    else sltoggle = false;
    
  };

  public void borders(Boolean k) {
    for (int i=0; i<items.size(); i++) {
      Button b = items.get(i);

      b.border = k;
    }
  };

  public void update() {
    counter = 0;
    for (int i=0; i<items.size(); i++) {

      Button a = items.get(i);
      if (a.pos()) counter++;
    }
  };

  public void setBorders(Boolean a) {
    for (int i=0; i<items.size(); i++) {
      Button b = items.get(i);

      b.border = a;
    }
  };

  public void logic() {

    mousePos = new PVector(mouseX,mouseY);
    
    if(mouse!=null) mousePos = mouse;
    if(index>-1&&subindex==-1&&!pos()&&mousePressed)index = -1;
    if (mWindow!=null)y = sliders.get(0).valuey;
    if (highlightable) {
      if (pos(mousePos)) col = hcol;
      else col = fcol;
    }

    if (toggle==1)col = hcol;
    else col = fcol;

    if ((pos()||toggle==1)) open_menu = true;
    else open_menu = false;
    if (draggable&&dpos()&&mousePressed&&!drag&&!mdown) {
      mdown = true;
      drag = true;
      dx = mouseX - x;
      dy = mouseY - y;
    }
    
    if(drag){
      x = mouseX - dx;
      y = mouseY - dy;
      
      for (int i=0;i<items.size();i++){
        Button b = items.get(i);
        b.x = x;
      }}
    
    Float X = PApplet.parseFloat(mouseX - pmouseX);
    Float Y = PApplet.parseFloat(mouseY - pmouseY);

    if (!mousePressed) {
      mdown = false;
      mup = true;
      drag = false;
    }

    if (t2>0)menuhover = true;
    else menuhover = false;
    
    if (!pos()) {
      if (mousePressed&&!menu&&file.items.get(6).toggle!=1&&!menuhover&&sliders.size()==0) {
        toggle=0;
        subindex = -1;
        index = -1;
      }}

    if(index>-1&&subindex>-1&&items.get(subindex).submenu!=null&&items.get(subindex).submenu.parentRight){
          //if( index>-1&&subindex>-1&&items.get(subindex).pos()&&!items.get(subindex).subpos())subindex = -1;
        }else if(index>-1&&subindex>-1&&items.get(subindex).submenu!=null){
          if( index>-1&&subindex>-1&&items.get(subindex).pos()&&!items.get(subindex).subpos())subindex = -1;
        }
    if (subindex!=index&&subindex!=-1&&items.size()>0&&sliders.size()==0)index = -1;
    

    if (items.size()>0&&index>=0&&toggle==1) {
      Button a = items.get(index);
      a.highlight2();
    }

    if (type==2) {
      toggle=1;
      if (sliders.size()>0&&sindex>=0&&smdown) {

        Slider b = sliders.get(sindex);
        
          b.mouseFunctions();
          if (b.btnpos()||b.pos()||b.mdown)b.btnh = b.h+5;
          if (!b.mdown) b.btnh = b.h;
          if (b.btnpos()||b.pos()||b.mdown)b.mouseFunctions();
        }
        
      if (sliders.size()>0&&sindex>=0&&!smdown) {
        Slider b = sliders.get(sindex); 
        b.btnh = b.h+2;
      }}

    if (items.size()>0&&subindex>=0&&subindex==index&&toggle==1&&sliders.size()==0) {
      Button a = items.get(subindex);

      if (a.submenu!=null&&a.id==subindex) {

        if (a.submenu.pos2()||a.submenu.menu)menu = true;
        else menu = false; 

        a.submenu.draw();
      }
      if (a.dMenu!=null&&a.id==subindex) {

        if (a.dMenu.menu)menu = true;
        else menu = false; 

        
        if(a.pos()&&!a.subpos()){}
        else a.dMenu.displayDropdown();
        
      }
    }
    if (!animate) {
      if (pos()||toggle==1) {
        if (bsize<tsize+2) bsize += 0.5f;
      } else if (bsize>tsize&&bsize>2)bsize -= 0.5f;
      }
  };
  
  public void logic(PVector m) {

    mousePos = new PVector(mouseX,mouseY);
    if(mouse!=null) mousePos = mouse;

    if (mWindow!=null)y = sliders.get(0).valuey;
    if (highlightable) {
      if (pos(mouse))col = hcol;
       else col = fcol;
      }

    if (toggle==1)col = hcol;
    else col = fcol;

    if ((pos(m)||toggle==1)) open_menu = true;
    else open_menu = false;
    if (draggable&&dpos(m)&&mousePressed&&!drag&&!mdown) {
      open_menus = true;
      mdown = true;
      drag = true;
      dx = m.x - x;
      dy = m.y - y;
      //mup = false;
    }
    
    if(drag){
      x = m.x - dx;
      y = m.y - dy;
      
      for (int i=0;i<items.size();i++){
        Button b = items.get(i);
        b.x = x;
      }}
      
    if (!mousePressed) {
      mdown = false;
      mup = true;
      drag = false;
    }

    if (t2>0)menuhover = true;
    else menuhover = false;
    
    if (!pos(mouse)) {
      if (mousePressed&&!menu&&file.items.get(6).toggle!=1&&!menuhover&&sliders.size()==0) {
        toggle=0;
        subindex = -1;
        index = -1;
      }}
    if (subindex!=index&&subindex!=-1&&items.size()>0&&sliders.size()==0)index = -1;
    

    if (items.size()>0&&index>=0&&toggle==1) {
      Button a = items.get(index);
      a.highlight2();
    }

    if (type==2) {
      toggle=1;
      if (sliders.size()>0&&sindex>=0&&smdown) {

        Slider b = sliders.get(sindex);
        b.mouseFunctions(m);
        if (b.btnpos(m)||b.pos(m)||b.mdown)b.btnh = b.h+5;
        if (!b.mdown) b.btnh = b.h;
        if (b.btnpos(m)||b.pos(m)||b.mdown)b.mouseFunctions(m);
      }
      if (sliders.size()>0&&sindex>=0&&!smdown) {
        Slider b = sliders.get(sindex); 
        b.btnh = b.h+2;
      }
    }

    if (items.size()>0&&subindex>=0&&subindex==index&&toggle==1&&sliders.size()==0) {
      Button a = items.get(subindex);

      if (a.submenu!=null&&a.id==subindex) {

        if (a.submenu.pos2(m))menu = true;
        else menu = false; 

        a.submenu.draw();
      }
    }
    if (!animate) {
      if (pos(m)||toggle==1) {
        if (bsize<tsize+2)bsize += 0.5f;
      } else if (bsize>tsize&&bsize>0)bsize -= 0.5f;
    }
  };

  public void set_link(Menu a) {

    link = a;
  };

  public boolean pos() {

    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h+1;
  };
  
  public boolean pos(PVector m) {

    return m.x>x&&m.x<x+w&&m.y>y&&m.y<y+h+1;
  };
  
  public boolean pos2() {

    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+20*(items.size());
  };
  public boolean pos2(PVector m) {

    return m.x>x&&m.x<x+w&&m.y>y&&m.y<y+20*(items.size());
  };
  public boolean pos3() {

    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+20*(items.size());
  };
  public boolean pos4() {

    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+20*(sliders.size());
  };

  public void drag() {
  };

  public boolean dpos() {
    return mouseX>x&&mouseX<x+w&&mouseY>y-10&&mouseY<y;
  };
  
  public boolean dpos(PVector m) {
    return m.x>x&&m.x<x+w&&m.y>y-10&&m.y<y;
  };

  public boolean outpos() {
    float X = mouseX;
    float Y = mouseY;
    return (X < x || X > x + w+10) || (Y < y || Y > y + h * (items.size()+1));
  }

  public void click() {
    if (parent==null) {
      if (pos() && mousePressed) {
        toggle++;
      }
      if (toggle==2) {
        toggle = 0;
      }
    } else if (parent.toggle==1) {
      if (pos() && mousePressed) {
        toggle++;
      }
      if (toggle==2) {
        toggle = 0;
      }
    }
  };
  
  public void selfClick(int i, Object o, String b) {
    //Button k = items.get(i);
    //if (link==null)k.selfClick(o, b);
    //else if (link.toggle==1)k.toggle(o, b);
    
  };
  
  public void toggle(int i, String b) {
    Button k = items.get(i);
    //k.toggle(o, b);
    ;
  };

  public void toggle(int i, PApplet o, String b) {
    Button k = items.get(i);
    if (link==null)k.toggle(o, b);
    else if (link.toggle==1)k.toggle(o, b);
    ;
  };
  
  public void toggle(int i, Object o, String b) {
    Button k = items.get(i);
    if(show){
    if (link==null)k.toggle(o, b);
    else if (link.toggle==1)k.toggle(o, b);
    }
    //k.toggle(o, b);
    ;
  };
  
  
  public void toggle2(int i, Object o, String b) {
    Button k = items.get(i);
    if (link==null)k.toggle2(o, b);
    else if (link.toggle==1)k.toggle2(o, b);
    ;
  };

  public void toggle(Menu m, int i, Object o, String b) {
    Button k = items.get(i);
    //if(parent!=null&&parent.toggle==1)
    if (m.toggle==1)k.toggle(o, b);
  };
  
  

  public void self_toggle(int i) {
    Button k = items.get(i);
    if (k.parent.toggle==1)k.self_toggle();
  };

  public void sptoggle(int n, Object a, String b, String [] c) {

    Button k = items.get(n);

    k.sptoggle(a, b, c);
  };

  public void click(int i, Object a, String b) {
    Button k = items.get(i);
    k.click(a, b);
    k.toggle=0;
    if(!mousePressed)k.mdown=false;
  };
  
  public void click(int i, PApplet a, String b) {
    Button k = items.get(i);
    k.click(a, b);
    k.toggle=0;
    if(!mousePressed)k.mdown=false;
  };

  public void slide(float start, float end) {
    sliders.get(0).set(start, end);
  }

  public void set(int a, int b) {
    items.get(a).toggle=b;
  };

  public void set_parent(Button b) {

    parent = b;

    //for(int i=0;i<m.items.size();i++){
    //  Button k = m.items.get(i);

    //}
  };

  public void set_link(int i) {
    Menu m = items.get(i).submenu;

    m.link = this;
  }
};


/*

 Charles Fried - 2017
 ANN Tutorial 
 Part #2
 
 NETWORK
 
 This class is for the neural network, which is hard coded with three layers: input, hidden and output
 
 */
ArrayList connec = new ArrayList();
ArrayList conStr = new ArrayList();

class Network {

  Neuron [] input_layer;
  Neuron [] hidden_layer;
  Neuron [] output_layer;
  int bestIndex = 0;

  Network(int inputs, int hidden, int outputs) {

    input_layer = new Neuron [inputs];
    hidden_layer = new Neuron [hidden];
    output_layer = new Neuron [outputs];

    for (int i = 0; i < input_layer.length; i++) {
      input_layer[i] = new Neuron();
    }

    for (int j = 0; j < hidden_layer.length; j++) {
      hidden_layer[j] = new Neuron(input_layer);
    }

    for (int k = 0; k < output_layer.length; k++) {
      output_layer[k] = new Neuron(hidden_layer);
    }
  };

  public void respond(Card card) {

    for (int i = 0; i < input_layer.length; i++) {
      input_layer[i].output = card.inputs[i];
    }
    // now feed forward through the hidden layer
    for (int j = 0; j < hidden_layer.length; j++) {
      hidden_layer[j].respond();
    }
    for (int k = 0; k < output_layer.length; k++) {
      output_layer[k].respond();
    }
  };

  public void display() {

    drawCon();

    // Draw the input layer
    for (int i = 0; i < input_layer.length; i++) {
      pushMatrix();
      translate(
        (i%14) * height / 20.0f + width * 0.05f, 
        (i/14) * height / 20.0f + height * 0.13f);
      input_layer[i].display();
      popMatrix();
    }

    // Draw the hidden layer
    for (int j = 0; j < hidden_layer.length; j++) {
      pushMatrix();
      translate(
        (j%7) * height / 20.0f + width * 0.53f, 
        (j/7) * height / 20.0f + height * 0.32f);
      hidden_layer[j].display();
      popMatrix();
    }

    // Draw the output layer
    float [] resp = new float [output_layer.length];
    float respTotal = 0.0f;
    for (int k = 0; k < output_layer.length; k++) {
      resp[k] = output_layer[k].output;
      respTotal += resp[k]+1;
    }

    for (int k = 0; k < output_layer.length; k++) {
      pushMatrix();
      translate(
        width * 0.85f, 
        (k%10) * height / 15.0f + height * 0.2f);
      output_layer[k].display();
      fill(150);
      strokeWeight(sq(output_layer[k].output)/2);
      line(12, 0, 25, 0);
      text(k%10, 40, 5);
      text(nfc(((output_layer[k].output+1)/respTotal)*100, 2) + "%", 55, 5);
      popMatrix();
      strokeWeight(1);
    }
    float best = -1.0f;
    for (int i =0; i < resp.length; i++) {
      if (resp[i]>best) {
        best = resp[i];
        bestIndex = i;
      }
    }
    stroke(255, 0, 0);
    noFill();
    ellipse(
      width * 0.85f, (bestIndex%10) * height / 15.0f + height * 0.2f, 
      25, 25);
  };

  public void train(float [] outputs) {
    // adjust the output layer
    for (int k = 0; k < output_layer.length; k++) {
      output_layer[k].setError(outputs[k]);
      output_layer[k].train();
    }
    float best = -1.0f;
    for (int i = 0; i < output_layer.length; i++) {
      if (output_layer[i].output > best) bestIndex = i;
    }
    // propagate back to the hidden layer
    for (int j = 0; j < hidden_layer.length; j++) {
      hidden_layer[j].train();
    }

    // The input layer doesn't learn: it is the input and only that
  };

  public void drawCon() {

    for (int i = 0; i < hidden_layer.length; i++) {
      float [] res = hidden_layer[i].getStrength();
      stroke(200);
      strokeWeight(pow(10, res[1])/35);
      line(
        (i%7) * height / 20.0f + width * 0.53f, 
        (i/7) * height / 20.0f + height * 0.32f, 
        (PApplet.parseInt(res[0])%14) * height / 20.0f + width * 0.05f, 
        (PApplet.parseInt(res[0])/14) * height / 20.0f + height * 0.13f);
    }

    for (int i = 0; i < output_layer.length; i++) {
      float [] res = output_layer[i].getStrength();
      stroke(res[1]*200);
      strokeWeight(pow(10, res[1])/35);
      line(
        width * 0.85f, 
        (i%10) * height / 15.0f + height * 0.2f,
        (res[0]%7) * height / 20.0f + width * 0.53f, 
        (res[0]/7) * height / 20.0f + height * 0.32f);
    }
    strokeWeight(1);
  };
};


/*

 Charles Fried - 2017
 ANN Tutorial 
 Part #2
 
 NEURON
 
 This class is for the neural network, which is hard coded with three layers: input, hidden and output
 
 */

float LEARNING_RATE = 0.01f;


class Neuron {

  Neuron [] inputs; // Strores the neurons from the previous layer
  float [] weights;
  float output;
  float error;

  Neuron() {
    error = 0.0f;
  };

  Neuron(Neuron [] p_inputs) {

    inputs = new Neuron [p_inputs.length];
    weights = new float [p_inputs.length];
    error = 0.0f;
    for (int i = 0; i < inputs.length; i++) {
      inputs[i] = p_inputs[i];
      weights[i] = random(-1.0f, 1.0f);
    }
  };

  public void respond() {

    float input = 0.0f;
    for (int i = 0; i < inputs.length; i++) {
      input += inputs[i].output * weights[i];
    }
    output = lookupSigmoid(input);
    error = 0.0f;
  };

  public void setError(float desired) {
    error = desired - output;
  };

  public void train() {

    float delta =(1.0f - output) * (1.0f + output) *
      error * LEARNING_RATE;
    for (int i = 0; i < inputs.length; i++) {
      inputs[i].error += weights[i] * error;
      weights[i] += inputs[i].output * delta;
    }
  };

  public void display() {
    stroke(200);
    fill(128 * (1 - output));
    ellipse(0, 0, 16, 16);
  };
  
public float [] getStrength() {
    float ind = 0.0f;
    float str = 0.0f;
    for (int i = 0; i < weights.length; i++) {
      if (weights[i] > str) {
        ind = i; 
        str = weights[i];
      }}
    float [] a = {ind, str};
    return a;
  };
  
};

/*

 Charles Fried - 2017
 ANN Tutorial 
 Part #1
 
 SIGMOID
 Activation function
 
 A sigmoid function is the neuron's response to inputs the sigmoidal response ranges from -1.0 to 1.0
 For example, the weighted sum of inputs might be "2.1" our response would be lookupSigmoid(2.1) = 0.970
 This is a look up table for sigmoid (neural response) values which is valid from -5.0 to 5.0
 
 */

float [] g_sigmoid = new float [200];

public void setupSigmoid() {
  
  for (int i = 0; i < 200; i++) {
    float x = (i / 20.0f) - 5.0f;
    g_sigmoid[i] = 2.0f / (1.0f + exp(-2.0f * x)) - 1.0f;
  }
};

// once the sigmoid has been set up, this function accesses it:
public float lookupSigmoid(float x) {
  
  return g_sigmoid[constrain((int) floor((x + 5.0f) * 20.0f), 0, 199)];
};

/*
LOADING DATA

The data is a list of 10,000 handwritten digits resampled to a grid of 14x14 pixels by Alasdair Turner
The original set can be found here: http://yann.lecun.com/exdb/mnist/

*/

Card [] testing_set; // the set we use to train (2000)
Card [] training_set; // the set we use to train (8000)

class Card { // This class contains all the functions to format and save the data

  float [] inputs;
  float [] outputs;
  int output;

  Card() {
    inputs = new float [196]; // the images are a grid of 14x14 pixels which makes for a total of 196
    outputs = new float[10]; // the number of possible outputs; from 0 to 9
  }

  public void imageLoad(byte [] images, int offset) { // Images is an array of 1,960,000 bytes, each one representing a pixel (0-255) of the 10,000 * 14x14 (196) images
                                               // We know one image consists of 196 bytes so the location is: offset*196
    for (int i = 0; i < 196; i++) {
      inputs[i] = PApplet.parseInt(images[i+offset]) / 128.0f - 1; // We then store each pixel in the array inputs[] after converting it from (0 - 255) to (+1 - -1) as they vary on the greyscale 
    }
  }

  public void labelLoad(byte [] labels, int offset) {  // Labels is an array of 10,000 bytes, each representing the answer of each image

    output = PApplet.parseInt(labels[offset]);
    
    for (int i = 0; i < 10; i++) {  // We then set the correct index in output[] to +1 if it corresponds to the ouput and -1 if not
      if (i == output) {
        outputs[i] = 1.0f;
      } else {
        outputs[i] = -1.0f;
      }}}
  
};

public void loadData(){ // In this function we initialise all our data in two seperate arrays, training[] and test[]
  
  byte [] images = loadBytes("t10k-images-14x14.idx3-ubyte");
  byte [] labels = loadBytes("t10k-labels.idx1-ubyte");
  training_set = new Card [8000];
  int tr_pos = 0;
  testing_set = new Card [2000];
  int te_pos = 0;
  for (int i = 0; i < images.length/196; i++) {
    if (i % 5 != 0) { 
      training_set[tr_pos] = new Card();
      training_set[tr_pos].imageLoad(images, 16 + i * 196); // There is an offset of 16 bytes
      training_set[tr_pos].labelLoad(labels, 8 + i);  // There is an offset of 8 bytes
      tr_pos++;
    } else {
      testing_set[te_pos] = new Card();
      testing_set[te_pos].imageLoad(images, 16 + i * 196);  // There is an offset of 16 bytes 
      testing_set[te_pos].labelLoad(labels, 8 + i);  // There is an offset of 8 bytes
      te_pos++;
    }}
};
class Plot_2D{
  
  int id,cols,rows,totalWeights = 10,totalBiases = 5;
  public int tCol = 2;
  public float pSize = 10;
  boolean mdown,odown;
  public float x,y,w,h;
  public String label;
  public boolean drag,resize,line,dotted,dashed,mHide,toggle,axis = true,grid = true,showMouse,loadRdata1,loadRdata2,labels = true,
                 showTab,constructData,construct1,construct2,point = true,cross,clear;
  PVector origin,mouse;
  public int col,pCol = 0;
  String [] settingsLabel = {"Psize","No. of Cols"};
  String [] optionsLabel = {"Show Grid","Show Axis","Track Mouse","Labels","Show Tab","Load Random Data","Load Random Data 2","Load From File","Load From Class","Clear","Exit"};
  String [] assignDataLabels = {"Class","Variables"};
  String [] getDataLabels1 = {"Humans","Plants","Shapes"};
  String [] getDataLabels2 = {"Velocity","Accelerration","Shapes","Population","Size","Health","Age","Children","Family","Proximity"};
  String [] palleteLabel = {};
  String [] pSizesLabel;
  String [] palleteBiasLabel;
  String [] palleteWeightsLabel;
  sliderBox palleteBias,palleteWeights,settings,pSizes;
  Menu options,getData1,getData2;
  ArrayList<ArrayList<Variable>> data = new ArrayList<ArrayList<Variable>>();
  tab pallete;
  Dropdown assignData;
  Network neuralNet;
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  
  
  Plot_2D(PVector Origin,float ww, float hh, int Cols, int Rows){
    
    origin = Origin;
    w = ww;
    h = hh;
    cols = Cols;
    rows = Rows;
    
    setupPallete();
  }
  
  Plot_2D(Float xx,float yy,float ww, float hh, int Cols, int Rows){
    
    origin = new PVector((xx+ww)/2,(yy+hh)/2);
    x = xx;
    y = yy;
    w = ww;
    h = hh;
    cols = Cols;
    rows = Rows;
    
    setupPallete();
  }
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void decisionBoundary(){
    
  };
  
  public void setupPallete(){
    palleteWeightsLabel = new String[totalWeights];
    palleteBiasLabel= new String[totalBiases];
    
    for(int i=0;i<totalBiases;i++){
      palleteBiasLabel[i] = "b"+i;;
    }
    for(int i=0;i<totalWeights;i++){
      palleteWeightsLabel[i] = "W"+i;;
    }
    pallete = new tab(main.x,H-70,main.w,70);
    pallete.scrollable = true;
    pallete.states.get(0).scrollable = true;
    palleteBias = new sliderBox(30,10,70,5,palleteBiasLabel,pallete);
    palleteWeights = new sliderBox(160,10,90,5,palleteWeightsLabel,pallete);
    palleteBias.parentCanvas = true;
    palleteWeights.parentCanvas = true;
    pallete.add(palleteBias);
    pallete.add(palleteWeights);
    settings = new sliderBox(palleteWeights.x+palleteWeights.w + 120,10,90,5,settingsLabel,pallete);
    settings.parentCanvas = true;
    pallete.add(settings);
    pallete.toggle=true;
    pallete.visible = true;
    pallete.sliderh.visible = false;
    pallete.sliderv.valuex = 0;
    pallete.sliderv.h +=20;
    
    options = new Menu(0,0,70,optionsLabel);

    assignData = new Dropdown(0,0,90,"Select",assignDataLabels,0);
    Dropdown d = new Dropdown(0,0,90,"Select",assignDataLabels,0);

    Button loadClass = options.items.get(8);

    String [] k = {"X","Y","Z"};
    options.items.get(8).submenu = new Menu(loadClass.x+loadClass.w,loadClass.y,k);
    //options.items.get(8).submenu.w = 90;
    options.set_link(8);

    loadClass = options.items.get(8).submenu.items.get(0);
    loadClass.dMenu = assignData;

    loadClass = options.items.get(8).submenu.items.get(1);
    loadClass.dMenu = d;

    // String [] k1 = ;
    // loadClass.submenu = new Menu(loadClass.x+loadClass.w,loadClass.y,90,k1,0);
    // options.items.get(8).submenu.set_link(0);

    // loadClass = options.items.get(8).submenu.items.get(1);
    // String [] k2 = {"Velocity","Accelerration","Shapes","Population","Size","Health","Age","Children","Family","Proximity"};
    // loadClass.submenu = new Menu(loadClass.x+loadClass.w,loadClass.y,k2);
    // options.items.get(8).submenu.set_link(1);
    options.show = false;
    options.items.get(0).toggle = 1;
    options.items.get(1).toggle = 1;
    options.items.get(3).toggle = 1;
    BMS.menus.add(options);
    pSizes = new sliderBox(settings.x+settings.w+90,10,90,5,pallete);
    //pSizes.menu.spacing = 5;
    pallete.add(pSizes);
    getData1 = new Menu(0,0,70,getDataLabels1);
    getData2 = new Menu(0,0,70,getDataLabels2);
  };
  
  public void loadRandomData(){
    
    if(construct1){
    ArrayList<Variable> variables = new ArrayList<Variable>();
    int c = color(random(0,255),random(0,255),random(0,255));
    
    for(int i=0;i<200;i++){
        
        PVector p = new PVector(x+w/2+random(-w/2,w/2),y+h/2+random(-h/2,h/2));
        Variable v = new Variable(p,i,c);
        
        variables.add(v);
    }
    
    if(!data.contains(variables))data.add(variables);
    
    loadRdata1 = false;
    options.items.get(5).toggle = 0;
    construct1 = false;
    
    }
    if(pSizes.menu.sliders.size()<data.size())pSizes.add
    (new Slider(pSizes.x,pSizes.y-15+(data.size()*(10+pSizes.vspacing)),pSizes.w,10,str(pSizes.menu.sliders.size())));
  };
  
  public void loadRandomData(int k){
    
    if(construct2){
      
    for(int j=0;j<k;j++){
      
      ArrayList<Variable> variables = new ArrayList<Variable>();
      int c = color(random(0,255),random(0,255),random(0,255));
      
      for(int i=0;i<200;i++){
        
        PVector p = new PVector(x+w/2+random(-w/2,w/2),y+h/2+random(-h/2,h/2));
        
        Variable v = new Variable(p,i,c);
        variables.add(v);
      }
      if(!data.contains(variables))data.add(variables);
    }
      loadRdata2 = false;
      options.items.get(6).toggle = 0;
      construct2 = false;
      
    }
    if(pSizes.menu.sliders.size()<data.size()){
      for(int i=0;i<tCol;i++){
        
        float ypos = pSizes.y - 15 + pSizes.menu.sliders.size()* (10 + pSizes.vspacing) + (10 + pSizes.vspacing);
        
        Slider a =  new Slider(pSizes.x ,ypos,pSizes.w,10,str(pSizes.menu.sliders.size()));
        
        a.bar = true;
        a.classic = true;
        a.parent = pSizes.menu;
        a.valuex = pSizes.w/2;
        pSizes.add(a);
      }}
  };
  
  public void logic(){
    if(loadRdata1&&!mousePressed)construct1 = true;
    if(loadRdata2&&!mousePressed)construct2 = true;
    
  };
  
  public PVector sigmoid(PVector a){
    return new PVector(1/exp(a.x),1/exp(a.y));
  };
  
  public void draw(){
    if(toggle){
      
      stroke(col);
      drawGrid();
      displayPointer();
      displayAxis();
      displayLabels();
      displayTab();
      sliderControl();
      
      logic();
      loadRandomData();
      loadRandomData(tCol);
      if(!clear)displayData();
      else {
        data = new ArrayList<ArrayList<Variable>>();
        clear = false;
        options.items.get(9).toggle = 0;
        pSizes.menu.sliders = new ArrayList<Slider>();
      }
      drawMenu();
      
    }
  };
  
  public void draw(PGraphics canvas){
    if(toggle){
      stroke(col);
      //displayPointer();
      drawGrid(canvas);
      displayPointer(canvas);
      displayAxis(canvas);
      displayLabels(canvas);
      displayTab(canvas);
      displayData(canvas);
      logic();
      loadRandomData();
      loadRandomData(2);
      //sliderControl();
      
    }
  };
  
  public void displayTab(){
    if(showTab)pallete.displayTabs();
  };
  
  public void displayTab(PGraphics canvas){
    if(showTab)pallete.displayTabs(canvas);
  };
  
  public void drawMenu(){
    if(mousePressed&&options.show&&!mdown&&!options.menu)options.show = false;
    if(options.show&&!mdown&&!options.pos()&&mousePressed&&options.index==-1)options.show = false;
    if(mousePressed&&mouseButton == RIGHT&&!mdown){
      options.x = mouseX;
      options.y = mouseY;
      mdown = true;
      options.show=true;
    }
    
    Dropdown d = options.items.get(8).submenu.items.get(0).dMenu;
    Dropdown d1 = options.items.get(8).submenu.items.get(1).dMenu;

    int k = -1;

    if(options.show){
      if(d.index==0){
        d.subMenu = getData1;
        d1.index = 1;
        d1.subMenu = getData2;
        k = 0;
      }
      if(d.index==1){
        d.subMenu = getData2;
        d1.index = 0;
        d1.subMenu = getData1;
        k = 1;
      }

      if(d.subMenu!=null)
      for(int i=0;i<d.subMenu.items.size();i++){

        Button b = d.subMenu.items.get(i);

        if(b.pos()&&mousePressed&&!mdown){
          b.self_toggle();
          mdown = true;
        }
        if(!b.pos()&&mousePressed)b.toggle=0;
      }
      if(d1.subMenu!=null&&mousePressed&&!mdown)
      for(int i=0;i<d1.subMenu.items.size();i++){

        Button b = d1.subMenu.items.get(i);

        if(b.pos()&&mousePressed&&!mdown){
          b.self_toggle();
          mdown = true;
        }
        if(!b.pos()&&mousePressed)b.toggle=0;
      }

      if(k==0){
        if(d.subMenu.items.get(0).toggle==1){}
        if(d.subMenu.items.get(1).toggle==1){}
        if(d.subMenu.items.get(2).toggle==1){}

        if(d1.subMenu.items.get(0).toggle==1){}
        if(d1.subMenu.items.get(1).toggle==1){}
        if(d1.subMenu.items.get(2).toggle==1){}
        if(d1.subMenu.items.get(3).toggle==1){}
        if(d1.subMenu.items.get(4).toggle==1){}
        if(d1.subMenu.items.get(5).toggle==1){}
      }

      if(k==1){
        if(d.subMenu.items.get(0).toggle==1){}
        if(d.subMenu.items.get(1).toggle==1){}
        if(d.subMenu.items.get(2).toggle==1){}
        if(d.subMenu.items.get(3).toggle==1){}
        if(d.subMenu.items.get(4).toggle==1){}
        if(d.subMenu.items.get(5).toggle==1){}

        if(d1.subMenu.items.get(0).toggle==1){}
        if(d1.subMenu.items.get(1).toggle==1){}
        if(d1.subMenu.items.get(2).toggle==1){}
      }
    }
    if(!mousePressed)mdown = false;
    // if(odown)text("odown",100,120);
    // if(mdown)text("mdown",100,130);
  };
  
  public void displayData(){
    for(int i=0;i<data.size();i++){
      
      ArrayList<Variable> v = data.get(i);
      
       for(int j=0;j<v.size();j++){ 
         Variable v1 = v.get(j);
         
         fill(v1.col);
         noStroke();
         int k = PApplet.parseInt(pSizes.menu.sliders.get(i).value);
         if(point)ellipse(v1.pos.x,v1.pos.y,pSize+k,pSize+k);
         else if(cross){}
    }}
  };
  
  public void displayData(PGraphics canvas){
    for(int i=0;i<data.size();i++){
      
      ArrayList<Variable> v = data.get(i);
      
       for(int j=0;j<v.size();j++){ 
         Variable v1 = v.get(j);
         
         canvas.fill(pCol);
         if(point)canvas.ellipse(v1.pos.x,v1.pos.y,pSize,pSize);
         else if(cross){}
    }}
  };
  
  public void drawGrid(){
    if(grid){
      fill(0);
      strokeWeight(0.5f);
    for(int i=0;i<rows;i++){
      float x1 = x + w/rows * i;
      
      line(x1,y,x1,y+h);
    }
    for(int i=0;i<cols;i++){
      float y1 = y + h/cols * i;
      
      line(x,y1,x+w,y1);
    }}
  };
  
  public void drawGrid(PGraphics canvas){
    canvas.fill(0);
    for(int i=0;i<rows;i++){
      float x1 = (origin.x - w/2) + w/rows * i + w/rows/2;
      
      canvas.line(x1,y,x1,y+h);
    }
    
    for(int i=0;i<cols;i++){
      float y1 = (origin.y - h/2 )+ h/cols * i + h/cols/2;
      
      canvas.line(x,y1,x+w,y1);
    }
  };
  
  public void sliderControl(){
    
  pallete.sliderv.set(0,pallete.sliderBoxes.get(1).menu.sliders.size());
      
      if(pallete.sliderv.mdown&&mouseY>pallete.y){
        
      for(int i=0;i<pallete.sliderBoxes.size();i++){
        
          Menu m = pallete.sliderBoxes.get(i).menu;
          
          if(pallete.sliderv.valuex>0)m.y = m.by - pallete.sliderv.valuex;
        
        for(int j=0;j<m.sliders.size();j++){
            
            Slider s1 = m.sliders.get(j);
            
            s1.y = m.y + (s1.h+m.spacing) * j;
            
        }}}
    
      sliderBox s = pSizes;
      
      for(int i=0;i<s.menu.sliders.size();i++)s.setint(i,2,20);
      
        settings.setint(0,2,10,this,"pSize");
        settings.setint(1,2,10,this,"tCol");
};

public void displayPointer(){
  if(showMouse){
      float x1=0,y1=0,xa=0,ya=0;
      if(col==0)stroke(0);
      else if(x1-xa==0||y1-ya==0)col = color(255,255,0);
      else col = color(0,255,0);
  if(mousePressed){
        fill(255);
        ellipse(mouseX,mouseY,2,2);
        fill(0);
        
         x1 = map(mouseX,x+23,w+23,floor(-rows/2),floor(rows/2));
         xa = floor(x1);
         y1 = map(mouseY,y+20,h+20,floor((-rows)/4),floor((rows)/4));
         ya = floor(y1);
        if(abs(x1-xa)<0.1f)x1=xa;
        if(abs(y1-ya)<0.1f)y1=ya;
        text( x1 + ", " + y1 ,mouseX,mouseY); 
        
      }}
};

public void displayPointer(PGraphics canvas){
  
  if(showMouse){
      float x1=0,y1=0,xa=0,ya=0;
      if(col==0)canvas.stroke(0);
      else if(x1-xa==0||y1-ya==0)col = color(255,255,0);
      else col = color(0,255,0);
  if(mousePressed){
        canvas.fill(255);
        canvas.ellipse(mouse.x,mouse.y,2,2);
        canvas.fill(0);
        
         x1 = map(mouse.x,x+23,w+23,floor(-rows/2),floor(rows/2));
         xa = floor(x1);
         y1 = map(mouse.y,y+20,h+20,floor((-rows)/4),floor((rows)/4));
         ya = floor(y1);
        if(abs(x1-xa)<0.1f)x1=xa;
        if(abs(y1-ya)<0.1f)y1=ya;
        canvas.text( x1 + ", " + y1 ,mouse.x,mouse.y); 
        
      }}
};

public void displayLabels(){
  
  if(labels){
    for(int i=0;i<cols/2+1;i++){
      fill(255);
      text(i, (x + w)/2 + x + (w/cols-1) * i - 20, y+h/2 + 10);
    }
    for(int i=0;i<cols/2+1;i++){
      fill(255);
      text(- i, (x + w)/2 + x - (w/cols-1) * i - 20, y+h/2 + 10);
    }
    
    for(int i=1;i<rows/2+1;i++){
      fill(255);
      text( i, x+w/2 - textWidth(str(i))-2, (y + h)/2 + y - (h/rows) * i - 10);
    }
    for(int i=1;i<rows/2+1;i++){
      fill(255);
      text(-i, x+w/2 - textWidth(str(-i))-2, (y + h)/2 + y + (h/rows) * i - (h/rows)/2);
    }}
};

public void displayLabels(PGraphics canvas){
  
  if(labels){
    for(int i=0;i<cols/2+1;i++){
      canvas.fill(255);
      canvas.text(i, (x + w)/2 + x + (w/cols-1) * i - 20, y+h/2 + 10);
    }
    for(int i=0;i<cols/2+1;i++){
      canvas.fill(255);
      canvas.text(- i, (x + w)/2 + x - (w/cols-1) * i - 20, y+h/2 + 10);
    }
    
    for(int i=1;i<rows/2+1;i++){
      canvas.fill(255);
      canvas.text( i, x+w/2 - textWidth(str(i)), (y + h)/2 + y - (h/rows) * i - 10);
    }
    for(int i=1;i<rows/2+1;i++){
      canvas.fill(255);
      canvas.text(-i, x+w/2 - textWidth(str(-i)), (y + h)/2 + y + (h/rows) * i - (h/rows)/2);
    }}
};

public void displayAxis(){
  if(axis){
    PVector o = origin;
    fill(0);
    stroke(0);
    strokeWeight(1);
    line(x,y+h/2 - (h/rows)/2,x+w,y+h/2 - (h/rows)/2);
    line(x+w/2,y,x+w/2,y + h);
    }
   if(showMouse){
    if(mouseX>x+(w)/2){
     if(mouseY>y+(h)/2){
      line(mouseX,mouseY,x+(w)/2,mouseY);
      line(mouseX,mouseY,mouseX,y+(h)/2 - h/cols/2);
    }else if(mouseY<y+(h)/2){
      line(mouseX,mouseY,x+(w)/2,mouseY);
      line(mouseX,mouseY,mouseX,y+(h)/2 - h/cols/2);
    }}else {
    if(mouseX<x+(w)/2){
      line(mouseX,mouseY,x+(w)/2,mouseY);
      line(mouseX,mouseY,mouseX,y+(h)/2 - h/cols/2);
    }else{
      line(mouseX,mouseY,x+(w)/2,mouseY);
      line(mouseX,mouseY,mouseX,y+(h)/2 - h/cols/2);
    }}}
};

public void displayAxis(PGraphics canvas){
  if(axis){
    PVector o = origin;
    canvas.fill(0);
    canvas.stroke(0);
    canvas.strokeWeight(1);
    canvas.line(x,y+h/2 - (h/rows)/2,x+w,y+h/2 - (h/rows)/2);
    canvas.line(x+w/2,y - (h/rows)/2,x+w/2,y + h -(h/rows)/2);
  }
    
  if(showMouse){
    if(mouseX>x+(w)/2){
     if(mouseY>y+(h)/2){
      canvas.line(mouseX,mouseY,x+(w)/2,mouseY);
      canvas.line(mouseX,mouseY,mouseX,y+(h)/2 - h/cols/2);
    }else if(mouseY<y+(h)/2){
      canvas.line(mouseX,mouseY,x+(w)/2,mouseY);
      canvas.line(mouseX,mouseY,mouseX,y+(h)/2 - h/cols/2);
    }}else {
    if(mouseX<x+(w)/2){
      canvas.line(mouseX,mouseY,x+(w)/2,mouseY);
      canvas.line(mouseX,mouseY,mouseX,y+(h)/2 - h/cols/2);
    }else{
      canvas.line(mouseX,mouseY,x+(w)/2,mouseY);
      canvas.line(mouseX,mouseY,mouseX,y+(h)/2 - h/cols/2);
    }}}
};
  
  public void regression(){
    //pos
  };
  
  public boolean pos(){
   return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY>y+h;
  };
  
  public boolean pos(PVector m){
   return m.x>x&&m.x<x+w&&m.y>y&&m.x>y+h;
  };
};



class Plot_3D{
  
  int id;
  float x,y,w,h;
  String label;
  boolean drag,resize;
  
  Plot_3D(){
    
  }
  
  public void draw(){
    
    
  };
  
  public void regression(){
    
  };
  
};

class Variable{
  
  PVector pos;
  float x,y;
  int col;
  int id,pSize;
  boolean static_,dynamic;
  
  Variable(float X,float Y,int Col){
    
    x = X;
    y = Y;
    col = Col;
    
  };
  
  Variable(PVector a,int Col){
    
    pos = a;
    x = a.x;
    y = a.y;
    col = Col;
  };
  
  //Variable(float X,float Y,int ID){
  //  x = X;
  //  y = Y;
  //  id = ID;
  //};
  
  Variable(float X,float Y,int Id,int Col){
    
    x = X;
    y = Y;
    id = Id;
    col = Col;
  };
  
  Variable(PVector a,int Id,int Col){
    
    pos = a;
    x = a.x;
    y = a.y;
    id = Id;
    col = Col;
  };
  
};
class Scene extends Boundary{
  
  int id;
  //public float x,y,w,h,
  public float bordersize = 1,limit;
  public int cols = 40, rows = 30;
  public String label;
  public boolean showq,showf;
  //public boolean drag,resize,border = true,fill = true ,toggle,visible,clear;
  //public color col = color(0);
  public int scol = color(0,150);
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  ArrayList<Menu> menus = new ArrayList<Menu>();
  ArrayList<Slider> sliders = new ArrayList<Slider>();
  ArrayList<Button> buttons = new ArrayList<Button>();
  ArrayList<Button> nav = new ArrayList<Button>();
  ArrayList<Plot_2D> plots_2d = new ArrayList<Plot_2D>();
  ArrayList<Plot_3D> plots_3d = new ArrayList<Plot_3D>();
  //Boundary boundary;
  
  
  PImage bgimage;
  ArrayList<Quad> fields = new ArrayList<Quad>();
  
  Scene(float xx,float yy, float ww, float hh){
    
    x = xx;
    y = yy;
    w = ww;
    h = hh;
    //main.Boundaries.add(new Boundary(x,y,w,h,4));
    float gW = (w)/cols, gH = h/rows;
    int k = gw;
    
    float sw = w /cols;
    float sh = h / rows;
    
    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        
        float X = x + gW/2 + (gW * j);  
        float Y = y + gH/2 + (gH * i);
        int ID = PApplet.parseInt(j + i * cols);
        
        fields.add(new Quad(new PVector(X,Y),ID,gW,gH,this));
        
      }}
    scenes.add(this);
  };
  
  
  
  Scene(){
    float gW = (w)/cols, gH = h/rows;
    int k = gw;
    
    float sw = w /cols;
    float sh = h / rows;
    
    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        
        float X = x + gW/2 + (gW * j);  
        float Y = y + gH/2 + (gH * i);
        int ID = PApplet.parseInt(j + i * cols);
        
        fields.add(new Quad(new PVector(X,Y),ID,gW,gH,this));
        
      }}
    scenes.add(this);
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void display(){
    
    noStroke();fill(255);rect(x,y,w,h);
    strokeWeight(bordersize);
    stroke(bg);if(!border){noStroke();}
    fill(bg);if(!fill)noFill();
    
    rect(x,y,w,h);
    
  };
  
  public void regression(){
    
  };
  
  public void field(){
    
    for(int i=0;i<fields.size();i++){
      
      Quad q = fields.get(i);
      
      q.draw();
      //q.setField();
      //q.field();
    }
    
  };
  
  public boolean pos(){
    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
  }
  
};
class Slider{
  
  int id = -1,type;
  float x,y,w,h,valuex,valuey,btnw,btnh, value = 0,toffx,toffy,spacing = 20,tsize = 12,ssize,temp,startvalue,endvalue;
  String label;
  boolean drag,resize,border,fill = true ,toggle,visible = true,horizontal = true,vertical,matrix,classic,pie,radio,square,bar,mdown,mup,Label,right,up,down,left,tvisible = true,
          tdown,parentCanvas;
  int col = color(0);
  int col2 = color(255);
  int col3 = color(255,100);
  int barcol = color(0,100),col4 = color(0,50),tcol = color(255),slidercol = color(255),hovercol = color(0,50);
  String control = "";
  Object Link;
  Menu parent;
  tab tooltip,parentTab;
  PVector mouse;
  TextBox Start = null,End = null,Current = null;
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  
  Slider(float xx,float yy, float ww, float hh){
    
    x = xx;
    y = yy;
    w = ww;
    h = hh;
    btnh = h+2;
    btnw = h;
    valuex = w/2;
    valuey = y;
    //value = 0;
    //valuex = 0;
    classic = true;
    bar = true;
    
    createOptionsMenu();
    
  };
  Slider(float xx,float yy, float ww, float hh,String Label){
    
    x = xx;
    y = yy;
    w = ww;
    h = hh;
    btnh = h+2;
    btnw = h;
    label = Label;
    valuex = w/2;
    valuey = y;
    value = 0;
    classic = true;
    bar = true;
    createOptionsMenu();
    
  };
  
  public void createOptionsMenu(){
    tooltip = new tab(x,w,50,120,this);
    String[] s1 = {"Reset"};
    float X = x+w+textWidth("0.000")+20;
    Menu options = new Menu(0,0,80,s1,0);
    tooltip.w = options.w;
    tooltip.add(options);
    TextBox t1 = new TextBox(0,0+30,68,20,20,"Start");
    tooltip.add(t1);
    t1.w = options.w;
    t1 = new TextBox(0,0+60,68,20,20,"End");
    t1.w = options.w;
    tooltip.add(t1);
    t1 = new TextBox(0,0+90,68,20,20,"Value");
    t1.w = options.w;
    tooltip.textboxes.add(t1);
    Start = tooltip.textboxes.get(0);
    End = tooltip.textboxes.get(1);
    tooltip.h = 90+20;
    
  };
  
  public void updateOptionsMenu(){
    //if(!tooltip.drag&&!dragged){
    tooltip.x = x+w+textWidth("0.000")+20;
    Menu options = tooltip.menus.get(0);
    
    
    options.x = 0;
    options.y = 0;
    for(int i=0;i<tooltip.menus.get(0).items.size();i++){
      Button b = tooltip.menus.get(0).items.get(i);
      b.x = 0;
      b.y = 0 + 20 * i;
    }
    TextBox t1 = tooltip.textboxes.get(0);
    t1.y = 0+30;
    t1.x = 0;
    t1 = tooltip.textboxes.get(1);
    t1.y = 0+60;
    t1.x = 0;
    t1 = tooltip.textboxes.get(2);
    t1.y = 0+90;
    t1.x = 0;
    Start = tooltip.textboxes.get(0);
    End = tooltip.textboxes.get(1);
    
    if(tooltip.y+tooltip.h>height)tooltip.draggable = true;
    else tooltip.draggable = false;
    
  };
  
  public void updateOptionsMenu(PGraphics canvas){
    //if(!tooltip.drag&&!dragged){
    tooltip.x = x+w+textWidth("0.000")+20;
    tooltip.y = y;
    Menu options = tooltip.menus.get(0);
    
    options.x = 0;
    options.y = 0;
    for(int i=0;i<tooltip.menus.get(0).items.size();i++){
      Button b = tooltip.menus.get(0).items.get(i);
      b.x = 0;
      b.y = 0 + 20 * i;
    }
    TextBox t1 = tooltip.textboxes.get(0);
    t1.y = 0+30;
    t1.x = 0;
    t1 = tooltip.textboxes.get(1);
    t1.y = 0+60;
    t1.x = 0;
    t1 = tooltip.textboxes.get(2);
    t1.y = 0+90;
    t1.x = 0;
    Start = tooltip.textboxes.get(0);
    End = tooltip.textboxes.get(1);
    
    if(tooltip.y+tooltip.h>height)tooltip.draggable = true;
    else tooltip.draggable = false;
    
  };
  
  
  
  public void draw(){
    functions();
    if(tooltipPos()){
    noStroke();
    //if(stroke)stroke(0);
    fill(0,100);
    String k = "0.0000";
    rect(x+w+textWidth(k),y,20,h);
    }
    if(tooltipPos()&&!mdown&&mousePressed){
      
      tooltip.x = x+w+textWidth("0.000")+20;
      tooltip.y = y;
      //tooltip.track();
      tooltip.toggle = true;
      tooltip.visible = true;
      mdown = true;
      tdown = true;
    }
    // if(!tooltip.draggable){
    // if((!tooltip.posTab()&&!mdown&&tdown&&mousePressed)){
      
    //   // tooltip.toggle = false;
    //   // tooltip.visible = false;
    //   mdown = true;
    //   //tdown = false;
    //   //cursor(ARROW);
    // }}else 
    if((!tooltip.posTabd()&&!mdown&&tdown&&mousePressed)&&!tooltip.posTab()){
      
      // tooltip.toggle = false;
      // tooltip.visible = false;
      mdown = true;
      tdown = false;
      //cursor(ARROW);
    }
    if(!mousePressed)mdown = false;
    if(tdown){
      updateOptionsMenu();
      tooltip.displayTab(); 
      
      if(tooltip.menus.get(0).items.get(0).pos(new PVector(mouseX-tooltip.x,mouseY-tooltip.y))&&mousePressed){
        tooltip.menus.get(0).items.get(0).toggle=1;
        resetControl();
        valuex = w/2;
        value = 0;
        cursor(ARROW);
        tdown = false;
    }
    if(!tdown)cursor(ARROW);
    TextBox t = tooltip.textboxes.get(2);
    
    if(PApplet.parseFloat(t.textBox)>-99999999&&keyPressed&&key==ENTER)setControl(t.value);
    }
    if(!mousePressed){
      //mdown = false;
      
      for(int i=0;i<tooltip.menus.get(0).items.size();i++){
        Button b = tooltip.menus.get(0).items.get(i);
        
        b.toggle=0;
      }}
  };
  
  public void draw(PGraphics canvas){
    functions(canvas);
    if(tooltipPos(mouse)){
    canvas.noStroke();
    //if(stroke)stroke(0);
    
    canvas.fill(0,100);
    String k = "0.0000";
    PVector m = tooltip.getMouse(mouse);
    canvas.rect(x+w+textWidth(k),y,20,h);
    }
    if(tooltipPos(mouse)&&!mdown&&!tdown&&mousePressed){
      
      tooltip.x = x+w+textWidth("0.000")+20;
      tooltip.y = y;
      //tooltip.track();
      tooltip.toggle=true;
      tooltip.visible = true;
      mdown = true;
      tdown = true;
    }
    if(!tooltip.draggable){

    if((!tooltip.posTab(mouse)&&!mdown&&tdown&&mousePressed)||pos(mouse)&&mousePressed){
      
      tooltip.toggle=false;
      tooltip.visible = false;
      mdown = true;
      tdown = false;
      //cursor(ARROW);
    }}else if((!tooltip.posTabd(mouse)&&!mdown&&tdown&&mousePressed)||pos(mouse)&&mousePressed){
      
      tooltip.toggle=false;
      tooltip.visible = false;
      mdown = true;
      tdown = false;
      //cursor(ARROW);
    }
    
    if(tdown&&!mdown){
      updateOptionsMenu(canvas);
      tooltip.mouse2 = mouse;
      if(parentTab!=null)tooltip.parentTab = parentTab;
      tooltip.displayTab(canvas); 
      fill(255);
      
      if(tooltip.menus.get(0).items.get(0).pos(new PVector(mouse.x-tooltip.x,mouse.y-tooltip.y))&&mousePressed){
        tooltip.menus.get(0).items.get(0).toggle=1;
        resetControl();
        valuex = w/2;
        value = 0;
        cursor(ARROW);
    }
    //else if(!tdown)cursor(ARROW);
    TextBox t = tooltip.textboxes.get(2);
    
    if(PApplet.parseFloat(t.textBox)>-99999999&&keyPressed&&key==ENTER)setControl(t.value);
    }
    if(!mousePressed){
      mdown = false;
      
      for(int i=0;i<tooltip.menus.get(0).items.size();i++){
        Button b = tooltip.menus.get(0).items.get(i);
        
        b.toggle=0;
      }}
  };
  
  public void set(String a){
    if(a=="vertical"||a=="Vertical"||a=="VERTICAL"){}
  };
  
  
  public void resetControl(){
    
            Field field = null;
    try{
         field = Link.getClass().getField(control); 
         field.set(Link, 0); 
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    } 
  };
  
  public void setControl(float a){
    value = a;
    valuex = map( value,startvalue,endvalue, 0+1, w-1);
            Field field = null;
    try{
         field = Link.getClass().getField(control); 
         field.set(Link, a); 
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    } 
  };
  
  public void setStart(float a){
            Field field = null;
    try{
         field = Link.getClass().getField(control); 
         field.set(Link, a); 
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    } 
  };
  
  public void setEnd(float a){
            Field field = null;
    try{
         field = Link.getClass().getField(control); 
         field.set(Link, a); 
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    } 
  };
  
  public void functions(){
    stroke(col);
    if(!border){
     noStroke(); 
    }
    if(classic){
      if(square)classic_Square();
      else if(radio)classic_Radio();
      else if(bar)classic_Bar();
    }else if(matrix){
      if(square)Matrix();
      else if(radio){}
      else if(bar){}
    }else if(pie){
      if(square)pie_Square();
      else if(radio)pie_Radio();
      else if(bar)pie_Bar();
    }
  };
  
  public void functions(PGraphics canvas){
    if(visible){
    canvas.stroke(col);
    if(!border){
     canvas.noStroke(); 
    }
    if(classic){
      if(square)classic_Square();
      else if(radio)classic_Radio();
      else if(bar)classic_Bar(canvas);
    }else if(matrix){
      if(square)Matrix();
      else if(radio){}
      else if(bar){}
    }else if(pie){
      if(square)pie_Square();
      else if(radio)pie_Radio();
      else if(bar)pie_Bar();
    }}
  };
  
 public void classic_Square(){
    //----------slider bg-----------
    fill(slidercol);
    if(vertical)rect(x,y,w,h);
    else rect(x,y,w,h);
    
    if(pos())fill(hovercol);if(!fill)noFill();
    
    if(vertical)rect(x,y,w,h);
    else rect(x,y,w,h);
    
    textSize(tsize);
    strokeWeight(ssize);
    stroke(0);
    if(parent==null){
    if(btnpos()||pos()||mdown)fill(col4);btnh = h+10;
    }
    
      if(label!=null){
        fill(tcol);
        if(vertical)text(label,x,y-tsize);
        else text(label,x-textWidth(label),y+h);
      }
      if(!vertical)btnh = h;
      noStroke();
      fill(255);
      
      //slider value-------------------
      rectMode(CORNER);
      if(vertical)rect(x,y+valuex,btnw-2,btnw-2);
      else rect(x+valuex,y,btnw,btnh);
      
      fill(barcol);
      
      if(vertical)rect(x,y+valuex,btnw-2,btnw-2);
      else  rect(x + valuex,y,btnw,btnh);
      
      fill(tcol);
      if(vertical){
        pushMatrix();
        translate(x+w+toffx,y+h+toffy);
        rotate(PI/2);
        
        translate(-(x+w+toffx),-(y+h+toffy-w));
        text(value,x+w+toffx,y+h+toffy);
        popMatrix();
      }else text(value,x+w+toffx,y+h+toffy);
      
  };
  
  public void classic_Radio(){
    //----------slider bg-----------
    fill(slidercol);
    if(vertical)rect(x,y,w,h);
    else rect(x,y,w,h);
    
    if(pos())fill(hovercol);if(!fill)noFill();
    
    if(vertical)rect(x,y+valuex,w,h-valuex);
    else rect(x,y,w,h);
    
    textSize(tsize);
    strokeWeight(ssize);
    stroke(0);
    if(parent==null){
    if(btnpos()||pos()||mdown)fill(col4);btnh = h+10;
    }
    
      if(label!=null){
        fill(tcol);
        if(vertical)text(label,x,y-tsize);
        else text(label,x-textWidth(label),y+h);
      }
      if(!vertical)btnh = h;
      noStroke();
      fill(255);
      
      //slider value-------------------
      ellipseMode(CORNER);
      //text(valuex , 500,500 + 10*id);
      if(vertical)ellipse(x,y+valuex,btnw-2,btnw-2);
      else ellipse(x+valuex,y,btnw,btnh);
      
      fill(barcol);
      
      if(vertical)ellipse(x,y+valuex,btnw-2,btnw-2);
      else  ellipse(x + valuex,y,btnw,btnh);
      
      fill(tcol);
      if(vertical){
        pushMatrix();
        translate(x+w+toffx,y+h+toffy);
        rotate(PI/2);
        
        translate(-(x+w+toffx),-(y+h+toffy-w));
        text(value,x+w+toffx,y+h+toffy);
        popMatrix();
      }else text(value,x+w+toffx,y+h+toffy);
      
  };
  
  public void classic_Bar(){
    //----------slider bg-----------
    fill(slidercol);
    if(vertical)rect(x,y+valuex,w,h-valuex);
    else rect(x+valuex,y,w-valuex,h);
    
    if(pos())fill(hovercol);if(!fill)noFill();
    
    if(vertical)rect(x,y+valuex,w,h-valuex);
    else rect(x + valuex,y,w-valuex,h);
    
    textSize(tsize);
    strokeWeight(ssize);
    stroke(0);
    if(parent==null){
    if(btnpos()||pos()||mdown)fill(col4);btnh = h+10;
    }
    
      if(label!=null){
        fill(tcol);
        if(vertical)text(label,x,y-tsize);
        else text(label,x-textWidth(label),y+h);
      }
      if(!vertical)btnh = h;
      noStroke();
      fill(255);
      
      //slider value-------------------
      if(vertical)rect(x,y,w,valuex);
      else rect(x,y,valuex,btnh);
      fill(barcol);
      if(vertical)rect(x,y,w,valuex);
      else rect(x,y,valuex,btnh);
      fill(tcol);
      if(vertical){
        pushMatrix();
        translate(x+w+toffx,y+h+toffy);
        rotate(PI/2);
        
        translate(-(x+w+toffx),-(y+h+toffy-w));
        if(tvisible)text(value,x+w+toffx,y+h+toffy);
        popMatrix();
      }else if(tvisible)text(value,x+w+toffx,y+h+toffy);
      
   
  };
  
  public void classic_Bar(PGraphics canvas){
    canvas.fill(255);

    //----------slider bg-----------
    canvas.fill(slidercol);
    if(vertical)canvas.rect(x,y+valuex,w,h-valuex);
    else canvas.rect(x+valuex,y,w-valuex,h);
    
    if(pos(mouse))canvas.fill(hovercol);if(!fill)canvas.noFill();
    
    if(vertical)canvas.rect(x,y+valuex,w,h-valuex);
    else canvas.rect(x + valuex,y,w-valuex,h);
    
    canvas.textSize(tsize);
    canvas.strokeWeight(ssize);
    canvas.stroke(0);
    if(parent==null){
    if(btnpos(mouse)||pos(mouse)||mdown)canvas.fill(col4);btnh = h+10;
    }
    
      if(label!=null){
        canvas.fill(tcol);
        if(vertical)canvas.text(label,x,y-tsize);
        else canvas.text(label,x-canvas.textWidth(label),y+h);
      }
      if(!vertical)btnh = h;
      canvas.noStroke();
      canvas.fill(255);
      //slider value-------------------
      if(vertical)canvas.rect(x,y,w,valuex);
      else canvas.rect(x,y,valuex,btnh);
      canvas.fill(barcol);
      if(vertical)canvas.rect(x,y,w,valuex);
      else canvas.rect(x,y,valuex,btnh);
      canvas.fill(tcol);
      if(vertical){
        canvas.pushMatrix();
        canvas.translate(x+w+toffx,y+h+toffy);
        canvas.rotate(PI/2);
        
        canvas.translate(-(x+w+toffx),-(y+h+toffy-w));
        if(tvisible)canvas.text(value,x+w+toffx,y+h+toffy);
        canvas.popMatrix();
      }else if(tvisible)canvas.text(value,x+w+toffx,y+h+toffy);
      
   
  };
  
  public void Matrix(){
    if(!fill){
      noFill();
    }
    fill(col2);
    rect(x,y,w,h);
    
  };
  
  public void pie_Square(){
    if(!fill){
      noFill();
    }
    fill(slidercol);
    ellipseMode(CENTER);
    ellipse(x,y,w,h);
    arc(x,y,w,h,valuex,valuey);
    arc(x+10,y+10,w,h,valuex,valuey);
    fill(col3);
    //rect(
    
  };
  
  public void pie_Radio(){
    if(!fill){
      noFill();
    }
    fill(col2);
    ellipseMode(CENTER);
    ellipse(x,y,w,h);
    arc(x,y,w,h,valuex,valuey);
    arc(x+10,y+10,w,h,valuex,valuey);
    fill(col3);
    ellipseMode(CENTER);
    if(!horizontal){
      ellipse(x+valuex,y,btnw,btnh);
    }else{
      ellipse(x,y + valuey,10,btnh);
    }
  };
  public void pie_Bar(){
    if(!fill){
      noFill();
    }
    fill(col2);
    ellipseMode(CENTER);
    ellipse(x,y,w,h);
    arc(x,y,w,h,valuex,valuey);
    arc(x+10,y+10,w,h,valuex,valuey);
    //line();
  };
  
  public void mouseFunctions(){
    if(btnpos()&&mousePressed||pos()&&mousePressed){
      mup = false;
      mdown = true;
      toggle = true;
    }
    
    if(mdown&&!tdown&&!parentCanvas){
      if(bar){
        if(vertical){
        if(mouseY>y&&mouseY<y + h-1)valuex = mouseY-y;
        if(mouseY>y+h-1)valuex = h-1;
        }else{
          if(mouseX>x&&mouseX<x + w-1)valuex = mouseX-x;
          if(mouseX>x+w-1)valuex = w-1;
        }}
      else if(radio||square){
        if(vertical){
          if(mouseY>y-1&&mouseY<y + h-1&&mouseX>x && mouseX < x + w)valuex = mouseY-y-1;
          if(mouseY>y+h-btnw)valuex = h-btnw;
        }else{
          if(mouseX>x-1&&mouseX<x + w-btnw && mouseY>y && mouseY < y + h)valuex = mouseX-x;
          if(mouseX>x+w-btnw)valuex = w-btnw;
        }} }
    if(mdown&&!mousePressed&&!tdown){
      
      mdown = false;
      toggle = false;
    }
  };
  
  public void mouseFunctions(PVector m){
    if(pos(m)&&mousePressed)mdown = true;
    
    if(mdown){
      if(bar){
        if(vertical){
          if(m.y>y&&m.y<y + h-1)valuex = m.y-y;
          if(m.y>y+h-1)valuex = h-1;
        }else{
          if(m.x>x&&m.x<x + w-1)valuex = m.x-x;
          if(m.x>x+w-1)valuex = w-1;
        }}
      else if(radio||square){
        if(vertical){
          if(m.y>y-1&&m.y<y + h-1&&m.x>x && m.x < x + w)valuex = m.y-y-1;
          if(m.y>y+h-btnw)valuex = h-btnw;
          
        }else{
          if(m.x>x-1&&m.x<x + w-btnw && m.y>y && m.y < y + h)valuex = m.x-x;
          if(m.x>x+w-btnw)valuex = w-btnw;
        }}}
    if(!mousePressed)mdown = false;
  };
  
  public boolean pos(){
    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
  }
  
  public boolean pos(PVector m){
    return m.x>x&&m.x<x+w&&m.y>y&&m.y<y+h;
  }
  
  public boolean btnpos(){
    
    if(!horizontal){
    return mouseX>x + valuex &&mouseX<x+valuex+btnw&&mouseY>y&&mouseY<y+h;
    
    }
    else{
      return mouseX>x&&mouseX<x+w&&mouseY>y+ valuey&&mouseY<y + valuey +btnh;
    }
  };
  
  public boolean btnpos(PVector m){
    
    if(!horizontal){
    return m.x>x + valuex &&m.x<x+valuex+btnw&&m.y>y&&m.y<y+h;
    
    }
    else{
      return m!=null&&m.x>x&&m.x<x+w&&m.y>y+ valuey&&m.y<y + valuey;
    }
  };
  
  public boolean tooltipPos(){
    return mouseX>x+w+textWidth("0.0000")&&mouseX<x+w+textWidth("0.0000")+20&&mouseY>y&&mouseY<y+h;
  };
  
  public boolean tooltipMenuPos(){
    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
  };
  
  public boolean tooltipPos(PVector m){
    return m!=null&&m.x>x+w&&m.x<x+w+textWidth("0.0000")+20&&m.y>y&&m.y<y+h;
  };
  
  public boolean tooltipMenuPos(PVector m){
    return m.x>tooltip.x&&m.x<tooltip.x+tooltip.w&&m.y>tooltip.y&&m.y<tooltip.y+tooltip.h;
  };
  
  public void click(){
    
  };
  
  public void set(float start, float end,Object a,String b) {
    startvalue = start;
    endvalue = end;
    if(Link==null)Link = a;
    if(control=="")control = b;
    float v = 0;
    if(!tdown){
    if(mdown){
      v = map( valuex, 0+1, w-1,start,end);
      value = v;
    }
            Field field = null;
    try{
         field = a.getClass().getField(b); 
         if(mdown)field.set(a, v); 
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }} 
  };
  
  public void set(float start, float end,Object a,String b,String c) {
    startvalue = start;
    endvalue = end;
    if(Link==null)Link = a;
    if(control=="")control = b;
    float v = 0;
    if(!tdown){
    if(mdown){
      v = map( valuex, 0+1, w-1,start,end);
      value = v;
    }
            Field field1 = null;
    try{
         field1 = a.getClass().getField(c); 
         if(mdown)field1.set(a, true); 
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }
            Field field = null;
    try{
         field = a.getClass().getField(b); 
         if(mdown)field.set(a, v); 
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }} 
  };
  
  public void set(float start, float end) {
    
    float v = 0;
    if(!vertical){
    if(mdown){
      v = map( valuex, 1, w-1,start,end);
      value = v;
    }}else{
      if(mdown){
      v = map( valuex, 1, h-1,start,end);
      value = v;
    }}
  };
  
  public void setint(int start, int end,Object a,String b) {
    if(Link==null)Link = a;
    if(control=="")control = b;
    int v = 0;
    if(mdown){
      v = floor(map( valuex, 1, w-1,start,end));
      value = v;
    }
            Field field = null;
    try{
         field = a.getClass().getField(b); 
         if(mdown)field.set(a, PApplet.parseInt(v)); 
         }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }      //noLoop();
  };
  
  public void setint(int start, int end) {
    int v = 0;
    if(mdown){v = floor(map( valuex, 1, w-1,start,end));
    value = v;
    }
  };
  
  
};






class TextBox {

  int id, toggle, cols, rows, size, t, timer = 20, blkrate = 30, t1 = blkrate, t2 = blkrate, start, end, hcount, index, lindex, vindex = -1, hindex = -1, windex, vpos = 0, hpos, sltcounter, vcount = 0;
  float x, y, w, h, textsize = 10, twidth = 0, posx, posy, tposx, tposy, strposx, strposy, tbwidth, strwidth, strwidth2, strheight, cursorx, cursory, crwidth, totalwidth,xoff,
        xOffset,yOffset;
  String label, text, label_backup, cboard = "";
  boolean drag, resize, hover, border, background, hidden, fill = true, init, ready, label_bool, clear, copied, tbox = false, full, tsize,dragtext,mdown,onfocus,showLabel,parentCanvas;
  Menu toolBox;
  Button child;
  ArrayList<Letter> textbox = new ArrayList<Letter>();
  ArrayList<Letter> tm0 = new ArrayList<Letter>();
  ArrayList<Letter> tm1 = new ArrayList<Letter>();
  String textBox = "";
  String temp = "";
  public float value;
  ArrayList<Integer> counted = new ArrayList<Integer>();
  ArrayList<Integer> lines = new ArrayList<Integer>();
  ArrayList<Integer> dragh = new ArrayList<Integer>();
  ArrayList<String> saveValues = new ArrayList<String>();
  Letter b = null;
  PVector mouse;
  int col = color(255), col2 = color(0);

  Window parent;

  TextBox(float X, float Y, float WW, float HH, int Cols) {

    x = X;
    y = Y;
    w = WW;
    h = HH;
    cols = Cols;
    totalwidth = w;
    size = textbox.size();
    textsize = h;
    lines.add(0);
    tbox = false;
  };

  TextBox(float X, float Y, float WW, float HH, int Cols, String Label) {

    x = X;
    y = Y;
    w = WW;
    h = HH;
    cols = Cols;

    totalwidth = w;
    size = textbox.size();
    label = Label;
    label_backup = Label;
    lines.add(0);
    label_bool = true;
    //textBox = label;
    showLabel = true;
    textsize = h;
    toolBox = new Menu(x+1, y-20, 200-1, 20);
  };

  TextBox(float X, float Y, float WW, float HH, int Cols, Boolean N) {

    x = X;
    y = Y;
    w = WW;
    h = HH;
    cols = Cols;
    totalwidth = w;
    size = textbox.size();
    lines.add(0);
    label_bool = true;
    textsize = h;
    tbox = N;
  };


  public void init() {
    
  };

  public void draw() {

    twidth = 0;
    box();
    getCursor();
    mpos();
    nav();
    conditionals();
    highlight();
    selectall();
    error();
    getKey();

    if (key== ENTER)value = PApplet.parseFloat(textBox);
    //debug();
    if(showLabel){
      textSize(textsize);
      fill(0);
      text(label,x,y+textsize - 5);
      textSize(12);
      if(mouse!=null&&mousePressed&&pos(mouse)||toggle==1)showLabel = false;
      else if(mousePressed&&pos())showLabel = false;
      
    }
    //----------------------------------------------------- amend letters
    xOffset = 0;
    for (int i=0; i<textBox.length(); i++) {
      Letter a = null;
    if(a!=null&&a.x>x+w)xOffset += textWidth(a.l);
    }
    
    float c1 = 0;
    int cindex = -1;
    twidth = cursorx;
    
    for (int i=0; i<textBox.length(); i++) {

      Letter a = null;
      String b = str(textBox.charAt(i));

      if (textbox.size()==textBox.length()) {
        a = textbox.get(i);
      } else {
        a = new Letter(b, x, y);
        textbox.add(a);
      }

      float c2 = textWidth(textBox.substring (0, i));

      if (a!=null) {
        strwidth2 = (c2 + textWidth(a.l)<w)? c2 + textWidth(a.l): c2%w + textWidth(a.l);
        //if (c1 + a.w > w)c1=0;
        if (c1==0) {
          cindex++;
          a.id = i;
          a.vpos = cindex;
          boolean k = lines.contains(i);
          if (!k)lines.add(i);
        }
      }

      if (a==null&&b!=null) {
        a = new Letter(b, x, y);
        if (a.id!=i)a.id = i;
        a.y = y;
        a.x = x+c1;
        a.vpos = cindex;
        textbox.add(a);
      }

      if (a.l!=b) { 
        textbox.get(i).l = b;
        a.w = textWidth(b);
        if (a.id!=i)a.id = i;
        a.y = y;
        a.x = x+c1;
        a.vpos = cindex;
      }
      fill(a.col2);
      textSize(textsize);
      
      if(a.x + xOffset<x||a.x+xOffset>x+w)a.visible = false;
      if(a.visible)text(a.l, a.x, a.y+textsize-5);
      c1 += textWidth(a.l);
      textSize(12);
      if (selectAll&&toggle==1&&dragh.size()==textBox.length()) {

        if (dragh.get(i)!= i) dragh.set(i, i);
      }
    }

    //-------------------------------------------------
    if(dragh.size()>0){
    for (int j=0; j<dragh.size(); j++) {
      Letter b = textbox.get(dragh.get(j));
      fill(0, 0, 255, 125);
      noStroke();
      rect(b.x, b.y, b.w, b.h);
    }}
    if (!mousePressed)dragh = new ArrayList<Integer>();
    strokeWeight(1);
  };
  
  public void draw(PGraphics canvas) {

    twidth = 0;
    box(canvas);
    getCursor(canvas);
    mpos(mouse);
    nav();
    conditionals(canvas);
    highlight(canvas);
    selectall();
    error(canvas);
    getKey(canvas);

    if (key== ENTER)value = PApplet.parseFloat(textBox);
    //debug();
    if(showLabel){
      canvas.textSize(textsize);
      canvas.fill(0);
      canvas.text(label,x,y+textsize - 5);
      canvas.textSize(12);
      if(mousePressed&&pos(mouse))showLabel = false;
    }
    //----------------------------------------------------- amend letters
    xOffset = 0;
    for (int i=0; i<textBox.length(); i++) {
      Letter a = null;
    if(a!=null&&a.x>x+w)xOffset += textWidth(a.l)+3;
    }
    
    float c1 = 0;
    int cindex = -1;
    twidth = cursorx;
    
    for (int i=0; i<textBox.length(); i++) {

      Letter a = null;
      String b = str(textBox.charAt(i));

      if (textbox.size()==textBox.length())a = textbox.get(i);
      else {
        a = new Letter(b, x, y);
        textbox.add(a);
      }

      float c2 = textWidth(textBox.substring (0, i));

      if (a!=null) {
        strwidth2 = (c2 + textWidth(a.l)<w)? c2 + textWidth(a.l): c2%w + textWidth(a.l);
        if (c1==0) {
          cindex++;
          a.id = i;
          a.vpos = cindex;
          boolean k = lines.contains(i);
          if (!k)lines.add(i);
        }}

      if (a==null&&b!=null) {
        a = new Letter(b, x, y);
        if (a.id!=i)a.id = i;
        a.y = y;
        a.x = x+c1;
        a.vpos = cindex;
        textbox.add(a);
      }

      if (a.l!=b) { 
        textbox.get(i).l = b;
        a.w = textWidth(b);
        if (a.id!=i)a.id = i;
        a.y = y;
        a.x = x+c1;
        a.vpos = cindex;
      }
      canvas.fill(a.col2);
      canvas.textSize(textsize);
      
      if(a.x + xOffset<x||a.x+xOffset>x+w)a.visible = false;
      if(a.visible)canvas.text(a.l, a.x, a.y+textsize-5);
      c1 += textWidth(a.l)+5;
      canvas.textSize(12);
      if (selectAll&&toggle==1&&dragh.size()==textBox.length()) {

        if (dragh.get(i)!= i) dragh.set(i, i);
      }}

    //-------------------------------------------------
    if(dragh.size()>0){
    for (int j=0; j<dragh.size(); j++) {
      Letter b = textbox.get(dragh.get(j));
      canvas.fill(0, 0, 255, 125);
      canvas.noStroke();
      canvas.rect(b.x, b.y, b.w, b.h);
    }}
    if (!mousePressed)dragh = new ArrayList<Integer>();
    canvas.strokeWeight(1);
  };

  public void selectall() {
    fill(0);
    //if(selectAll){fill(0);text("Select all", 100,200);}
    if (toggle==1&&ctrl==1&&selectAll)text("Select all", 100, 200);
    
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };

  public String getValue() {
    return textBox;
  };

  public ArrayList getObject() {
    return textbox;
  };

  public void highlight() {
    float c = 0;
    int d = 0;

    if (textbox.size()>0) {

      for (int i=0; i<textbox.size(); i++) {
        Letter a = textbox.get(i);
        noStroke();
        if (a.pos()) {
          a.col = color(255, 255, 0);
          fill(a.col);
          rect(a.x, a.y, a.w, a.h);
        } else a.col  = color(0);
        if (mousePressed&&a.pos()) {
          vindex = a.vpos;
          hindex = a.id;
          cursorx = a.x-x+a.w;
          cursory = a.y;
          boolean n = dragh.contains(i);
          
          if (!n) dragh.add(i);
          //text(a.id, a.x + x, a.y);
        }}}
  };
  
  public void highlight(PGraphics canvas) {
    float c = 0;
    int d = 0;

    if (textbox.size()>0) {

      for (int i=0; i<textbox.size(); i++) {
        Letter a = textbox.get(i);
        canvas.noStroke();
        if (a.pos(mouse)) {
          a.col = color(255, 255, 0);
          canvas.fill(a.col);
          canvas.rect(a.x, a.y, a.w, a.h);
        } else a.col  = color(0);
        if (mousePressed&&a.pos(mouse)) {
          vindex = a.vpos;
          hindex = a.id;
          cursorx = a.x-x+a.w;
          cursory = a.y;
          boolean n = dragh.contains(i);
          
          if (!n) dragh.add(i);
          //text(a.id, a.x + x, a.y);
        }}}
  };
  

  public void error() {
    //boolean tsize = true;
    if (clipBoard.length()>0&&textWidth(clipBoard)+textWidth(textBox)*textsize/12>totalwidth&&copy_clipboard&&clipboard_toggle==1)tsize = true;

    if (toggle==1) {
      if (tsize) {
        String message = "ClipBoard too large";
        float l = textWidth(message);
        stroke(0);
        fill(255);
        rect(W/2-l/2+200, H/2-textsize, l*2, textsize*2);
        fill(0);
        text(message, W/2+200, H/2);
      }

      if (tsize&&mousePressed)tsize = false;
    }
  };
  
  public void error(PGraphics canvas) {
    //boolean tsize = true;
    if (clipBoard.length()>0&&textWidth(clipBoard)+textWidth(textBox)*textsize/12>totalwidth&&copy_clipboard&&clipboard_toggle==1)tsize = true;

    if (toggle==1) {
      if (tsize) {
        String message = "ClipBoard too large";
        float l = textWidth(message);
        canvas.stroke(0);
        canvas.fill(255);
        canvas.rect(W/2-l/2+200, H/2-textsize, l*2, textsize*2);
        canvas.fill(0);
        canvas.text(message, W/2+200, H/2);
      }

      if (tsize&&mousePressed)tsize = false;
    }
  };

  public void getKey() {
    
    Boolean k = false;
    if (pos()||toggle>0) {
      String clipboard = null;
      Letter current = null;

      float current_width = textWidth(textBox)*textsize/12;

      if (textbox.size()>0&&hindex!=-1)current = textbox.get(hindex);
      if (textbox.size()>0&&hindex==-1)current = textbox.get(textbox.size()-1);

      if (clipboard_toggle==0)cboard = "";

      if (cboard != clipBoard&&copy_clipboard) { 
        clipboard = clipBoard;
        cboard = clipBoard;
      } else clipboard = null;
      
      String a = getChar();
      String tm = "";
      String tm2 = "";
      tm0 = new ArrayList<Letter>();
      tm1 = new ArrayList<Letter>();

      if (!copy_clipboard&&clipboard_toggle==0) {

        timer --;
        Letter l = null;

        if (a!=null) l = new Letter(a, x+strwidth, y + vcount * textsize);
        if (a!=null&&timer%5==0&&!exclusion()&&key!=BACKSPACE&&key!=ENTER) {

          l.id = hindex +1;

          if (hindex==-1) {
            if (textBox.length()<cols) {
              l.y = y + vcount * textsize;
              cursory = l.y;
              textbox.add(l);
              textBox += a;
            }} else {

            Letter end = textbox.get(textbox.size()-1);
            Letter n = new Letter(a, cursorx, cursory);
            if ((hindex!=textbox.size()-1||hindex!=-1)&&timer%5==0) {

              Letter b = textbox.get(hindex);
              l.id = b.id ;

              n.x = cursorx ;
              if (hindex-1> 0)l.y = y + textbox.get(hindex-1).vpos * textsize;
              else l.y = y; 
              cursory = y;

              tm = textBox.substring ( 0, hindex + 1);
              tm += a;
              tm2  = textBox.substring ( hindex + 1, textBox.length()  );
              textBox = tm + tm2;
              hindex ++;
              if (hindex < textbox.size()-1)cursorx = textbox.get(hindex+1).x;
            }}

          if (timer<=0)timer = 21;
          } else if (keyPressed && key==BACKSPACE&&timer%5==0)delete();
            else if (keyPressed && keyCode==ENTER&&timer%5==0) value = PApplet.parseFloat(textBox);
        
          } else if (copy_clipboard&&clipboard_toggle==1&&timer%5==0) {
          if (!tsize) {
            if (timer<=0)timer = 21;
          
          if (hindex>-1) {
            tm = textBox.substring ( 0, hindex  );
            tm2  = textBox.substring ( hindex, textBox.length()  );

            if (hindex>-1) {
              if (hindex<textBox.length())tm = textBox.substring ( 0, hindex + 1  );
              if (hindex<textBox.length())tm2  = textBox.substring ( hindex + 1, textBox.length()  );
              tm += cboard;
              tm += tm2;

              textBox = tm;
            }
          } else {

            for (int i=0; i<cboard.length(); i++) {
              String b = str(cboard.charAt(i));
              textBox += b;
            }}}}}
  };
  
  public void getKey(PGraphics canvas) {
    
    Boolean k = false;
    if (pos(mouse)||toggle>0) {
      String clipboard = null;
      Letter current = null;

      float current_width = textWidth(textBox)*textsize/12;

      if (textbox.size()>0&&hindex!=-1)current = textbox.get(hindex);
      if (textbox.size()>0&&hindex==-1)current = textbox.get(textbox.size()-1);

      if (clipboard_toggle==0)cboard = "";

      if (cboard != clipBoard&&copy_clipboard) { 
        clipboard = clipBoard;
        cboard = clipBoard;
      } else clipboard = null;
      
      String a = getChar();
      String tm = "";
      String tm2 = "";
      tm0 = new ArrayList<Letter>();
      tm1 = new ArrayList<Letter>();

      if (!copy_clipboard&&clipboard_toggle==0) {

        timer --;
        Letter l = null;

        if (a!=null) l = new Letter(a, x+strwidth, y + vcount * textsize);
        if (a!=null&&timer%5==0&&!exclusion()&&key!=BACKSPACE&&key!=ENTER) {

          l.id = hindex +1;

          if (hindex==-1) {
            if (textBox.length()<cols) {
              l.y = y + vcount * textsize;
              cursory = l.y;
              textbox.add(l);
              textBox += a;
            }} else {

            Letter end = textbox.get(textbox.size()-1);
            Letter n = new Letter(a, cursorx, cursory);
            if ((hindex!=textbox.size()-1||hindex!=-1)&&timer%5==0) {

              Letter b = textbox.get(hindex);
              l.id = b.id ;

              n.x = cursorx ;
              if (hindex-1> 0)l.y = y + textbox.get(hindex-1).vpos * textsize;
              else l.y = y; 
              cursory = y;

              tm = textBox.substring ( 0, hindex + 1);
              tm += a;
              tm2  = textBox.substring ( hindex + 1, textBox.length()  );
              textBox = tm + tm2;
              hindex ++;
              if (hindex < textbox.size()-1)cursorx = textbox.get(hindex+1).x;
            }
          }

          if (timer<=0)timer = 21;
          
        } else if (keyPressed && key==BACKSPACE&&timer%5==0) {
          delete();
        } else if (keyPressed && keyCode==ENTER&&timer%5==0) {
          value = PApplet.parseFloat(textBox);
        }
      } else if (copy_clipboard&&clipboard_toggle==1&&timer%5==0) {
        if (!tsize) {
          if (timer<=0) {
            timer = 21;
          }
          if (hindex>-1) {
            tm = textBox.substring ( 0, hindex  );
            tm2  = textBox.substring ( hindex, textBox.length()  );

            if (hindex>-1) {
              if (hindex<textBox.length())tm = textBox.substring ( 0, hindex + 1  );
              if (hindex<textBox.length())tm2  = textBox.substring ( hindex + 1, textBox.length());
              tm += cboard;
              tm += tm2;

              textBox = tm;
            }
          } else {

            for (int i=0; i<cboard.length(); i++) {
              String b = str(cboard.charAt(i));
              textBox += b;
            }}}}}
  };
  
  public void dragText(){
    
  };

  public void getCursor() {

    getClick();
    //cursor(HAND);
    Boolean k = false;
    if(mouse!=null&&pos(m))k = true;
    if (vindex>-1) {
    }
    if (hindex==-1) {
      if (textbox.size()==0) {
        cursory = y;
        cursorx = 1;
        vindex = 0;
      } else {
        if (textbox.size()>0&&hindex<textbox.size()) {
          cursory = y + textbox.get(textbox.size()-1).vpos * textsize;
          cursorx = textbox.get(textbox.size()-1).x + textbox.get(textbox.size()-1).w*(textsize/12)-x;
        }
      }
    }
    if (hindex>-1) {
      if (textbox.size()>hindex+1) {
        cursorx = textbox.get(hindex).x + textbox.get(hindex).w*(textsize/12) - x;
        cursory = y + textbox.get(hindex).vpos * textsize;
      }
    }
    if ((pos()||toggle>0)||k) {
      cursor(POINT);
      if (t1>0) {
        t1 --;
        if (strheight<y+h) {
          stroke(0);
          strokeWeight(1);
          line(x+cursorx, cursory, x+cursorx, cursory+textsize);
        }
        if (t1<=0)t2 = blkrate;
      }
      if (t2>0&&t1<=0) {
        t2--;
        if (t2<=0)t1 = blkrate;
      }
    } else cursor(ARROW);
    
  };
  
  public void getCursor(PGraphics canvas) {

    getClick(mouse);
    //cursor(HAND);
    if (vindex>-1) {
    }
    if (hindex==-1) {
      if (textbox.size()==0) {
        cursory = y;
        cursorx = 1;
        vindex = 0;
      } else {
        if (textbox.size()>0&&hindex<textbox.size()) {
          cursory = y + textbox.get(textbox.size()-1).vpos * textsize;
          cursorx = textbox.get(textbox.size()-1).x + textbox.get(textbox.size()-1).w*(textsize/12)-x;
        }
      }
    }
    if (hindex>-1) {
      if (textbox.size()>hindex+1) {
        cursorx = textbox.get(hindex).x + textbox.get(hindex).w*(textsize/12) - x;
        cursory = y + textbox.get(hindex).vpos * textsize;
      }
    }
    if ((pos(mouse)||toggle>0)) {
      cursor(POINT);
      if (t1>0) {
        t1 --;
        if (strheight<y+h) {
          canvas.stroke(0);
          canvas.strokeWeight(1);
          canvas.line(x+cursorx, cursory, x+cursorx, cursory+textsize);
        }
        if (t1<=0)t2 = blkrate;
      }
      if (t2>0&&t1<=0) {
        t2--;
        if (t2<=0)t1 = blkrate;
      }
    } else cursor(ARROW);
    
  };

  public void delete() {
    Letter current = null;

    if (textbox.size()>0&&hindex!=-1)current = textbox.get(hindex);
    if (textbox.size()>0&&hindex==-1)current = textbox.get(textbox.size()-1);

    String tm1 = "", tm2 = "";

    String tma;
    if (keyPressed && key == BACKSPACE) {
      if (hindex==-1) {
        if (current!=null&&current.id>0) {
          if (lines.size()-1>0&&current.vpos<lines.size()-1) {
            vcount --;
            lines.remove(lines.size()-1);
          }
          hindex = current.id;
          textbox.remove(textbox.size()-1);
          textBox = textBox.substring ( 0, textBox.length()-1  );
        } else {
          textbox = new ArrayList<Letter>();
          textBox = "";
        }
      } else {
        if (current!=null&&current.id>-1) {
          //if(current!=null&&lines.get(lines.size()-1) > textbox.get(textbox.size()-1).id-1) lines.remove(lines.size()-1);
          if (lines.size()>0&&textbox.get(textbox.size()-1).vpos<lines.size()-1) {
            vcount --;
            lines.remove(lines.size()-1);
          }
          hindex = current.id-1;
          //hindex --;
          textbox.remove(textbox.size()-1);
          if (current.id >0) {
            tm1 = textBox.substring ( 0, hindex+1 );
            tm2 = textBox.substring ( hindex +2, textBox.length()  );
          } else if (current.id==0) {
            tm1 = "";
            tm2 = textBox.substring ( 0, textBox.length()  );
          }
          textBox = tm1 + tm2;
        }
      }
    }
  };

  public void paste() {

    for (int i=0; i<cboard.length(); i++) {
      String a = str(cboard.charAt(i));
      getKey();
    }
  };

  public void box() {
    if (!hidden) {
      //------------------------------- border
      if (border)stroke(col2);
      else noStroke();
      //-------------------------------label
      if (label!=null&&!clear) {
        fill(col2);
        text(label, x, y+textsize);
      }
      //---------------------------------fill
      if (fill)if (pos())fill(col);
      else fill(0);
      else noFill();
      fill(col);

      rect(x, y, w, h);
    }
  };
  
  public void box(PGraphics canvas) {
    if (!hidden) {
      //------------------------------- border
      if (border)canvas.stroke(col2);
      else canvas.noStroke();
      //-------------------------------label
      if (label!=null&&!clear) {
        canvas.fill(col2);
        canvas.text(label, x, y+textsize);
      }
      //---------------------------------fill
      if (fill)if (pos(mouse))canvas.fill(col);
      else canvas.fill(0);
      else canvas.noFill();
      canvas.fill(col);

      canvas.rect(x, y, w, h);
    }
  };

  public Letter sort(ArrayList<Letter>a) {
    Letter k = a.get(0);

    for (int i=0; i<a.size(); i++) {

      if (k.id>a.get(i).id) {
        k = a.get(i);
      }
    }
    return k;
  };

  public void conditionals() {

    if (vpos<=0) vpos = 0;
    Boolean k = false;
    if (selectAll&&toggle==1) {
      if (dragh.size()!=textBox.length())dragh.add(0);
    }

    if (keyPressed)timer --;
    else timer = 20;
    if (lines.size()>rows)lines.remove(lines.size()-1);
    if (lines.size()<=1)vcount = 0;
    if (toggle==1)clear = true;
    if (mousePressed&&(!pos()))hindex = -1;
    if (mousePressed&&(pos()))toggle=1;mdown = true;
    if(!mousePressed)mdown = false;
  };
  
  public void conditionals(PGraphics canvas) {

    if (vpos<=0) vpos = 0;
    if (selectAll&&toggle==1)if (dragh.size()!=textBox.length())dragh.add(0);
    if (keyPressed)timer --;
    else timer = 20;
    if (lines.size()>rows)lines.remove(lines.size()-1);
    if (lines.size()<=1)vcount = 0;
    if (toggle==1)clear = true;
    if (mousePressed&&(!pos(m)))hindex = -1;
    if (mousePressed&&(pos(m)))toggle=1;mdown = true;
    if(!mousePressed)mdown = false;
  };

  public void constants() {
    strheight = (floor(textWidth(textBox)/(w)));
    strwidth = ((textWidth(textBox))%(w));
  };

  public boolean exclusion() {
    boolean k = false;

    if (keyCode==37||keyCode==38||keyCode==39||keyCode==40||keyCode==33||keyCode==34||keyCode==17||keyCode==18||keyCode==9) {
      k = true;
    } else if (keyCode==20||keyCode==16||keyCode==255||keyCode==91||keyCode==36||keyCode==35||keyCode==45||keyCode==46||keyCode==8) {
      k = true;
    }
    return k;
  };



  public void select_All() {
    if (selectAll) {
    }
  };

  public void debug() {
    fill(255);
    text(vpos, 140, 110);

    text("lines " + lines.size(), 140, 140);
    text(totalwidth, 140, 160);
    if (hindex>-1) {
      text(hindex, 140, 120);
    } else {
      text(hindex, 140, 120);
    }
    if (vcount>-1)text(vcount, 140, 130);
    //if(clipBoard!=""){text(clipBoard,140,100);}
    for (int i=0; i<lines.size(); i++) {
      text(lines.get(i), x+x, y+40+10*i);
    }
  };



  public String getChar() {
    String a = null;

    if (keyPressed) {
      a  = str(key);
    }
    if (keyCode==9) a = null;

    return a;
  }
  public char getchar() {
    char a = '¬';

    if (keyPressed) {
      a  = PApplet.parseChar(key);
    }
    if (keyCode == 8) {
    }
    pos();
    return a;
  };

  public boolean pos() {

    float X = mouseX;
    float Y = mouseY;

    return X > x && X < x + w && Y > y && Y < y + h;
  };
  
  public boolean pos(PVector m) {

    float X = m.x;
    float Y = m.y;

    return X > x && X < x + w && Y > y && Y < y + h;
  };

  public void calc_lwidth() {
    for (int i=0; i<strheight+1; i++) {
      for (int j=0; j<w; j++) {
      }
    }
  };

  public void insert() {
    if (hindex>-1) {
    } else {
    }
  };

  public void mpos() {
    float X = mouseX;
    float Y = mouseY;
    float ww = w/cols;
    float hh = h/rows;

    if (pos())posx = floor(X/ww)*ww-10;
    posy = floor(Y/hh)*hh;
  };
  
  public void mpos(PVector m) {
    float X = m.x;
    float Y = m.y;
    float ww = w/cols;
    float hh = h/rows;

    if (pos(m))posx = floor(X/ww)*ww-10;
    posy = floor(Y/hh)*hh;
  };

  public void getClick() {
    if (pos() && mousePressed)toggle++;
    if (!pos()&& mousePressed)toggle=0;
    if(toggle==2)toggle=0;
  };
  
  public void getClick(PVector m) {
    
    if (pos(m) && mousePressed)toggle++;
    if (!pos(m)&& mousePressed)toggle=0;
    if(toggle==2)toggle=0;
  };

  public void nav() {
    if (hindex>=textbox.size()-1) {
      hindex  =-1;
    }
    if (textbox.size()>0) {
      if (hindex>=1) {
        if (keyPressed && keyCode == 37 &&timer%5==0) {
          hindex --;
        }
      }
      if (hindex<=textbox.size()-1&&hindex>-1) {
        if (keyPressed && keyCode == 39 &&timer%5==0) { 
          hindex ++;
        }
      }
      //if(keyPressed && key == UP && strheight >0) hindex += vpos *2;
      //if(keyPressed && key == DOWN && strheight )

      if (hindex==-1) {
        if (keyPressed && keyCode == 37 &&timer%5==0) {
          hindex = textbox.size()-2;
        }
        //if(keyPressed && keyCode == 39 &&timer%5==0){ hindex = 0;}
      }
    }
  };
};

class Text{
  
  float x,y,textsize;
  
  boolean visible;
  int col,col1,col2,col3,col4;
  String text = "";
  Text(float X,float y,String s){
    x = X;
    y = Y;
    
    text = s;
  };
  
  public void draw(){
      if(visible){
        fill(col);
        text(text,x,y);
    }
  };

};
public void camera (){
  String[] cameras = Capture.list();
  
  if (cameras.length == 0) {
    println("There are no cameras available for capture.");
    exit();
  } else {
    println("Available cameras:");
    for (int i = 0; i < cameras.length; i++) {
      println(cameras[i]);
    }
    
    // The camera can be initialized directly using an 
    // element from the array returned by list():
   
    //cam.start();     
  }
};
public Object getFromClipboard (DataFlavor flavor) {

  Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); 
  Transferable contents = null;
  try{
   contents = clipboard.getContents(null);
  }catch(IllegalStateException e){
    
  }
  
  Object object = null;

  if (contents != null && contents.isDataFlavorSupported(flavor))
  {
    try
    {
      object = contents.getTransferData(flavor);
      //println("Clipboard.getFromClipboard() >> Object transferred from clipboard.");
    }

    catch (UnsupportedFlavorException e1) // Unlikely but we must catch it
    {
      //println("Clipboard.getFromClipboard() >> Unsupported flavor: " + e1);
      //~  e1.printStackTrace();
    }

    catch (java.io.IOException e2)
    {
      //println("Clipboard.getFromClipboard() >> Unavailable data: " + e2);
      //~  e2.printStackTrace();
    }
  }

  return object;
}

public String getTextFromClipboard () {
  String text = (String) getFromClipboard(DataFlavor.stringFlavor);
 
  if (text==null) 
    return "";
 
  return text;
}
class Dropdown extends Menu {

  Slider slider;
  float windowx,bwindowx,hiddenw;
  int dcount,windowSize = 5;
  boolean dclick,visible = true,dclose,draggable,mcoord;
  Button title;
  Boundary boundary;
  PVector mouse;
  tab parentTab;
  Menu subMenu;
  Dropdown dMenu;

  Dropdown() {
    
  };

  Dropdown(float xx, float yy, float ww, float h, String[] Labels) {
    dmenu = true;
    
    x = xx;
    y = yy;
    bx = x;
    by = y;
    
    w = ww;
    
    setLabels(Labels);
    h = 20;
    
    windowx = windowSize * 20;
    bwindowx = windowx;
    boundary = new Boundary(x,y,w,h,4);
  };


  Dropdown(float xx, float yy, float ww, String[] Labels) {

    dmenu = true;
    x = xx;
    y = yy;
    bx = x;
    by = y;
    
    w = ww;

    setLabels(Labels);
    if(Labels.length>5)setSlider();
    h = 20;
    
    windowx = windowSize * 20;
    bwindowx = windowx;
    boundary = new Boundary(x,y,w,h,4);
  };
  
  Dropdown(float xx, float yy, float ww, String l, String[] Labels) {

    dmenu = true;
    x = xx;
    y = yy;
    bx = x;
    by = y;
    
    w = ww;
    
    label = l;
    blabel = l;
    
    setLabels(Labels);
    h = 20;
    windowx = windowSize * 20;
    if(Labels.length>5)setSlider();
    bwindowx = windowx;
    boundary = new Boundary(x,y,w,h,4);
  };
  


  Dropdown(float xx, float yy, float ww, String l, String[] Labels, int k) {

    dmenu = true;
    x = xx;
    y = yy;
    bx = x;
    by = y;
    
    w = ww;
    
    label = l;
    blabel = l;
    
    windowx = windowSize * 20;
    bwindowx = windowx;
    setLabels_(Labels);
    if(Labels.length>5)setSlider_();
    h = 20;
    boundary = new Boundary(x,y,w,h,4);
  };

  Dropdown(float xx, float yy, float ww, String[] Labels, int k) {

    dmenu = true;
    x = xx;
    y = yy;
    w = ww;
    h = 20 * (k + 1);
    bx = x;
    by = y;
    
    windowx = windowSize * 20;
    bwindowx = windowx;
    setLabels(Labels);
    if(Labels.length>5)setSlider();
    boundary = new Boundary(x,y,w,h,4);
  };
  
  public void labelsToArray(String []a){
    for (int i=0; i<a.length; i++) {
      String s = a[i];
      
      labels.add(s);
      
    }
  };

  public void setLabels(String[] a) {
    
    if (label==null) label = a[0];
    float mwidth = w;
    title = new Button(x,y,w,20,label);
    title.parent = this;
    
    for (int i=0; i<a.length; i++) {

      Button b =null;
      if(textWidth(a[i])>mwidth) mwidth = textWidth(a[i]+20);
    }
    for (int i=0; i<a.length; i++) {

      Button b =null;
      if(textWidth(a[i])>mwidth) mwidth = textWidth(a[i]);
      if(a.length<5) b = new Button(x, (y + 20) + 20 * i, mwidth, 20,a[i]);
      else b = new Button(x, (y + 20) + 20 * i, mwidth - 10, 20,a[i]);

      b.border = false;
      b.togglebox = true;
      //b.parent = this;
      b.visible = true;
      items.add(b);
    }
    
    w = mwidth;
    
  };
  
  public void setLabels_(String[] a) {
    
    if (label==null) label = a[0];
    float mwidth = w;
    title = new Button(x,y,w,20,label);
    title.parent = this;
    
    for (int i=0; i<a.length; i++) {

      Button b =null;
      if(textWidth(a[i])>mwidth) mwidth = textWidth(a[i]+20);
    }
    for (int i=0; i<a.length; i++) {

      Button b =null;
      if(textWidth(a[i])>mwidth) mwidth = textWidth(a[i]);
      if(a.length<5) b = new Button(x, (y + 20) + 20 * i, mwidth, 20,a[i]);
      else b = new Button(x, (y + 20) + 20 * i, mwidth - 10, 20,a[i]);

      b.border = false;
      b.togglebox = true;
      //b.parent = this;
      b.visible = true;
      items.add(b);
    }
    
    hiddenw = mwidth;
    
  };

  public void setSlider() {
    slider = new Slider(x + w - 10, y + 20, 10, 20*5);
    slider.vertical = true;
    slider.bar = true;
    slider.classic = true;
    slider.visible = true;
    slider.valuex = 0;
    slider.vertical = true;
    slider.tvisible = false;
  };
  
  public void setSlider_() {
    slider = new Slider(x + hiddenw - 10, y + 20, 10, 20*5);
    slider.vertical = true;
    slider.bar = true;
    slider.classic = true;
    slider.visible = true;
    slider.valuex = 0;
    slider.vertical = true;
    slider.tvisible = false;
  };
  
  public void displayDropdown(){
    fill(255);
    
    if(items.size()>0){
      drawLabel();
      selfClick();
      drawButtons();
      drawSlider();
      drawDragbox();
      drag();
      
      if (pos()||(dclick&&subPos()))menu = true;
      if(dMenu!=null){
        dMenu.x = x + w;
        dMenu.y = y;
      }
      if(subMenu!=null){
        subMenu.x = x + w;
        subMenu.y = y;
      }
      drawSubMenu();
    }
  };

  public void drawSubMenu(){
    if(subMenu!=null){
      if(subMenuPos())subMenu.show = true;
      if(pos()&&!subMenuPos())subMenu.show = false;
    }
    if(subMenu!=null&&subMenu.show)subMenu.trace();
    if(dMenu!=null&&subMenuPos())dMenu.displayDropdown();
  };

  public void drawSubMenu(PVector mouse){
    if(subMenu!=null&&subMenuPos(mouse))subMenu.show = true;
    //else if(subMenu!=null)subMenu.show = false;
    if(subMenu!=null)subMenu.trace();
    if(dMenu!=null&&subMenuPos(mouse))dMenu.displayDropdown();
  };
  
  public void displayDropdown(PGraphics canvas){
    fill(255);
    
    if(items.size()>0){
      drawLabel(canvas);
      selfClick(mouse);
      drawButtons(canvas);
      drawSlider(canvas);
      drawDragbox(canvas);
      drag(mouse);
      drawSubMenu(mouse);
      if (pos(mouse)||(dclick&&subPos(mouse))||(dMenu!=null&&dMenu.menu)||(subMenu!=null&&subMenu.menu))menu = true;
      else menu = false;
      if(dMenu!=null){
        dMenu.x = x + w;
        dMenu.y = y;
      }
      if(subMenu!=null){
        subMenu.x = x + w;
        subMenu.y = y;
      }
    }
  };
  
  public void drawButtons(){
    
    dcount = 0;

      if(dclick&&slider!=null){
        fill(255);
        rect(x,y+h,w,slider.h);
        fill(0,150);
        rect(x,y+h,w,slider.h);
      }



    for(int i=0;i<items.size();i++){
      Button b = items.get(i);
      
      if(drag){
        b.x = x;
        b.y = y + 20 + 20 * i;
        b.by= y + 20 + 20 * i; 
      }
      
      if(slider!=null&&slider.mdown)b.y = b.by - slider.valuex;
      
      if(slider!=null){
        
      if(!slider.mdown){
      if(!dclick)b.visible = false;
      else if(b.y + b.h < y + h + windowx+1) b.visible = true;
        
      }
      else {
        if(b.y + b.h > y + h + windowx+1||b.y<y+h-1)b.visible = false;
        else b.visible = true;
      }}
      else{
        if(!dclick)b.visible = false;
        else b.visible = true;
        
        b.x = x;
        b.y = y + 20 + 20 * i;
      }
      if(b.y<y+h-1)b.visible = false;
      if(b.visible){
        
        b.draw();
        b.highlight();
        if(b.pos(mousePos))dcount++;
      }

      if(slider!=null){
    
      if(mousePressed&&b.pos(mousePos)&&b.visible&&!slider.mdown){
          label = b.label;
          index = i;
          dclick = false;
      }
    }
      else{
        if(mousePressed&&b.pos(mousePos)&&b.visible){
          label = b.label;
          index = i;
          dclick = false;
      }}}
      if(slider!=null){if(dcount==0&&mousePressed&&!pos(mousePos)&&!slider.pos(mousePos)&&!slider.mdown)dclick = false;}
      else if(dcount==0&&mousePressed&&!pos(mousePos))dclick = false;
      //if(mdown2)dclick
  };
  
  public void drawButtons(PGraphics canvas){
    
    dcount = 0;
      if(dclick&&slider!=null){
        canvas.fill(255);
        canvas.rect(x,y+h,w,slider.h);
        canvas.fill(0,150);
        canvas.rect(x,y+h,w,slider.h);
      }
    for(int i=0;i<items.size();i++){
      
      Button b = items.get(i);
      
      if(drag){
        b.x = x;
        b.y = y + 20 + 20 * i;
        b.by= y + 20 + 20 * i; 
      }
      
      if(slider!=null&&slider.mdown)b.y = b.by - slider.valuex;
      
      if(slider!=null){
      if(!slider.mdown){
      if(!dclick)b.visible = false;
      else if(b.y + b.h < y + h + windowx+1) b.visible = true;
        
      }else {
        if(b.y + b.h > y + h + windowx+1||b.y<y+h-1)b.visible = false;
        else b.visible = true;
        
      }}else{
        if(!dclick)b.visible = false;
        else b.visible = true;
      }
      if(b.y<y+h-1)b.visible = false;
      if(b.visible){
        b.mouse = mouse;
        //b.parentCanvas = true;
        b.draw(canvas);
        
        b.highlight(mouse);
        if(b.pos(mouse))dcount++;
      }
      
      if(slider!=null){
    
      if(mousePressed&&b.pos(mouse)&&b.visible&&!slider.mdown){
          label = b.label;
          index = i;
          dclick = false;
      }} else{
        if(mousePressed&&b.pos(mouse)&&b.visible){
          label = b.label;
          index = i;
          dclick = false;
      }}}
      if(slider!=null){if(dcount==0&&mousePressed&&!pos(mouse)&&!slider.pos(mouse)&&!slider.mdown)dclick = false;}
      else if(dcount==0&&mousePressed&&!pos(mouse))dclick = false;
  };
  
  public void drawBoundary(){
    
    if(draggable){
      if(border)boundary.draw2();
      drag();
    }
    
  };
  
  public void drawDragbox(){
    
    if(draggable){
      fill(255);
      rect(x,y - 10,w,10);
      fill(0,50);
      rect(x,y - 10,w,10);
    }
    
  };
  
  public void drawDragbox(PGraphics canvas){
    
    if(draggable){
      canvas.fill(255);
      canvas.rect(x,y - 10,w,10);
      canvas.fill(0,50);
      canvas.rect(x,y - 10,w,10);
    }
    
  };
  
  
  public void drawSlider(){
    if(drag&&slider!=null){
      slider.x = x + w - 10;
      slider.y = y + 20;
    }
    if(slider!=null&&dclick){
    slider.draw();
    slider.mouseFunctions();
    slider.set(0,(20*items.size()-20*5));
    }
  };
  
  public void drawSlider(PGraphics canvas){
    if(drag&&slider!=null){
      slider.x = x + w - 10;
      slider.y = y + 20;
    }
    if(slider!=null&&dclick){
        slider.mouse = mouse;
        slider.draw(canvas);
        slider.mouseFunctions(mouse);
        slider.set(0,(20*items.size()-20*5));
    }
  };
  
  public void drawLabel(){
    
    fill(255);
    rect(x,y,w,h);
    fill(0,150);
    rect(x,y,w,h);
    text(label,x+2,y+tsize+2);
    
  };
  
  public void drawLabel(PGraphics canvas){
    
    canvas.fill(255);
    canvas.rect(x,y,w,h);
    canvas.fill(0,150);
    canvas.rect(x,y,w,h);
    canvas.text(label,x+2,y+tsize+2);
    
  };
  
  public void drag(){
    if(slider!=null){
    if(dpos()&&mousePressed&&!drag&&!slider.mdown){
      if(draggable){
        drag = true;
        dx = x - mouseX;
        dy = y - mouseY;
        mdown = true;
      }}}
      else{
        if(dpos()&&mousePressed&&!drag){
          if(draggable){
        drag = true;
        dx = x - mouseX;
        dy = y - mouseY;
        mdown = true;
      }}}
    
    if(drag){
      x = mouseX + dx;
      y = mouseY + dy;
    }
    
    if(!mousePressed){
      dx = 0;
      dy = 0;
      drag = false;
    }
  };
  
  public void drag(PVector m){
    if(slider!=null){
    if(dpos(mouse)&&mousePressed&&!drag&&!slider.mdown){
      if(draggable){
        drag = true;
        dx = x - m.x;
        dy = y - m.y;
        mdown = true;
      }}}else{
        if(dpos(mouse)&&mousePressed&&!drag){
          if(draggable){
        drag = true;
        dx = x - m.x;
        dy = y - m.y;
        mdown = true;
      }}}
    
    if(drag){
      x = m.x + dx;
      y = m.y + dy;
    }
    
    if(!mousePressed){
      dx = 0;
      dy = 0;
      drag = false;
    }
  };
  
  public void selfClick(){
    mousePos = new PVector(mouseX,mouseY);
    fill(255);
    //if(dclick)text(hello,100,200);
    if(slider!=null){
    if(pos(mousePos)&&mousePressed&&!mdown&&!dclick&&!slider.mdown&&!drag){
        dclick = true;
        mdown = true;
    }
    if(pos(mousePos)&&mousePressed&&!mdown&&dclick&&!slider.mdown&&!drag){
        dclick = false;
        mdown = true;
    }}
    else{
      
      if(pos(mousePos)&&mousePressed&&!mdown&&!dclick&&!drag){
        
        dclick = true;
        mdown = true;
    }
    if(pos(mousePos)&&mousePressed&&!mdown&&dclick&&!drag){
        dclick = false;
        mdown = true;
    }}
    if(!mousePressed)mdown = false;
  };
  
  public void selfClick(PVector mouse){
    if(slider!=null){
    if(pos(mouse)&&mousePressed&&!mdown&&!dclick&&!slider.mdown&&!drag){
        dclick = true;
        mdown = true;
    }
    if(pos(mouse)&&mousePressed&&!mdown&&dclick&&!slider.mdown&&!drag){
        dclick = false;
        mdown = true;
    }}
    else{
      if(pos(mouse)&&mousePressed&&!mdown&&!dclick&&!drag){
        dclick = true;
        mdown = true;
    }
    if(pos(mouse)&&mousePressed&&!mdown&&dclick&&!drag){
        dclick = false;
        mdown = true;
    }}
    if(!mousePressed)mdown = false;
  };
  
  public void toggled(int i,Object o,String c){
    Button b = items.get(i);
    
    if(b.visible)b.toggle2(o,c);
    
  };
  
  public void sptoggled(Object o,String c){
    
    for(int i=0;i<items.size();i++){
      Button b = items.get(i);
      if(b.visible)b.toggle3(o,c);
      if(!b.pos()&&mousePressed)b.toggle=0;
    }
    
  };
  
  public boolean subPos(){
    return mouseX>x&&mouseX<x+w&&mouseY>y+20&&mouseY<y+20+items.size()*20;
  };
  
  public boolean subPos(PVector m){
    return m.x>x&&m.x<x+w&&m.y>y+20&&m.y<y+20+items.size()*20;
  };
  
  public boolean dpos(){
    return mouseX>x&&mouseX<x+w&&mouseY>y-10&&mouseY<y;
  };
  
  public boolean dpos(PVector m){
    return m.x>x&&m.x<x+w&&m.y>y+20&&m.y<y;
  };

  public boolean subMenuPos(){
    return mouseX>x+w-20&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
  };

  public boolean subMenuPos(PVector m){
    return m.x>x+w-20&&m.x<x+w&&m.y>y&&m.y<y+h;
  };
};


public void spawnRaces(String a, int b,int num){
  entities = new ArrayList<Entity>();
  Entity e = new Entity(23,20,W-46,H-90);
  e.ent = entities.size();
  e.hRaces = b;
  int pos = entities.size();
  float a1 = 0;
  for(int i=0;i<8;i++){
    e.oscilators.add(a1);
    e.oscilatorCounters.add(a1);
  };

  if(a=="Human"||a=="human"||a=="humans"||a=="Humans"){

    for(int i=0;i<b;i++){
      
      ArrayList<Human> race = new ArrayList<Human>();
      int c = color(random(255),random(255),random(255));
      
      float r = random(10,20);
      //r = 10;
      float br = random(r*2,50);
      float vlimit = random(5,10);
      vlimit = 5;
      float alimit = random(0.1f,0.9f);
      alimit = 0.1f;
      float min = random(r*2,50);
      //float alignment = random(5,)
      //float alimit = random(5,20);
      for(int j=0;j<num;j++){

        Human h = new Human(random(W),random(H),j,i,pos,c);

        h.scene = e.scene;
        h.radius = r;
        h.oscilators = e.oscilators;
        h.oscilatorCounters = e.oscilatorCounters;
        h.breathingroom = br;
        h.vlimit = vlimit;
        h.vlimitb = vlimit;
        h.alimit = alimit;
        h.alimitb = alimit;
        h.mass = h.radius*0.4f;
        h.min = min;
        h.minb = min;

        race.add(h);

    }e.Humans.add(race);}

      for(int k=0;k<b;k++){
        for(int l=0;l<b;l++){
          e.Humans.get(k).get(0).seekNeighbour.add(PApplet.parseFloat(-1));
          e.Humans.get(k).get(0).avoidNeighbour.add(PApplet.parseFloat(-1));
          e.Humans.get(k).get(0).alignNeighbour.add(PApplet.parseFloat(-1));
          e.Humans.get(k).get(0).prox2.add(new ArrayList<Human>());
        }
        for(int l=0;l<b;l++){
          int p = floor(random(20));
          int p1 = floor(random(20));
          int p2 = floor(random(20));
          if(l!=k){
          if(p>=10)e.Humans.get(k).get(0).seekNeighbour.set(l,random(0,50));
            else e.Humans.get(k).get(0).seekNeighbour.set(l,PApplet.parseFloat(-1));
          if(p1>=10)e.Humans.get(k).get(0).avoidNeighbour.set(l,random(0,50));
            else e.Humans.get(k).get(0).avoidNeighbour.set(l,PApplet.parseFloat(-1));
          if(p2>=10)e.Humans.get(k).get(0).alignNeighbour.set(l,random(0,50));
            else e.Humans.get(k).get(0).alignNeighbour.set(l,PApplet.parseFloat(-1));
      }
      if(l==k){
        e.Humans.get(k).get(0).seekNeighbour.set(k,PApplet.parseFloat(20));
        e.Humans.get(k).get(0).avoidNeighbour.set(k,PApplet.parseFloat(-1));
        e.Humans.get(k).get(0).alignNeighbour.set(k,PApplet.parseFloat(-1));
      }}}}

  if(a=="Plant"||a=="plant"||a=="plants"||a=="Plants"){
    for(int i=0;i<b;i++){

      ArrayList<Plant> species = new ArrayList<Plant>();

      for(int j=0;j<num;j++){

        Plant p = new Plant(random(W),random(H),i,j,pos);

        p.scene = e.scene;

        species.add(p);

    }e.Plants.add(species); }}
  if(a=="Mineral"||a=="mineral"||a=="minerals"||a=="Minerals"){
    for(int i=0;i<b;i++){

      ArrayList<Mineral> species = new ArrayList<Mineral>();

      for(int j=0;j<b;j++){

        Mineral m = new Mineral(random(W),random(H),i,j,pos);

        m.scene = e.scene;

        species.add(m);

    }e.Minerals.add(species); }}

  if(a=="Animal"||a=="animal"||a=="Animals"||a=="animals"){
    for(int i=0;i<b;i++){

      ArrayList<Animal> species = new ArrayList<Animal>();

      for(int j=0;j<num;j++){

        Animal A = new Animal(random(W),random(H),i,j,pos);

        A.scene = e.scene;

        species.add(A);

    }e.Animals.add(species); }}

  if(a=="Metals"||a=="metal"||a=="metals"||a=="Metals"){
    for(int i=0;i<b;i++){

      ArrayList<Metal> type = new ArrayList<Metal>();

      for(int j=0;j<num;j++){

        Metal m = new Metal(random(W),random(H),i,j,pos);

        m.scene = e.scene;

        type.add(m);

    }e.Metals.add(type); }
  }

  entities.add(e);

  if(entities.size()==b){

    for(int i=0;i<entities.size();i++){

         //Entity e = entities.get(i).Humans.get(0);
         
         
    }}
};

public void textbox(Button a,Object b){

}

class Tree{
  float x,y;
  
  
  Tree(){
    
  }
  
  
};

class SoundSpectrum{
  
  SoundFile Audio = null;
  Amplitude amp;
  
  FFT fft;
  AudioIn in;
  
  processing.sound.Sound s;
  public float volume = 0,offsetx,offsety;
  int bands,slices;
  PImage specImg;
  
  int frame,frame2,frames,count;
  boolean constructImage,debug;
  
  float[] spectrum = new float[bands];
  ArrayList<PVector> audio = new ArrayList<PVector>();
  ArrayList<ArrayList<PVector>> audio2 = new ArrayList<ArrayList<PVector>>();
  ArrayList<ArrayList<PVector>> visualiser = new ArrayList<ArrayList<PVector>>();
  ArrayList<PImage> audioSlices = new ArrayList<PImage>();
  ArrayList<GridImg> gridImages = new ArrayList<GridImg>();
  ArrayList<Image> imageProcesses = new ArrayList<Image>();
  GridImg imageGrid;
  
  PApplet sketchRef;
  tab parent;
  Window window;
  
  SoundSpectrum(processing.sound.Sound S, PApplet sketchRef_,int Bands,String loc){
    s = S;
    slices = 1;
    sketchRef = sketchRef_;
    s = new processing.sound.Sound(sketchRef);
    bands = Bands;
    // Create an Input stream which is routed into the Amplitude analyzer
    amp = new Amplitude(sketchRef_);
    Audio = new SoundFile(sketchRef_,loc);
    // Create an Input stream which is routed into the Amplitude analyzer
    fft = new FFT(sketchRef_, bands);
    
    //amp.input(audio);
    fft.input(Audio);
    Audio.play();
    //audio.amp(0.01);
    frames = Audio.frames();
    
  }
  
  SoundSpectrum(processing.sound.Sound S, PApplet sketchRef_,int Bands,int Slices,String loc){
    s = S;
    slices = Slices;
    sketchRef = sketchRef_;
    s = new processing.sound.Sound(sketchRef);
    bands = Bands;
    // Create an Input stream which is routed into the Amplitude analyzer
    amp = new Amplitude(sketchRef_);
    Audio = new SoundFile(sketchRef_,loc);
    // Create an Input stream which is routed into the Amplitude analyzer
    fft = new FFT(sketchRef_, bands);
    
    //amp.input(audio);
    fft.input(Audio);
    Audio.play();
    //audio.amp(0.01);
    frames = Audio.frames();
    
    load();
    int l = floor(sqrt(audioSlices.size()));
    GridImg imageGrid = new GridImg(parent.x + offsetx,parent.y + offsety,l,l,audioSlices);
    
    
  }
  
  SoundSpectrum(){
    
  }
  
  public void save(){
    
  };
  
  public void loadSave(){
    
  };
  
  public void load() { 
  
  //---------------------------------------------------------------------------------------------------
  // Map vertical mouse position to volume.
  float amplitude = map(mouseY, 0, height, 0.4f, 0.0f);

  // Instead of setting the volume for every oscillator individually, we can just
  // control the overall output volume of the whole Sound library.
  s.volume(0);
  //------------------------------------------------------------------------------------------------------
 
  if(Audio.isPlaying())analyse();
  else if(!constructImage)construct();
    
};

public void draw(){
  if(constructImage)display();
  debug();
}

public void play(){
  s.volume(1);
  Audio.play();
};

public void play(float a){
  Audio.play(a);
};

public void analyse(){
  fft.analyze(spectrum);
  audio2.add(new ArrayList<PVector>());
  visualiser.add(new ArrayList<PVector>());
  for(int i = 0; i < bands; i++){
  // The result of the FFT is normalized
  // draw the line for frequency band i scaling it up by 5 to get more amplitude.
  float k = map(i,0,bands,0,width);
  float y = map( (spectrum[i]),0,0.01f,0,height);
  
  float k1 = i;
  float y1 = map( (spectrum[i]),0,0.01f,0,255);
  
  colorMode(HSB);
  stroke(i,random(255),random(255));
  fill(i,random(255),random(255));
  audio.add(new PVector(k,y));
  audio2.get(frame).add(new PVector(k,height-y));
  visualiser.get(frame).add(new PVector(i,y1));
  //vertex(k,-y);
  stroke(i,random(255),random(255));
  //vertex(bar.x,bar.y);
  line(k,height,k,height -y);
  }
  //endShape(OPEN);
  fill(255);
  text("playing",100,100);
  frame ++;
};

public void construct(){
    colorMode(RGB);
    fill(255);
    text("Constructing",100,110);
    
    specImg = createImage(bands,frame,RGB);
    specImg.loadPixels();
    loadPixels();
    
    for(int i = 0; i < visualiser.size(); i++){
      ArrayList<PVector> b = visualiser.get(i);
      for(int j = 0; j < b.size(); j++){
        
        int pos = j+i*b.size();
        PVector p = b.get(j);
        
        specImg.pixels[pos] = color(255-p.y,map(i,0,255,0,height),255-p.y);
        
        pixels[pos] = color(random(255),0,0);
      }}
      updatePixels();
      specImg.updatePixels();
      
    if(slices>1&&audioSlices.size()<slices){
      PImage img = createImage(bands,frame/slices,RGB);
      
      count = 0;
      for(int i = 0; i < visualiser.size(); i++){
        
        ArrayList<PVector> b = visualiser.get(i);
        
          for(int j = 0; j < b.size(); j++){
            if(count==0)img.loadPixels();
            
            int pos = j+i*b.size();
            PVector p = b.get(j);
            
            img.pixels[count] = specImg.pixels[pos];
            count++;
            
            if(count>=(specImg.width*specImg.height)/2){
              img.updatePixels();
              if(audioSlices.size()<slices)audioSlices.add(img);
              img = createImage(bands,frame/slices,RGB);
              count = 0;
            }}}
      text(slices + " slices",100,110);
    }else{
      text("1 slice",100,110);
      audioSlices.add(specImg);
    }
    constructImage = true;
};

public void display(){
  fill(255);
  if(slices>1){
        for(int i = 0; i < audioSlices.size(); i++){
          image(audioSlices.get(i),0,0+i*audioSlices.get(i).height);
        }
        text(audioSlices.size() + " slices",100,110);
        text("stopped",100,100);
      
    }else{
      image(specImg,0,0); 
      
      text("1 slice",100,110);
      text("stopped",100,100);
      if(frame2<frame-1)frame2++;
      }
};

public void debug(){
  if(debug){
  fill(0);
  text(frameRate,200,200);
  text(frames,200,210);
  text(frame,200,220);
  text(audio2.size(),200,230);
  text(visualiser.size(),200,240);
  }
};
  
  
};

class TwitterKeyword{
  
  ArrayList<String> Keywords = new ArrayList<String>();
  public boolean toggle,addKeyword,showKeyword; 
  Menu keywords;
  String []keywordArray;
  int col = 255;;
  boolean arraySet;
  TwitterKeyword(String S){
    Keywords.add(S);
    keywords = new Menu(100,100,70,Keywords);
  };
  
  TwitterKeyword(String[] S){
    for(int i=0;i<S.length;i++){
      Keywords.add(S[i]);
    }
    
    keywords = new Menu(100,100,70,S,0);
  };
  
  TwitterKeyword(ArrayList<String> S){
    Keywords = S;
    keywords = new Menu(100,100,70,S);
  };
  
  public void showKeywords(){
    fill(col);
    for(int i=0;i<Keywords.size();i++){
      text(Keywords.get(i),100,100+10*i);
    }
  };
  
  public void addKeywords(String s){
    
    if(addKeyword&&arraySet){
      Keywords.add(s);
      arraySet = false;
    }
    
  };
  
  public void eventListener(){
    
  };
  
  public String [] getKeywords(){
    
    if(!arraySet){
      keywordArray = new String [Keywords.size()];
    for(int i=0;i<Keywords.size();i++){
      String s1 = Keywords.get(i);
      
      keywordArray[i] = s1;
      
    }arraySet = true;
    }
    return keywordArray;
  };
  
};

public class Grid {

  int id, rows, cols, imrows, imcols, camcols, camrows, tbcols, tbrows, ztoggle, ztoggle2, Rows, Cols, rowcount, colcount, totalAgents = 100, agentsCounted, squaresCounted,bcount,res,xRes,yRes;
  public int sides;
  int totalpixels;
  public float x, y, z, xback, yback, zback, w, h, lim, acceleration, elasticity, depth, sealevel = 0, floorlevel = 0.2f,groundlevel = 0.4f,grasslevel = 0.6f, mountainlevel = 0.8f, flying, fx, fy, zoom, yrot, xrot, zrot, distance,perlx_xoff,perlx_yoff, perly_xoff,perly_yoff,noise1 = 0.05f,noise2,noise3, XX, YY, vdistance, hdistance, bordersize = 1, groundlevel2 = 100, posx, posy, dx, dy, imw, imh, camw, camh, mdist = 20, y_padding = -0.8f, x_padding= -1,pxfx, pxfy,pyfx, pyfy,map1 = 2,map2 = 4,seed,scale1 = 0.05f,freq = 1,freq1 = 1,freq2 = 1,freq3 = 3,amp1 = 1,amp2 = 1,amp3 = 1,scale2 = 0.05f,scale3 = 0.05f,scale,amp = 1;
  float deltay, deltax;
  int C;
  public float convup = 0, convright = 0, convdown = 0, convleft = 0, threshold = 0, conv, convhp = 1, convvp = 1, convhn = -1, convvn = -1;
  float [][] perlx, perly, perlz, perlh, perlw, perld, perlr, perlg, perlb = new float[cols][rows], terrain;
  String label;
  public boolean trackmouse, drag, resize, init, border = true, fill = true, hover, count, wrap, move, collide, cloth, partition, bounce, mouse, forward = true, backward, pause, randcolor, graph, circular, 
    sdown;
  public boolean visible = true, field = false, reset, heading, intersect, perlcolor, perlheight, isometric, topdown, particle, terrain2d, terrain3d, entity, floored = true, entities, circle,rect;
  public boolean colrepeat, rowrepeat, contour, brightness, camera, toggle, tbtoggle, dot, attractor, populateBoundaries, debug, popuateSpecies;
  //img bools
  public boolean im_init, imtoggle, normal_img, mouse_img, blur_img, linedetect_img, dot_img, imreset, refreshed, backup, bright, sharp, convolved, imgreset;
  //webcam bools
  public boolean cm_init, camtoggle, normal_cam, mouse_cam, blur_cam, linedetect_cam, dot_cam, camreset, webcam, menu, updateimage;
  // bools
  public boolean normal, mouse_interact, blur, linedetect, shape, imgworkflow;
  boolean array, agentsPopulated, mapScoped, neighboured,beginSquareSorting,sortBoundaries,terrainP= true,Boundaries,bbb;

  Window search;
  taskList workflow;
  String[] palleteLabels = {"Circle", "Hide", "Graph", "Attractor", "Forward", "Backwards", 
    "Pause", "Heading", "Save", "Load", "Contour", "Mouse", "Reset", 
    "Populate Boundaries", "Spawn Entities", "Debug"};
  String []sliderLabels1 = {"Scale","Sea","Floor","Grass","Mountains","Distance","Height","hdistance","Xrot","Yrot","Zrot","xvar","Scale 1","Scale 2","Scale 3","Amp 1", "Amp 2","Amp 3","Freq 1","Freq 2","Freq 3","Seed"};

  String []sliderLabels2 = {"Scale","Sea","Floor","Grass","Mountains","Scale 1","Scale 2","Scale 3","Amp 1", "Amp 2","Amp 3","Freq 1","Freq 2","Freq 3","Seed"};
  Menu pallete;
  sliderBox sliderMenu;
  HashMap<String, String> workflow_link = new HashMap<String, String>();

  PImage current_image;

  PShape grid;
  
  int gridChildren;
  int [][] map;
  int [] map1d;
  float [][] mapNoise;
  float [] mapNoise1d;
  boolean [][] mapUpdate;
  boolean update,keyUpdate;

  //plain grid
  boolean plain;
  String test = "", link;
  PImage img, img1, cam, im, imgtemp;

  float [] b_kernel1d_ = {1/9, 1/9, 1/9, 1/9, 1/9, 1/9, 1/9, 1/9, 1/9};
  float[][] b_kernel2d_ = {{1/9, 1/9, 1/9}, 
    {1/9, 1/9, 1/9}, 
    {1/9, 1/9, 1/9}};

  float [] b_kernel1d = {1, 1, 1, 1, 1, 1, 1, 1, 1};
  float[][] b_kernel2d = {{1, 1, 1}, 
    {1, 1, 1}, 
    {1, 1, 1}};


  float [] sobelv1d = {convvn, 0, convvp, convvn, conv, convvp, convvn, 0, convvp};
  float [] sobelh1d = {convvn, 0, convvp, convvn, conv, convvp, convvn, 0, convvp};

  float[][] vkernel2d = {{convvn, 0, convvp }, 
    { convvn, 0, convvp }, 
    { convvn, 0, convvp }};

  float[][] hkernel2d = {{-1, -1, -1 }, 
    {0, 0, 0 }, 
    {1, 1, 1 }}; 

  float [] vkernel1d = {convvn, 0, convvp, convvn, conv, convvp, convvn, 0, convvp};

  float [] hkernel1d = {convhn, convhn, convhn, 0, conv, 0, convhp, convhp, convhp};

  float [] difflkernel1d = {0, 0, 0, -1, convleft, 0, 0, 0, 0}; 
  float [] diffrkernel1d = {0, 0, 0, 0, convright, -1, 0, 0, 0}; 
  float [] diffukernel1d = {0, -1, 0, 0, convup, 0, 0, 0, 0}; 
  float [] diffdkernel1d = {0, 0, 0, 0, convdown, 0, 0, -1, 0}; 

  HashMap<String, Boolean> values = new HashMap<String, Boolean>();
  HashMap<String, Float> floats = new HashMap<String, Float>();
  ArrayList<Grid_space> squares = new ArrayList<Grid_space>();
  ArrayList<Grid_space> unsortedSquares = new ArrayList<Grid_space>();
  ArrayList<ArrayList<Grid_space>> sortedSquares = new ArrayList<ArrayList<Grid_space>>();
  ArrayList<ArrayList<Grid_space>> wallSquares = new ArrayList<ArrayList<Grid_space>>();
  ArrayList<ArrayList<Grid_space>> unsortedWallSquares = new ArrayList<ArrayList<Grid_space>>();
  ArrayList<ArrayList<Grid_space>> sortedWallSquares = new ArrayList<ArrayList<Grid_space>>();
  ArrayList<Grid_space> wallSquaresBackup = new ArrayList<Grid_space>();

  ArrayList<ArrayList<Grid_space>> boundaries = new ArrayList<ArrayList<Grid_space>>();

  ArrayList<Grid_space> agents = new ArrayList<Grid_space>();
  ArrayList<Grid_space> agentsBackup = new ArrayList<Grid_space>();
  ArrayList<Grid_space> agentsConst = new ArrayList<Grid_space>();
  ArrayList<Grid_space> sortedAgents = new ArrayList<Grid_space>();
  ArrayList<ArrayList<Grid_space>> popHist = new ArrayList<ArrayList<Grid_space>>();
  ArrayList<ArrayList<Grid_space>> sortedPopHist = new ArrayList<ArrayList<Grid_space>>();
  ArrayList<ArrayList<Grid_space>> popStack = new ArrayList<ArrayList<Grid_space>>();
  ArrayList<ArrayList<Grid_space>> connections = new ArrayList<ArrayList<Grid_space>>();

  ArrayList<Grid_space> table = new ArrayList<Grid_space>();
  ArrayList<Grid_space> imsquares = new ArrayList<Grid_space>();

  ArrayList<Boolean> walls = new ArrayList<Boolean>();
  ArrayList<PImage> images = new ArrayList<PImage>();
  ArrayList<Button> buttons = new ArrayList<Button>();

  ArrayList<Grid_space> camsquares = new ArrayList<Grid_space>();
  ArrayList<Grid_space> temp_rows = new ArrayList<Grid_space>();
  ArrayList<Grid_space> temp_cols = new ArrayList<Grid_space>();
  ArrayList<Grid_space> temp_rowe = new ArrayList<Grid_space>();
  ArrayList<Grid_space> temp_cole = new ArrayList<Grid_space>();

  Grid_space [][]squares2 = new Grid_space[rows][cols];

  ArrayList<Grid_space> temp = new ArrayList<Grid_space>();
  ArrayList<Grid_space> temp2 = new ArrayList<Grid_space>();
  ArrayList<Grid_space> tempSquares = new ArrayList<Grid_space>();

  ArrayList<Shape> shapes = new ArrayList<Shape>();

  //color col = color(255);
  Grid() {
  };

  Grid(float xx, float yy, float ww, float hh, int Row, int Col,boolean k) {
    
    sliderMenu = new sliderBox(40,360,90,5,sliderLabels2);
    
    x = xx;
    y = yy;
    xback = x;
    yback = y;

    w = ww;
    h = hh;

    rows = Row;
    cols = Col;

    bordersize = 1;

    perlx  = new float[cols][rows];
    perly = new float[cols][rows];
    perlz = new float[cols][rows];
    perlr  = new float[cols][rows];
    perlg = new float[cols][rows];
    perlb = new float[cols][rows];
    terrain = new float[cols][rows];

    perlheight = true;
    squares2 = new Grid_space[rows][cols];

    trackmouse = false;
    //totalAgents = rows/2;
    if (BMS.terrain3d) {
      terrain3d = true;
      terrain2d = false;
    }else{
      terrain3d = false;
      terrain2d = true;
    }

    pallete = new Menu(W-90, H/2, 70, palleteLabels);
    pallete.draggable = true;
    seed = random(1000000);
    //init();
  };

  Grid(float xx, float yy, float ww, float hh) {
    
    
    x = xx;
    y = yy;
    xback = x;
    yback = y;
    w = ww;
    h = hh;
    bordersize = 1;
    squares2 = new Grid_space[rows][cols];
    trackmouse = true;
  };

  Grid(float xx, float yy, float ww, float hh,int Res) {
    
    sliderMenu = new sliderBox(40,360,90,5,sliderLabels2);
    
    x = xx;
    y = yy;
    xback = x;
    yback = y;
    w = ww;
    h = hh;
    cols = PApplet.parseInt(ww/Res);
    rows = PApplet.parseInt(hh/Res);
    res = Res;
    map = new int[cols][rows];
    scale = 0.05f;
    seed = 10;
    noiseSeed(PApplet.parseInt(seed));
    map = new int[cols][rows];
    map1d = new int[cols * rows];
    mapNoise = new float[cols][rows];
    mapNoise1d = new float[cols * rows];
    mapUpdate = new boolean[cols][rows];
    grid = createShape(GROUP);

    pallete = new Menu(W-90, H/2, 70, palleteLabels);
    pallete.draggable = true;
    seed = random(1000000);
    visible = true;
    init2();
    rect = true;
  };

  
  Grid(float xx, float yy,float W,float H,int xRes,int yRes){
    
    cols = PApplet.parseInt(W/xRes);
    rows = PApplet.parseInt(H/yRes);
    scale = 0.05f;
    seed = 10;
    this.xRes = xRes;
    this.yRes = yRes;
    noiseSeed(PApplet.parseInt(seed));
    map = new int[cols][rows];
    map1d = new int[cols * rows];
    mapNoise = new float[cols][rows];
    mapNoise1d = new float[cols * rows];
    mapUpdate = new boolean[cols][rows];
    
    init3();
  };
  

  //-3d-------------------
  Grid(float xx, float yy, float zz, float ww, float hh, float dd, int Col, int Row) {

    x = xx;
    y = yy;
    z = zz;
    xback = x;
    yback = y;
    zback = z;

    w = ww;
    h = hh;

    depth = dd;

    rows = Row;
    cols = Col;

    bordersize = 1;

    Cols = cols;
    Rows = rows;

    //totalAgents = rows;
    squares2 = new Grid_space[rows][cols];
    search = new Window( 50, 50, 200, 100, "C:\\Users\\paul goux\\");
  };
  //cam------------------------------------------------------
  Grid(float xx, float yy, int ww, int hh, String a) {

    x = xx;
    y = yy;
    xback = x;
    yback = y;
    w = ww;
    h = hh;
    rows = ww;
    cols = hh;
    if (a =="cam"||a == "Cam" || a == "CAM")camera = true;
    bordersize = 1;
    Cols = cols;
    Rows = rows;
    squares2 = new Grid_space[rows][cols];

    search = new Window( 50, 50, 200, 100, "C:\\Users\\paul goux\\");
  };
  //------------------------------------------------
  Grid(float xx, float yy, int ww, int hh, int Cols, int Rows, int Sides) {

    x = xx;
    y = yy;
    xback = x;
    yback = y;
    w = ww;
    h = hh;
    rows = Rows;
    cols = Cols;
    Cols = cols;
    Rows = rows;
    bordersize = 1;
    zrot = 0;
    shape = true;
    sides = Sides;
    perlx  = new float[cols][rows];
    perly = new float[cols][rows];
    perlz = new float[cols][rows];
    perlr  = new float[cols][rows];
    perlg = new float[cols][rows];
    perlb = new float[cols][rows];
    terrain = new float[cols][rows];
    randcolor = false;
    perlheight = true;
    squares2 = new Grid_space[rows][cols];
    fx = 0;
    fy = 0;
    pxfx = 0;
    pxfy = 0;
    pyfx = 0;
    pyfy = 0;
    trackmouse = true;
    zoom = 0;
    totalAgents = rows;
    terrain3d = false;
    terrain2d = false;
    search = new Window( 50, 50, 200, 100, "C:\\Users\\paul goux\\");
    pallete = new Menu(W-90, H/2, 70, palleteLabels);
    pallete.draggable = true;
  };
  //---------------image array-----------------------------------


  //-------------Table---------------------------------

  Grid(float xx, float yy, int ww, int hh) {

    x = xx;
    y = yy;
    xback = x;
    yback = y;
    w = ww;
    h = hh;
    rows = ww;
    cols = hh;

    bordersize = 1;
    Cols = cols;
    Rows = rows;
    squares2 = new Grid_space[rows][cols];
  };

  public void kernel_modifier() {
    //hkernel1d = {convhn, convhn, convhn, 0, conv, 0,convhp , convhp, convhp};

    hkernel1d[0] = convhn;
    hkernel1d[1] = convhn;
    hkernel1d[2] = convhn;
    hkernel1d[3] = 0;
    hkernel1d[4] = conv;
    hkernel1d[5] = 0;
    hkernel1d[6] = convhp;
    hkernel1d[7] = convhp;
    hkernel1d[8] = convhp;
    //vkernel1d = {convvn, 0, convvp, convvn, conv, convvp, convvn, 0, convvp};
    vkernel1d[0] = convvn;
    vkernel1d[1] = 0;
    vkernel1d[2] = convvp;
    vkernel1d[3] = convvn;
    vkernel1d[4] = conv;
    vkernel1d[5] = convvp;
    vkernel1d[6] = convvn;
    vkernel1d[8] = 0;
    vkernel1d[8] = convvp;
    difflkernel1d[4] = convleft;
    diffukernel1d[4] = convup;
    diffrkernel1d[4] = convright;
    diffdkernel1d[4] = convdown;
  };

  public void grid_functions() {
    init();
    fill(255);
    if (init&&toggle) {
      display();
      //draw_2d();
      if (populateBoundaries)popAgents();
      //if(populateBoundaries)seekBoundaries2();
      if (agentsPopulated)seekBoundaries();
      seekBoundaries3();
      //text(wallSquares.size(),W-50,100);
      //for(int i=wallSquares.size()-1;i>-1;i--){
      //  Grid_space g = wallSquares.get(i);
      //  fill(255,0,0,150);
      //  //noFill();
      //  if(contour)ellipse(g.x+g.w/2,g.y+g.h/2,g.w,g.h);
      //}
    }
  };

  public void mouseLogic(){
    // if(!mousePressed){
    // amp = map(mouseY,0,height,1,2);
    // freq = map(mouseX,0,width,1,2);
    // }else{
      
    // }
    if(mouseX!=pmouseX||mouseY!=pmouseY) update = true;
    else update = false;
  };

  public void plainFunctions(){
    init();
    if(init&&toggle)drawPlain();

  };

  public void drawPlain(){

    for (int yy = 0; yy < rows-1; yy++) {

        if (terrain3d)beginShape(TRIANGLE_STRIP);
        float xoffr = fx;

        for (int xx = 0; xx< cols; xx++) {
          
          int pos = xx + yy * cols;
          Grid_space a = squares.get(pos);
          a.shape.draw();

        }}

  };

  public void shape_functions() {
  };

  public void waveform(PVector a) {
  };

  public void waveform(float a, float b) {
  };

  public void save() {
  };

  public void load() {
  };

  public void init() {

    float WW = w/cols;
    float HH = h/rows;
    if (!init&&!array) {
      //squares = new ArrayList<Grid_space>();
      array = true;
    }

    if (toggle) {
      if (squares.size()<rows*cols) {
        if (circular) {

          for (int i=0; i<360; i+=WW) {
            for (int j=0; j<rows; j++) {

              float x1 = (x + WW * i);
              float y1 = (y + HH * j);
              float r = WW;

              x1 = x+w/2 + (r/2+1)*j * cos(i);
              y1 = y+h/2 + (r/2+1)*j * sin(i);
              int num = i + j * cols;
              Grid_space a = new Grid_space(x1, y1, WW, HH, num, i, j);
              a.lim = lim;
              randcolor = true;
              a.parent = this;
              if (randcolor) {
                a.col = color(random(255), random(255), random(255));
              }
              squares.add(a);
            }
          }
        } else {
          float theta=0, ratio=0, ratio2 = 0, wx=0, ww=0, ku=0, kuu=0, hh=0;
          if (shape) {
            theta = radians(360/sides);
            ratio = (HH)/2 * sin(theta);
            ratio2 = (HH)/2 * cos(theta);
            ww = ratio *2;
            hh = ratio2*2;
          }
          for (int yy = 0; yy < rows; yy++) {
            for (int xx = 0; xx< cols; xx++) {
              float x1 = (x + WW * xx);
              float y1 = (y + HH * yy);
              if (shape) {
                float k = pow(-1, yy);
                x1 = ww+x+(ww)*xx+ratio/2*k;
                y1 = hh+y+(hh*1.5f)*yy;
                WW=HH;
              }
              int num = xx + yy * cols;
              Grid_space a = new Grid_space(x1, y1, WW, HH, num, xx, yy);
              a.lim = lim;

              if (randcolor) a.col = color(random(255), random(255), random(255));
              
              a.parent = this;

              if (shape) {
                a.sides = sides;
                a.col = color(random(255), random(255), random(255));
                a.col2 = color(255);
                if (border)a.border = true;
                a.col2 = color(0);
                a.shape = new Shape(sides, a);
              }
              squares.add(a);
              //squares2[xx][yy] = a;
            }
          }
        }
      } else {
        //for(int xx=0;xx<rows;xx++){
        //  int pos = xx + 0 * rows;
        //  Grid_space a = squares.get(pos);
        //  //temp_cols.add(a);
        //}
        //for(int xx=0;xx<cols;xx++){
        //  int pos = 0 + xx * rows;
        //  Grid_space a = squares.get(pos);
        //}
        init = true;
        array = false;
      }

      if(reset){
        squares = new ArrayList<Grid_space>();
       init = false;
       zoom = 0;
       flying = 0;
       fx = 0;
       fy = 0;
       reset = false;

      }
    }
  };

  public void init2d() {

    float WW = w/res;
    float HH = h/res;

      if (squares.size()<rows*cols) {

          for (int yy = 0; yy < rows; yy++) {
            for (int xx = 0; xx< cols; xx++) {
              float x1 = x+xx * res;
              float y1 = y+yy * res;
              int num = xx + yy * cols;
              Grid_space a = new Grid_space(x1, y1, res, res, num, xx, yy);
              a.lim = lim;

              a.col = color(random(255), random(255), random(255));
              
              a.parent = this;

              squares.add(a);
              //squares2[xx][yy] = a;
            }
          }
        
      } 
    
  };

  public void init2(){
    grid = createShape(GROUP);
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
          
          float yy = y + scale*i*freq;
          float xx = x + scale*j*freq;

          float x1 = x + j * res;
          float y1 = y + i * res;
          
          int p = j + i * cols;
          
          float n = noise(xx,yy);
          float height = map(n*amp,0,1,0,255);
          
          int col = 0;
          if(height>50)col = color(0, 0, 153);
          if(height>100)col = color(204, 204, 0);
          if(height>150)col = color(51, 153, 51);
          if(height>200)col = color(102, 102, 153);
          
          map[j][i] = col;
          mapNoise[j][i] = n;
          mapUpdate[j][i] = false;
          
          map1d[p] = col;
          mapNoise1d[p] = n;
          
          PShape rect = createShape(RECT,j*res,i*res,res,res);
          rect.setFill(col);
          grid.addChild(rect);
          gridChildren++;

          int num = j + i * cols;
          Grid_space a = new Grid_space(x1, y1, res, res, p, j, i);
          a.lim = lim;
          if(randcolor)a.col = color(random(255), random(255), random(255));
          else a.col = col;
          a.parent = this;
          squares.add(a);
        
      }}
  };
  
  public void init3(){
    
     for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
          
          float yy = scale*i*freq;
          float xx = scale*j*freq;
          
          noStroke();
          //float height = map(noise(xx,yy)*amp,0,1,0,255);
          float height = noise(xx,yy)*amp;
          int col = 0;
          
            if(height>0.2f)map[j][i] = color(0, 0, 153);
            if(height>0.4f)map[j][i] = color(204, 204, 0);
            if(height>0.6f)map[j][i] = color(51, 153, 51);
            if(height>0.8f)map[j][i] = color(102, 102, 153); 
          
          map[j][i] = col;
          mapNoise[j][i] = noise(xx,yy);
          mapUpdate[j][i] = false;
        
      }}
  };

  public void timeControls(Grid_space a){

    if (forward||backward) {
            if (acceleration!=0)a.ax = acceleration;
            a.ay = acceleration;
            if (a.collide) fill(0);
            if (a.pos()&&hover) fill(0, 255, 0);

            stroke(a.col);
            strokeWeight(bordersize);
            if (!border) noStroke();

            // ------------------------------------------ time control---------------------------------------
            if (forward) {
              a.forward = true;
              a.pause = false;
              a.backward = false;
              a.update();
            } else if (backward) {
              a.forward = false;
              a.pause = false;
              a.backward = true;
              a.update();
            } else if (pause) {
              a.forward = false;
              a.pause = true;
              a.backward = false;
              a.update();
            } else {
              a.forward = false;
              a.pause = false;
              a.backward = false;
              a.update();
            }
            if (attractor)a.attractors();

            if (mouse&&forward)a.mouse();
          }
  };

  public void createVertices(Grid_space a){

    int count = 0;

    for (int i=0; i<a.Neighbours_b.length; i++) {

                  Grid_space neighbour = a.Neighbours_b[i];

                  if (neighbour!=null&&a.col2!=-10000&&neighbour.col2!=-10000&&neighbour.col2==a.col2)a.Walls_b.set(i, false);
                  else if (neighbour==null||neighbour!=null&&a.col2!=-10000&&neighbour.col2!=-10000&&a.col2!=neighbour.col2)a.Walls_b.set(i, true);

                  if (neighbour!=null&&(a.Walls_b.get(i)))if(contour)a.Boundaries.get(i).drawLine();
                  
                  if (neighbour!=null&&a.popVisited&&neighbour.popVisited) {
                    if (a.col2!=-10000
                      &&neighbour.col2!=-10000
                      
                      &&a.popCol!=neighbour.popCol
                      &&a.col2==neighbour.col2
                      &&agentsBackup.get(a.popId).psteps<=agentsBackup.get(neighbour.popId).psteps
                      ) {
                      agentsBackup.get(a.popId).psteps --;
                      agentsBackup.get(neighbour.popId).psteps ++;

                      a.popId = neighbour.popId;
                      a.popCol = neighbour.popCol;
                      count++;
    }}}

  };

  public void createVertices2(){


  };



  public void display(){
    
    mouseLogic();
    //logic();
      keys();
      
      noiseSeed(PApplet.parseInt(seed));
      
      agentsCounted = 0;
      if (border){
        stroke(0);
        fill(255);
        rect(x,y,w,h);
      }
      if(sliderMenu!=null&&sliderMenu.visible&&sliderMenu.menu.smdown)
      update = true;
      else update = false;
      if(scale<=0)scale = 0.0001f;

      //if(contour)beginShape();

      for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
          
          noStroke();
          int p = j + i * cols;
          Grid_space a = squares.get(p);

          
          if(update||keyUpdate){
            float y1 = fy + scale1*i*freq1;
            float x1 = fx + scale1*j*freq1;

            float y2 = scale2*i*freq2;
            float x2 = scale2*j*freq2;

            float y3 = scale3*i*freq3;
            float x3 = scale3*j*freq3;

            float n1 = noise(x1,y1);
            float n2 = noise(x2,y2);
            float n3 = noise(x3,y3);

            float height = (n1*amp1 + n2*amp2 + n3*amp3)/3;
            //float height = n1*amp1;
            mapNoise[j][i] = n1;

            // if(height>sealevel)map[j][i] = color(0, 0, 153);
            // else if(height>groundlevel)map[j][i] = color(204, 204, 0);
            // else if(height>grasslevel)map[j][i] = color(51, 153, 51);
            // else if(height>mountainlevel)map[j][i] = color(102, 102, 153); 

            if (height>mountainlevel) map[j][i] = color(102, 102, 153); 
            else if (height>grasslevel) map[j][i] = color(51, 153, 51);
            else if (height>groundlevel) map[j][i] = color(204, 204, 0);
            else if (height<sealevel) map[j][i] = color(0, 0, 153);
            a.compared = false;
            
          }
          
          int col = map[j][i];
          a.col = map[j][i];
          // a.get_neighbours(this);
          a.getNeighbours4(this);
          a.compareNeighbours();
          fill(col);
          noStroke();
          //rect(x+j*res,y+i*res,res,res);
          
          rect(a.x,a.y,a.w,a.h);
          if(contour)a.drawBoundaries();
      }}
      //if (contour)endShape(OPEN);
  // 
  if (toggle&&pallete.visible)pallete.draw();
  if (toggle&&sliderMenu!=null&&sliderMenu.visible)sliderMenu.draw();

  fill(255);
  text(frameRate,100,100);
      
  };
  
  public void display2(){
    mouseLogic();
    if(scale<=0)scale = 0.0001f;
    
      for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
          
          noStroke();
          
          if(update){
            float yy = scale*i*freq;
            float xx = scale*j*freq;
            float n = noise(xx,yy);
            float height = n*amp;
            //map[j][i] = n;
            mapNoise[j][i] = n;
            if(height>0.2f)map[j][i] = color(0, 0, 153);
            if(height>0.4f)map[j][i] = color(204, 204, 0);
            if(height>0.6f)map[j][i] = color(51, 153, 51);
            if(height>0.8f)map[j][i] = color(102, 102, 153); 
          }
          
          int col = map[j][i];
          
          fill(col);
          rect(j*xRes,i*yRes,xRes,yRes);
        
      }}
  };
  
  public void displayGrid(){
    mouseLogic();
    
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
          if(update){
                //float height = mapNoise1d[i]*amp*freq;
                
                int p = j + i * cols;
                float yy = scale*i*freq;
                float xx = scale*j*freq;
                float n = noise(xx,yy);
                float height = n*amp;
                mapNoise1d[i] = n;
                if(height>0.2f)map1d[p] = color(0, 0, 153);
                if(height>0.4f)map1d[p] = color(204, 204, 0);
                if(height>0.6f)map1d[p] = color(51, 153, 51);
                if(height>0.8f)map1d[p] = color(102, 102, 153); 
              
                int col = map1d[p];
                
                grid.getChild(p).setFill(col);
          }
    }}
    
    shape(grid);
    fill(255,0,0);
    text(gridChildren,100,210);
  };

  public void displayMesh(){


  };

  public void draw2d(){

    if (toggle) {
      logic();
      keys();
      fill(255);
      text(squares.size(),100,200);
      noiseSeed(PApplet.parseInt(seed));
      
      agentsCounted = 0;
      if (border){
        stroke(0);
        fill(255);
        rect(x,y,w,h);
      }
      int count = 0;
      for (int i=0;i<rows;i++) {
        for (int j=0;j<cols;j++) {

          float x1 = (scale1*j*freq);
          float y1 = (scale1*i*freq);

          float x2 = (scale2*j*freq);
          float y2 = (scale2*i*freq);

          float x3 = (scale3*j*freq);
          float y3 = (scale3*i*freq);

          int pos = j + i * cols;
          
          float height1 = map(noise(x1, y1)*amp1, 1, 0, 0, 255);
          float height2 = map(noise(x2, y2)*amp2, 1, 0, 0, 255);
          float height3 = map(noise(x3, y3)*amp3, 1, 0, 0, 255);

          float height = (height1+height2+height3)/3;
          Grid_space a = squares.get(pos);

          float mapHeight = map(height,0,255,0,255);
          
          float sea = sealevel;
          float floor = groundlevel;
          float grass = grasslevel;
          float mountain = mountainlevel;
          fill(a.col);
          if (mapHeight>mountain) {
            a.col2 = color(255, 255, 255);
            a.col = color(255, 255, 255, 255-abs(mapHeight/2)*1.2f);
            C = color(255, 255, 255, 255-abs(mapHeight/2)*1.2f);
          } else if (mapHeight>grass) {
            a.col2 = color(0, 255, 0);
            a.col = color(0, 255, 0, 255-abs(mapHeight/2)*1.1f);
            C = color(0, 255, 0, 255-abs(mapHeight/2)*1.1f);
          } else if (mapHeight>floor) {
            a.col2 = color(255, 255, 0);
            a.col = color(255, 255, 0, 255-abs(mapHeight/2)*1.1f);
            C = color(255, 255, 0, 255-abs(mapHeight/2)*1.1f);
          } else if (mapHeight<sea) {
            a.col2 = color(0, 0, 255);
            a.col = color(0, 0, 255, 255-abs(mapHeight/2)*1.1f);
            C = color(0, 0, 255, 255-abs(mapHeight/2)*1.1f);
          } else {
            a.col2 = color(255, 255, 255);
            a.col = color(255, 255, 255, 255-abs(mapHeight/2)*1.2f);
            C = color(255, 255, 255, 255-abs(mapHeight/2)*1.2f);
          }

            if (visible) {
              debug(a);
              fill(a.col);
              if(circle) {
              ellipseMode(CORNER);
              ellipse(a.x, a.y, a.w, a.h);
              }
              if (dot) {
                strokeWeight(2);
                point(a.x, a.y);
                strokeWeight(1);
              }
              if(rect) {
                fill(a.col);
                noStroke();
                rect(a.x, a.y, a.w,a.h);

                // beginShape(QUAD);
                // noStroke();

                // vertex(a.x, a.y);
                // vertex(a.x + a.w, a.y);
                // vertex(a.x + a.w, a.y + a.h);
                // vertex(a.x, a.y + a.h);


                // endShape();
              }
              //a.drawBoundaries();
              //compareNeighbours(a,count);
            }}}}

    text(frameRate, W-50, 90);
    if (toggle&&pallete.visible)pallete.draw();
    if (toggle&&sliderMenu!=null&&sliderMenu.visible)sliderMenu.draw();
    if (squaresCounted==squares.size()) sdown = false;
    if (agentsCounted==squares.size()-rows&&agentsPopulated)mapScoped = true;
    if (bcount>=squares.size())Boundaries = true;

  };

  public void compareNeighbours(Grid_space a,int count){

    if (!fill) noFill();
    if (a.popVisited&&populateBoundaries)fill(a.popCol);

    if (sdown)a.neighboured = false;

    if (!a.neighboured) {
      squaresCounted++;
      a.get_neighbours(this);
    }
    noStroke(); 
                  
    if (!mapScoped&&count==0)agentsCounted ++;
  };



  public void draw_2d() {
    if (terrain3d&&toggle) {
      pushMatrix();
      translate(W/2, H/2);

      if (mousePressed) {
        //XX += pmouseX - mouseX;
        //YY += pmouseY - mouseY;
      }
      rotateX(PI/3+radians(xrot+YY));
      translate(-W/2, -W/2);
      translate(w/2, h/2);
      rotateZ(radians(zrot+XX));
      translate(-w/2, -h/2);
      translate(w/2, 0);
      rotateY(radians(yrot));
      translate(-w/2, 0);
      translate(-hdistance-400, -distance-400, -vdistance);
      keys();
    }

    if (toggle) {
      logic();
      rowcount = 0;
      colcount = 0;
      noiseSeed(PApplet.parseInt(seed));
      fill(255);
      text(seed,100,200);

      float yoffr = fy;
      perlx_yoff = pxfy;
      perly_yoff = pyfy;

      agentsCounted = 0;

      for (int yy = 0; yy < rows-1; yy++) {

        if (terrain3d)beginShape(TRIANGLE_STRIP);
        
        float xoffr = fx;
        perlx_xoff = pxfy;
        perly_xoff = pyfy;

        for (int xx = 0; xx< cols; xx++) {

          int pos = xx + yy * cols;
          terrain[xx][yy] = map(noise(xoffr, yoffr), 1, 0, 0, 255);
          perlx[xx][yy] = map(noise(perlx_xoff, perlx_yoff)*map1, 1, 0, 0, 255);
          perly[xx][yy] = map(noise(perly_xoff, perly_yoff)*map2, 1, 0, 0, 255);

          xoffr += noise1 + zoom;
          // perlx_xoff += pow(noise1,map1) + zoom;
          // perly_xoff += pow(noise2,map2) + zoom;

          perlx_xoff += noise2 + zoom;
          perly_xoff += noise3 + zoom;

          strokeWeight(0);

          Grid_space a = squares.get(pos);

          float num = perlx[xx][yy];
          float num1 = perly[xx][yy];
          // float R = map((terrain[xx][yy]+num+num1),0,255/map1+255/map2+255,0,255);
          float R = map((terrain[xx][yy]+num+num1),0,765,0,255);
          
          float floor2 = groundlevel2;
          float mountain = mountainlevel;
          float sea = sealevel;
          float grass = grasslevel;

          if (a.shape!=null)a.shape.draw();
          
          if ((terrain2d||terrain3d)&&!plain) {
            fill(a.col);
            if (R>mountain) {
              a.col2 = color(255, 255, 255);
              a.col = color(255, 255, 255, 255-abs(R/2)*1.2f);
              C = color(255, 255, 255, 255-abs(R/2)*1.2f);
            } else if (R>grass) {
              a.col2 = color(0, 255, 0);
              a.col = color(0, 255, 0, 255-abs(R/2)*1.1f);
              C = color(0, 255, 0, 255-abs(R/2)*1.1f);
            } else if (R>floor2) {
              a.col2 = color(255, 255, 0);
              a.col = color(255, 255, 0, 255-abs(R/2)*1.1f);
              C = color(255, 255, 0, 255-abs(R/2)*1.1f);
            } else if (R<sea) {
              a.col2 = color(0, 0, 255);
              a.col = color(0, 0, 255, 255-abs(R/2)*1.1f);
              C = color(0, 0, 255, 255-abs(R/2)*1.1f);
            } else {
              a.col2 = color(255, 255, 255);
              a.col = color(255, 255, 255, 255-abs(R/2)*1.2f);
              C = color(255, 255, 255, 255-abs(R/2)*1.2f);
            }}

          if (forward||backward) {
            if (acceleration!=0)a.ax = acceleration;
            a.ay = acceleration;
            if (a.collide) fill(0);
            if (a.pos()&&hover) fill(0, 255, 0);

            stroke(a.col);
            strokeWeight(bordersize);
            if (!border) noStroke();

            // ------------------------------------------ time control---------------------------------------
            if (forward) {
              a.forward = true;
              a.pause = false;
              a.backward = false;
              a.update();
            } else if (backward) {
              a.forward = false;
              a.pause = false;
              a.backward = true;
              a.update();
            } else if (pause) {
              a.forward = false;
              a.pause = true;
              a.backward = false;
              a.update();
            } else {
              a.forward = false;
              a.pause = false;
              a.backward = false;
              a.update();
            }
            if (attractor)a.attractors();

            if (mouse&&forward)a.mouse();
          }
          if (terrain2d) {
            if (visible) {
              debug(a);
              if (!circle&&!dot&&!shape&&!plain) {
                fill(a.col);
                if (!fill) noFill();
                if(!terrainP)fill(255,40);
                if (a.popVisited&&populateBoundaries)fill(a.popCol);

                if (sdown)a.neighboured = false;

                if (!a.neighboured) {
                  squaresCounted++;
                  a.get_neighbours(this);
                }
                noStroke(); 
                if (plain)stroke(0);
                //if(!terrainP){stroke(0,150);strokeWeight(1);}
                rect(a.x, a.y, a.w, a.h);

                int count = 0;

                for (int k=0; k<a.Neighbours_b.length; k++) {

                  Grid_space neighbour = a.Neighbours_b[k];

                  if (neighbour!=null&&a.col2!=-10000&&neighbour.col2!=-10000&&neighbour.col2==a.col2)a.Walls_b.set(k, false);
                  else if (neighbour==null||neighbour!=null&&a.col2!=-10000&&neighbour.col2!=-10000&&a.col2!=neighbour.col2)a.Walls_b.set(k, true);

                  //if (neighbour!=null&&(a.Walls_b.get(k)))if(contour)a.Boundaries.get(k).drawLine();
                  

                  if (neighbour!=null&&a.popVisited&&neighbour.popVisited) {
                    if (a.col2!=-10000
                      &&neighbour.col2!=-10000
                      
                      &&a.popCol!=neighbour.popCol
                      &&a.col2==neighbour.col2
                      &&agentsBackup.get(a.popId).psteps<=agentsBackup.get(neighbour.popId).psteps
                      ) {
                      agentsBackup.get(a.popId).psteps --;
                      agentsBackup.get(neighbour.popId).psteps ++;

                      a.popId = neighbour.popId;
                      a.popCol = neighbour.popCol;
                      count++;
                    }}}

                for (int k=0; k<a.Neighbours_b.length; k++) {
                  }

                if(contour)a.drawBoundaries();
                if (!mapScoped&&count==0)agentsCounted ++;
                //if (!populateBoundaries) {
                //  if (!wallSquares.contains(a)&&(wall>0))wallSquares.add(a);
                //  else if (wallSquares.contains(a)&&wall==0)wallSquares.remove(wallSquares.indexOf(a));
                //}
              } else {
                ellipseMode(CORNER);
                if (circle) ellipse(a.x, a.y, a.w, a.h);
                else if (dot) {
                  strokeWeight(2);
                  point(a.x, a.y);
                  strokeWeight(1);
                }
              }
            }
          } else if (terrain3d) {
            float mult = 1;
            fill(a.col);
            stroke(a.col);
            if (!border)noStroke();
            if (!fill)noFill();
            if (floored) {

              float a1 = terrain[xx][yy];
              float a2 = terrain[xx][yy];
              float a3 = terrain[xx][yy];
              float a4 = terrain[xx][yy];

              if (groundlevel<sealevel)groundlevel=sealevel;
              if (grasslevel<groundlevel)grasslevel=groundlevel;
              if (mountainlevel<grasslevel)mountainlevel=grasslevel;

              if (a1<sealevel)a1 = sealevel;
              else {
                if (a1<groundlevel2)a1 = groundlevel2;
                else {
                  if (a1<grasslevel)a1 = grasslevel;
                  else a1 = a3;
                }
              }
              if (a2<sealevel)a2 = sealevel;
              else {
                if (a2<groundlevel2)a2 = groundlevel2;
                else {
                  if (a2<grasslevel)a2 = grasslevel;
                  else a2 = a4;
                }
              }

              vertex(xx*a.w*mult, yy*a.h*mult, terrain[xx][yy]);
              vertex(xx*a.w*mult, (yy+1)*a.h*mult, terrain[xx][yy+1]);
            } else if (R<-100) {
              vertex(xx*a.w*mult, (yy)*a.h*mult, terrain[xx][yy]);
              vertex(xx*a.w*mult, (yy+1)*a.h*mult, terrain[xx][yy+1]);
            }
          }
        }
        if (terrain3d)endShape(CLOSE);
        yoffr += noise1 + zoom;
        // perlx_yoff += pow(noise1,map1) + zoom;
        // perly_yoff += pow(noise2,map2) + zoom;
        perlx_yoff += noise2 + zoom;
        perly_yoff += noise3 + zoom;
      }
    }
    if (terrain3d)popMatrix();
    //if (debug)
    text(frameRate, W-50, 90);
    if (toggle&&pallete.visible)pallete.draw();
    keys();
    if (toggle&&sliderMenu!=null&&sliderMenu.visible)sliderMenu.draw();
    if (squaresCounted==squares.size()) {
      //neighboured = true;
      sdown = false;
    }
    if (agentsCounted==squares.size()-rows&&agentsPopulated)mapScoped = true;
    if (bcount>=squares.size())Boundaries = true;
    //if(mapScoped)text("Scoped",W-50,120);
  };

  public void draw3d(){

  };

  public void debug(Grid_space a) {

    if (a.pos()&&debug) {
      float X = W-170;
      float Y = 23;
      fill(255);

      rect(X, Y, 170, 200);

      fill(0);
      text("ID : " + a.id, X, Y+12);
      text("Pid : " + a.pid, X, Y+12*2);
      text("Pop ID : " + a.popId, X, Y+12*3);
      text("Pop Color : " + a.popCol, X, Y+12*4);
      text("Col 2 : " + a.col2, X, Y+12*5);
      text("Leader Pid : " + a.leader.pid, X, Y+12*6);
      text("Steps ; " + a.psteps, X, Y+12*7);
      text("Walls : ", X, Y+12*8);

      for (int i=0; i<a.Walls_b.size(); i++) {

        if (a.Walls_b.get(i))text("True, ", X+40+30*i, Y+12*8);
        else text("False, ", X+40+30*i, Y+12*8);
      }
      text(a.visitedBy.size(), X, Y+12*9);
      if (a.popVisited)text("Visited", X, Y+12*10);
      fill(a.col2);
    }
  };

  public void popAgents() {
    if (populateBoundaries&&!agentsPopulated) {
      for (int i=0; i<totalAgents; i++) {

        Grid_space g = squares.get(floor(random(squares.size())));
        g.popId = i;
        g.pid = i;
        g.popCol = color(random(255), random(255), random(255));

        if (!agents.contains(g)) {
          g.popVisited = true;
          agents.add(g);
          agentsBackup.add(g);
          agentsConst.add(g);
          popHist.add(new ArrayList<Grid_space>());
          popStack.add(new ArrayList<Grid_space>());
          connections.add(new ArrayList<Grid_space>());
        } else i--;
      } 
      agentsPopulated = true;
    }
  };

  public void seekBoundaries() {

    //if(agentsCounted<totalAgents){
    text(agentsCounted, W-50, 100);
    text(squares.size(), W-50, 110);


    if (agentsPopulated) {
      for (int i=0; i<agents.size(); i++) {

        Grid_space c = agents.get(i);

        Grid_space next = c.getNewNeighbour();

        Grid_space home = agentsBackup.get(i);

        ArrayList<Grid_space> neighbours = c.getNewNeighbour1(this);

        Grid_space t = agentsBackup.get(i);

        fill(255, 0, 0, 150);
        noStroke();
        if (populateBoundaries&&!contour)rect(t.x, t.y, c.w, c.h);
        stroke(0);
        if (contour)line(c.x, c.y, home.x, home.y);

        if (next!=null&&!pause) {

          next.psteps = agentsBackup.get(c.popId).psteps;
          agentsBackup.get(c.popId).psteps ++;

          next.popVisited = true;
          next.popId = c.popId;
          next.pid = c.pid;
          next.next = c;
          next.popCol = c.popCol;

          popHist.get(c.pid).add(c);
          popStack.get(c.pid).add(c);

          if (popStack.get(c.pid).size()>1)trimPopStack2(c);
          agents.set(i, next);
        } else if (!pause&&popStack.get(i).size()>0)agents.set(i, popStack.get(i).remove(popStack.get(i).size()-1));
        else if (agents.get(i)!=agentsBackup.get(i))agents.set(i, agentsBackup.get(i));
      }
    }
  };

  public void completeBoundaries() {

    if (populateBoundaries&&unsortedWallSquares.size()>0&&!pause) {
      ArrayList<Grid_space> biome = new ArrayList<Grid_space>();
      
        biome = unsortedWallSquares.remove(0);
      if (unsortedWallSquares.size()>0) {
        
        Grid_space current = biome.get(biome.size()-1);
        Grid_space next = current.getNewWallNeighbour(this);

        if (next!=null) {
          rect(next.x+next.w/2, next.y+next.h/2, next.w, next.h);
          next.wVisited = true;
          if (!biome.contains(next))biome.add(next);
          int k = wallSquares.indexOf(next);
          if (k>-1)wallSquares.remove(k);
        } else {
          if (!boundaries.contains(biome))boundaries.add(biome);
          biome = new ArrayList<Grid_space>();
        }
      } else if (!boundaries.contains(biome))boundaries.add(biome);
    }
    fill(255);
    text(boundaries.size(), W-50, 110);
    
    for (int i=boundaries.size()-1; i>0; i--) {

      ArrayList<Grid_space> g = boundaries.get(i);

      text(g.size(), 100, 100+10*i);

      for (int k=0; k<g.size(); k++) {
        Grid_space a = g.get(k);

        rect(a.x, a.y, a.w, a.h);
      }
    }
  };

  public void seekBoundaries3() {
    if(mapScoped){
      
    }
    if(mapScoped){
      fill(255);
      text(unsortedSquares.size(),W-50,140);
      text(squares.size(),W-50,150);
    if (squares.size()>=unsortedSquares.size()&&!beginSquareSorting) {
      //text("hello 1",W-50,160);
      
      for (int i=1; i<squares.size(); i++) {
        Grid_space b = squares.get(i);

        unsortedSquares.add(b);
      }}
    else beginSquareSorting = true;
    int count = 0;
    if(beginSquareSorting){
      if(unsortedSquares.size()>0){
      
      tempSquares = new ArrayList<Grid_space>();
      temp = new ArrayList<Grid_space>();
      
      Grid_space a = unsortedSquares.remove(0);

      if(!tempSquares.contains(a))tempSquares.add(a);
      
      for (int i=unsortedSquares.size()-1;i>-1;i--) {

        Grid_space b = unsortedSquares.get(i);
        
        fill(255,100);
        noStroke();
        rect(b.x, b.y, b.w, b.h);
        
        int walls = 0;
        
        if (a.popCol==b.popCol) {
          
            tempSquares.add(b);
            count++;
            unsortedSquares.remove(i);
            
            for(int j=0;j<b.Walls_b.size();j++)if(b.Walls_b.get(j))walls++;
            
            if(walls>0)temp.add(b);
        }}
        sortedSquares.add(tempSquares);
        wallSquares.add(temp);
        unsortedWallSquares.add(temp);
    }else sortBoundaries = true;}}
        
        
      fill(255,0,0);
      text("Sorted : " + sortedSquares.size(),W-100,170);
      text("Unsorted : " + unsortedSquares.size(),W-100,180);
      
      for(int i=0;i<sortedSquares.size();i++){
        text(sortedSquares.get(i).size(),W-50,190+10*i);
        if(sortedSquares.get(i).size()>0){
          
          Grid_space b = sortedSquares.get(i).get(0);
          fill(0);
          noStroke();
          rect(b.x, b.y, b.w, b.h);
          
      }}
    
    for(int i=0;i<wallSquares.size();i++){
      
      for(int j=0;j<wallSquares.get(i).size();j++){
        
        Grid_space b = wallSquares.get(i).get(j);
        fill(0,100);
        noStroke();
        rect(b.x, b.y, b.w, b.h);
    }}
  };
  
  public void completeBoundary(){
    
    for(int i=0;i<wallSquares.size();i++){
      
      for(int j=0;j<wallSquares.get(i).size();j++){
        
        Grid_space b = wallSquares.get(i).get(j);
        fill(0,100);
        noStroke();
        rect(b.x, b.y, b.w, b.h);
    }}
    
  };

  public void updateHist(int a, int b) {

    for (int j=popHist.get(a).size()-1; j>-1; j--) {

      Grid_space c = popHist.get(a).get(j);

      ArrayList<Grid_space> neighbours = c.getNewNeighbour2(this);

      if (neighbours!=null) {

        for (int i=0; i<neighbours.size(); i++) {

          Grid_space next = neighbours.get(i);

          next.popId = a;
          next.popCol = agentsBackup.get(b).popCol;
        }
      }
    }
  };

  public int getSteps(int i) {
    int k = popHist.get(i).size();
    //for(int j=0;j<agentsBackup.get(i).modifiedAgents.size();j++){

    //  Grid_space g1 = agentsBackup.get(i).modifiedAgents.get(j);

    //  k += popHist.get(g1.pid).size();
    //}
    //for(int j=0;j<agentsBackup.get(i).visitedBy.size();j++){

    //  Grid_space g1 = agentsBackup.get(i).visitedBy.get(j);

    //  k += popHist.get(g1.pid).size();
    //}
    return k;
  };


  public void sortHist() {
    if (sortedAgents.size()<totalAgents) {

      if (agents.size()>0) {

        Grid_space c = mostTravelledAgent();

        sortedAgents.add(c);
        agents.remove(c.popId);
      } else sortedAgents.add(agents.get(0));
    }
  };

  public Grid_space mostTravelledAgent() {

    Grid_space c = agents.get(0);

    for (int i=1; i<agents.size(); i++) {

      Grid_space n = agents.get(i);

      if (n.steps>c.steps)c = n;
    }
    return c;
  };

  public void connectMap() {
    if (mapScoped) {
      agentsCounted = 0;
      for (int i=0; i<agents.size(); i++) {
        Grid_space c = agents.get(i);
        //Grid_space next = c.getNewNeighbour2(this);
      }
    }
  };

  public void trimPopStack(int i) {

    if (popStack.get(i).size()>1) {

      for (int j=popStack.get(i).size()-1; j>-1; j--) {

        Grid_space next = popStack.get(i).get(j).getNewNeighbour();
        ArrayList<Grid_space> next1 = popStack.get(i).get(j).getNewNeighbour4(this);

        if (next!=null||next1!=null)break;
        else popStack.get(i).remove(j);
      }
    }
  };

  public void trimPopStack2(Grid_space a) {

    if (popStack.get(a.pid).size()>0) {

      for (int j=popStack.get(a.pid).size()-1; j>-1; j--) {

        Grid_space next = popStack.get(a.pid).get(j).getNewNeighbour();
        ArrayList<Grid_space> next1 = popStack.get(a.pid).get(j).getNewNeighbour4(this);

        if (next!=null) {

          Grid_space b = popStack.get(a.pid).get(j);

          //b.pid    = a.pid;
          //b.popId  = a.pid;
          //b.psteps = agentsBackup.get(a.pid).psteps;

          b.pid    = agents.size()-1;
          b.popId  = agents.size()-1;
          b.leader = a.leader;
          b.popCol = a.popCol;
          b.psteps = agentsBackup.get(a.popId).steps;

          //agentsBackup.add(agentsBackup.get(a.pid));
          //agentsConst.add(agentsConst.get(a.pid));

          agentsBackup.add(b);
          agentsConst.add(b);

          popHist.add(new ArrayList<Grid_space>());
          popStack.add(new ArrayList<Grid_space>());

          agents.add(b);
          totalAgents++;

          break;
        }
        if (next1!=null)break;
        if (next==null&&next1==null&&popStack.get(a.pid).size()>0) popStack.get(a.pid).remove(j);
      }
    }
  };

  public void addToArray(ArrayList<Grid_space> a, ArrayList<Grid_space> b) {

    for (int i=0; i<b.size(); i++) {
      Grid_space g = b.get(i);
      a.add(g);
    }
  }



  public void gshape(int sides, Grid_space a, int col) {

    beginShape();
    noFill();
    float theta = 360 / sides;
    for (int i=0; i<sides; i++) {
      if (a.Walls_a.get(i)==true) {
        float thetab =  theta * i;
        float thetac =  theta * i+theta;
        stroke(col);
        if (!a.parent.border) noStroke();
        strokeWeight(1);
        line(a.x+a.w/2*sin(thetab), a.y+a.w/2*cos(thetab), a.x+a.w/2*sin(thetac), a.y+a.w/2*cos(thetac));
      } else noStroke();
    }
    endShape();
  };

  public void keys() {
    if (ztoggle2==1)zoom -= noise1;
    if (ztoggle==1)zoom += noise1;
    
    // left
    int n = 0;
    float k = 0.05f;

    if (keyPressed && keyCode ==37) {
      n++;
      if (!terrain3d){
        fx += k;
        pxfx += k;
        pyfy += k;
      }else {
        fy += k;
        pxfx += k;
        pyfy += k;
      }}

    // right

    if (keyPressed && keyCode ==39) {
      n++;
      if (!terrain3d){
          fx -= k;
          pxfx -= k;
          pyfy -= k;
      } else {
          fy -= k;
          pxfx -= k;
          pyfy -= k;
      }}
    // up
    if (keyPressed && keyCode ==38) {
      n++;
      if (!terrain3d) {
          fy += k;
          pxfx += k;
          pyfy += k;
      }else {
          fx -= k;
          pxfx -= k;
          pyfy -= k;
      }}
    // down
    if (keyPressed && keyCode ==40) {
      n++;
      if (!terrain3d) {
        fy -= k;
        pxfx -= k;
        pyfy -= noise3;
      }else {
        fx += k;
        pxfx += k;
        pyfy += k;
      }}

    if (keyCode == 87) {
      
      ztoggle ++;
      ztoggle2 = 0;
      if (ztoggle==2)ztoggle = 0; 
      //zoom += 0.02;
    }
    if (keyCode == 83) {
      ztoggle2 ++;
      ztoggle = 0;
      if (ztoggle2==2)ztoggle2 = 0;
    }
    if (keyCode == 68) {
      ztoggle = 0;
      ztoggle2 = 0;
    }
    if(n>0)keyUpdate = true;
    else keyUpdate = false;
  };

  public void keys_() {
    if (ztoggle2==1)zoom -= noise1;
    if (ztoggle==1)zoom += noise1;
    
    // left

    if (keyPressed && keyCode ==37) {
      if (!terrain3d){
        fx += noise1;
        pxfx += pow(noise1,map1);
        pyfy += pow(noise2,map2);
      }else {
        fy += noise1;
        pxfx += pow(noise1,map1);
        pyfy += pow(noise2,map2);
      }}

    // right

    if (keyPressed && keyCode ==39) {
      if (!terrain3d){
          fx -= noise1;
          pxfx -= pow(noise1,map1);
          pyfy -= pow(noise2,map2);
      } else {
          fy -= noise1;
          pxfx -= pow(noise1,map1);
          pyfy -= pow(noise2,map2);
      }}
    // up
    if (keyPressed && keyCode ==38) {
      if (!terrain3d) {
          fy += noise1;
          pxfx += pow(noise1,map1);
          pyfy += pow(noise2,map2);
      }else {
          fx -= noise1;
          pxfx -= pow(noise1,map1);
          pyfy -= pow(noise2,map2);
      }}
    // down
    if (keyPressed && keyCode ==40) {
      if (!terrain3d) {
        fy -= noise1;
        pxfx -= pow(noise1,map1);
        pyfy -= pow(noise2,map2);
      }else {
        fx += noise1;
        pxfx += pow(noise1,map1);
        pyfy += pow(noise2,map2);
      }}

    if (keyCode == 87) {
      ztoggle ++;
      ztoggle2 = 0;
      if (ztoggle==2)ztoggle = 0; 
      //zoom += 0.02;
    }
    if (keyCode == 83) {
      ztoggle2 ++;
      ztoggle = 0;
      if (ztoggle2==2)ztoggle2 = 0;
    }
    if (keyCode == 68) {
      ztoggle = 0;
      ztoggle2 = 0;
    }
  };

  public void set(String a, boolean b) {
    values.put(a, b);
    //hover = true;
  };

  public boolean pos() {
    float X = mouseX;
    float Y = mouseY;

    return X > x && X < x + w && Y > y && Y < y + h;
  };

  public void logic() {
    if (pos() && !mousePressed) {
      dx = mouseX - x;
      dy = mouseY - y;
    }

    if ( pos() && mousePressed) {
      posx = dx;
      posy = dy;
      x = mouseX - dx;
      y = mouseY - dy;
      deltax =  dx;
      deltay =  dy;
    }
    if (BMS.terrain3d&&!terrain3d)terrain3d = true;
    else if (!BMS.terrain3d&&terrain3d)terrain3d = false;
  };

  

  public void update() {
  };
};

class Shape {

  int sides;
  float x, y, w, theta;
  PVector p;
  Grid_space parent;

  ArrayList<PVector> p1 = new ArrayList<PVector>();
  ArrayList<PVector> p2 = new ArrayList<PVector>();
  ArrayList<PVector[]> lines = new ArrayList<PVector[]>();

  Shape(int Sides, Grid_space Parent) {
    sides = Sides;
    parent = Parent;
    x = parent.x;
    y = parent.y;
    w = parent.w;
    p = new PVector(x, y);
    theta = radians(360 / sides);
    for (int i=0; i<sides; i++) {
      float thetab =  theta * i;
      float thetac =  theta * i+theta;
      PVector a = new PVector (x+w/2*sin(thetab), y+w/2*cos(thetab));
      PVector b = new PVector (x+w/2*sin(thetac), y+w/2*cos(thetac));
      parent.Walls_a.set(i, true);
      p1.add(a);
      p2.add(b);
      PVector []c = {a, b};
      lines.add(c);
    }
  };

  public void draw() {
    beginShape();
    fill(parent.col);

    for (int i=0; i<sides; i++) {
      if (parent.Walls_a.get(i)==true) {
        stroke(parent.col2);
        if (!parent.border) noStroke();
        strokeWeight(1);
        vertex(p1.get(i).x, p1.get(i).y);
        vertex(p2.get(i).x, p2.get(i).y);
      } else noStroke();
    }
    endShape();
  }
};



class Grid3D extends Grid {

  Grid3D() {
  };

  public void save() {
  };

  public void load() {
  };
};

class kernel {

  kernel() {
  };

  public void init() {
  };
};

class ImgGrid extends Grid {

  ImgGrid() {
  };

  public void save() {
  };

  public void load() {
  };
};

class plainGrid extends Grid {

  plainGrid() {
  };

  public void save() {
  };

  public void load() {
  };
};
public void pop(int x,int y,float w,float h){
  float gW = (1000)/PApplet.parseFloat(gw), gH = 580/PApplet.parseFloat(gh);
  int total = x*y;
  
  for (int i=0;i<total;i++){
    PVector a = new PVector(random(W),random(H));
    
    qgrid.add(new Quad(a,i,w,h));
  }
 
 //float gw = w/x;
 //float gh = h/y;
 
 for (int j=0;j<gh;j++){
    for (int i=0;i<gw;i++){
      int id = i+j*x;
      PVector p = new PVector(i*gW,j*gH);
      qgrid.add(new Quad(p,id,gw,gh));
    }}
};

public Quad index2(int xpos,int ypos){
  
  if(wrap){
    
  if(xpos<=0)xpos = gw -1;
  if(xpos>= gw -1)xpos = 0;
  if(ypos <= 0)ypos = gh - 1;
  if(ypos >= gh - 1)ypos = 0;
  
    return qgrid.get(ypos + (xpos * PApplet.parseInt(gw)));
  }
  else{
    if(xpos<0||xpos>gw-1||ypos<0||ypos>gh-1){
     
    return null;
  }
    return qgrid.get(xpos + (ypos * PApplet.parseInt(gw)));
  }
  
};

class Quad{
  int id,iid,counter;
  float x,y,w,h,dens,dens2,dens3,dens4,v,v2,v3,v4,kv,kv2,kv3,kv4;
  float dir,dir2,dir3,dir4;
  PVector p, kp = new PVector(0,0),kp2 = new PVector(0,0),kp3 = new PVector(0,0);
  int col = 0,col2 = 0,col3 = 0,col4 = 0;
  ArrayList<Entity> children  = new ArrayList<Entity>();
  ArrayList<Quad> affectees  = new ArrayList<Quad>();
  ArrayList<Quad> affectors  = new ArrayList<Quad>();
  //HashMap<Quad,ArrayList
  Scene scene;
  
  Quad(PVector P,int ID,float W,float H){
    p = P;
    id = ID;
    x = p.x;
    y = p.y;
    w = W;
    h = H;
  };
  
  Quad(PVector P,int ID,float W,float H,Scene s){
    p = P;
    id = ID;
    x = p.x;
    y = p.y;
    w = W;
    h = H;
    scene = s;
  };

  public void draw(){
    
    if(x+w<scene.x+scene.w +w&&y+h<scene.y+scene.h+w){
    float kv = 0;
    float kd = 0;
    kp = new PVector(0,0);
    PVector tkp = new PVector(0,0);
    PVector tkp2 = new PVector(0,0);
    int a = 0;
    affectors = new ArrayList<Quad>();
    
    if(children.size()>0){
      dens = children.size();
    for(int i=0;i<children.size();i++){
      Entity e = children.get(i);
      
      kv += sqrt(abs(e.vel.x*e.vel.x+ e.vel.y*e.vel.y));
      kd += e.dir;
      tkp.add(e.p); 
      
      a += e.col;
    }}
    kv2 = 0;
    col2 = 0;
    dens2 = 0;
    dir2 = 0;
    
    for(int i=0;i<scene.fields.size();i++){
      Quad q = scene.fields.get(i);
      
      float d = dist(x,y,q.x,q.y);
      if(q.dens*4>d&&q!=this){
        if(!affectors.contains(q))affectors.add(q);
      }}
      
      dens2 = affectors.size();
      for(int i=0;i<affectors.size();i++){
        
        Quad q = affectors.get(i);
        
        if(dens2>0){
        kv2 += q.kv/dens2;
        col2 += q.col/dens2;
        dir2 = q.dir/dens2;
        tkp2.add(q.kp);
      }}
      
      dir3 = kd + dir2;
      dir = kd;
      tkp.div(dens);
      tkp2.div(dens2);
      if(kv>0)kv = map(kv,0-200,200,0,125);
      if(kv2>0)kv2 = map(kv2,0-200,200,0,125);
      v = kv + kv2;
      dens3 = dens + dens2;
      PVector k = PVector.add(tkp,tkp2);
      kp = tkp;
      kp = k.div(2);
      kp2 = tkp2;
      a /=dens;col2/=dens2;
      col = a + col2;
      
      
      //if(dens2>0){
      //  dir = dir2;
      //  dens3 = dens2;
      //  v = kv2;
      //  col = col2;
      //}
      
      // if(children.size()>0){
      //  dir = kd/dens;
      //  v = map(kv,0-200,200,0,255)/dens;
      //  //kp = kp.div(dens);
      //  a /=dens; col = a;
      // }
    
    if(scene.showf)line(x,y,x + h/2 * cos(dir3),y + h/2 * sin(dir3));
    if(scene.showf)line(x,y,x - h/2 * cos(dir3),y - h/2 * sin(dir3));
    noFill();
    //fill(255,d);
    noStroke();
    
    if(dir>0){
    fill(col,v);
    //fill(255,kv2/4);
    if(scene.showq)ellipse(kp.x,kp.y,dens3*4,dens3*4);
    //if(scene.showq)ellipse(kp2.x,kp2.y,dens2*10,dens2*10);
    }
    
    //fill(255);
    //text(int(dens3),x,y);
    if(dir<0){
    fill(col,v);
    //fill(0,kv2/4);
    if(scene.showq)ellipse(kp.x,kp.y,dens3*4,dens3*4);
    //if(scene.showq)ellipse(kp2.x,kp2.y,dens2*10,dens2*10);
    }}
  };
  
  public void fillc(){
    fill(255);
    rect(p.x,p.y,w,h);
    
  }; 
  
  
  public void field(){
    dens2 = 0;
    kv2 = 0;
    col2 = 0;
    dir2 = 0;
    if(x+w<scene.x+scene.w + w&&y+h<scene.y+scene.h+w){
    for(int i=0;i<scene.fields.size();i++){
      Quad q = scene.fields.get(i);
      
      float d = dist(x,y,q.x,q.y);
      if(dens*4>d&&q!=this){
        q.dens2 = dens/4;
        q.kv2 = kv/4;
        q.col2 = col/4;
        q.kp = kp;
        q.dir2 = atan2(y-q.y,x-q.x);
        
      }}}
  };
  
  public void humans(){
    
  }
  
};

  



//void setup(){
//  image = loadImage("1_UsARa4r6x_ZuZATcxFqJ6A.jpeg");
//  size(1000,600);
//  dataset = new immageDataset(image,400);
//  //imageLoad(image);
  
//};

//void draw(){
  
//  background(50);
  
//  dataset.draw_test();
  
//  //dataset.cards.get(200).draw();
  
  
//};

class immageDataset{
  
  PImage image ;
  immageDataset dataset;
  
  ArrayList<Card> cards = new ArrayList<Card>();
  ArrayList<Card> train = new ArrayList<Card>();
  ArrayList<Card> test = new ArrayList<Card>();
  
  
  immageDataset(PImage image, int n){
    if(cards.size()<n){
    for (int i = 0; i < image.height-25; i+=25) {
      for (int j = 0; j < image.width; j+=25) {
        
              Card c = new Card(image,j,i);
              int pos = cards.size() + 1;
              cards.add(c);
              if(pos%5==0) test.add(c);
              else train.add(c);
    }}}
  };
  
  immageDataset(PImage image, int n,int offset){
    if(cards.size()<n){
    for (int i = 0; i < image.height-offset; i+=offset) {
      for (int j = 0; j < image.width; j+=offset) {
        
              Card c = new Card(image,j,i);
              int pos = cards.size() + 1;
              cards.add(c);
              if(pos%5==0) test.add(c);
              else train.add(c);
    }}}
  };
  
  immageDataset(PImage image, int n,int xoffset,int yoffset){
    if(cards.size()<n){
    for (int i = 0; i < image.height-yoffset; i+=yoffset) {
      for (int j = 0; j < image.width; j+=xoffset) {
        
              Card c = new Card(image,j,i);
              int wnum = image.width/xoffset;
              int pos = cards.size() + 1;
              cards.add(c);
              if(pos%5==0) test.add(c);
              else train.add(c);
    }}}
  };
  
  immageDataset(ArrayList<PImage> images){
    if(cards.size()<images.size()){
    for (int i = 0; i < images.size(); i++) {
              
              Card c = new Card(image,0,i);
              int pos = cards.size() +1;
              cards.add(c);
              if(pos%5==0) test.add(c);
              else train.add(c);
    }}
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void draw(){
    for(Card c: cards){
      c.draw();
    }
  };
  
  public void draw_train(){
    for(Card c: train){
      c.draw();
    }
  };
  
  public void draw_test(){
    for(Card c: test){
      c.draw();
    }
  };
  
  
  
  class Card{
  
  float x,y;
  int id;
  PImage image;
  
  Card(PImage Image, float xx,float yy){
    
    x = xx;
    y = yy; 
    id = cards.size();
    image = new PImage(25,25);
    image.loadPixels();
    for(int i=0;i<25;i++){
      for(int j=0;j<25;j++){
        
        int pos = j + i * 25;
        int pos2 = PApplet.parseInt(x+j) + PApplet.parseInt(y+i) * Image.width; 
      image.pixels[pos] = Image.pixels[pos2];
    }}
    image.updatePixels();
    
  }
  
  public void draw(){
    fill(0);
    //text(test.size(),x, y+10);
    image(image,x,y);
  }
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
};
  
};


// This function returns all the files in a directory as an array of Strings  
public String[] listFileNames(String dir) {
  File file = new File(dir);
  if (file.isDirectory()) {
    String names[] = file.list();
    return names;
  } else {
    // If it's not a directory
    return null;
  }
}

public ArrayList<String> trimNames(String []dir) {
  ArrayList<String> temp = new ArrayList<String>();
  //if(dir==null)return null;

  for (int i=0; i<dir.length; i++) {
    int count = 0;
    String s = dir[i];
    for (int j=0; j<dir[i].length(); j++) {

      char t = dir[i].charAt(j);

      if ((t=='.'&&j==0)||t=='{')count ++;
    }
    if (count==0&&s!="")temp.add(s);
  }

  return temp;
};

// This function returns all the files in a directory as an array of File objects
// This is useful if you want more info about the file
public File[] listFiles(String dir) {
  File file = new File(dir);
  if (file.isDirectory()) {
    File[] files = file.listFiles();
    return files;
  } else {
    // If it's not a directory
    return null;
  }
}

// Function to get a list of all files in a directory and all subdirectories

public ArrayList<File> listFilesRecursive(String dir) {
  ArrayList<File> fileList = new ArrayList<File>(); 
  recurseDir(fileList, dir);
  return fileList;
}

// Recursive function to traverse subdirectories
public void recurseDir(ArrayList<File> a, String dir) {
  File file = new File(dir);
  if (file.isDirectory()) {
    // If you want to include directories in the list
    a.add(file);  
    File[] subfiles = file.listFiles();
    for (int i = 0; i < subfiles.length; i++) {
      // Call this function on all files in this directory
      recurseDir(a, subfiles[i].getAbsolutePath());
    }
  } else {
    a.add(file);
  }
};
class Box{
  float x,y,w,h;
  
  
  Box(float xx,float yy,float ww,float hh){
    
  }
  
  
};
public void Reset(){
  //if(yes.toggle==1)text("hello",100,100);
  boolean mdown = false;
  
  if(file.items.get(6).toggle==1&&file.items.get(6).parent.toggle==1){
  fill(255,150);
  rect(0,0,width,height);
  reset_dialogue.toggle = 1;
  reset_dialogue.draw();
  reset_dialogue.toggle  = 1;
  mdown = true;
  
  }
  if(no.toggle==1){
    file.items.get(6).toggle = 0;
    no.toggle=0;
    file.toggle = 0;
  }
  
  if(yes.toggle==1){
    //file.toggle =0;
    BMS = new BMScontrols(this);
    horizontaltabs tab = null;
    windows = new ArrayList<Window>();
    menus = new ArrayList<Menu>();
    textboxes = new ArrayList<TextArea>();
    buttons = new ArrayList<Button>();
    Sliders = new ArrayList<Slider>();
    qgrid = new ArrayList<Quad>();
    gcam = null;
    g = null;
    gimg = null;
    //scenes = new ArrayList<Scene>();
    attractors = new Attractor();
    int W = 1200, H = 660,gw = 10,gh = 10;
    gridtype = false;
    float kkkk = 0.1f, gW = (W)/PApplet.parseFloat(gw), gH = H/PApplet.parseFloat(gh);;
    Button btn1,btn2,btn3,reset,attractor;
    Button grav;
    noiseSeed(PApplet.parseInt(random(1000000)));
    Grid g;
    TextArea textb1;
    Plot_2D plot;
    Menu file;
    Entity humans;
    Entity plants;
    Entity mineral;
    Entity metal;
    entities = new ArrayList<Entity>();
    
    BMS.begin();
    tabsetup();
    
    spawnRaces("human",3,60);
  }
};
class sliderBox{
  
  float x,y,w,h,vspacing,hspacing;
  Slider sliderR,sliderB,sliderG;
  ArrayList<Slider> sliders = new ArrayList<Slider>();
  String type;
  PVector mouse,mouse2;
  boolean vertical, horizontal = true,draggable,saved,tdown,mdown,visible = true,parentCanvas,t2down;
  Menu menu;
  Menu tooltip;
  tab parentTab;
  String savePath = "";
  
  sliderBox(float xx, float yy,float ww,float S,int num){
    
    x = xx;
    y = yy;
    w = ww;
    h = (10 + S) * num;
    vspacing = S;
    
    menu = new Menu(x,y,w,h);
    menu.highlightable = false;
    menu.visible = false;
    menu.type = 2;
    menu.spacing = vspacing;
    menu.vertical = false;
    
    for(int i=0;i<num;i++){
      float ypos = y + (10 + S) *i;
      Slider a =  new Slider(x ,ypos,w,10);
      a.id = i;
      a.bar = true;
      a.classic = true;
      a.parent = menu;
      a.valuex = a.w/2;
      sliders.add(a);
      menu.sliders.add(a);
    }
    //menu.id = menus.size()-1;
    createTooltip();
  };
  
  sliderBox(float xx, float yy,float ww,float S,String [] Labels){
    
    x = xx;
    y = yy;
    w = ww;
    h = (10 + S) * Labels.length - S;
    vspacing = S;
    
    menu = new Menu(x,y,w,h);
    menu.highlightable = false;
    menu.visible = false;
    menu.type = 2;
    menu.spacing = vspacing;
    menu.vertical = false;
    menu.slide = false;
    menu.draggable = true;
    
    for(int i=0;i<Labels.length;i++){
      float ypos = y + (10 + S) *i;
      Slider a =  new Slider(x ,ypos,w,10,Labels[i]);
      a.id = i;
      a.bar = true;
      a.classic = true;
      a.parent = menu;
      a.valuex = a.w/2;
      sliders.add(a);
      menu.sliders.add(a);
    }
    createTooltip();
  };
  
  sliderBox(float xx, float yy,float ww,float S,String [] Labels,tab t){
    
    parentCanvas = true;
    x = xx;
    y = yy;
    w = ww;
    h = (10 + S) * Labels.length - S;
    vspacing = S;
    
    menu = new Menu(x,y,w,h);
    menu.highlightable = false;
    menu.visible = false;
    menu.type = 2;
    menu.spacing = vspacing;
    menu.vertical = false;
    menu.slide = false;
    menu.draggable = true;
    
    for(int i=0;i<Labels.length;i++){
      float ypos = y + (10 + S) *i;
      Slider a =  new Slider(x ,ypos,w,10,Labels[i]);
      a.id = i;
      a.tooltip.Width = PApplet.parseInt(t.w);
      a.tooltip.Height = PApplet.parseInt(t.h);
      a.bar = true;
      a.classic = true;
      a.parent = menu;
      a.valuex = a.w/2;
      sliders.add(a);
      menu.sliders.add(a);
    }
    createTooltip();
  };
  
  sliderBox(float xx, float yy,float ww,float S,String Label, String [] Labels,tab t){
    
    parentCanvas = true;
    x = xx;
    y = yy;
    w = ww;
    h = (10 + S) * Labels.length - S;
    vspacing = S;
    
    menu = new Menu(x,y,w,h,Label);
    menu.highlightable = false;
    menu.visible = false;
    menu.type = 2;
    menu.spacing = vspacing;
    menu.vertical = false;
    menu.slide = false;
    menu.draggable = true;
    
    for(int i=0;i<Labels.length;i++){
      float ypos = y + 20 + (10 + S) *i;
      Slider a =  new Slider(x ,ypos,w,10,Labels[i]);
      a.id = i;
      a.tooltip.Width = PApplet.parseInt(t.w);
      a.tooltip.Height = PApplet.parseInt(t.h);
      a.bar = true;
      a.classic = true;
      a.parent = menu;
      a.valuex = a.w/2;
      sliders.add(a);
      menu.sliders.add(a);
    }
    createTooltip();
  };
  
  sliderBox(float xx, float yy,float ww,float S,Menu m,String [] Labels){
    
    x = xx;
    y = yy;
    w = ww;
    h = (10 + S) * Labels.length - S;
    vspacing = S;
    
    menu = m;
    menu.highlightable = false;
    menu.visible = false;
    menu.type = 2;
    menu.spacing = vspacing;
    menu.vertical = false;
    
    for(int i=0;i<Labels.length;i++){
      float ypos = y + (10 + S) *i;
      Slider a =  new Slider(x ,ypos,w,10,Labels[i]);
      a.id = i;
      a.bar = true;
      a.classic = true;
      a.parent = menu;
      a.valuex = a.w/2;
      sliders.add(a);
      menu.sliders.add(a);
    }
    createTooltip();
  };
  
  sliderBox(float xx, float yy,float ww,float S,tab t){
    
    parentCanvas = true;
    vspacing = S;
    x = xx;
    y = yy;
    w = ww;
    
    menu = new Menu(x,y,w,h);
    menu.highlightable = false;
    menu.visible = false;
    menu.type = 2;
    menu.spacing = S;
    menu.vertical = false;
    menu.slide = false;
    menu.draggable = true;
    
    createTooltip();
  };
  
  public void createTooltip(){
    String []s1 = {"Reset All","Save","Load","Minimize"};
    tooltip = new Menu(x+w,y-30,40,s1);
    //menu.id = menus.size()-1;
   // menus.add(menu);
   BMS.sliderBoxes.add(this);
   savePath = "sliderBox" + BMS.sliderBoxes.size();
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public PVector getMouse(PVector m,PVector n){
    
    return new PVector (m.x-n.x,m.y-n.y);
  };
  
  public void draw(){
    //if(visible){
    //menu.sliderBoxP = this;
    menu.draw();
    if(t2down&&tooltip!=null)tooltip.draw();
    logic();
    drawToolTip();
    //}
  };
  
  
  public void draw(PGraphics canvas){
    menu.mouse = new PVector(mouseX-parentTab.x,mouseY-parentTab.y);
    menu.parentTab = parentTab;
    menu.setParentCanvas(canvas);
    menu.draw(canvas);
    
    if(tdown&&tooltip!=null){
      tooltip.mouse = new PVector(mouseX-parentTab.x,mouseY-parentTab.y);
      tooltip.setParentCanvas(canvas);
      tooltip.draw(canvas);
    }
    mouse = new PVector(mouseX-parentTab.x,mouseY-parentTab.y);
    logic(canvas);
    drawToolTip(canvas);
  };
  
  public void logic(){
    

    
    if(menu.draggable&&menu.drag){
      
      tooltip.x = menu.x + menu.w;
      tooltip.y = menu.y - 50;
      
        for(int i=0;i<sliders.size();i++){
        
        Slider b = sliders.get(i);
        
        b.x = menu.x;
        b.y = menu.y + (b.h + vspacing) * i;
        b.tooltip.x = b.x+b.w+textWidth("0.0000");
        b.tooltip.y = b.y;
        
      }
          x = menu.x;
          y = menu.y;
    }else{
          menu.x = x;
          menu.y = y;
    }
    
    
    if(!saved&&!BMS.autoControl){
      }
    if(frameCount%BMS.autoSaveTimeout==0)saved = false;
    else saved = true;
    if(mousePressed&&tooltip!=null&&tooltipPos()&&!t2down&&!mdown&&tooltip.visible){
      tdown = true;
      mdown = true;
    }
    if(mousePressed&&tdown&&!mdown&&tooltip!=null&&!tooltipPos()&&!t2down&&tooltip.visible){
      tdown = false;
      mdown = true;
    }
    if(!mousePressed)mdown = false;
    if(tdown&&!mousePressed)t2down = true;
    boolean n = false;
    if(t2down){
      tdown = false;
      if(tooltip!=null&&tooltip.items.get(0).pos()&&mousePressed){
        mdown = true;
        for(int i=0;i<menu.sliders.size();i++){
          Slider s = menu.sliders.get(i);
          
          s.value = 0;
          s.valuex = s.w/2;
          
          if(s.Link!=null){
                  Field field = null;
                try{
                     field = s.Link.getClass().getField(s.control); 
                     field.set(s.Link, 0); 
                }catch (NullPointerException e) {
                }catch (NoSuchFieldException e) {
                }catch (IllegalAccessException e) {
                } 
          }}t2down = false; }}
          // if(t2down&&tooltip!=null&&!tooltip.items.get(0).pos()&&mousePressed){
          //   t2down = false;
          //   text(hello,100,150);
          // }
        
  };
  
  public void logic(PGraphics canvas){
    
    if(menu.draggable&&menu.drag){
        tooltip.x = menu.x+menu.w;
        tooltip.y = menu.y - 50;
        //menu.spacing = vspacing;
        for(int i=0;i<sliders.size();i++){
        
        Slider b = sliders.get(i);
        
        b.x = menu.x;
        b.y = menu.y + (b.h + vspacing) * i;
        b.tooltip.x = b.x+b.w+textWidth("0.0000");
        b.tooltip.y = b.y;
        
      }}
    if(!saved&&!BMS.autoControl){
      }
    if(frameCount%BMS.autoSaveTimeout==0)saved = false;
    else saved = true;
    if(tooltip!=null&&mousePressed&&!tdown&&!mdown&&tooltipPos(mouse)&&!t2down){
      tdown = true;
      mdown = true;
    }
    if(tooltip!=null&&mousePressed&&tdown&&!mdown&&!tooltipPos(mouse)&&!t2down){
      tdown = false;
      mdown = true;
    }
    if(!mousePressed)mdown = false;
    if(tdown&&!mousePressed&&!t2down)t2down = true;
    canvas.fill(255);
    canvas.ellipse(mouse.x,mouse.y,10,10);
    if(t2down){
      
      if(tooltip!=null&&tooltip.items.get(0).pos(mouse)&&mousePressed){
        mdown = true;
        for(int i=0;i<menu.sliders.size();i++){
          Slider s = menu.sliders.get(i);
          
          s.value = 0;
          s.valuex = s.w/2;
          
          if(s.Link!=null){
                  Field field = null;
                try{
                     field = s.Link.getClass().getField(s.control); 
                     field.set(s.Link, 0); 
                }catch (NullPointerException e) {
                }catch (NoSuchFieldException e) {
                }catch (IllegalAccessException e) {
                }}}
          t2down = false;
        }}
        if(t2down&&tooltip!=null&&!tooltip.items.get(0).pos(mouse)&&mousePressed)t2down = false;
  };
  
  public void drawToolTip(PGraphics canvas){
    if(tooltip!=null&&tooltipPos(mouse)&&!tdown&&!t2down&&tooltip.visible){
      canvas.noStroke();
      canvas.fill(0,150);
      canvas.rect(menu.x+menu.w,menu.y-50,50,50);
    }
  };
  
  public void drawToolTip(){
    if(!tdown&&tooltip!=null&&tooltipPos()&&!t2down&&tooltip.visible){
      noStroke();
      fill(0,150);
      rect(menu.x+menu.w,menu.y-50,50,50);
    }
  };
  
  public void add(Slider s,float spacing){
    
    vspacing = spacing;
    menu.spacing = spacing;
    s.valuex = w/2;
    menu.add(s,spacing);
    h = (s.h+spacing)*menu.sliders.size();
    
    menu.h = h;
  };
  
  public void add(Slider s){
    
    s.valuex = w/2;
    menu.add(s);
    h = (s.h+vspacing)*menu.sliders.size();
    
    menu.h = h;
  };
  
  
  //void save(){
  //  //String savePath = 
  //  for(int i=0;i<sliders.size();i++){
        
  //      Slider s = sliders.get(i);
        
        
        
  //  }
  //};
  
  //void load(){
    
  //};
  
  public void display(String a){
    
    if(a=="vertical"|| a== "Vertical"){
      float k = 0;
      menu.vertical = true;
      k = menu.h;
      menu.h = menu.w ;
      h = w;
      menu.w = k;
      w = k;
      
      for(int i=0;i<sliders.size();i++){
        
        Slider b = sliders.get(i);
        
        //b.horizontal = false;
        k = b.w;
        b.w = b.h;
        b.h = k;
        k = b.btnw;
        b.btnw = b.btnh;
        b.btnh = k;
      }
    }
    
  };
  
  public void set(int b, String a){
    
    if(b==menu.sindex)menu.sliders.get(b).label = a;
  };
  
  public void set(int a,int b, int c){
    
    if(a==menu.sindex)menu.sliders.get(a).set(b,c);
  };
  
  public float get(int a){
    
    return menu.sliders.get(a).value;
  };
  
  public int getint(int a){
    
    return floor(menu.sliders.get(a).value);
  };
  
  public void set(int a, float b,float c,Object o, String variable){
    if(a==menu.sindex)menu.sliders.get(a).set(b,c,o,variable);
  };
  
  public void set(int a, float b,float c,Object o, String variable,String n){
    if(a==menu.sindex)menu.sliders.get(a).set(b,c,o,variable,n);
  };
  
  public void setint(int a, int b,int c,Object o, String variable){
    if(a==menu.sindex)menu.sliders.get(a).setint(b,c,o,variable);
  };
  
  public void setint(int a, int b,int c){
    if(a==menu.sindex)menu.sliders.get(a).setint(b,c);
  };
  
  public void setint(int a, int b,int c,Object o, String variable,String n){
    //if(visible)
    //menu.sliders.get(a).setint(b,c,o,variable,n);
  };
  
  public void set(int a, String b, String c){
    
    if(b == "Classic" || b == "classic"){
      if(c == "Bar" || c =="bar"){
        menu.sliders.get(a).classic = true;
        menu.sliders.get(a).bar = true;
        menu.sliders.get(a).radio = false;
        menu.sliders.get(a).square = false;
      }
      
      if(c == "Radio" || c =="radio"){
        menu.sliders.get(a).classic = true;
        menu.sliders.get(a).bar = false;
        menu.sliders.get(a).radio = true;
        menu.sliders.get(a).square = false;
      }
      
      if(c == "Square" || c =="square"){
        menu.sliders.get(a).classic = true;
        menu.sliders.get(a).bar = false;
        menu.sliders.get(a).radio = false;
        menu.sliders.get(a).square = true;
      }}
      
      //menus.remove(menu.id);
      //menu.add(
  };
  
  //void draw2(){
    
  //  fill(255);
  //  text("hello",100,100);
    
  //};
  
  
  public void set(int c, Grid_space a, String b,float d, float e){
    //sliders.get(c).slide(float d,float e, 
  };
  
  public void set(Entity a, String b){
    
  };
  
  public void set(Window a, String b){
    
  };
  
  public void set(Menu a, String b){
    
  };
  
  public void set(Boundary a, String b){
    
  };
  
  public void set(Plot_2D a, String b){
    
  };
  
  public void setbg(){
    
  };
  
  public void setDrag(Boolean a){
    menu.draggable = a;
  };
  
  public boolean pos(){
    return mouseX>menu.x&&mouseX<menu.x+menu.w&&mouseY>menu.y&&mouseY<menu.y+menu.w;
  }
  
  public boolean tooltipPos(){
    return mouseX>menu.x+menu.w&&mouseX<menu.x+menu.w+50&&mouseY>menu.y-50&&mouseY<menu.y;
  };
  
  public boolean tooltipPos(PVector m){
    return m.x>menu.x+menu.w&&m.x<menu.x+menu.w+50&&m.x>menu.y-50&&m.x<menu.y;
  };
};
class SliderGrid{
  float x,y,w,h;
  ArrayList<Slider> sliders = new ArrayList<Slider>();
  
  SliderGrid(float X,float Y,float W,float H,String[] Labels,int cols,int rows){
    
    x = X;
    y = Y;
    w = W;
    h = H;
    
    float ww = W/cols;
    float hh = H/cols;
    
    for (int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        
        int pos = j+i*cols;
        
        String label = null;
        if(pos<Labels.length){
        
          label = Labels[pos];
        Slider s = new Slider(x+ww*j,y+hh*i,ww-30,10,label);
        sliders.add(s);
        
    }}}
  };
    
    public void draw(){
     for(int i=0;i<sliders.size();i++){
       Slider s = sliders.get(i);
       
       s.draw();
     }
    
  };
  
  
  
};
class rgb_Slider{
  
  float x,y,w,h,vspacing,hspacing;
  Slider sliderR,sliderB,sliderG;
  String type;
  boolean vertical, horizontal = true;
  Menu menu;
  
  rgb_Slider(float xx, float yy,float ww,float hh,float S){
    
    x = xx;
    y = yy;
    w = ww;
    h = hh;
    vspacing = S;
    
    menu = new Menu(x,y,w,h);
    menu.highlightable = false;
    menu.visible = false;
    menu.type = 2;
    menu.spacing = vspacing;
    //-------------R-----------------
    sliderR = new Slider(x,menu.y,w,10,"R");
    sliderR.classic = true;
    sliderR.bar = true;
    sliderR.parent = menu;
    sliderR.valuex = x;
    menu.sliders.add(sliderR);
    
    //-------------G-----------------
    sliderG = new Slider(menu.x,menu.y + vspacing * 1,w,10,"G");
    sliderG.classic = true;
    sliderG.bar = true;
    sliderG.parent = menu;
    sliderG.valuex = x;
    menu.sliders.add(sliderG);
    
    //-------------B-----------------
    sliderB = new Slider(menu.x,menu.y + vspacing * 2,w,10,"B");
    sliderB.classic = true;
    sliderB.bar = true;
    sliderB.parent = menu;
    sliderB.valuex = x;
    menu.sliders.add(sliderB);
    menus.add(menu);
    
    
  }
  
  public void draw(){
    //menu.draw();
  }
  
  public void display(String a){
    
    if(a=="vertical"|| a== "Vertical"){
      float k = 0;
      menu.vertical = true;
      
      k = menu.h;
      menu.h = menu.w ;
      h = w;
      menu.w = k;
      w = k;
      
      sliderR.horizontal = false;
      k = sliderR.w;
      sliderR.w = sliderR.h;
      sliderR.h = k;
      k = sliderR.btnw;
      sliderR.btnw = sliderR.btnh;
      sliderR.btnh = k;
      
      sliderG.horizontal = false;
      k = sliderG.w;
      sliderG.w = sliderG.h;
      sliderG.h = k;
      k = sliderG.btnw;
      sliderG.btnw = sliderG.btnh;
      sliderG.btnh = k;
      
      sliderB.horizontal = false;
      k = sliderB.w;
      sliderB.w = sliderB.h;
      sliderB.h = k;
      k = sliderB.btnw;
      sliderB.btnw = sliderB.btnh;
      sliderB.btnh = k;
    }
    
  };
  
  public void set(String a){
    if(a=="radio" || a == "Radio"){
      sliderR.radio = true;
      sliderR.square = false;
      sliderR.bar = false;
      
      sliderG.radio = true;
      sliderG.square = false;
      sliderG.bar = false;
      
      sliderB.radio = true;
      sliderB.square = false;
      sliderB.bar = false;
    }
    if(a=="Bar" || a == "bar"){
      sliderR.radio = false;
      sliderR.square = false;
      sliderR.bar = true;
      
      sliderG.radio = false;
      sliderG.square = false;
      sliderG.bar = true;
      
      sliderB.radio = false;
      sliderB.square = false;
      sliderB.bar = true;
    }
    if(a=="Square" || a == "square"){
      sliderR.radio = false;
      sliderR.square = true;
      sliderR.bar = false;
      
      sliderG.radio = false;
      sliderG.square = true;
      sliderG.bar = false;
      
      sliderB.radio = false;
      sliderB.square = true;
      sliderB.bar = false;
    }
    
    if(a =="color" || a == "Color"){
      sliderR.slidercol = color(255,0,0);
      sliderG.slidercol = color(0,255,0);
      sliderB.slidercol = color(0,0,255);
    }
  };
  
  public void set(Grid_space a, String b){
    
  };
  
  public void set(Entity a, String b){
    
  };
  
  public void set(Window a, String b){
    
  };
  
  public void set(Menu a, String b){
    
  };
  
  public void set(Boundary a, String b){
    
  };
  
  public void set(Plot_2D a, String b){
    
  };
  
  public void setbg(){
    
  };
  
  
};


class tab extends tabBoundary {

  PGraphics canvas,canvas2;
  float x, y, w, h,bx,by,bh,bw;
  int tabindex = -1, state, current,id,Width,Height;
  String label;
  boolean border,open,parentCanvas,overflow;
  PVector mouse,mouse2;
  ArrayList<TextBox> textboxes = new ArrayList<TextBox>();
  ArrayList<Grid> grids = new ArrayList<Grid>();
  ArrayList<Grid3D> grids3d = new ArrayList<Grid3D>();
  ArrayList<TextArea> textareas = new ArrayList<TextArea>();
  ArrayList<Window> windows = new ArrayList<Window>();
  ArrayList<Button> buttons = new ArrayList<Button>();
  ArrayList<PImage> images = new ArrayList<PImage>();
  ArrayList<PImage> temp_images = new ArrayList<PImage>();
  ArrayList<Image> processedImages = new ArrayList<Image>();
  ArrayList<Menu> menus = new ArrayList<Menu>();
  ArrayList<sliderBox> sliderBoxes = new ArrayList<sliderBox>();
  ArrayList<Dropdown> dmenus = new ArrayList<Dropdown>();
  ArrayList<Table_> tables = new ArrayList<Table_>();
  ArrayList<String> links = new ArrayList<String>();
  ArrayList<String> textblock = new ArrayList<String>();
  ArrayList<vectorText> processedText = new ArrayList<vectorText>();
  ArrayList<String[]> temp_text = new ArrayList<String[]>();
  ArrayList<processing.data.Table> temp_tables = new ArrayList<processing.data.Table>();
  String folder = "";
  String file = "";
  HashMap<String, Boolean> keys = new HashMap<String, Boolean>();

  ArrayList<Boolean> bools = new ArrayList<Boolean>();
  PVector window = new PVector(0, 0);
  Slider sliderv;
  Slider sliderh;
  tab navigator;
  verticaltabs navigatorv;
  horizontaltabs navigatorh;
  tab child, parent,parentTab;
  tab current_tab, next_tab, previous_tab;


  ArrayList<tab> tabs = new ArrayList<tab>();
  ArrayList<tab> states = new ArrayList<tab>();
  ArrayList<Integer> transitions = new ArrayList<Integer>();
  public boolean visible = true, scrollable,draggable,drag;
  boolean sliderset, displayChild, init, setTab,slidersUpdated;
  Button title;

  tab( float x, float y, float w, float h,int k) {
    
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    canvas = createCanvas();
    //tabs.add(this);
    createConstruct();
    
  };
  
  tab( float x, float y, float w, float h) {
    
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    //tabs.add(this);
    canvas = createCanvas();
    createConstruct();
    
    //this.label = label;
    //title = new Button(x, y, w, 20, label);
    //title.border = false;
  };
  
  tab( float x, float y, float w, float h,Slider s) {
    
    
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    canvas = createCanvas();
    states.add(this);
    
  };
  
  tab( float x, float y, float w, float h,Boundary b) {
    
    
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    canvas = createCanvas();
    states.add(this);
    createConstruct2();
    
  };
  
  tab( float x, float y, float w, float h, String label,int k) {
    //super();
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    canvas = createCanvas();
    this.label = label;
    title = new Button(0, 0, w, 20, label);
    title.border = false;

    createConstruct();
  };

  tab( float x, float y, float w, float h, String label) {
    
    
    //super();
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    canvas = createCanvas();
    this.label = label;
    title = new Button(0, 0, w, 20, label);
    title.border = false;

    createConstruct();
  };
  
    tab( float x, float y, float w, float h, String label,boolean n) {
    
    
    //super();
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    canvas = createCanvas();
    this.label = label;
    title = new Button(0, 0, w, 20, label);
    title.border = false;
    createConstruct();
  };

  tab() {
  };
  
  public void createConstruct(){
    Window w1 = new Window(83, 80, 200, 200, "C:\\Users\\paul goux\\");
    w1.draggable = true;
    windows.add(w1);

    sliderv = new Slider(w-10, 0, 10, h-10);
    sliderv.classic = true;
    sliderv.bar = true;
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderv.tvisible = false;
    sliderh = new Slider(0, h-10, w-10, 10);
    sliderh.tvisible = false;
    sliderh.classic = true;
    sliderh.bar = true;
    //Boundaries.add(new Boundary(0, 0, w, h, 4));
    states.add(this);
  };
  
  public void createConstruct2(){

    sliderv = new Slider(w-10, 0, 10, h-10);
    sliderv.classic = true;
    sliderv.bar = true;
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderv.tvisible = false;
    sliderh = new Slider(0, h-10, w-10, 10);
    sliderh.tvisible = false;
    sliderh.classic = true;
    sliderh.bar = true;
    //Boundaries.add(new Boundary(0, 0, w, h, 4));
  };
  
public PGraphics createCanvas() {
  PGraphics pg = createGraphics(PApplet.parseInt(w), PApplet.parseInt(h));
  //pg.setLocation(x, y);
  return pg;
}

public PGraphics createCanvas2() {
  PGraphics pg = createGraphics(PApplet.parseInt(w), PApplet.parseInt(h+50));
  //pg.setLocation(x, y);

 
  return pg;
}

public PGraphics createCanvas(float w,float h) {
  PGraphics pg = createGraphics(PApplet.parseInt(w), PApplet.parseInt(h));
  //pg.setLocation(x, y);
  
 
  return pg;
}
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  

  public void displayTab(PGraphics scene) {
    
    tab t = states.get(state);
    
    if (toggle) {
      t.mouse = mouse2;
      mouse = mouse2;
      canvas.beginDraw();
      canvas.background(50);
      logic();
      t.drawBorder();
      t.boundingBox();
      
      t.drawButtons();
      t.drawMenus();
      t.drawTextboxes();
      t.drawTextareas();
      t.drawWindows();
      t.drawSliderBoxes();
    if(t.title!=null&&t.visible){
      t.title.toggle=1;
      t.drawTitle();
      t.drawBorder();
      t.drawDmenu();
    }
    if(t.scrollable)t.drawSlider();
      canvas.endDraw();
      scene.image(canvas,x,y);
    }
  };
  
  public void displayTab() {
    fill(255);
    tab t = states.get(state);
    if (toggle) {
      if(!parentCanvas){
        t.mouse = getMouse();
        mouse = getMouse();
      }
      else{
        t.mouse = getMouse();
        mouse = getMouse();
      }
      canvas.beginDraw();
      canvas.background(50);
      logic();
      t.drawBorder();
      t.boundingBox();
      
      t.drawButtons();
      t.drawMenus();
      t.drawTextboxes();
      
      t.drawTextareas();
      t.drawWindows();
      t.drawSliderBoxes();
      
    if(t.title!=null&&t.visible){
      t.title.toggle=1;
      t.drawTitle();
      t.drawBorder();
      t.drawDmenu();
    }
    if(t.scrollable)t.drawSlider();
      canvas.endDraw();
      image(canvas,x,y);
    }
  };

  
  public void displayTabs() {
    
    tab t = states.get(state);
    
    if (toggle&&t!=null) {
      t.mouse = getMouse();
      mouse = getMouse();
      canvas.beginDraw();
      canvas.background(50);
      //for(int i=0;i<states.size();i++){
      //tab t1 = states.get(i);
      
      //if(i!=state&&toggle){
      //  t1.toggle = false;
      //  t1.visible = false;
      //  if(t1.title!=null)t1.title.toggle=1;
      //}else t1.toggle=true;}
      t.logic();
      t.boundingBox();
      t.drawButtons();
      t.drawMenus();
      t.drawTextboxes();
      t.drawTextareas();
      t.drawTable_s();
      //t.displayInnerTabs();
      t.drawText();
      t.drawTitle();
      t.drawBorder();
      t.drawDmenu();
      t.drawSliderBoxes();
    
    if (t!=null&&t.scrollable&&t.toggle)t.drawSlider();
      
      canvas.endDraw();
      image(canvas,x,y);
    }
  };
  
  public void displayTabs(PGraphics scene) {
    
    tab t = states.get(state);
    
    if (toggle&&t!=null) {
      t.mouse = mouse2;
      mouse = mouse2;
      
      canvas.beginDraw();
      
      for(int i=0;i<states.size();i++){
      tab t1 = states.get(i);
      
      if(i!=state&&toggle){
        t1.toggle = false;
        t1.visible = false;
        if(t1.title!=null)t1.title.toggle=1;
      }else t1.toggle=true;}
      t.logic();
      t.boundingBox();
      t.drawButtons();
      t.drawMenus();
      t.drawTextboxes();
      t.drawTextareas();
      t.drawTable_s();
      //t.displayInnerTabs();
      t.drawText();
      t.drawTitle();
      t.drawBorder();
      t.drawDmenu();
      t.drawSliderBoxes();
    
    if (t!=null&&t.scrollable&&t.toggle)t.drawSlider();
    
      canvas.endDraw();
      scene.image(canvas,x,y);
      
    }
  };
  
  public void addState(int k){
    if(title==null){
    for(int i=0;i<k;i++){
      states.add(new tab(x,y,w,h));
    }}else{
      for(int i=0;i<k;i++){
      states.add(new tab(x,y,w,h,"hello"+i));
    }}
  };
  
  public void setTitle(int i,String s){
    tab k = states.get(i);
    
    if(k.title!=null)k.title.label = s;
  };
  
  public void add(int i,Button b){
    //clear();
    tab k = states.get(i);
    b.parentCanvas = true;
    k.buttons.add(b);
  };
  
  public void add(int i,Menu m){
    //clear();
    tab k = states.get(i);
    m.parentCanvas = true;
    k.menus.add(m);
  };
  
  public void add(int i,Dropdown d){
    //clear();
    tab k = states.get(i);
    d.parentCanvas = true;
    k.dmenus.add(d);
  };
  
  public void add(int i,TextBox t){
    //clear();
    tab k = states.get(i);
    t.parentCanvas = true;
    k.textboxes.add(t);
  };
  
  public void add(int i,TextArea t){
    //clear();
    tab k = states.get(i);
    t.parentCanvas = true;
    k.textareas.add(t);
  };
  
  public void add(int i,String s){
    //clear();
    tab k = states.get(i);
    k.textblock.add(s);
  };
  
  public void add(int i,Table_ t){
    //clear();
    t.parentCanvas = true;
    tab k = states.get(i);
    k.tables.add(t);
  };
  
  public void add(Button b){
    //clear();
    tab k = states.get(0);
    b.parentCanvas = true;
    k.buttons.add(b);
  };
  
  public void add(Menu m){
    //clear();
    tab k = states.get(0);
    m.parentCanvas = true;
    m.localCanvas = canvas;
    k.menus.add(m);
  };
  
  public void add(Dropdown d){
    //clear();
    tab k = states.get(0);
    d.parentCanvas = true;
    k.dmenus.add(d);
  };
  
  public void add(TextBox t){
    //clear();
    tab k = states.get(0);
    t.parentCanvas = true;
    k.textboxes.add(t);
  };
  
  public void add(TextArea t){
    //clear();
    tab k = states.get(0);
    t.parentCanvas = true;
    k.textareas.add(t);
  };
  
  public void add(String s){
    //clear();
    tab k = states.get(0);
    k.textblock.add(s);
  };
  
  public void add(Table_ t){
    //clear();
    t.parentCanvas = true;
    tab k = states.get(0);
    k.tables.add(t);
  };
  
  public void add(sliderBox s){
    //clear();
    s.parentCanvas = true;
    tab k = states.get(0);
    k.sliderBoxes.add(s);
  };
  
  public PVector getMouse(){
    return new PVector(mouseX-x,mouseY-y);
  };
  
  public PVector getMouse2(){
    return new PVector(mouseX-x,mouseY-y);
  };
  
  public PVector getMouse(PVector m){
    return new PVector(m.x-x,m.y-y);
  };
  
  public void clear(){
    textboxes = new ArrayList<TextBox>();
    grids = new ArrayList<Grid>();
    grids3d = new ArrayList<Grid3D>();
    textareas = new ArrayList<TextArea>();
    //windows = new ArrayList<Window>();
    buttons = new ArrayList<Button>();
    images = new ArrayList<PImage>();
    temp_images = new ArrayList<PImage>();
    processedImages = new ArrayList<Image>();
    menus = new ArrayList<Menu>();
    dmenus = new ArrayList<Dropdown>();
    tables = new ArrayList<Table_>();
    links = new ArrayList<String>();
    textblock = new ArrayList<String>();
    processedText = new ArrayList<vectorText>();
    temp_text = new ArrayList<String[]>();
    temp_tables = new ArrayList<processing.data.Table>();
  };
  
  public void logic() {
    
    if (navigator!=null)navigator.displayTabs();
    if (scrollable) {

      if (!sliderh.mdown) {
        sliderv.mouseFunctions();
        sliderv.set(-h+20, h-20, this, "window.y");
      }

      if (!sliderv.mdown) {
        sliderh.set(-w+10, w-10, this, "window.x");
        sliderh.mouseFunctions();
      }
    }
    if(draggable){
      drawDragBox();
      if(posTabd()&&mousePressed&&!mdown&&!drag){
        mdown = true;
        dx = x - mouseX;
        dy = y - mouseY;
      }
      
      if(mdown)drag = true;
      else drag = false;
      
      if(drag){
        x = mouseX-dx;
        y = mouseY-dy;
      }
      
      if(!mousePressed)mdown = false;
    }
  };
  
  public void drawSliderBoxes(){
    
    for (int i=states.get(state).sliderBoxes.size()-1;i>-1; i--) {
      
      sliderBox s = states.get(state).sliderBoxes.get(i);
      s.mouse = getMouse();
      s.parentTab = this;
      s.draw(canvas);
    }
  };
  
  public void drawDragBox(){
    
    canvas.fill(0);
    canvas.noStroke();
    if(border)canvas.stroke(255);
    canvas.rect(x,y-5,w,5);
    
  };
  
  public void drawSlider() {
    
    sliderv.parentCanvas = true;
    sliderh.parentCanvas = true;
    sliderv.mouse = mouse;
    sliderv.mouseFunctions(mouse);
    sliderv.draw(canvas);
    sliderh.mouseFunctions(mouse);
    sliderh.mouse = getMouse();
    sliderh.draw(canvas);
  };

  public void drawText() {
  };

  public void drawDmenu() {
    for (int i=0; i<states.get(state).dmenus.size(); i++) {
      Dropdown d = states.get(state).dmenus.get(i);
      
      if(parentTab==null)d.mouse = getMouse();
      else d.mouse = getMouse(mouse);
      d.displayDropdown(canvas);
    };
  };

  public void scrolllogic() {
  };

  public void drawTitle() {
    canvas.fill(255);
    if(states.size()>0&&state<states.size()&&state>-1){
      if(states.get(state).title!=null){
        states.get(state).title.mouse = mouse;
        states.get(state).title.draw(canvas);
      }}
    
    if(states.size()>0&&state<states.size()&&states.get(state).title!=null)states.get(state).title.toggle2(this, "toggle");
  };
  
  public void drawTitle(PGraphics scene) {
    scene.fill(255);
    if(states.size()>0&&state<states.size()&&state>-1){
      if(states.get(state).title!=null){
        states.get(state).title.mouse = mouse;
        states.get(state).title.draw(scene);
      }}
    
    if(states.size()>0&&state<states.size()&&states.get(state).title!=null)states.get(state).title.toggle2(this, "toggle");
  };
  
  public void drawBorder() {
    if (border) {
      canvas.stroke(255, 200);
      canvas.noFill();
      canvas.rect(0, 0, w, h);
    }
    canvas.noStroke();
  };

  public void boundingBox() {

    canvas.noStroke();
    canvas.fill(255);
    
    canvas.rect(0, 0, w, h);
    canvas.fill(0, 50);
    canvas.rect(0, 0, w, h);
  };
  
  public void getFile(){
    PImage t_img ;
    
    Image t_Img;
    String[] t_text;
    processing.data.Table t_table;
    
    ArrayList<Integer> k = new ArrayList<Integer>();
    
    if(file.length()>0){
      if(file.endsWith("jpg")|| file.endsWith("jpeg") ||file.endsWith("png")||file.endsWith("bmp")||
          file.endsWith("gif")||file.endsWith("JPG")||file.endsWith("JPEG")||file.endsWith("PNG")||
          file.endsWith("BMP")||file.endsWith("GIF")){
            
          t_img = loadImage(file);
          if(!temp_images.contains(t_img))temp_images.add(t_img);
          //if(!temp_images.contains(t_img))images.add(t_img);
          Image img = new Image(t_img);
          if(!processedImages.contains(img))processedImages.add(img);
      }
      
      if(file.endsWith("txt")){
            
          t_text = loadStrings(file);
          if(!temp_text.contains(t_text))temp_text.add(t_text);
      }
      
      if(file.endsWith("csv")){
            
          t_table = loadTable(file);
          if(!temp_tables.contains(t_table))temp_tables.add(t_table);
      }
      
      if(file.endsWith("doc")){
            
          t_text = WordStream(file);
          if(!temp_text.contains(t_text))temp_text.add(t_text);
      }
      if(file.endsWith("mp3")|| file.endsWith("aiff") ||file.endsWith("ogg")||file.endsWith("flac")||
          file.endsWith("m4a")||file.endsWith("flac")){
            
          t_table = loadTable(file);
          if(!temp_tables.contains(t_table))temp_tables.add(t_table);
      }
    }
  };
  
  public boolean posTab() {
    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
  };
  
  public boolean posTab(PVector m) {
    return mouse!=null&&mouse.x>x&&mouse.x<x+w&&mouse.y>y&&mouse.y<y+h;
  };
  
  public boolean posTabd() {
    return mouseX>x&&mouseX<x+w&&mouseY>y-5&&mouseY<y;
  };
  
  public boolean posTabd(PVector m) {
    return m.x>x&&m.x<x+w&&m.y>y-5&&m.y<y;
  };
  
  public void drawImages(){
    
    for (int i=0; i<states.get(state).images.size(); i++) {
      PImage p = states.get(state).images.get(i);
      canvas.image(p,x,y);
    }
    
  };

  public void drawButtons() {
    fill(255);

    for (int i=0; i<buttons.size(); i++) {
      
      Button b = buttons.get(i);
      b.mouse =  mouse;
      b.parentCanvas = true;
      b.draw(canvas);
      
      b.self_click2(mouse);
    }
  };
  
  public void drawButtons(PGraphics scene) {
    scene.fill(255);

    for (int i=0; i<buttons.size(); i++) {
      Button b = buttons.get(i);
      b.mouse =  mouse;
      b.parentCanvas = true;
      b.draw(scene);
      b.self_click2(mouse);
    }
  };

  public void drawMenus() {
    for (int i=0; i<menus.size(); i++) {
      
      Menu m = menus.get(i);
      
      m.setParentCanvas(canvas);
      if(parentTab==null)m.mouse = getMouse();
      else m.mouse = getMouse(mouse);
      m.draw(canvas);
      }
  };

  public void drawTextboxes() {
    for (int i=0; i<textboxes.size(); i++) {
      TextBox t = textboxes.get(i);
      if(parentTab==null)t.mouse = mouse;
      else t.mouse = getMouse(mouse);
      t.draw(canvas);
    }
  };

  public void drawTextareas() {
    for (int i=0; i<textareas.size(); i++) {
      TextArea t = textareas.get(i);
      t.draw();
    }
  };

  public void drawWindows() {
    for (int i=0; i<windows.size(); i++) {
      Window w = windows.get(i);
      w.toggle = true;
      
      w.display_grid();
    }
  };

  public void drawTable_s() {
    for (int i=0; i<tables.size(); i++) {
      Table_ t = tables.get(i);
      t.draw();
    }
  };

  public void displayInnerTabs() {
    for (int i=0; i<tabs.size(); i++) {
      tab t = tabs.get(i);
      t.displayTabs();
    }
  };
};





 class tabBoundary{
  
  float x1,x2,y1,y2,w,h,x3,y3,size = 1,x4,y4,D1,D2,T1,T2,collision_index,menux,menuy,deltamx,deltamy,tacx,tacy,dir;
  float x,y,bx = x,by = y;
  public float mass,vx,vy,ax,ay,density,friction_u,momentum,bax ,bay,pathWidth=20,
               gconst = 0.1f,floor = 590,rtheta = 0,avoidance,cohesion;
  PVector p1,midpoint1,midpoint2,midpoint3,m = new PVector(0,0);
  PVector p2,p3,p4,center = new PVector(-1,-1),vel,ac,rotatep;
  int key1,key2,type,t,t2,vert,vert1,vert3,trit,id,index,lindex,sindex,ccount,sid,vcount,hcount,uindex = -1,counter,tpoints,mcount,sides,shapeIndex,lineIndex,lcount,pcount
      ,options = -1,numm,state,state1=1;
  public int cols = 40,rows = 25;
  public boolean toggle = false,mdown,mup = true,circle,square,bezier,tri,c_poligon,poligon,drag,none,spline,hover,hover2,point1,point2,point3,point4,gravity,hidemenu,clear,
                 edit,complex,cstart,showgrid,cfinish = false,border,fill,hidden,connectedlines,path,avoidtabBoundary,cohesiontabBoundary,amendtabBoundary,amendInnertabBoundary,
                 amendCohesion,amendAvoidance,dashed;
  boolean linedown = false,sdown,rtoggle,click,open,dynamic = true,falling = true,rotating,update,lock,pdown,updatep,updateg,tdown,trow,menudown,pointadded,converted,rdown,phover,
          lhover,contextClick,visible = true;
  float dx,dy,Theta,Norm;
  int col = color(255),bg = color(0,180);
  ArrayList<Integer> indices = new ArrayList<Integer>();
  ArrayList<Button> Buttons = new ArrayList<Button>();
  ArrayList<tabBoundary> Boundaries = new ArrayList<tabBoundary>();
  ArrayList<tabBoundary> innerBoundaries = new ArrayList<tabBoundary>();
  ArrayList<tabBoundary> outerBoundaries = new ArrayList<tabBoundary>();
  ArrayList<PVector> points = new ArrayList<PVector>();
  ArrayList<PVector> rotation_points = new ArrayList<PVector>();
  Scene scene;
  ArrayList<Scene> scenes = new ArrayList<Scene>();
  tabBoundary parent;
  tabBoundary child;
  PShape bpath;
  ArrayList<PShape> paths = new ArrayList<PShape>();
  ArrayList<Float[]> velocity = new ArrayList<Float[]>();
  ArrayList<PVector> velocitypv = new ArrayList<PVector>();
  ArrayList<tabBoundary> Quadrants = new ArrayList<tabBoundary>();
  ArrayList<PVector> Midpoints = new ArrayList<PVector>();
  ArrayList<PVector> collision_array = new ArrayList<PVector>();
  //ArrayList<PVector> Midpoints = new ArrayList<PVector>();
  
  String []contextlabels = {"Undo","Redo"};
  String []contextDellabels = {"Delete Point","Cancel"};
  String []palletelabels = {"Fill","Gravity","Friction","Velocity","Connect","Amend B","Amend iB","Avoid","Seek",
                            "Follow","Dashed","Border","Clear","Visible","Grid","Hide","Edit","Reset"};
  String []complexmenu = {"Finish"};
  String []convertmenu = {"Convert","Delete Shape"};
  String []connectedlMenul = {"Convert","Delete Line","Delete Shape"};
  
  Menu palletehide,context,contextDel,pallete,complexsub,convertToPath,connectedlMenu;
  String [] settingsLabel = {"Cohesion","Avoidance"};
  sliderBox settings;
  
  TextBox Sides = new TextBox (W-200,H-200,20,20,5,"Sides");
  ArrayList<Float> norm = new ArrayList<Float>();
  ArrayList<Float[]> mdist = new ArrayList<Float[]>();
  ArrayList<Float[]> pdist = new ArrayList<Float[]>();
  ArrayList<Float> dist = new ArrayList<Float>();
  ArrayList<Integer> types = new ArrayList<Integer>();
  ArrayList<Float> theta = new ArrayList<Float>();
  ArrayList<Float> mtheta = new ArrayList<Float>();
  ArrayList<PVector> temp = new ArrayList<PVector>();
  ArrayList<ArrayList> polytemp = new ArrayList<ArrayList>();
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  
  PVector polymidpoint = new PVector(0,0);
  Grid gridlayout;
  ArrayList<Point> grid = new ArrayList<Point>();
  ArrayList<Point> ugrid = new ArrayList<Point>();
  ArrayList<Point> ogrid = new ArrayList<Point>();
  
  tabBoundary(){
    
    palletehide = new Menu(0,200+300/2 - 100,20,50);
    context = new Menu(mouseX,mouseY,90,contextlabels);
    contextDel = new Menu(mouseX,mouseY,90,contextDellabels);
    pallete = new Menu(0,200,90,palletelabels,0);
    complexsub = new Menu(W-200,H-200,90,complexmenu);
    convertToPath = new Menu(mouseX,mouseY,90,convertmenu);
    connectedlMenu = new Menu(mouseX,mouseY,90,connectedlMenul);
    type = -1;
    
  };
  
  tabBoundary(float X1, float Y1,float X2, float Y2){
    
    x1 = X1;
    y1 = Y1;
    x2 = X2;
    y2 = Y2;
    type = 2;
    p1 = new PVector(x1,y1);
    p2 = new PVector(x2,y2);
    center = new PVector((x1+x2)/2,(y1+y2)/2);
    
  };
  
  tabBoundary(float X1, float Y1,float ww,float hh,int Type){
    
    float t1 = 0;
    x1 = X1;
    y1 = Y1;
    w = ww;
    h = hh;
    
    Float [] d1 = {0.0f,0.0f};
    Float [] vel = {0.0f,0.0f};
    
    if(Type==0){
    
    x1 = X1;
    y1 = Y1;
    w = ww;
    h = hh;
    x2 = x1 + ww;
    y2 = y1 + hh;
    
    type = 0;
    center = new PVector((x1+x2)/2,(y1+y2)/2);
    d1[0] = center.x - x1;
    d1[1] = center.y - y1;
    pdist.add(d1);
    t1 = atan2(y1-center.y,x1-center.x);
    theta.add(t1);
    d1[0] = center.x - x2;
    d1[1] = center.y - y2;
    pdist.add(d1);
    t1 = atan2(y2-center.y,x2-center.x);
    theta.add(t1);
    
    }
    
    if(Type==2){
    x1 = X1;
    y1 = Y1;
    x2 = ww;
    y2 = hh;
    
    type = 2;
    center = new PVector((x1+x2)/2,(y1+y2)/2);
    Boundaries.add(new tabBoundary(x1,y1,x2,y2));
    d1[0] = center.x - x1;
    d1[1] = center.y - y1;
    pdist.add(d1);
    t1 = atan2(y1-center.y,x1-center.x);
    theta.add(t1);
    d1[0] = center.x - x2;
    d1[1] = center.y - y2;
    pdist.add(d1);
    t1 = atan2(y2-center.y,x2-center.x);
    theta.add(t1);
    velocity.add(vel);
    create_rotation_points(Boundaries);
    create_points(Boundaries);
    
    }
    
    if(Type==0||Type==2){
      center = new PVector((x1+x2)/2,(y1+y2)/2);
    }
    
    if(Type==3){
    
    w = dist(x1,y1,ww,hh);
    h = dist(x1,y1,ww,hh);
    
    Norm = -atan2(x1 - ww,y1 - hh);
    
    x2 = ww + w/1.5f * cos(Norm);
    y2 = hh + h/1.5f * sin(Norm);
    x3 = ww - w/1.5f * cos(Norm);
    y3 = hh - h/1.5f * sin(Norm);
    
    center = new PVector((x1+x2+x3)/3,(y1+y2+y3)/3);
    Boundaries.add(new tabBoundary(x1,y1,x2,y2));
    velocity.add(vel);
      d1[0] = center.x - x1;
      d1[1] = center.y - y1;
      pdist.add(d1);
      t1 = atan2(y1-center.y,x1-center.x);
      theta.add(t1);
    midpoint1 = new PVector((x1 + x2)/2,(y1 + y2)/2);
    Boundaries.add(new tabBoundary(x2 , y2 ,x3 , y3));
     d1[0] = center.x - x2;
     d1[1] = center.y - y2;
     pdist.add(d1);
     t1 = atan2(y2-center.y,x2-center.x);
     theta.add(t1);
    midpoint2 = new PVector((x2 + x3)/2,(y2 + y3)/2);
    velocity.add(vel);
    Boundaries.add(new tabBoundary(x3, y3,x1,y1 ));
      d1[0] = center.x - x3;
      d1[1] = center.y - y3;
      pdist.add(d1);
      t1 = atan2(y3-center.y,x3-center.x);
      theta.add(t1);
    velocity.add(vel);
    midpoint3 = new PVector((x3 + x1)/2,(y3 + y1)/2);
    type = 3;
    create_rotation_points(Boundaries);
    create_points(Boundaries);
    
    }
    
    if(Type==4){
      
    x2 = x1 + ww;
    y2 = y1;
    x3 = x1 + ww;
    y3 = y1 + hh;
    x4 = x1;
    y4 = y1 + hh;
    
    center = new PVector((x1+x2+x3+x4)/4,(y1+y2+y3+y4)/4);
    Boundaries.add(new tabBoundary(x1,y1,x2,y2));
    velocity.add(vel);
      d1[0] = center.x - x1;
      d1[1] = center.y - y1;
      pdist.add(d1);
      t1 = atan2(y1-center.y,x1-center.x);
      theta.add(t1);
    Boundaries.add(new tabBoundary(x2,y2,x3,y3));
    velocity.add(vel);
      d1[0] = center.x - x2;
      d1[1] = center.y - y2;
      pdist.add(d1);
      t1 = atan2(y2-center.y,x2-center.x);
      theta.add(t1);
    Boundaries.add(new tabBoundary(x3,y3,x4,y4));
    velocity.add(vel);
      d1[0] = center.x - x3;
      d1[1] = center.y - y3;
      pdist.add(d1);
      t1 = atan2(y3-center.y,x3-center.x);
      theta.add(t1);
    Boundaries.add(new tabBoundary(x4,y4,x1,y1));
    velocity.add(vel);
      d1[0] = center.x - x4;
      d1[1] = center.y - y4;
      pdist.add(d1);
      t1 = atan2(y4-center.y,x4-center.x);
      theta.add(t1);

    center = new PVector((x1+x2+x3+x4)/4,(y1+y2+y3+y4)/4);
    type = 4;
    }
    
    if(Type==103){
      
    Norm = -atan2(x1 - ww,y1 - hh);
    
    x2 = x1 + w/2 ;
    y2 = y1 + h ;
    x3 = x1 - w/2 ;
    y3 = y1 + h ;
    center = new PVector((x1+x2+x3)/3,(y1+y2+y3)/3);
    Boundaries.add(new tabBoundary(x1,y1,x2,y2));
    velocity.add(vel);
      d1[0] = center.x - x1;
      d1[1] = center.y - y1;
      pdist.add(d1);
      t1 = atan2(y1-center.y,x1-center.x);
      theta.add(t1);
    midpoint1 = new PVector((x1 + x2)/2,(y1 + y2)/2);
    Boundaries.add(new tabBoundary(x2 , y2 ,x3 , y3));
     d1[0] = center.x - x2;
     d1[1] = center.y - y2;
     pdist.add(d1);
     t1 = atan2(y2-center.y,x2-center.x);
     theta.add(t1);
    midpoint2 = new PVector((x2 + x3)/2,(y2 + y3)/2);
    velocity.add(vel);
    Boundaries.add(new tabBoundary(x3, y3,x1,y1 ));
      d1[0] = center.x - x3;
      d1[1] = center.y - y3;
      pdist.add(d1);
      t1 = atan2(y3-center.y,x3-center.x);
      theta.add(t1);
    velocity.add(vel);
    midpoint3 = new PVector((x3 + x1)/2,(y3 + y1)/2);
    type = 3;
    create_points(Boundaries);
    
    }
    
    type = Type;
    create_points(Boundaries);
    create_dist();
    create_angles(Boundaries);
    create_rotation_points(Boundaries);
  };
  
  tabBoundary (float X1, float Y1,float X2,float Y2,float X3, float Y3){

    x1 = X1;
    y1 = Y1;
    x2 = X2;
    y2 = Y2;
    x3 = X3;
    y3 = Y3;
    type = 3;
  };
  
  tabBoundary(PVector A, PVector B,PVector C){

    p1 = A;
    p2 = B;
    p3 = C;
    x1 = p1.x;
    y1 = p1.y;
    x2 = p2.x;
    y2 = p2.y;
    type = 3;
  };
  
  tabBoundary(PVector A, PVector B){

    p1 = A;
    p2 = B;
    x1 = p1.x;
    y1 = p1.y;
    x2 = p2.x;
    y2 = p2.y;
  };
  
  tabBoundary(ArrayList<Point> A){
  
   center = new PVector (0,0);
    for(int i=0;i<A.size();i++){
      
      Point a = A.get(i);
      Point b = A.get(i);
      
      if(i<A.size()-1)b = A.get(i+1);
      else b = A.get(0);
      tabBoundary B = new tabBoundary(a.x,a.y,b.x,b.y,2);
      Boundaries.add(B);
      
    }
    
      calc_center();
      create_points(Boundaries);
      create_dist();
      create_angles(Boundaries);
      create_rotation_points(Boundaries);
      type = 105;
  };
  
  tabBoundary(ArrayList<Point> A,int k){
  
   center = new PVector (0,0);
    for(int i=0;i<A.size();i++){
      
      Point a = A.get(i);
      Point b = null;
      Point c = null;
      
      if(i+2<A.size()){
       b = A.get(i+1);
       c = A.get(i+2);
      
      if(((b.x==a.x)&&(c.x==a.x)||b.y==a.y&&(c.y==a.y))){
        A.remove(i+1);
        i--;
        
      }else{
        tabBoundary B = new tabBoundary(a.x,a.y,b.x,b.y,2);
        Boundaries.add(B);
      }}else if(i+1<A.size()){
        b = A.get(i+1);
        tabBoundary B = new tabBoundary(a.x,a.y,b.x,b.y,2);
        Boundaries.add(B);
      }}
    
      calc_center();
      create_points(Boundaries);
      create_dist();
      create_angles(Boundaries);
      create_rotation_points(Boundaries);
      type = 106;
  };
  
  tabBoundary(tabBoundary B){
   
   //Boundaries = B.Boundaries;
   
   if(B.type==106){
     
   float pw = pathWidth; 
   
   center = new PVector (0,0);
   
   tabBoundary b0 = B.Boundaries.get(0);
   
   PVector p0 = new PVector(b0.x1,b0.y1);
   PVector p1 = new PVector(b0.x2,b0.y2);
   
   float t = -atan2(p0.x-p1.x,p0.y-p1.y);
   
   PVector p2 =  new PVector(p0.x+pw*cos(t),p0.y+pw*sin(t));
   PVector p3 =  new PVector(p0.x-pw*cos(t),p0.y-pw*sin(t));
   
   tabBoundary b = new tabBoundary(p1,p2);
   
   Boundaries.add(b);
   
    for(int i=1;i<B.Boundaries.size()-1;i++){
      
      b = B.Boundaries.get(i);
      
      tabBoundary b1 = B.Boundaries.get(i-1);
      tabBoundary b2 = B.Boundaries.get(i+1);
      
      p0 = new PVector(b.x1,b.y1);
      p1 = new PVector(b1.x2,b1.y2);
      
      p2 = new PVector(b2.x2,b2.y2);
      p3 = new PVector();
      
      float t1 = atan2(p0.y-p1.y,p0.x-p1.x);
      float t2 = atan2(p0.y-p2.y,p0.x-p2.x);
      
      t = -1/((t1+t2)/2);
      
      PVector p4 = new PVector(p0.x+pw*cos(t),p0.y+pw*sin(t));
      PVector p5 = new PVector(p1.x+pw*cos(t),p1.y+pw*sin(t));
      
      Boundaries.add(new tabBoundary(p4.x,p4.y,p5.x,p5.y));
      
      }
      
      b0 =  B.Boundaries.get(B.Boundaries.size()-1);
      p0 = new PVector(b0.x1,b0.y1);
     
      t = radians(90);
      p1 =  new PVector(p0.x+pw*cos(t),p0.y+pw*sin(t));
      p2 =  new PVector(p0.x-pw*cos(t),p0.y-pw*sin(t));
     
      b = new tabBoundary(p1,p2);
     
      Boundaries.add(b);
      
      for(int i=B.Boundaries.size()-1;i>-1;i--){
      
      b = B.Boundaries.get(i);
      tabBoundary b1 = B.Boundaries.get(i-1);
      tabBoundary b2 = B.Boundaries.get(i+1);
      
      p0 = new PVector(b.x1,b.y1);
      p1 = new PVector(b1.x2,b1.y2);
      
      p2 = new PVector(b2.x2,b2.y2);
      p3 = new PVector();
      
      float t1 = atan2(p0.y-p1.y,p0.x-p1.x);
      float t2 = atan2(p0.y-p2.y,p0.x-p2.x);
      
      t = -1/((t1+t2)/2);
      
      PVector p4 = new PVector(p0.x-pw*cos(t),p0.y-pw*sin(t));
      PVector p5 = new PVector(p1.x-pw*cos(t),p1.y-pw*sin(t));
      
      Boundaries.add(new tabBoundary(p4.x,p4.y,p5.x,p5.y));
      
      }
    
      calc_center();
      create_points(Boundaries);
      create_dist();
      create_angles(Boundaries);
      create_rotation_points(Boundaries);
      type = 107;
      
   }else if(B.type!=0){
     
     float pw = pathWidth; 
   
      center = B.center;
      calcInner(B);
      calcOuter(B);
    
      create_points(innerBoundaries);
      create_points(outerBoundaries);
      create_angles(innerBoundaries);
      create_angles(outerBoundaries);
      create_rotation_points(innerBoundaries);
      create_rotation_points(outerBoundaries);
      type = 107;
   }else {
     
   }
  };
  
  public Point getNextPoint(ArrayList<Point> a,Point b){
    Point c = null;
    for(int i=0;i<a.size();i++){
      Point d = a.get(i);
      if(d.x!=b.x&&d.y!=b.y)c = d; 
    }
    
    return c;
  };
  
  public void debug(){
    fill(255);
  };
  
  public void calcInner(tabBoundary a){
    if(a.type==0){
      
    }else if(a.type!=0&&a.type!=106){
      
      float pw = a.pathWidth;
      
    for(int i=0;i<a.Boundaries.size();i++){
      tabBoundary b = a.Boundaries.get(i);
      tabBoundary b1 = a.Boundaries.get(i);
      
      if(i<a.Boundaries.size()-1)b1 = a.Boundaries.get(i+1);
      else b1 = a.Boundaries.get(0);
      
      PVector p = new PVector(b.x1,b.y1);
      PVector p1 = new PVector(b.x2,b.y2);
      
      float t = atan2(a.center.y-p.y,a.center.x-p.x);
      float d = dist(p.x,p.y,a.center.x,a.center.y);
      
      float t1 = atan2(a.center.y-p1.y,a.center.x-p1.x);
      float d1 = dist(p1.x,p1.y,a.center.x,a.center.y);
      
      PVector p2 = new PVector(a.center.x+(d-pw)*cos(t),a.center.y+(d-pw)*sin(t));
      PVector p3 = new PVector(a.center.x+(d1-pw)*cos(t1),a.center.y+(d1-pw)*sin(t1));
      
      
      //a.innerBoundaries.add(new tabBoundary(p2.x,p2.y,p3.x,p3.y));
      //a.outerBoundaries.add(new tabBoundary(p2.x,p2.y,p3.x,p3.y));
    }a.type = 107;}else{
      
    }
    
  };
  
  public void calcOuter(tabBoundary a){
    if(a.type==0){
      
    }else if(a.type!=0&&a.type!=106){
      
      float pw = a.pathWidth;
      
    for(int i=0;i<a.Boundaries.size();i++){
      tabBoundary b = a.Boundaries.get(i);
      tabBoundary b1 = a.Boundaries.get(i);
      
      if(i<a.Boundaries.size()-1)b1 = a.Boundaries.get(i+1);
      else b1 = a.Boundaries.get(0);
      
      PVector p = new PVector(b.x1,b.y1);
      PVector p1 = new PVector(b1.x1,b1.y1);
      
      float t = atan2(a.center.y-p.y,a.center.x-p.x)-PI;
      float d = dist(p.x,p.y,a.center.x,a.center.y);
      
      float t1 = atan2(a.center.y-p1.y,a.center.x-p1.x)-PI;
      float d1 = dist(p1.x,p1.y,a.center.x,a.center.y) ;
      
      PVector p2 = new PVector(a.center.x+(d+pw)*cos(t),a.center.y+(d+pw)*sin(t));
      PVector p3 = new PVector(a.center.x+(d1+pw)*cos(t1),a.center.y+(d1+pw)*sin(t1));
      
      PVector p4 = new PVector(a.center.x+(d)*cos(t) - pw*cos(t),a.center.y+(d)*sin(t) - pw*sin(t));
      PVector p5 = new PVector(a.center.x+(d1)*cos(t1) - pw*cos(t),a.center.y+(d1)*sin(t1) - pw*sin(t));
      
      a.innerBoundaries.add(new tabBoundary(p4.x,p4.y,p5.x,p5.y));
      a.outerBoundaries.add(new tabBoundary(p2.x,p2.y,p3.x,p3.y));
    }a.type = 107;}else{
      
    }
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void draw(){
     rmenu();
     hcount = 0;lcount = 0;pcount = 0;
     boolean lineHover = false;
     int k = -1;
     fill(255);
     
     if(mouseX>0)m.x = mouseX;
     if(mouseY>0)m.y = mouseY;
    if(!clear){
    //for(int i=Boundaries.size()-1;i>-1;i--){
      for(int i=1;i<Boundaries.size();i++){
      tabBoundary b = Boundaries.get(i);
      
      b.id = i;
      if(!b.visible&&pos(b,m)){
        if(visible&&mousePressed)b.visible = true;
      }
      if(b.visible){
      if(edit){
      if(b.type!=2&&!point1&&!point2&&!linedown&&!rdown)mtranslate(b,m);
      if(!point1&&!point2&&!tdown&&!rdown)move(b,m);
      if((b.type!=0)&&!linedown&&!tdown&&!rdown)pospoint(b);
      if(!point1&&!point2&&!linedown&&!tdown)pos_rotationpoint(b);
      b.update(b);
      }
      
      if(!pospoint(b,0))pcount++;
      
      if(gravity)b.gravity = true;
      else b.gravity = false;
      
      strokeWeight(1);
      if(pos(b,m)){
        if(!visible&&mousePressed)b.visible = false;
        if(amendtabBoundary){
          fill(255);
          text(b.state,b.x1,b.y1);
                if(mousePressed){
                if(amendCohesion&&amendAvoidance)b.state = 1;
                else if(amendCohesion&&!amendAvoidance)b.state = 2;
                else if(!amendCohesion&&amendAvoidance)b.state = 3;
                else if(!amendCohesion&&!amendAvoidance)b.state = 4;
         }}
        indices.add(i);
        if(indices.size()>2)indices.remove(0);
      }
      if(!pos(b,m))hcount ++;
        
        if(b.type==0){
          stroke(0);
          fill(0,50);strokeWeight(1);
          if(pos(b,m)){
            shapeIndex=i;
            fill(255,50);
          }
          ellipseMode(CENTER);
          ellipse(b.center.x,b.center.y,b.w,b.h);
        }else if(b.type!=107){
          
          if(b.type!=106)fill(0,50);
          else noFill();
          if(pos(b,m)){
            shapeIndex=i; 
            fill(255,50);
          }
          stroke(0);
          beginShape();
          
          for(int j=0;j<b.Boundaries.size();j++){
            tabBoundary c = b.Boundaries.get(j);
            
            vertex(c.x1,c.y1);
            vertex(c.x2,c.y2);
          }}}
          if(b.type==106)endShape();
          else if(b.type!=107)endShape(CLOSE);
          
          if(b.type==107){
            
            //if(!b.converted){
              
          b.bpath = createShape();
          //---------------begin shape------------------------------------
          beginShape();
          fill(0,150);
          stroke(0);
          strokeWeight(1);
          //-------------exterior------------------------------------
          
          for(int j=0;j<b.outerBoundaries.size()-1;j++){
            
            tabBoundary c = b.outerBoundaries.get(j);
            tabBoundary c1 = b.outerBoundaries.get(j+1);
            
            vertex(c.x1,c.y1);
            vertex(c1.x1,c1.y1);
            
            if(pos(c,m)){
              if(amendInnertabBoundary){
                if(mousePressed){
                     if(amendCohesion&&amendAvoidance)c.state1 = 1;
                else if(amendCohesion&&!amendAvoidance)c.state1 = 2;
                else if(!amendCohesion&&amendAvoidance)c.state1 = 3;
                else if(!amendCohesion&&!amendAvoidance)c.state1 = 4;
              }}
              if(c.state1==3)stroke(255,0,0);
              else if(c.state1==2)stroke(0,0,255);
              else if(c.state1==1)stroke(0,255,0);
              line(c.x1,c.y1,c.x2,c.y2);
              lineHover = true;
              k = j;
          }}
          //------------interior------------------------------------
          beginContour();
          
          for(int j=b.innerBoundaries.size()-1;j>0;j--){
            
            tabBoundary c = b.innerBoundaries.get(j);
            tabBoundary c1 = b.innerBoundaries.get(j-1);
            
            vertex(c.x1,c.y1);
            vertex(c1.x1,c1.y1);
            if(pos(c,m)){
              if(amendInnertabBoundary){
                if(mousePressed){
                     if(amendCohesion&&amendAvoidance)c.state1 = 1;
                else if(amendCohesion&&!amendAvoidance)c.state1 = 2;
                else if(!amendCohesion&&amendAvoidance)c.state1 = 3;
                else if(!amendCohesion&&!amendAvoidance)c.state1 = 4;
              }}
              if(c.state1==3)stroke(255,0,0);
              else if(c.state1==2)stroke(0,0,255);
              else if(c.state1==1)stroke(0,255,0);
              line(c.x1,c.y1,c.x2,c.y2);
              lineHover = true;
              k = j;
          }}
          //for(int j=0;j<b.innerBoundaries.size()-1;j++){
            
          //  tabBoundary c = b.innerBoundaries.get(j);
          //  tabBoundary c1 = b.innerBoundaries.get(j+1);
            
          //  vertex(c.x1,c.y1);
          //  vertex(c.x2,c.y2);
          //  //vertex(c1.x1,c.y1);
          //}
            endContour();
            //----------end shape------------------------------------
            endShape(CLOSE);
            //b.converted = true;
            //shape(b.bpath);
          //}
            //else shape(b.bpath);
          }
        if(!clear){
          
          for(int j=0;j<b.Boundaries.size();j++){
        
            tabBoundary c = b.Boundaries.get(j);
            
            if(pos(c,m)){
              if(amendInnertabBoundary){
                if(mousePressed){
                     if(amendCohesion&&amendAvoidance)c.state1 = 1;
                else if(amendCohesion&&!amendAvoidance)c.state1 = 2;
                else if(!amendCohesion&&amendAvoidance)c.state1 = 3;
                else if(!amendCohesion&&!amendAvoidance)c.state1 = 4;
              }}
              if(c.state1==3)stroke(255,0,0);
              else if(c.state1==2)stroke(0,0,255);
              else if(c.state1==1)stroke(0,255,0);
              line(c.x1,c.y1,c.x2,c.y2);
              lineHover = true;
              k = j;
          }}
          lindex = k;
          if(lineHover)shapeIndex = i;
          else lcount++;
        }}
          if(hcount>0) hover2 = true;
          else hover2  = false;
    }else{
      //tabBoundary a = Boundaries.get(0);
      //Boundaries = new ArrayList<tabBoundary>();
      //Boundaries.add(a);
      while(Boundaries.size()>1)Boundaries.remove(Boundaries.size()-1);
      clear = false;
    }
    int n = Boundaries.size();
    if(pcount==0)phover = false;
    if(lcount==0)lhover = false;
    if(hcount==n&&lcount==n&&pcount==n)shapeIndex=-1;
  };
  
  public void draw2(){
    logic();
    debug();
    
    strokeWeight(1);
    for(int i=0;i<Boundaries.size();i++){
      tabBoundary b = Boundaries.get(i);
      b.id = i;
      move(b,m);
      beginShape();
      stroke(0);
      vertex(b.x1,b.y1);
      vertex(b.x2,b.y2);
      endShape(CLOSE);
    }
  };
  
  public void trace(){
    
    //scene.draw(9);
    
  };
  
  public void rmenu(){
    logic();
      if(open||none){
       pallete.draw();
       if(showgrid){
         gridlayout.toggle=true;
         gridlayout.grid_functions();
         gridlayout.terrain2d = true;
         }
       else if(type==-2)gridlayout.toggle=false;
       
       //if(mousePressed&&mouseButton == RIGHT&&!rtoggle){rtoggle = true;}
         //-----------------------------------------------------------------------------
         
         if(mousePressed&&mouseButton==RIGHT&&!rtoggle&&!contextClick)rtoggle=true;
         
         
         if(rtoggle&&edit){
           
         contextDel.visible = false;
         convertToPath.visible = false;
         context.visible = false;
         connectedlMenu.visible = false;
         
         if(shapeIndex==-1)options = 0;
         else {
           if(Boundaries.get(shapeIndex).type==106){
             numm = shapeIndex;
               if(pcount==1)options = 5;
               else if(lcount==pcount) options = 1;
              //else if((pcount<lcount))options = 1;
              //else options = 5;
         }else {
               if(pcount==lcount&&pcount>0)options = 3;
              else if(pcount>lcount)options = 2;
              else if((pcount<lcount))options = 1;
              else options = 4;
         }}
         if(!edit||Boundaries.size()==0)options=4;
         context.x = mouseX;
         context.y = mouseY;
         
         connectedlMenu.x = mouseX;
         connectedlMenu.y = mouseY;
         
         for (int i=0;i<connectedlMenu.items.size();i++){
           Button a = connectedlMenu.items.get(i); 
           a.x = connectedlMenu.x;
           a.y = connectedlMenu.y+ i*20;
         }
         
         for (int i=0;i<context.items.size();i++){
           Button a = context.items.get(i); 
           a.x = context.x;
           a.y = context.y+ i*20;
         }
         
         contextDel.x = mouseX;
         contextDel.y = mouseY;
         
         if(options==1)contextDel.items.get(0).label = "Delete Point";
         else if(options==2)contextDel.items.get(0).label = "Delete Line";
         
         for (int i=0;i<contextDel.items.size();i++){
           Button a = contextDel.items.get(i); 
           a.x = contextDel.x;
           a.y = contextDel.y+ i*20;
         }
         
         convertToPath.x = mouseX;
         convertToPath.y = mouseY;
         
         for (int i=0;i<convertToPath.items.size();i++){
           Button a = convertToPath.items.get(i); 
           a.x = convertToPath.x;
           a.y = convertToPath.y+ i*20;
         }
         
         if(!mousePressed){
           contextClick = true;
           rtoggle=false;
         }}
         //------------------------------------------------------------------------------------
         //if(mousePressed&&mouseButton==LEFT)options = 4;
         if(options==0){
           contextDel.visible = false;
           convertToPath.visible = false;
           context.visible = true;
           connectedlMenu.visible = false;
         }
         else if(options==1||options==2){
             contextDel.visible = true;
             convertToPath.visible = false;
             context.visible = false;
             connectedlMenu.visible = false;
           }else if(options==3){
             contextDel.visible = false;
             convertToPath.visible = true;
             context.visible = false;
             connectedlMenu.visible = false;
           }else if(options==4){
             contextDel.visible = false;
             convertToPath.visible = false;
             context.visible = false;
             connectedlMenu.visible = false;
           }else if(options==5){
             connectedlMenu.visible = true;
             contextDel.visible = false;
             convertToPath.visible = false;
             context.visible = false;
           }
         
         if(contextClick){
         if(contextDel.visible){
           contextDel.draw();
         if(mousePressed&&!contextDel.items.get(0).pos()&&!contextDel.items.get(1).pos()){
                rtoggle=false;
                contextClick=false;
           }}
         else if(context.visible){
           context.draw();
           if(mousePressed&&!context.items.get(0).pos()&&!context.items.get(1).pos()){
                rtoggle=false;
                contextClick=false;
           }}
         else if(convertToPath.visible){
            convertToPath.draw();
            //if(mousePressed&&mouseButton==LEFT){
              if(mousePressed&&convertToPath.items.get(1).pos()){
                if(shapeIndex>-1)Boundaries.remove(shapeIndex);
                rtoggle=false;
                contextClick=false;
           }else if(mousePressed&&convertToPath.items.get(0).pos()){
                calcInner(Boundaries.get(shapeIndex));
                calcOuter(Boundaries.get(shapeIndex));
                
                rtoggle=false;
                contextClick=false;
           }else if(mousePressed&&!convertToPath.items.get(0).pos()&&!convertToPath.items.get(1).pos()){
                rtoggle=false;
                contextClick=false;
           }}
           else if(connectedlMenu.visible){
             connectedlMenu.draw();
             if(mousePressed&&connectedlMenu.items.get(2).pos()){
                if(numm>-1)Boundaries.remove(numm);
                rtoggle=false;
                contextClick=false;
           }else if(mousePressed&&connectedlMenu.items.get(0).pos()){
                calcInner(Boundaries.get(numm));
                calcOuter(Boundaries.get(numm));
                
                rtoggle=false;
                contextClick=false;
           }}
         else if (mousePressed){
           contextClick = false;
           rtoggle = false;
       }}}
         
         if(contextClick&&!contextDel.pos()&&context.pos()&&!convertToPath.pos()&&mousePressed){
           contextClick=false;
           rtoggle = false;
         }
           
  };
  
  public void update(tabBoundary a){
    float midx = 0;
    float midy = 0;
    
    float aa = 0.05f;
    vcount = 0;
    
    //dir = atan2(a.Boundaries.get(0).y1 - center.y,a.Boundaries.get(0).x1 - center.x);
    //line(Boundaries.get(0).x1,Boundaries.get(0).y1,center.x,center.y);
    if(type!=0){
      
      if(!mousePressed){trow = true;}
      
      if(gravity){
        
        //updateg = true;
        if(falling){
          vy += gconst;
          if(vy>=4)vy = 4.0f;
          if(vy<=-4)vy = -4.0f;
          if(vy>=4)vy = 4.0f;
          if(vy<=-4)vy = -4.0f;
          center.y += vy;
        }
        if(type!=2){
        update_Boundaries();
        a.update_angles();
        create_rotation_points(Boundaries);
        }else{
          //center.x = (x1+x2)/2;
          //center.y = (y1+y2)/2;
          a.update_line();
        }
        

 }else updateg = false;
    
    for(int i=0;i<Boundaries.size();i++){
      
      tabBoundary b = Boundaries.get(i);
      
      if(b.y1>=floor)vcount++;rotatep = (new PVector(b.x1,b.y1));
      if(b.y2>=floor)vcount++;rotatep = (new PVector(b.x2,b.y2));
    }
    
    if(vcount>0) falling = false;
    if(vcount>0) rotating = true;
    
    }
    
    if(type==0){
      if(gravity){
        
        if(center.y<floor){
          vy += ay;
          center.y += vy;
       }}}
    
    strokeWeight(20);
    stroke(255);
    point(center.x,center.y);
    strokeWeight(1);
    
      if(!mousePressed)sdown = false;linedown = false;
      if(mousePressed&&!linedown)linedown = true;
      
      if(!mousePressed&&!a.point1&&!a.point2&&!a.point3&&a.updatep&&a.uindex==id&&a.type!=2){
        
        calc_center();
        update_dist(Boundaries);
        a.create_rotation_points(Boundaries);
        a.update_angles();
        a.updatep = false;
      }
  };
  
  public void create_points(ArrayList<tabBoundary> a){
    for(int i=0;i<a.size();i++){
      
      tabBoundary b = a.get(i);
      if(points.size()==i)points.add(new PVector(b.x1,b.y1));
      }
  };
  
  public void create_angles(ArrayList<tabBoundary> a){
    for(int i=0;i<a.size();i++){
      
      tabBoundary b = Boundaries.get(i);
      
      float t1 = atan2(b.y1 - center.y,b.x1 - center.x);
      
      if(theta.size()<a.size())theta.add(t1);
      else theta.set(i,t1);
    }
  };
  
  public void update_points(ArrayList<tabBoundary> a){
    
    
    for(int i=0;i<a.size();i++){
      
      PVector b = points.get(i);
      
      float d1 = dist(b.x,b.y,center.x,center.y);
      
      float t1 = theta.get(i);;
      
      float ax = center.x + (d1) * cos(t1);
      float ay = center.y + (d1) * sin(t1);
      
      if(points.size()<a.size())points.add(new PVector(ax,ay));
      else rotation_points.set(i,new PVector(ax,ay));
    }
  };
  
  public void create_dist(){
    for(int i=0;i<Boundaries.size();i++){
      
      tabBoundary b = Boundaries.get(i);
      
      dist.add(dist(center.x,center.y,b.x1,b.y1));
    }
  };
  
  public void update_Boundaries(){
    
    for(int i=0;i<Boundaries.size();i++){
      
      tabBoundary b = Boundaries.get(i);
      
      float t = theta.get(i);
      Float d = dist.get(i);
      
      float t1 = 0;
      Float d1 = dist.get(i);
      
      if(i<Boundaries.size()-1){
        t1 = theta.get(i+1);
        d1 = dist.get(i+1);
      }else if(type!=106){
        t1 = theta.get(0);
        d1 = dist.get(0);
      }
      strokeWeight(10);
      stroke(0);
      
      b.x1 = center.x + d * cos(t);
      b.y1 = center.y + d * sin(t);
      if(type!=106){
      b.x2 = center.x + d1 * cos(t1);
      b.y2 = center.y + d1 * sin(t1);
      }else {
        
      }
      strokeWeight(1);
    }
  };
  
  public void update_line(){
    
    tabBoundary a = Boundaries.get(0);
    
    float b = theta.get(0);
    Float d = dist.get(0);
    
    a.x1 = center.x - d * cos(b) ;
    a.y1 = center.y - d * sin(b) ;
    
    a.x2 = center.x + d * cos(b) ;
    a.y2 = center.y + d * sin(b) ;
  };
  
  public void update_Boundaries(tabBoundary a){
    
    for(int i=0;i<a.Boundaries.size();i++){
      
      tabBoundary b = a.Boundaries.get(i);
      
      float t = a.theta.get(i);
      Float d = a.dist.get(i);
      
      float t1 = 0;
      Float d1 = a.dist.get(i);
      
      if(i<Boundaries.size()-1){
        t1 = a.theta.get(i+1);
        d1 = a.dist.get(i+1);
      }else if(a.type!=106){
        t1 = a.theta.get(0);
        d1 = a.dist.get(0);
      }
      strokeWeight(10);
      stroke(0);
      
      b.x1 = center.x + d * cos(t);
      b.y1 = center.y + d * sin(t);
      if(a.type!=106){
      b.x2 = center.x + d1 * cos(t1);
      b.y2 = center.y + d1 * sin(t1);
      }
      strokeWeight(1);
    }
  };
  
  public void rotate(float t){
    
    for(int i=0;i<Boundaries.size();i++){
      
      tabBoundary b = Boundaries.get(i);
      float t2 = theta.get(i);
      float d2 = dist.get(i);
      
      if(i<theta.size()-1){
        t2 = theta.get(i+1);
        d2 = dist.get(i+1);
      }else if(type!=106){
        t2 = theta.get(0);
        d2 = dist.get(0);
      }
      
      b.x1 = center.x + dist.get(i) * cos(theta.get(i)+radians(t));
      b.y1 = center.y + dist.get(i) * sin(theta.get(i)+radians(t));
      
      b.x2 = center.x + d2 * cos(t2+radians(t));
      b.y2 = center.y + d2 * sin(t2+radians(t));
    }
    
  };
  public void rotate2(float t){
    
    float t3 = radians(90);
    for(int i=0;i<Boundaries.size();i++){
      
      tabBoundary b = Boundaries.get(i);
      float t2 = theta.get(i);
      float d2 = dist.get(i);
      
      if(i<theta.size()-1){
        t2 = theta.get(i+1);
        d2 = dist.get(i+1);
      }else if(type!=106){
        t2 = theta.get(0);
        d2 = dist.get(0);
      }
      
      b.x1 = center.x + dist.get(i) * cos(theta.get(i)+(t)+t3);
      b.y1 = center.y + dist.get(i) * sin(theta.get(i)+(t)+t3);
      
      b.x2 = center.x + d2 * cos(t2+(t)+t3);
      b.y2 = center.y + d2 * sin(t2+(t)+t3);
    }
    
  };
  
  public void update_angles(){
    for(int i=0;i<Boundaries.size();i++){
      
      tabBoundary b = Boundaries.get(i);
      
      float t = atan2(b.y1 - center.y,b.x1 - center.x);
      if(i<theta.size())theta.set(i,t);
      else theta.add(t);
    }
  };
  
  public void angular_vel(float a, float u){
    
    
    
  };
  
  public void create_rotation_points(ArrayList<tabBoundary>a){
    
    float d = 10;
    
    for(int i=0;i<a.size();i++){
      
      tabBoundary b = a.get(i);
      
      float d1 = dist(b.x1,b.y1,center.x,center.y);
      
      float t1 = atan2(b.y1 - center.y,b.x1 - center.x);
      
      float ax = center.x + (d1+d) * cos(t1);
      float ay = center.y + (d1+d) * sin(t1);
      
      if(rotation_points.size()<a.size())rotation_points.add(new PVector(ax,ay));
      else rotation_points.set(i,new PVector(ax,ay));
    }
    
  };
  
  public void rotate_about(PVector a,Float v){
    
    for(int i=0;i<Boundaries.size();i++){
      
      tabBoundary b = Boundaries.get(i);
      
      float d1 = dist(b.x1,b.y1,center.x,center.y);
      float d2 = dist(b.x2,b.y2,center.x,center.y);
      float t1 = atan2(b.y2 - b.y1,b.x2 - b.x1);
      float t2 = atan2(b.y1 - b.y2,b.x1 - b.x2);
      
      b.x1 = center.x + d1 * cos(t1+v);
      b.y1 = center.y + d1 * sin(t1+v);
      b.x2 = center.x + d2 * cos(t2+v);
      b.y2 = center.y + d2 * sin(t2+v);
    }
    
  };
  
  public void pos_rotationpoint(tabBoundary a){
    
    float X = mouseX;
    float Y = mouseY;
    
    t2 = 0;
    float t0 = 0;
    
    boolean k = false;
    
    for(int i=0;i<a.rotation_points.size();i++){
      PVector b = a.rotation_points.get(i);
      
      float d1 = dist(b.x,b.y,X,Y);
      
    if(d1<5){
      strokeWeight(5);
      stroke(255);
      point(b.x,b.y);
      if(mousePressed&&!point3){
        point3 = true;
        vert = i;
        index = a.id;
        rdown = true;
      }}}
      
      if(point3&&mousePressed&&index == a.id&&!point1&&!point2&&!linedown){
        rdown = true;
        float t2 = atan2(a.center.y -  mouseY,a.center.x - mouseX);
        
        for(int i=0;i<a.Boundaries.size();i++){
          
          tabBoundary b = a.Boundaries.get(i);
          
          PVector c = a.rotation_points.get(i);
          PVector d = null;
          
          float d1 = dist(c.x,c.y,a.center.x,a.center.y)-10;
          float t1 = atan2(a.center.y - c.y,a.center.x - c.x);
          
          float d2 = 0,t3 = 0;
          
          if(i<a.Boundaries.size()-1)d = a.rotation_points.get(i+1);
          else if(a.type!=106)d = a.rotation_points.get(0);
          
          if(d!=null){
          d2 = dist(d.x,d.y,a.center.x,a.center.y)-10;
          t3 = atan2(a.center.y - d.y,a.center.x - d.x);
          }
          b.x1 = a.center.x + d1 * cos(t1 + t2);
          b.y1 = a.center.y + d1 * sin(t1 + t2);
          
          b.x2 = a.center.x + d2 * cos(t3 + t2);
          b.y2 = a.center.y + d2 * sin(t3 + t2);
        }}
        
      if(!mousePressed&&point3){
        vert = -1;
        vert1 = -1;
        index = -1;
        rdown = false;
        point3 = false;
        a.update_dist(a.Boundaries);
        a.create_rotation_points(a.Boundaries);
        uindex = a.id;
        updatep = true;
      }
   };
  
  public void calc_center(){
    
    float midx = 0;
    float midy = 0;
    
    for(int i=0;i<Boundaries.size();i++){
      tabBoundary b = Boundaries.get(i);
      midx += (b.x1 + b.x2)/2;
      midy += (b.y1 + b.y2)/2;
    }
    
    midx /= Boundaries.size();
    midy /= Boundaries.size();
    
    center = new PVector(midx,midy);
  };
  
  public void logic(){
    if((tri||toggle||circle||bezier||square||spline||poligon||c_poligon||connectedlines||path)){ open = true;}
    if(mousePressed&&open_menus)menudown = true;
    else menudown = false;
    if(none)open = false;
    if(pallete!=null)pallete.click(12,main,"clear");
    if(hidemenu){
      
      if(pallete.x+pallete.w>=0){
      //if(type==0)palletelist.menu.x -= 2;
      pallete.x -= 6;
      for(int i=0;i<pallete.items.size();i++){
        Button a = pallete.items.get(i);
        a.x = pallete.x;
      }
      rect(pallete.x,pallete.y,pallete.w,pallete.h);
      }else if(pallete.x+pallete.w<0){
      palletehide.draw();
      
      if(palletehide.pos()&&mousePressed){
        hidemenu = false;
        pallete.items.get(10).toggle=0;
      }
    }}else if(pallete!=null&&pallete.x<0){
      main.pallete.items.get(15).toggle=0;
      pallete.x += 6;
      for(int i=0;i<pallete.items.size();i++){
        Button a = pallete.items.get(i);
        a.x = pallete.x;
      }
      rect(pallete.x,pallete.y,pallete.w,pallete.h);
    }
    
    
    if(type==-1&&clear){
      Boundaries = new ArrayList<tabBoundary>();
      ArrayList<Float[]> velocity = new ArrayList<Float[]>();
      ArrayList<PVector> velocitypv = new ArrayList<PVector>();
      ArrayList<tabBoundary> Quadrants = new ArrayList<tabBoundary>();
      ArrayList<PVector> Midpoints = new ArrayList<PVector>();
      clear = false;
    }
  };
  
  public void mtranslate(tabBoundary b ,PVector m){
    
    float mx = m.x;
    float my = m.y;
    
    if(!point1&&!point2&&!point3&&!linedown&&!rdown&&type!=2){
      if(pos(b,m)&&mousePressed&&!tdown){
         index = b.id;
         deltamx = (b.center.x - mx);
         deltamy = (b.center.y - my);
         
         b.tdown = true;
         tdown = true;
    }}
    
    
    if(b.tdown&&index == b.id&&type!=2){
      if(index>=0){
        
      tabBoundary c = Boundaries.get(index);
      b.center.x = mx + deltamx;
      b.center.y = my + deltamy;
      b.create_rotation_points(b.Boundaries);
      //b.update_angles();
      b.update_Boundaries();
      }}
    
    if(!mousePressed&&type!=2){
      if(index>=0){
        tabBoundary c = Boundaries.get(index);
        index = -1;
        deltamx = 0;deltamy = 0;
        uindex = c.id;
        updatep = true;
        b.tdown = false;
        tdown = false;
      
    }}
    
  };
  
  public void mtranslate(PVector m){
    
    float mx = m.x;
    float my = m.y;
    
   if(mousePressed&&!mdown){
    mdown = true; 
    dx = center.x - mx;
    dy = center.y - my;
   }
    
   if(mdown){
     center.x = mx + dx;
     center.y = my + dy;
   }
     update_Boundaries();
   if(!mousePressed){
     mdown = false;
     
   }
   
  };
  
  public void functions(){
      debug();
      if(!edit&&!open_menus&&!pallete.pos()&&open&&!palletehide.pos()){
    if (toggle)create();
    else if (square)createtabRect();
    else if(circle)create_circle();
    else if(tri)createtab_tri();
    else if(bezier)create_bezier();
    else if(poligon)create_poligon();
    else if(complex)create_complex_poligon();
    else if(connectedlines)connectedLines();
    else if(path)drawPath();
    else if(spline){
      
    }}
  
  };
  
    public boolean pos(tabBoundary a,PVector p){
      float X = p.x;
      float Y = p.y;
      boolean k = false;
      trit = 0;
      if(a.type==0){
            
            float mx = abs((a.x2-a.x1))/2;
            float my = abs((a.y2-a.y1))/2;
            
            float A = sq(X - a.center.x);
            float B = sq(Y - a.center.y);
            
            float C = sq(mx);
            float D = sq(my);
            return A/C + B/D <1;
            
        } if(a.type==2){
        return check_lineP(new PVector(a.x1,a.y1),new PVector(a.x2,a.y2),new PVector(X,Y));
      }
       if(a.type==4||a.type==3||a.type==103||a.type==201){
        
        for(int i=0;i<a.Boundaries.size();i++){
          
          tabBoundary b = a.Boundaries.get(i);
          
          tabBoundary A = new tabBoundary((b.x1 + b.x2)/2,(b.y1 + b.y2)/2,X,Y);
          //line((b.x1 + b.x2)/2,(b.y1 + b.y2)/2,X,Y);
          for(int j=0;j<a.Boundaries.size();j++){
            
            tabBoundary C = a.Boundaries.get(j);
            
            PVector i1 = check_intersect(A,C);
            
            if(i1!=null&&i!=j){
              trit++;
              
            }}}
            if(trit>0)k = false;
            else k = true;
        }
      return k;
      
    };
    
    public boolean check_lineP(PVector a, PVector b,PVector c){
    
    boolean k = false;
    float d1 = dist(a.x,a.y,b.x,b.y);
    float d2 = dist(a.x,a.y,c.x,c.y);
    float d3 = dist(b.x,b.y,c.x,c.y);
    float d4 = d2 + d3;
    
    if(d4 <= d1 + 0.05f && d4 >= d1 - 0.05f){
      k = true;
    }
    return k;
  };
  
  public boolean check_lineP(float x1, float y1,float x2,float y2, PVector c){
    
    boolean k = false;
    float d1 = dist(x1,y1,x2,y2);
    float d2 = dist(x1,y1,c.x,c.y);
    float d3 = dist(x2,y2,c.x,c.y);
    float d4 = d2 + d3;
    
    if(d4 <= d1 + 0.05f && d4 >= d1 - 0.05f){
      k = true;
    }
    return k;
  };
  
  public void drag(){
  };
  
  public boolean pospoint(tabBoundary a,int n){
    float X = mouseX;
    float Y = mouseY;
    
    boolean k = false;
    
    for(int i=0;i<a.Boundaries.size();i++){
      tabBoundary b = a.Boundaries.get(i);
      
      float d1 = dist(b.x1,b.y1,X,Y);
      float d2 = dist(b.x2,b.y2,X,Y);
      
    if(d1<5){
      k = true;
    }
      
      if(d2<5){
        k = true;
    }}
    return k;
    };
  
  public void pospoint(tabBoundary a){
    float X = mouseX;
    float Y = mouseY;
    
    t = 0;
    
    boolean k = false;
    //if(!a.linedown){
    for(int i=0;i<a.Boundaries.size();i++){
      tabBoundary b = a.Boundaries.get(i);
      
      float d1 = dist(b.x1,b.y1,X,Y);
      float d2 = dist(b.x2,b.y2,X,Y);
      
    if(d1<5){
      strokeWeight(5);
      stroke(255);
      point(b.x1,b.y1);
      if(mousePressed&&!point1&&!a.point1){
        
        t++;
        vert = i;
        index = a.id;
        point1 = true;
        a.point1 = true;
        a.pdown = true;
        pdown = true;
      }}
      
      if(d2<5){
      strokeWeight(5);
      stroke(255);
      point(b.x2,b.y2);
      if(mousePressed&&!point2&&!a.point2){
        
        t++;
        vert1 = i;
        index = a.id;
        point2 = true;
        a.point2 = true;
        a.pdown = true;
        pdown = true;
      }}
      if(point1&&vert>=0&&index==a.id){
        tabBoundary c = a.Boundaries.get(vert);
        c.x1 = X;
        c.y1 = Y;
      }
      if(point2&&vert1>=0&&index==a.id){
        tabBoundary c = a.Boundaries.get(vert1);
        c.x2 = X;
        c.y2 = Y;
      }
      if(a.type==2){
        a.x1 = b.x1;a.y1 = b.y1;
        a.x2 = b.x2;a.y2 = b.y2;
      }
      if(a.type==4){
        
          if(vert==0)a.x1 = b.x1;
          if(vert==1)a.x2 = b.x1;
          if(vert==2)a.x3 = b.x1;
          if(vert==3)a.x4 = b.x1;
          
          if(vert1==0)a.x2 = b.x2;
          if(vert1==1)a.x3 = b.x2;
          if(vert1==2)a.x4 = b.x2;
          if(vert1==3)a.x1 = b.x2;
        }
      if(a.type==3||a.type==103){
        if(vert==0)a.x1 = b.x1;a.y1 = b.y1;
        if(vert==1)a.x2 = b.x1;a.y2 = b.y1;
        if(vert==2)a.x3 = b.x1;a.y3 = b.y1;
        
        if(vert1==0)a.x2 = b.x2;a.y2 = b.y2;
        if(vert1==1)a.x3 = b.x2;a.y3 = b.y2;
        if(vert1==2)a.x1 = b.x2;a.y1 = b.y2;
     
    }}
      
    if(t>0){
      k = true;
      hover = true;
    }
    if(!mousePressed){
      a.update_dist(a.Boundaries);
      a.calc_center();
      a.create_rotation_points(a.Boundaries);
      a.update_angles();
    }
    if(!mousePressed){
      
      vert = -1;
      vert1 = -1;
      index = -1;
      point1 = false;
      point2 = false;
      a.point2 = false;
      a.point1 = false;
      uindex = a.id;
      updatep = true;
      a.pdown = false;
      pdown = false;
      
    }
  };
  
  public void update_dist(ArrayList<tabBoundary> a){
   
    
    for(int i=0;i<a.size();i++){
      
      tabBoundary b = a.get(i);
      int id = b.id;
      //float Dist = dist.get
      float dx = (b.x1 - center.x);
      float dy = (b.y1 - center.y);
      float d  = dist(b.x1,b.y1,center.x,center.y);
      Float [] d1 = {dx,dy};
      
      if(dist.size()==Boundaries.size()){dist.set(i,d);}
      else {dist.add(d);}
      if(pdist.size()==Boundaries.size()*2)pdist.set(i,d1);
      else pdist.add(d1);
    }
  };
  
  public void move(tabBoundary a,PVector p){
    float mx = p.x;
    float my = p.y;
    
    boolean down = false;
    
    for (int i=0;i<a.Boundaries.size();i++){
      
      tabBoundary b = a.Boundaries.get(i);
      
     float d1 = dist(b.x1,b.y1,mx,my);
     float d2 = dist(b.x2,b.y2,mx,my);
     
    boolean k = check_lineP(b.x1,b.y1,b.x2,b.y2,new PVector(mx,my));
    if(k&&!linedown&&d1>6&&d2>6&&!point1&&!point2&&mousePressed&&!a.linedown){
      vert3 = i;
      sid = a.id;
      D1 = d1;
      D2 = d2;
      T1 = atan2(b.y2 - b.y1,b.x2 - b.x1);
      T2 = atan2(b.y1 - b.y2,b.x1 - b.x2);
      
      linedown = true;
      a.linedown = true;
    }}
    
    if(linedown && sid==a.id && a.linedown&&a.Boundaries.size()>0){
      
      tabBoundary b   = a.Boundaries.get(vert3);
      tabBoundary b_1 = a.Boundaries.get(0);
      tabBoundary bp1 = a.Boundaries.get(0);
      
      if(vert3>0)b_1 = a.Boundaries.get(vert3-1);
      else if(a.type!=106)b_1 = a.Boundaries.get(a.Boundaries.size()-1);
      if(vert3<a.Boundaries.size()-1)bp1 = a.Boundaries.get(vert3+1);
      else if(a.type!=106)bp1 = a.Boundaries.get(0);
      
      stroke(255,0,0);
      PVector p1 = new PVector( mx + D2 * cos(T1),my + D2 * sin(T1));
      PVector p2 = new PVector( mx + D1 * cos(T2),my + D1 * sin(T2));
      //line(p1.x,p1.y,p2.x,p2.y);
      
      b.x2 = p1.x;
      b.y2 = p1.y;
      b.x1 = p2.x;
      b.y1 = p2.y; 
      
      b_1.x2 = p2.x;
      b_1.y2 = p2.y;
      bp1.x1 = p1.x;
      bp1.y1 = p1.y;
      
    }
    
    if(!mousePressed&&a.linedown){
      D1 = 0;D2 = 0;T1 = 0;T2 = 0;vert3 = -1;sid = -1;down = false;
      a.update_dist(a.Boundaries);
      uindex = a.id;
      updatep = true;
      linedown = false;
      a.linedown = false;
    }
  };
  
  public void create_circle(){
    float ax = mouseX;
    float ay = mouseY;
    
    tabBoundary n;
    if (circle&&!menudown&&mousePressed&&mouseButton == LEFT){
       
      mdown = true;
      ax = mouseX;
      ay = mouseY;
       
      temp.add(new PVector(ax,ay));
      dx = ax - temp.get(0).x;
      dy = ay - temp.get(0).y;
       
      strokeWeight(1);
      stroke(col);
      ellipseMode(CORNER);
      ellipse(temp.get(0).x,temp.get(0).y,dx,dy);
      }
      if(mdown&&!mousePressed&&!point1&&!point2){
        
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
      tabBoundary a = new tabBoundary(temp.get(0).x,temp.get(0).y,dx,dy,0);
      a.id = Boundaries.size();
      Boundaries.add (a);
      //scene.Boundaries.add (a);
      theta.add(atan2((temp.get(0).y + dy) - temp.get(0).y,(temp.get(0).x + dx) - temp.get(0).x));
      norm.add(atan2((temp.get(0).x + dx) - temp.get(0).x, (temp.get(0).y + dy) - temp.get(0).y));
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      temp = new ArrayList<PVector>();
      mdown = false;
      
      }}
  };
  
  public void create(){
    
    float ax = mouseX;
    float ay = mouseY;
    
    tabBoundary n;
    
    
      if (toggle&&!menudown&&mousePressed&&!open_menus&&mouseButton == LEFT){
       
      mdown = true;
      ax = mouseX;
      ay = mouseY;
      
      temp.add(new PVector(ax,ay));
      
      line(temp.get(0).x,temp.get(0).y,temp.get(temp.size()-1).x,temp.get(temp.size()-1).y);
      }
      if(mdown&&!mousePressed&&!point1&&!point2){
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
      n = new tabBoundary(temp.get(0).x,temp.get(0).y,temp.get(temp.size()-1).x,temp.get(temp.size()-1).y,2);
      n.id = Boundaries.size();
      Boundaries.add (n);
      theta.add(atan2(temp.get(temp.size()-1).y - temp.get(0).y,temp.get(temp.size()-1).x - temp.get(0).x));
      norm.add(atan2(temp.get(temp.size()-1).x - temp.get(0).x, temp.get(temp.size()-1).y - temp.get(0).y));
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      temp = new ArrayList<PVector>();
      
      }mdown = false;
    }
  };
  
  public void createtab_tri(){
    
    float ax = mouseX;
    float ay = mouseY;
    
    tabBoundary n;
    float d;
    
    if (tri&&mousePressed&&!open_menus&&shapes.toggle==0&&mouseButton == LEFT){
       
      mdown = true;
      ax = mouseX;
      ay = mouseY;
      
      temp.add(new PVector(ax,ay));
      d = dist(ax,ay,temp.get(0).x,temp.get(0).y);
      
      float Norm = -atan2(temp.get(0).x - ax,temp.get(0).y - ay);
      
      float X2 = ax + d/1.5f * cos(Norm);
      float Y2 = ay + d/1.5f * sin(Norm);
      float X3 = ax - d/1.5f * cos(Norm);
      float Y3 = ay - d/1.5f * sin(Norm);
      
      beginShape();
      stroke(255);
      fill(0);
      
      vertex(temp.get(0).x,temp.get(0).y);
      vertex(X2,Y2);
      vertex(X3,Y3);
      endShape(CLOSE);
      }
      if(mdown&&!mousePressed&&!point1&&!point2){
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
      n = new tabBoundary(temp.get(0).x,temp.get(0).y,ax,ay,3);
      n.id = Boundaries.size();
      Boundaries.add (n);
      theta.add(atan2(temp.get(temp.size()-1).y - temp.get(0).y,temp.get(temp.size()-1).x - temp.get(0).x));
      norm.add(atan2(temp.get(temp.size()-1).x - temp.get(0).x, temp.get(temp.size()-1).y - temp.get(0).y));
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      temp = new ArrayList<PVector>();
      
      }mdown = false;
    }
  };
  
  public void createtabRect(){
    
    float ax = mouseX;
    float ay = mouseY;
    
    tabBoundary n;
    if (square&&!menudown&&mousePressed&&!open_menus&&shapes.toggle==0&&mouseButton == LEFT){
      
      mdown = true;
      ax = mouseX;
      ay = mouseY;
       
      temp.add(new PVector(ax,ay));
      dx = ax - temp.get(0).x;
      dy = ay - temp.get(0).y;
       
      strokeWeight(20);
      stroke(0);
      point(ax,ay);
      strokeWeight(1);
      stroke(col);
      rect(temp.get(0).x,temp.get(0).y,dx,dy);
      }
      if(mdown&&!mousePressed&&!point1&&!point2){
        
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
      tabBoundary a = new tabBoundary(temp.get(0).x,temp.get(0).y,dx,dy,4);
      a.id = Boundaries.size();
      Boundaries.add (a);
      theta.add(atan2((temp.get(0).y + dy) - temp.get(0).y,(temp.get(0).x + dx) - temp.get(0).x));
      norm.add(atan2((temp.get(0).x + dx) - temp.get(0).x, (temp.get(0).y + dy) - temp.get(0).y));
      temp = new ArrayList<PVector>();
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      mdown = false;
      
      }}
  };
  
  public void create_poligon(){
    float ax = mouseX;
    float ay = mouseY;
    
    tabBoundary n;
    
    Sides.draw();
    sides = PApplet.parseInt(Sides.value);
    if(sides>0){
      
    if (mousePressed&&mcount==0&&!complexsub.pos()){
      
      mdown = true;
      ax = mouseX;
      ay = mouseY;
       
      temp.add(new PVector(ax,ay));
      dx = ax - temp.get(0).x;
      dy = ay - temp.get(0).y;
       
      strokeWeight(20);
      stroke(0);
      point(ax,ay);
      strokeWeight(1);
      stroke(col);
      beginShape();
      
      float X = (temp.get(0).x + ax)/2;
      float Y = (temp.get(0).y + ay)/2;
      
      for(int i=0;i<sides;i++){
       
        float theta = radians(360/sides*i);
        
        float w = abs((temp.get(0).x - ax))/2;
        float h = abs((temp.get(0).y - ay))/2;
        
        PVector a = new PVector(X + w * cos(theta),Y + h * sin(theta));
        vertex(a.x,a.y);
        
        //vertex(X + w * cos(theta2),Y + h * sin(theta2));
        
      }
      endShape(CLOSE);
      }
      if(mdown&&!mousePressed){
        
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
        n = new tabBoundary(temp.get(0).x,temp.get(0).y,ax,ay,201);
        float X = (temp.get(0).x + ax)/2;
        float Y = (temp.get(0).y + ay)/2;
        n.center = new PVector(X,Y);
      
      for(int i=0;i<sides;i++){
       
        float theta = radians(360/sides*i);
        float theta2 = radians(360/sides*(i+1));
        
        float w = abs((temp.get(0).x - ax))/2;
        float h = abs((temp.get(0).y - ay))/2;
        
        PVector a = new PVector(X + w * cos(theta),Y + h * sin(theta));
        PVector b = new PVector(X + w * cos(theta2),Y + h * sin(theta2));
        //vertex(a.x,a.y);
        n.Boundaries.add(new tabBoundary(a.x,a.y,b.x,b.y));
        
      }
      
      n.id = Boundaries.size();
      Boundaries.add (n);
      theta.add(atan2((temp.get(0).y + dy) - temp.get(0).y,(temp.get(0).x + dx) - temp.get(0).x));
      norm.add(atan2((temp.get(0).x + dx) - temp.get(0).x, (temp.get(0).y + dy) - temp.get(0).y));
      temp = new ArrayList<PVector>();
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      mdown = false;
      
      }}}else text("Please define number of sides",100,100);
  };
  
  public void create_bezier(){
    
  };
  
  public void create_complex_poligon(){
    //mcount = 0;
    float mx = mouseX;
    float my = mouseY;
    
    float sw = w/cols, sh = h/rows;
    if(!mousePressed){mcount = 0;}
    //text(x + "         " + scene.x + "          " + scene.w,100,110);
    if(complex){
      
      complexsub.draw();
      
      for(int i=0;i<ogrid.size();i++){
          Point a = ogrid.get(i);
          
          a.draw();
        }
      
      if(mousePressed&&mcount==0&&!complexsub.pos())mdown = true;
      else mdown = false;
      if(mdown) mcount++;
      if(mousePressed&&complexsub.pos())cfinish = true;
      else if(!mousePressed)cfinish = false;
      
      if(mdown){
        
        counter++;
        if(!complexsub.pos())grid.add(new Point(floor(mx/sw)*sw,floor(my/sh)*sh,counter));
        polymidpoint = new PVector(0,0);
        ogrid = new ArrayList<Point>();
        for(int i=0;i<grid.size();i++){
          Point a = grid.get(i);
          boolean b = ugrid.contains(a);
          
          if(!b){
            ugrid.add(a);
            polymidpoint.x += a.x;
            polymidpoint.y += a.y;
          }}polymidpoint.div(grid.size());}
          
            sortpoints(grid,ugrid,ogrid,polymidpoint);
  
        if(ogrid.size()>1&&!cfinish){
          for(int i=0;i<ogrid.size();i++){
          Point a = ogrid.get(i);
          int pos = 0;
            
          if(i<ogrid.size()-1){
            pos = i+1;
          }
          else{
            pos = 0;
          }
          
          Point b = ogrid.get(pos);
          stroke(0);
          strokeWeight(1);
          line(b.x,b.y,a.x,a.y);
          
        }}
        
        strokeWeight(20);
        stroke(0);
        point(polymidpoint.x,polymidpoint.y);
        strokeWeight(1);
        }
        
        if(cfinish){
          
          Boundaries.add(new tabBoundary(ogrid));
          
          ogrid = new ArrayList<Point>();
          grid = new ArrayList<Point>();
          ugrid = new ArrayList<Point>();
          
          cfinish = false;
        }
    
  };
  
  public void connectedLines(){
    //mcount = 0;
    float mx = mouseX;
    float my = mouseY;
    
    float sw = w/cols, sh = h/rows;
    if(!mousePressed){
      mcount = 0;
      pointadded = false;
    }
    if(connectedlines){
      complexsub.draw();
      
      if(mousePressed&&mcount==0&&!complexsub.pos())mdown = true;
      else mdown = false;
      if(mousePressed&&complexsub.pos())cfinish = true;
      else if(!mousePressed)cfinish = false;
      
      if(mdown){
        
        if(!complexsub.pos()){
          Point a = new Point(floor(mx/sw)*sw,floor(my/sh)*sh,grid.size());
          Point b;
          boolean k = grid.contains(a);
          if(grid.size()==0)grid.add(a);
          else{
            b = grid.get(grid.size()-1);
            if(b.x!=a.x||b.y!=a.y)grid.add(a);
          }}
        //pointadded = true;
      }
        for(int i=grid.size()-1;i>-1;i--){
          Point a = grid.get(i);
          
          a.draw();
          
        if(grid.size()>1&&!cfinish){
          int pos = 0;
            
          if(i<grid.size()-1)pos = i+1;
          
          Point b = grid.get(pos);
          stroke(0);
          strokeWeight(1);
          if(i<grid.size()-1)line(b.x,b.y,a.x,a.y);
          
        }}
        
        if(cfinish){
          
          if(grid.size()>0)Boundaries.add(new tabBoundary(grid,0));
          
          grid = new ArrayList<Point>();
          
          cfinish = false;
          mdown = false;
        }}
        strokeWeight(1);
  };
  
  public void drawPath(){
    //mcount = 0;
    float mx = mouseX;
    float my = mouseY;
    
    float sw = w/cols, sh = h/rows;
    if(!mousePressed){
      mcount = 0;
      pointadded = false;
    }
    if(path){
      complexsub.draw();
      
      if(mousePressed&&mcount==0&&!complexsub.pos())mdown = true;
      else mdown = false;
      if(mousePressed&&complexsub.pos())cfinish = true;
      else if(!mousePressed)cfinish = false;
      
      if(mdown){
        
        if(!complexsub.pos()){
          Point a = new Point(floor(mx/sw)*sw,floor(my/sh)*sh,grid.size());
          Point b;
          boolean k = grid.contains(a);
          if(grid.size()==0)grid.add(a);
          else{
            b = grid.get(grid.size()-1);
            if(b.x!=a.x||b.y!=a.y)grid.add(a);
          }}
        //pointadded = true;
      }
        for(int i=grid.size()-1;i>-1;i--){
          Point a = grid.get(i);
          
          a.draw();
          
        if(grid.size()>1&&!cfinish){
          int pos = 0;
            
          if(i<grid.size()-1)pos = i+1;
          
          Point b = grid.get(pos);
          stroke(0);
          strokeWeight(1);
          if(i<grid.size()-1)line(b.x,b.y,a.x,a.y);
          
        }}
        
        if(cfinish){
          
          if(grid.size()>0)Boundaries.add(new tabBoundary(grid,0));
          
          grid = new ArrayList<Point>();
          
          cfinish = false;
          mdown = false;
        }}
        strokeWeight(1);
  };
  
  public void create_free(){
    
  };
  
  public Boolean posWindow(){
    
    float mx = mouseX;
    float my = mouseY;
    
    return(mx>x1&&mx<x2&&my>y1&&my<y2);
    
  };
  
  public void mass_Center(){
    
    ccount = 0;
    PVector Center = new PVector(0,0);
    if(center == null|| center !=Center){
    for(int i=0;i<Boundaries.size();i++){
      
      tabBoundary a = Boundaries.get(i);
      PVector midp = new PVector((a.x1+a.x2)/2,(a.y1+a.y2)/2);
      Center.add(midp);
      Midpoints.add(midp);
      ccount++;
    }
  if(ccount==Boundaries.size())center = Center;
  }
};
    
};

  public PVector check_intersect(tabBoundary a, tabBoundary b){

    float a1 = a.y2 - a.y1;
    float b1 = a.x1 - a.x2;
    float c1 = a1 * a.x1 + b1 * a.y1;
    float a2 = b.y2 - b.y1;
    float b2 = b.x1 - b.x2;
    float c2 = a2 * b.x1 + b2 * b.y1;
    float denom = a1 * b2 - a2 * b1;
    
    if((a.x1==b.x1||a.x2==b.x2)&&(a.y1==b.y1||a.y2==b.y2)){
      
      return null;
    }
     else{
        
    Float X = (b2 *c1 - b1 * c2) / denom;
    Float Y = (a1 *c2 - a2 * c1) / denom;
    
    PVector p = new PVector(X,Y);   
      boolean Linea = ((p.x<a.x1&&p.x>a.x2)||(p.x>a.x1&&p.x<a.x2))||((p.y<a.y1&&p.y>a.y2)||(p.y>a.y1&&p.y<a.y2));
      boolean Lineb = ((p.x<b.x1&&p.x>b.x2)||(p.x>b.x1&&p.x<b.x2))||((p.y<b.y1&&p.y>b.y2)||(p.y>b.y1&&p.y<b.y2));
      boolean Linec = (p.x!=a.x1&&p.x!=a.x2)&&(p.y!=a.y1&&p.y!=a.y2);
      
      Linec = (dist(p.x,p.y,a.x1,a.y1)>0.5f&&dist(p.x,p.y,a.x1,a.y1)>0.5f);
        if(Linec&&Linea&&Lineb){
            //strokeWeight(20);
            //  stroke(0);
            //  point(p.x,p.y);
            //  strokeWeight(1);
        return p;
      }
      else{
      return null;
      }}
  };
  
  public PVector check_intersect2(tabBoundary a, tabBoundary b){

    float a1 = a.y2 - a.y1;
    float b1 = a.x1 - a.x2;
    float c1 = a1 * a.x1 + b1 * a.y1;
    float a2 = b.y2 - b.y1;
    float b2 = b.x1 - b.x2;
    float c2 = a2 * b.x1 + b2 * b.y1;
    float denom = a1 * b2 - a2 * b1;
    
    Float X = (b2 *c1 - b1 * c2) / denom;
    Float Y = (a1 *c2 - a2 * c1) / denom;
    
    PVector p = new PVector(X,Y);   
      boolean Linea = ((p.x<=a.x1&&p.x>=a.x2)||(p.x>=a.x1&&p.x<=a.x2))||((p.y<=a.y1&&p.y>=a.y2)||(p.y>=a.y1&&p.y<=a.y2));
      boolean Lineb = ((p.x<=b.x1&&p.x>=b.x2)||(p.x>=b.x1&&p.x<=b.x2))||((p.y<=b.y1&&p.y>=b.y2)||(p.y>=b.y1&&p.y<=b.y2));
      boolean Linec = (p.x==a.x1||p.x==a.x2)||(p.y==a.y1||p.y==a.y2);
      boolean Lined = (p.x==b.x1||p.x==b.x2)&&(p.y==b.y1||p.y==b.y2);
        if(Linea&&Lineb||Linec){
        return p;
      }
      else{
      return null;
      }
  };
  
  class tabConnection{
    float d,e,x,y;
    //ArrayList<Integer[]> vertex = new ArrayList<Integer[]>();
    PVector c;
    
    tabConnection(PVector C){
      c = C;
      x = c.x;
      y = c.y;
      
    };
    
    
  };
  
  
  class tabRect{
    
    float x,y,w,h,mass,density,viscoscity,friction,moment,vx,vy,ax,ay;
    boolean border, dashed,connected;
    PVector pos,vel,ac;
    int bg,str;
    tabBoundary rect;
    
    tabRect(float xx,float yy,float ww,float hh){
      x = xx;
      y = yy;
      h = hh;
      w = ww;
      
      rect = new tabBoundary(xx,yy,ww,hh,4);
    };
    
    public void draw(){
      
    }
    
  };
  
  class tab_tri{
    
    float x,y,w,h,mass,density,viscoscity,friction,moment,vx,vy,ax,ay;
    boolean border, dashed,connected,fill = true;
    PVector pos,vel,ac;
    int bg = color(0,180),str = color(0);
    tabBoundary tri;
    Human parent;
    
    tab_tri(float xx,float yy,float ww,float hh){
      x = xx;
      y = yy;
      h = hh;
      w = ww;
      
      tri = new tabBoundary(x,y,10,20,103);
    };
    tab_tri(){
    };
    
    public void draw(){
      beginShape();
      stroke(str);
      if(!border)noStroke();
      fill(bg);
      if(parent!=null)fill(parent.col);
      if(!fill)noFill();
      
      for(int i=0;i<tri.Boundaries.size();i++){
        tabBoundary b = tri.Boundaries.get(i);
        vertex(b.x1,b.y1);
        //vertex(b.x1,b.y1);
      }
      endShape(CLOSE);
    }
    public void update(){
    for(int i=0;i<tri.Boundaries.size();i++){
        tabBoundary b = tri.Boundaries.get(i);
        
        b.create_rotation_points(tri.Boundaries);
        b.update_dist(tri.Boundaries);
        b.update_angles();
        b.create_angles(tri.Boundaries);
      }
  };
  
  public boolean pos(PVector a){
    boolean k = false;
    
    if(tri.pos(tri,a))k = true;
    return k;
  }
  };
  
  
  
   class tabEllipse{
    
    float x,y,w,h,mass,density,viscoscity,friction,moment,vx,vy,ax,ay;
    boolean border, dashed,connected;
    PVector pos,vel,ac;
    int bg,str;
    tabBoundary ellipse;
    
    tabEllipse(float xx,float yy,float ww,float hh){
      x = xx;
      y = yy;
      h = hh;
      w = ww;
      
      ellipse = new tabBoundary(xx,yy,ww,hh,2);
    };
    
    public void draw(){
      
    }
    
  };

  
 class tabPoligon extends tabBoundary{
    
    tabPoligon(float xx,float yy,float ww,float hh,int _sides){
      
    sides = _sides;
    x1 = xx;
    y1 = yy;
    w = ww;
    h = hh;
    ax = xx + ww;
    ay = yy + hh;
    
    tabBoundary n;
    
    Sides.draw();
    sides = PApplet.parseInt(Sides.value);
    
        n = new tabBoundary(xx,yy,ax,ay,201);
        
        float X = (xx + w)/2;
        float Y = (yy + h)/2;
        
        n.center = new PVector(X,Y);
      
      for(int i=0;i<sides;i++){
       
        float theta = radians(360/sides*i);
        float theta2 = radians(360/sides*(i+1));
        
        PVector a = new PVector(X + w * cos(theta),Y + h * sin(theta));
        PVector b = new PVector(X + w * cos(theta2),Y + h * sin(theta2));
        //vertex(a.x,a.y);
        n.Boundaries.add(new tabBoundary(a.x,a.y,b.x,b.y));
        
      }
      
      n.id = Boundaries.size();
      Boundaries.add (n);
      
      theta.add(atan2((y1 + hh) - y1,(x1 + ww) - x1));
      norm.add(atan2((x1 + ww) - x1, (y1 + hh) - y1));
      
      temp = new ArrayList<PVector>();
      Float [] vel = {0.0f,0.0f};
      
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      mdown = false;
      
      }
      
    };
class horizontaltabs extends tab {
  float x, y, w, h;

  ArrayList<tab> tabs = new ArrayList<tab>();
  horizontaltabs parentnavh;
  verticaltabs parentnavv;
  horizontaltabs childnavh;
  verticaltabs childnavv;

  Window currentWindow = null;
  int windex = -1;
  //boolean navigator;

  horizontaltabs(float x, float y, float w, float h, float W, String [] titles) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    //canvas = createCanvas(w,h);
    for (int i=0; i<titles.length; i++) {

      String s = titles[i];

      tab t = new tab(x + W * i, y, w, h, s);
      Button b = new Button(x + w * i, y, w, 20);
      b.border = false;
      t.buttons.add(b);

      tabs.add(t);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
  };

  horizontaltabs(float x, float y, float w, float h, String [] titles) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    //canvas = createCanvas(w,h);
    for (int i=0; i<titles.length; i++) {

      String s = titles[i];

      tab t = new tab(x + w * i, y, w, h, s);
      //t.buttons.add(new Button(x + w * i,y,w,20,s));
      tabs.add(t);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
  };

  horizontaltabs(float x, float y, float w, float h, float W, int n) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    //canvas = createCanvas(w,h);
    for (int i=0; i<n; i++) {

      tab t = new tab(x + W * i, y, w, h);
      //t.buttons.add(new Button(x + W * i,y,w,20));
      tabs.add(t);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
  };

  horizontaltabs(float x, float y, float w, float h, int n) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    //canvas = createCanvas(w,h);
    for (int i=0; i<n; i++) {

      tab t = new tab(x + w * i, y, w, h);
      t.buttons.add(new Button(0 + w * i, 0, w, 20));
      tabs.add(t);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
  };

  horizontaltabs(float x, float y, float w, horizontaltabs n) {

    this.x = x;
    this.y = y;
    this.w = w;
    //this.h = h;
    parentnavh = n;
    //canvas = createCanvas(w,n.h);
    //canvas = createCanvas(w,h);
    for (int i=0; i<n.tabs.size(); i++) {
      String s = n.tabs.get(i).label;
      tab t = new tab(0, 0, w, h, s);
      t.parent = n.tabs.get(i);

      tabs.add(t);
      n.tabs.get(i).child = tabs.get(tabs.size()-1);
    }

    sliderv = new Slider(w-10, 20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(0, h-10, w-10, 10);
    sliderh.tvisible = false;
    n.childnavh = this;
  };

  horizontaltabs(float x, float y, float w, float h, horizontaltabs n) {

    this.x = x;
    this.y = y;
    this.w = w ;
    this.h = h;
    parentnavh = n;
    
    canvas = createCanvas(w,h);
    
    for (int i=0; i<n.tabs.size(); i++) {
      
      String s = n.tabs.get(i).label;
      
      tab t = new tab(0, 0, w, h, s);
      t.parent = n.tabs.get(i);

      tabs.add(t);
      n.tabs.get(i).child = tabs.get(tabs.size()-1);
    }

    sliderv = new Slider(w-10, 20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(0, h-10, w-10, 10);
    sliderh.tvisible = false;
    n.childnavh = this;
  };

  horizontaltabs(float x, float y, float w, verticaltabs n) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    parentnavv = n;

    for (int i=0; i<n.tabs.size(); i++) {
      String s = n.tabs.get(i).label;
      tab t = new tab(x + w * i, y, w, h, s);
      t.parent = n.tabs.get(i);
      tabs.add(t);
      n.tabs.get(i).child = tabs.get(tabs.size()-1);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
    n.childnavh = this;
  };

  horizontaltabs(float x, float y, float w, float h, verticaltabs n) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    parentnavv = n;

    for (int i=0; i<n.tabs.size(); i++) {
      String s = n.tabs.get(i).label;
      tab t = new tab(x + w * i, y, w-40, h-40, s);
      t.parent = n.tabs.get(i);
      tabs.add(t);
      n.tabs.get(i).child = tabs.get(tabs.size()-1);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
    n.childnavh = this;
  };
  
  public void displayTabs() {
    fill(255);

    //if(childnavh!=null){
    //  text("Navigator h",x,y);
    //if(toggle)childnavh.toggle=true;
    //else childnavh.toggle = false;

    //childnavh.displayTabs();
    //}
    //if(childnavv!=null){
    //  //text("Navigator v",x,y);
    //if(toggle)childnavv.toggle=true;
    //else childnavv.toggle = false;

    //childnavv.displayTabs();
    //}
    tabindex = -1;
    logic();
    //canvas.beginDraw();
    if (toggle&&canvas!=null) {
      
      canvas.beginDraw();
      mouse = getMouse();
      
      for (int i=0; i<tabs.size(); i++) {
        tab t1 = tabs.get(i);
        tab t = t1.states.get(t1.state);
        if (t.toggle&&t.windows.get(0).toggle)currentWindow = t.windows.get(0);
        if (t.visible) {
          t.toggle = true;
          tabindex = i;
        }
        ////else if(tabindex>0)t.toggle = false;
        //if(t.toggle&&t.title.toggle==0)t.title.toggle = 1;

        //if (t.toggle)t.title.toggle=1;
        //else t.title.toggle = 0;
        if(t1.toggle){t.visible=true;t.toggle=true;t.title.toggle=1;}
        if(t.title.toggle!=1&&(t.toggle||t.visible)){t.toggle=true;t.visible = true;t.title.toggle=1;}
        
        if(!t.visible){t.toggle = false;}
        if (t.title.toggle==0&&t.toggle) {

          t.toggle= false;
          t.visible = false;
        } else if (t.title.toggle==1&&!t.toggle) {
        }

        if (t.title.pos()&&mousePressed)sliderset = false;

        else if ((t.title.pos()||t.posTab())&&mousePressed&&t.visible) {
          current = i;
          setTab = true;
        }

        if (t.child!=null&&t.displayChild) {
          if (t.visible||t.title.toggle==1) {
            //t.child.visible = true;
            //t.child.displayTabs();
          } else if (!t.visible) t.child.visible = false;
        }
        //if(t.toggle)
        t.displayTabs();
      }

      if (setTab) {
        tabindex = current;
        setTab = false;
      }
      //
      displayNavv();
      displayWindow();
      
      canvas.endDraw();
      image(canvas,x,y);
      displayNavh();
    }else canvas = createCanvas(w,h);
  };

  public void displayTabs_() {
    fill(255);

    //if(childnavh!=null){
    //  text("Navigator h",x,y);
    //if(toggle)childnavh.toggle=true;
    //else childnavh.toggle = false;

    //childnavh.displayTabs();
    //}
    //if(childnavv!=null){
    //  //text("Navigator v",x,y);
    //if(toggle)childnavv.toggle=true;
    //else childnavv.toggle = false;

    //childnavv.displayTabs();
    //}
    
    tabindex = -1;
    logic();
    if (toggle) {
      for (int i=0; i<tabs.size(); i++) {

        tab t = tabs.get(i);
        if (t.toggle&&t.windows.get(0).toggle)currentWindow = t.windows.get(0);
        if (t.visible) {
          t.toggle = true;
          tabindex = i;
          t.title.toggle = 1;
          t.title.draw();
        }
        if (t.title.pos()&&mousePressed)sliderset = false;
        else if ((t.title.pos()||t.posTab())&&mousePressed&&t.visible) {
          current = i;
          setTab = true;
        }

        if (t.child!=null&&t.displayChild) {
          if (t.visible||t.title.toggle==1) {
            //t.child.visible = true;
            //t.child.displayTabs();
          } else if (!t.visible) t.child.visible = false;
        }
        //if(t.toggle)
        t.displayTabs();
      }

      if (setTab) {
        tabindex = current;
        setTab = false;
      }
      displayNavh();
      displayNavv();
      displayWindow();
    }
  };

  public void displayNavh() {

    if (navigatorh!=null&&tabindex>-1) {

      setTabsh();
      navigatorh.canvas.beginDraw();
      navigatorh.canvas.background(50);
      navigatorh.mouse = new PVector(mouse.x - navigatorh.x,mouse.y-navigatorh.y);
      
      if(current_tab!=null)current_tab.mouse2 = navigatorh.mouse;
      if(previous_tab!=null)previous_tab.mouse2 = navigatorh.mouse;
      if(next_tab!=null)next_tab.mouse2 = navigatorh.mouse;
      //--------------------------------------------------------------
      
      float v = map(sliderh.value, -navigatorh.w/2, navigatorh.w/2, 0, navigatorh.w*2);

      current_tab.w = v;
      current_tab.x = sliderh.value ;
      current_tab.title.x = 0;
      
      if (current_tab.x<=10) {
        current_tab.x = 0;
        current_tab.title.x = 0;
        
      }
      //if (current_tab.x + current_tab.w >navigatorh.w)current_tab.w =   navigatorh.w - current_tab.x;

      if (current_tab.title!=null)current_tab.title.w = v;
      
      //-------------------------------------------------------------
      if (previous_tab!=null) {
        previous_tab.x = 0;

        float value = (current_tab.x);
        if(value>navigatorh.w)previous_tab.x = 0+value*2;
        
        if (previous_tab!=null&&previous_tab.title!=null) {
          previous_tab.title.x = previous_tab.x;
          previous_tab.title.w = value;
        }
        previous_tab.displayTabs(navigatorh.canvas);
      }
      //----------------------------------------------------------------
      current_tab.displayTabs(navigatorh.canvas);
      //current_tab.title.mouse = navigatorh.mouse;
      //current_tab.title.draw(navigatorh.canvas);
      //----------------------------------------------------------------
      if (next_tab!=null&&(!next_tab.visible || !next_tab.toggle)) next_tab = null;
      else if (next_tab!=null&&next_tab.visible && next_tab.toggle) {
        
        next_tab.x = v;
        
        if(next_tab.x+textWidth(next_tab.label)>=navigatorh.w){
          
        }
        float value = (sliderh.x + sliderh.w) - (current_tab.x + current_tab.w );
        //if (value>)
        next_tab.w = value + 10;

        if (next_tab.title!=null) {
          
          next_tab.title.w = value;
          next_tab.title.mouse = navigatorh.mouse;
        } 
        
        next_tab.displayTabs(navigatorh.canvas);
      }
      current_tab.w =  navigatorh.w;
      
      if (current_tab.title!=null)current_tab.title.w = navigatorh.w;

      if (navigatorh!=null&&navigatorh.visible) {
        if (toggle) {
          navigatorh.toggle = true;
          navigatorh.visible = true;
        } else {
          navigatorh.toggle = false;
          navigatorh.visible = false;
        }
      }
      sliderControl(navigatorh.canvas);
      navigatorh.canvas.endDraw();
      image(navigatorh.canvas,navigatorh.x,navigatorh.y);
      
    }

    //-----------------------------------------------------------------
  };

  public void displayNavv() {
    if (tabindex!=-1) {
      if (navigatorv!=null) {

        setTabsv();

        if (navigatorv.visible) {
          if (toggle) {
            navigatorv.toggle = true;
            navigatorv.visible = true;
          } else {
            navigatorv.toggle = false;
            navigatorv.visible = false;
          }
        }

        sliderControl(canvas);
      }
    }
  };
  
  public void logic(){
    //if(open){
    //  for(int i =0;i<tabs.size();i++){
    //    tab t = tabs.get(i);
    //    t.toggle = true;
    //    t.visible = true;
    //  }
    //}else{
    //  for(int i =0;i<tabs.size();i++){
    //    tab t = tabs.get(i);
    //    t.toggle = false;
    //    t.visible = false;
    //  }
    //}
  };

  public void setTabsv() {



    if (navigatorv!=null&&tabindex>-1&&!setTab) {

      current_tab = navigatorv.tabs.get(tabindex);

      if (tabindex<tabs.size()-1)next_tab = navigatorh.tabs.get(tabindex + 1);
      else next_tab = null;

      if (tabindex>1)previous_tab = navigatorh.tabs.get(tabindex - 1);
      else previous_tab = null;

      if (current_tab!=null) {
        current_tab.toggle=true;
        current_tab.visible=true;
      }

      if (previous_tab!=null) {
        previous_tab.toggle=true;
        previous_tab.visible=true;
      }

      if (next_tab!=null) {
        next_tab.toggle=true;
        next_tab.visible=true;
      }
      setTab =true;
    }
  };

  public void setTabsh() {
    fill(255);
    if (current>-1&&!setTab) {
      if (tabs.get(current).visible) {
        tabindex = current;
        setTab = true;
      }
    }
    if (navigatorh!=null&&tabindex>-1) {

      current_tab = navigatorh.tabs.get(tabindex);

      if (tabindex<tabs.size()-1)next_tab = navigatorh.tabs.get(tabindex + 1);
      else next_tab = null;

      if (tabindex>0)previous_tab = navigatorh.tabs.get(tabindex - 1);
      else previous_tab = null;

      if (current_tab!=null) {
        current_tab.toggle=true;
        current_tab.visible=true;
      }

      if (previous_tab!=null) {
        previous_tab.toggle=true;
        previous_tab.visible=true;
      }

      if (next_tab!=null) {
        next_tab.toggle=true;
        next_tab.visible=true;
      }
      setTab = true;
    }
  };


  public void displayWindow() {
    if (currentWindow!=null)currentWindow.display_grid();
  };

  public void displayNav() {
    //if(scrollable&&toggle){
    //  if(title==null){
    //  if(!sliderh.mdown){
    //    //sliderv.draw();
    //    //sliderv.mouse();
    //  }
    //  if(!sliderv.mdown){

    //    //sliderh.mouse();
    //    //sliderh.draw();
    //  }}}
  };

  public void sliderControl(PGraphics canvas) {
    if (tabindex>-1) {
      
      if (current_tab!=null)sliderh.set(-current_tab.w, current_tab.w);
      if (!sliderset&&current_tab!=null) {
        sliderv = new Slider(current_tab.x+current_tab.w-10, current_tab.y+20, 10, current_tab.h-30);
        sliderv.vertical = true;
        sliderv.tvisible = false;
        sliderv.valuex = 0;
        sliderh.value = 0;
        sliderh = new Slider(current_tab.x, current_tab.y+current_tab.h - 10, current_tab.w-10, 10);
        sliderh.tvisible = false;
        sliderset = true;
      }

      if (!sliderh.mdown)sliderv.mouseFunctions(navigatorh.mouse);
      sliderv.mouse = mouse;
      sliderv.parentCanvas = true;
      sliderv.draw(navigatorh.canvas);
      if (!sliderv.mdown)sliderh.mouseFunctions(navigatorh.mouse);
      sliderh.mouse = mouse;
      sliderh.parentCanvas = true;
      sliderh.draw(navigatorh.canvas);
    }
  };
  
  public void states(int k){
    for(int i=0;i<tabs.size();i++){
      tab t = tabs.get(i);
      
      tab t1 = new tab(t.x,t.y,t.w,t.h);
      tab t2 = new tab(t.x,t.y,t.w,t.h,t.label);
      
      for(int j=0;j<k;j++){
        
        if(t.title!=null)t.states.add(t2);
        else t.states.add(t1);
        
    }}
  }

  public void setWidth(int k, float W) {
    tabs.get(k).w = W;
    tabs.get(k).title.w = W;
    tab T = tabs.get(k);
    float cwidth = w;
    for (int i=k+1; i<tabs.size(); i++) {
      tab t = tabs.get(i);

      t.x =  T.x + cwidth;
      cwidth += t.w;
    }
  };
};
class verticaltabs extends tab {

  float x, y, w, h;

  ArrayList<tab> tabs = new ArrayList<tab>();

  horizontaltabs parentnavh;
  verticaltabs parentnavv;
  horizontaltabs childnavh;
  verticaltabs childnavv;

  verticaltabs(float x, float y, float w, float h, float H, String [] titles) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;

    for (int i=0; i<titles.length; i++) {

      String s = titles[i];

      tab t = new tab(x, y + H * i, w, H, s);
      tabs.add(t);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
  };

  verticaltabs(float x, float y, float w, float h, String [] titles) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;

    for (int i=0; i<titles.length; i++) {

      String s = titles[i];

      tab t = new tab(x, y + h * i, w, h, s);
      tabs.add(t);
    }
    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
  };

  verticaltabs(float x, float y, float w, float h, float H, int n) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;

    for (int i=0; i<n; i++) {
      tab t = new tab(x, y + H * i, w, H);
      tabs.add(t);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
  };

  verticaltabs(float x, float y, float w, float h, int n) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;

    for (int i=0; i<n; i++) {
      tab t = new tab(x, y + h * i, w, h);
      tabs.add(t);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
  };

  verticaltabs(float x, float y, float w, verticaltabs n) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    parentnavv = n;

    for (int i=0; i<n.tabs.size(); i++) {
      String s = n.tabs.get(i).label;
      tab t = new tab(x, y + h * i, w, h, s);
      tabs.add(t);
    }
    n.childnavv = this;
  };

  verticaltabs(float x, float y, float w, horizontaltabs n) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    parentnavh = n;

    for (int i=0; i<n.tabs.size(); i++) {
      String s = n.tabs.get(i).label;
      tab t = new tab(x, y + h * i, w, h, s);
      tabs.add(t);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
    n.childnavv = this;
  };

  public void displayTabs() {
    for (int i=0; i<tabs.size(); i++) {

      tab t = tabs.get(i);
      t.displayTab();
    }
  };
};
public void tabsetup(){

  tab.tabs.get(0).toggle = true;
  for(int i=1;i<tab.tabs.size();i++){
    //if(i==1)i++;
    tab t = tab.tabs.get(i);
    t.toggle = false;
    t.border = true;
    t.visible = false;
    
    for(int j=0;i<t.windows.size()-1;j++){
    Window w1 = t.windows.get(j);
    
    w1.launchable = false;
    w1.quickAccess = true;
    w1.transparent = true;
    w1.border = true;
    
  }
  for(int j=0;j<t.states.size();j++){
    tab t1 = t.states.get(j);
    t1.toggle = false;
    if(t1.title!=null)t1.title.toggle=1;
    t1.border = true;
    t1.visible = false;
  }
}

  //tab.navigator = new horizontaltabs(300,400,600,200,tab);
  
  tab.tabs.get(0).border = true;
  tab.navigatorh = new horizontaltabs(300,400,600,200,tab);
  tab.navigatorh.scrollable = true;
  tab.navigatorh.parentnavh = tab;
  tab.toggle = false;
  Table_ t = new Table_(tab.navigatorh.x+10,tab.navigatorh.y+21,200,200,3,3,10);
  tab.tables.add(t);
  Window w1 = tab.tabs.get(1).windows.get(0);
  w1.launchable = false;
  w1.quickAccess = true;
  w1.transparent = true;
  w1.border = true;
};

public void tabLogic(){
  tab tab1 = tab.tabs.get(0);
  tab tab2 = tab.tabs.get(1);
  tab tab3 = tab.tabs.get(2);
  tab tab4 = tab.tabs.get(3);
  tab tab5 = tab.tabs.get(4);
  tab tab6 = tab.tabs.get(5);
  tab tab7 = tab.tabs.get(6);
  
  // tab 1-------------Project------------------------
  
  tab tab00_01 = tab1.states.get(0);
  tab tab00_02 = tab1.states.get(1);
  tab tab00_03 = tab1.states.get(2);
  tab tab00_04 = tab1.states.get(3);
  tab tab00_05 = tab1.states.get(4);
  tab tab00_06 = tab1.states.get(5);
  
  // tab 2--------------Inputs--------------------------
  
  tab tab01_01 = tab2.states.get(0);
  tab tab01_02 = tab2.states.get(1);
  tab tab01_03 = tab2.states.get(2);
  tab tab01_04 = tab2.states.get(3);
  tab tab01_05 = tab2.states.get(4);
  tab tab01_06 = tab2.states.get(5);
  
  // tab 3------------Processing---------------------------
  
  tab tab02_01 = tab3.states.get(0);
  tab tab02_02 = tab3.states.get(1);
  tab tab02_03 = tab3.states.get(2);
  tab tab02_04 = tab3.states.get(3);
  tab tab02_05 = tab3.states.get(4);
  tab tab02_06 = tab3.states.get(5);
  
  // tab 4-------------------------------------------------
  
  tab tab03_01 = tab4.states.get(0);
  tab tab03_02 = tab4.states.get(1);
  tab tab03_03 = tab4.states.get(2);
  tab tab03_04 = tab4.states.get(3);
  tab tab03_05 = tab4.states.get(4);
  tab tab03_06 = tab4.states.get(5);
  
  // tab 5-------------------------------------------------
  
  tab tab04_01 = tab5.states.get(0);
  tab tab04_02 = tab5.states.get(1);
  tab tab04_03 = tab5.states.get(2);
  tab tab04_04 = tab5.states.get(3);
  tab tab04_05 = tab5.states.get(4);
  tab tab04_06 = tab5.states.get(5);
  
  // tab 6----------------Outputs-----------------
  
  tab tab05_01 = tab6.states.get(0);
  tab tab05_02 = tab6.states.get(1);
  tab tab05_03 = tab6.states.get(2);
  tab tab05_04 = tab6.states.get(3);
  tab tab05_05 = tab6.states.get(4);
  tab tab05_06 = tab6.states.get(5);
  
 
  };
  
  public void tabfunctions(){
  tab tab1 = tab.tabs.get(0);
  
  //tab tab2 = tab.tabs.get(1).states.get(tab.tabs.get(1).state);
  tab tab2 = tab.tabs.get(1);
  tab tab3 = tab.tabs.get(2);
  tab tab4 = tab.tabs.get(3);
  tab tab5 = tab.tabs.get(4);
  tab tab6 = tab.tabs.get(5);
  tab tab7 = tab.tabs.get(6);
  
  int index = tab1.dmenus.get(1).index;
  int index2 = tab1.dmenus.get(0).index;
  fill(255);
  //text(index,100,90);
  //text(tab2.state,200,100);
  //     if(index==0||index==2)tab2.state = 0;
  ////else 
  if(index>-1)tab.tabs.get(1).state = index;
  ////else if(index==3)tab2.state = 2;
  //else tab2.state = 5;
  //tab2.state = 0;
  
  //-------------------------------------------------------------------------------------------
  
  int [] s1 = {0,1,2,3,4,5};
  
  if(index2>-1&&index>-1){
    tab2.visible=true;
    tab2.toggle=true;
  }
  //else {
  //  tab2.visible=false;
  //  tab2.toggle=false;
  //}
  
  //tab2.state = 4;
    
  if(tab2.toggle){
   
    if(index>=0&&index2>-1)tab2.buttons.get(0).toggle2(tab3,"toggle");
    Window w1 = tab2.windows.get(0);
    tab2.dmenus.get(0).items.get(0).mouse = tab2.mouse;
    //tab2.buttons.get(0).mouse = tab2.mouse;
    if((index<4&&index>-1)&&tab2.dmenus.size()>0)tab2.dmenus.get(0).items.get(0).latch(w1,"toggle");
  }
  if(tab3.toggle&&tab3.dmenus.get(0).index>-1)tab3.buttons.get(0).toggle2(tab4,"toggle");
  if(tab4.toggle&&tab4.dmenus.get(0).index>-1)tab4.buttons.get(0).toggle2(tab5,"toggle");
  if(tab5.toggle&&tab5.dmenus.get(0).index>-1)tab5.buttons.get(0).toggle2(tab6,"toggle");
  if(tab6.toggle&&tab6.dmenus.get(0).index>-1)tab6.buttons.get(0).toggle2(tab7,"toggle");
  
  Window w1 = tab1.windows.get(0);
  if(w1.currentp!=null&&mousePressed)tab.tabs.get(1).folder = w1.currentp;
  if(w1.currentf!=null&&mousePressed)tab.tabs.get(1).file = w1.currentf;
  
  //----------inuputs---------------------------------
 
  };
class Table_ {

  int rows, cols, bcols, brows;
  float x, y, w, h, bw, bh, xpadding, ypadding;

  ArrayList<TextBox> grid = new ArrayList<TextBox>();
  ArrayList<Button> Buttons = new ArrayList<Button>();
  ArrayList<ArrayList<TextBox>> gridarray = new ArrayList<ArrayList<TextBox>>();
  boolean initialize,parentCanvas;

  Table_(float x, float y, float w, float h, int cols, int rows) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    this.cols = cols;
    this.rows = rows;
    bcols = cols;
    brows = rows;

    for (int i=0; i<rows; i++) {
      ArrayList<TextBox> g = new ArrayList<TextBox>();
      for (int j = 0; j<cols; j++) {

        TextBox t = new TextBox(x + w/cols * j, y + h/rows * i, w / cols - 5, h / rows - 5, 2);
        grid.add(t);
        g.add(t);
      }
      gridarray.add(g);
    }

    bw = w/cols;
    bh = h/rows;
  };

  Table_(float x, float y, float w, float h, int cols, int rows, int k) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    this.cols = cols;
    this.rows = rows;

    bcols = cols;
    brows = rows;

    for (int i=0; i<rows; i++) {
      ArrayList<TextBox> g = new ArrayList<TextBox>();
      for (int j = 0; j<cols; j++) {

        TextBox t = new TextBox(x + w/cols * j, y + h/rows * i, w / cols - 5, h / rows - 5, k);
        grid.add(t);
        g.add(t);
      }
      gridarray.add(g);
    }

    bw = w/cols;
    bh = h/rows;

    //Button b1 = new Button(x+w - 70, y - 30, 100, 20, "Randomize");

    //Buttons.add(b1);
    ////Buttons.add(b2);
  };
  
  public void initialize(){
    if(!initialize){
      gridarray = new ArrayList<ArrayList<TextBox>>();
      for (int i=0; i<rows; i++) {
      ArrayList<TextBox> g = new ArrayList<TextBox>();
      for (int j = 0; j<cols; j++) {

        TextBox t = new TextBox(x + bw * j, y + bh * i, bw - 5, bh - 5, 2);
        grid.add(t);
        g.add(t);
      }
      gridarray.add(g);
    }initialize = true;}
    
  };
  
  public void initialize(int Cols,int Rows){
    
    if(!initialize){
      cols = Cols;
      rows = Rows;
      gridarray = new ArrayList<ArrayList<TextBox>>();
      for (int i=0; i<rows; i++) {
      ArrayList<TextBox> g = new ArrayList<TextBox>();
      for (int j = 0; j<cols; j++) {

        TextBox t = new TextBox(x + bw * j, y + bh * i, bw - 5, bh - 5, 2);
        grid.add(t);
        g.add(t);
      }
      gridarray.add(g);
    }initialize = true;}
    
  };

  public void draw() {
    if((gridarray.size()>0)&&(gridarray.size()!=rows||gridarray.get(0).size()!=cols)||gridarray.size()==0)initialize();initialize = false;
    for (int i=0; i<rows; i++) {
      ArrayList<TextBox> a = gridarray.get(i);
      
      for (int j=0; j<cols; j++) {

        TextBox t = a.get(j);
        if (t!=null)t.draw();
      }
    }

    for (int i=0; i<Buttons.size(); i++) {
      Button b = Buttons.get(i);

      b.draw();
      b.self_click3();
    }
    Button b = null;
    if(buttons.size()>0){b = Buttons.get(0);
    b.self_click3();
      
    if(b.toggle==1){
      for (int i=0; i<rows; i++) {
      ArrayList<TextBox> a = gridarray.get(i);
      
      for (int j=0; j<cols; j++) {

        TextBox t = a.get(j);
        int k = floor(random(0,10));
        if (t!=null){
          t.textBox = str(k);
          t.value = k;
      }}}b.toggle=0;}
    }
  };
  
  public void old_button_functions(){
    
    //if(b.toggle==1){
    //      ArrayList<TextBox> temp = new ArrayList<TextBox>();
    //      for(int j=0;j<cols;j++){
            
    //        TextBox k = gridarray.get(0).get(0);
            
    //        temp.add(new TextBox(x + bw * j, y + h, k.w,k.h,10));
    //      }
    //  gridarray.add(temp);
    //  rows ++;
    //  h += bh;
    //  b.toggle=0;
    //  }
      
    //  Button b1 = Buttons.get(0);
      
    //  if(b1.toggle==1){
    //      for(int j=0;j<rows;j++){
            
    //        TextBox k = gridarray.get(0).get(0);
            
    //        gridarray.get(j).add(new TextBox(x + w, y + bh * j, k.w,k.h,10));
            
    //      }
      
    //  cols ++;
    //  w += bw;
    //  b1.toggle=0;
    //  }
    
  };
};
class taskList extends Window{
   
    float x,y,w,h,w2,h2;
    int tcount = 0;
    Menu menu,submenu;
    ArrayList<String> tasks = new ArrayList<String>();
    ArrayList<String[][]> conv_pair = new ArrayList<String[][]>();
    //HashMap<String,Float[][]> tasks
    PImage icon;
    boolean done,numbered,convolved,cdown,windowreset;
    Table_ table;
    Window Window;
    //Float [][] convolution;
    String [][] convolution;
    TextBox [] colrow;
    //ArrayList<String> convolution = new ArrayList<String>();
    
    taskList(){
      
    };
    
    taskList(float x,float y,float w,float h, String [] List){
      
      this.x = x;
      this.y = y;
      this.w = w;
      this.h = h;
      w2 = w;
      h2 = h;
      menu = new Menu(x+w+5,y,100,List,0); 
      
      Button b = new Button(x+100,y+10,30,30,"+");
      b.bsize = 35;
      b.tsize = 35;
      b.tmax = 5;
      b.tyoff = 7;
      b.txoff = -1;
      Buttons.add(b);
      
      Button b1 = new Button(x+5,y+h - 30,w-15,20,"Finish");
      Buttons.add(b1);
      
      Button b2 = new Button(x+5,y+h - 55,w-15,20,"Clear");
      Buttons.add(b2);
      
      Button b3 = new Button(menu.x ,menu.y - 30,w - 55,20,"Get From File");
      Buttons.add(b3);
      
      String [] submenuLabels = {"Load Dataset","Load Training set","Load Image Folder"};
      
      submenu = new Menu(menu.x ,y + h - 70,w - 55,submenuLabels,10);
      submenu.border = true;
      
      int trows = 3;
      int tcols = 3;
      table = new Table_(menu.x + menu.w,y,120,100,tcols,trows);
      windows.get(0).launchable = false;
      colrow = new TextBox[2];
      TextBox t1 = new TextBox(x+40,y+h-80,30,20,2);
      TextBox t2 = new TextBox(x+20+90,y+h-80,30,20,2);
      colrow[0] = t1;
      colrow[1] = t2;
      
    };
    
    taskList(float x,float y,float w,float h, String [] List,int k){
      super(x,y,w,h,"C:\\Users\\paul goux\\");
      this.x = x;
      this.y = y;
      this.w = w;
      this.h = h;
      w2 = w;
      h2 = h;
      menu = new Menu(x+w+5,y,80,List,0); 
      
      Button b = new Button(x+100,y+10,30,30,"+");
      b.bsize = 35;
      b.tsize = 35;
      b.tmax = 5;
      b.tyoff = 7;
      b.txoff = -1;
      Buttons.add(b);
      
      Button b1 = new Button(x+5,y+h - 55,w-15,20,"Clear");
      Buttons.add(b1);
      
      Button b2 = new Button(x+5,y+h - 30,w-15,20,"Finish");
      Buttons.add(b2);
      
      Button b3 = new Button(menu.x ,menu.y - 30,w - 55,20,"Get From File");
      Buttons.add(b3);
      
      String [] submenuLabels = {"Load Dataset","Load Training set","Load Image Folder","Load Source"};
      
       submenu = new Menu(menu.x ,y + h - 75,w - 55,submenuLabels,5);
       submenu.visible = false;
       submenu.borders(true);
       
      int trows = 3;
      int tcols = 3;
      table = new Table_(menu.x + menu.w,y,120,100,tcols,trows,0);
      windows.get(0).launchable = false;
      colrow = new TextBox[2];
      TextBox t1 = new TextBox(x+40,y+h-80,30,20,2);
      TextBox t2 = new TextBox(x+20+90,y+h-80,30,20,2);
      colrow[0] = t1;
      colrow[1] = t2;
      
    };
    
    public void displayList(){
      fill(255);
      if(!done){
        box();
      fill(0);
      text("Cols :",x+10,y+h-65);
      text("Rows :",x+75,y+h-65);
      
      for(int i=0;i<colrow.length;i++){
        
        TextBox t = colrow[i];
        
        t.draw();
      }
      for(int i=0;i<Buttons.size()-1;i++){
        
        Button b = Buttons.get(i);
        
        if(!windows.get(0).toggle)b.self_click2();
        b.draw();
        
      }
      String link2 = null;
      if(Buttons.get(1).toggle==1&&!windows.get(0).toggle){
        tasks = new ArrayList<String>();
        conv_pair = new ArrayList<String[][]>();
        convolution = null;
        table.rows = 0;
        table.cols = 0;
        table.gridarray = new ArrayList<ArrayList<TextBox>>();
        colrow[0].textBox = "";
        colrow[0].value = 0;
        colrow[1].textBox = "";
        colrow[1].value = 0;
      }
      if(Buttons.get(2).toggle==1&&!windows.get(0).toggle)done = true;
      if(Buttons.get(0).toggle==1){
        w2 = 450;
        y2 = y - 40;
        h2 = h + 40;
        menu.draw();table.draw();submenu.draw();
        Buttons.get(3).draw();
        Buttons.get(3).highlight();
        if(!windows.get(0).ddown&&!!windows.get(0).mdown)Buttons.get(3).toggle2(windows.get(0),"toggle");
        
        for(int i=0;i<submenu.items.size();i++){
          Button b1 = submenu.items.get(i);
          b1.toggle2(windows.get(0),"toggle");
        }
        //submenu.toggle(0,windows.get(0),"toggle");
        
        if(windows.get(0).nav.get(2).pos()&&mousePressed&&!mdown){
          windows.get(0).nav.get(2).reverseclick(windows.get(0),"toggle");
          Buttons.get(3).mdown=false;
          Buttons.get(3).toggle=0;
        }
        //if(Buttons.get(3).toggle==0)windows.get(0).nav.get(2).toggle=0;
        windows.get(0).display_grid();
        table.rows = PApplet.parseInt(colrow[1].value);
        table.cols = PApplet.parseInt(colrow[0].value);
        if(mousePressed&&!mdown)link2 = windows.get(0).currentf;
      
      }else {
      w2 = w;
      y2 = y;
      h2 = h;
      }
      
      if(!mousePressed)mdown = false;
      if(link2!=null){
      
      if(link2.endsWith("txt")|| link2.endsWith("csv")){
        //
          convolution = string_to_array(loadStrings(link2));
          convolved = false;
          
      }
      link2 = null;
    }
      
      if(convolution!=null){
      if(table.gridarray.size()>0&&convolution.length*convolution[0].length==table.gridarray.size()*table.gridarray.get(0).size()){
        
        for(int i=0;i<convolution.length;i++){
          for(int j=0;j<convolution[0].length;j++){
            
          TextBox t = table.gridarray.get(j).get(i);
          t.textBox = convolution[i][j].toString();
          t.value = PApplet.parseInt(convolution[i][j]);
        }}}else {table.initialize(convolution.length,convolution[0].length);}convolved = true;}
      
      Button b = Buttons.get(3);
      
      tcount = 0;
      if(table.gridarray.size()>0&&!convolved){
        
        
        for(int i=0;i<table.gridarray.size();i++){
          for(int j=0;j<table.gridarray.get(i).size();j++){
          TextBox t = table.gridarray.get(i).get(j);
          
          if(t.textBox!=null&&t.textBox!="")tcount ++;
        }}}
        
        if(table.gridarray.size()>0&&(tcount == table.gridarray.size()*table.gridarray.get(0).size())||convolved) numbered = true;
        else numbered = false;
      
      for(int i=0;i<menu.items.size();i++){
        Button b1 = menu.items.get(i);
        if(b1.pos()&&mousePressed&&!mdown&&(numbered||convolved)){
          tasks.add(b1.label);
          conv_pair.add(convolution);
          b.toggle = 0;
        }
        else if(b1.pos()&&mousePressed&&!mdown&&(!numbered||convolved)){
          cdown = true;
          mdown = true;
        }
      }
      
      if(cdown)convolve_request();
      
      for(int i=0;i<tasks.size();i++){
        
       String s = tasks.get(i);
       
       text(s,x+10,y+40 +10*i);
      }}
      if(mousePressed&&!mdown) cdown = false;
      if(mousePressed)mdown = true;
      //if(mousePressed&&cdown&&mdown) cdown = false;
      
      
    };
    
    public void box(){
      noStroke();
      if(!transparent)fill(255);
      else fill(255,transparency);
      rect(x,y,w,h);
      rect(x,y2,w2,h2);
      
      fill(0,transparency2);
      rect(x,y2,w2,h2);
      rect(x,y,w,h);
      
    };
    
    public void convolve_request(){
          stroke(0);
          fill(255);
          
          rect(300,300,200,20);
          fill(0);
          text("Please add convolution!",340,315);
    };
    
    public void tasklogic(){
      if(!mousePressed) smdown = false;
    };
    
    public ArrayList<String> string_to_arrayl(String [] a){
      ArrayList<String> temp = new ArrayList<String>();
      
      for (int i=0;i<a.length;i++){
        String s = a[i];
        temp.add(s);
      }
      
      return temp;
    }
  };
  
  public String[][] string_to_array(String [] a){
    String s = "";
    int count = 0;
    for(int i=0;i<a.length;i++){
      if(a[i].length()>0){
      String k = a[i] + ",";
      
      if(a[i].charAt(a[i].length()-1)==',')s += a[i];
      else s += k;
    }}
    
    int char_counter = 0;
    
    ArrayList<String> s1 = new ArrayList<String>();
    
    for(int i=0;i<s.length();i++){
      
      char c = s.charAt(i);
      
      if(c==','){
        String b = s.substring(char_counter,i);
        
        s1.add(b);
        char_counter = i+1;
      }
    }
    
      int wid = s1.size()/a.length;
      String[][] temp = new String [wid][a.length];
      
      for (int j=0;j<a.length;j++){
        
        for (int i=0;i<wid;i++){
        
          int pos = i + j * wid;
          
          temp[i][j] = s1.get(pos);
        
      }}
      
    return temp;
};
  

class TextArea{
  
  int id,toggle,cols,rows,size,t,timer = 20,blkrate = 30,t1 = blkrate,t2 = blkrate,start,end,hcount,index,lindex,vindex = -1,hindex = -1,windex,vpos = 0,hpos,sltcounter,vcount = 0;
  float x,y,w,h,textsize = 12,twidth = 0,posx,posy,tposx,tposy,strposx,strposy,tbwidth,strwidth,strheight,cursorx, cursory,crwidth,totalwidth;
  String label,text,label_backup,cboard = "",value;
  boolean drag,resize,hover,border,background,hidden,fill = true,init,ready,label_bool,clear,copied,tbox = true,tsize = false,parentCanvas;
  Menu toolBox;
  Button child;
  //Slider
  ArrayList<Letter> textbox = new ArrayList<Letter>();
  ArrayList<Letter> tm0 = new ArrayList<Letter>();
  ArrayList<Letter> tm1 = new ArrayList<Letter>();
  String textBox = "";
  String temp = "";
  String stringImport = "";
  String [] backup;
  ArrayList<Integer> counted = new ArrayList<Integer>();
  ArrayList<Integer> lines = new ArrayList<Integer>();
  ArrayList<Integer> dragh = new ArrayList<Integer>();
  //ArrayList<Float> tsize = new ArrayList<Float>();
  Letter b = null;
  int col = color(255),col2 = color(0);
  PVector mouse;
  Window parent;
  
  TextArea(float X,float Y,float WW,float HH,int Cols,int Rows){
    
    x = X;
    y = Y;
    w = WW;
    h = HH;
    cols = Cols;
    rows = Rows;
    totalwidth = w * rows;
    size = textbox.size();
    lines.add(0);
    textsize = 12;
    toolBox = new Menu(x+1,y-20,200-1,20);
  };
  
  TextArea(float X,float Y,float WW,float HH,int Cols,int Rows,String Label){
    
    x = X;
    y = Y;
    w = WW;
    h = HH;
    cols = Cols;
    rows = Rows;
    totalwidth = w * rows;
    textsize = 12;
    size = textbox.size();
    label = Label;
    label_backup = Label;
    lines.add(0);
    label_bool = true;
    //toolBox = new Menu(x+1,y-20,200-1,20);
  };
  
  TextArea(float X,float Y,float WW,float HH,int Cols,int Rows,String []Lines){
    
    x = X;
    y = Y;
    w = WW;
    h = HH;
    cols = Cols;
    rows = Rows;
    
    //String [] text = null;
    //if(BMScontrols.Lines!=null)text = null;
    if(Lines!=null){
      //for(int i=0;i<Lines.length;i++){
        
      //  //String[] space = match(Lines[i],"  ");
      //  //if(space!=null){
      //  //  //Lines.splice(i+1,"")
      //  //  for(int j=0;j<cols;j++){
      //  //    Lines[i]+= " ";
      //  //  }}
      //  //Lines[i] = Lines[i].replace("//+", "\n  ");
      //}
    
      for(int i=0;i<Lines.length;i++){
      textBox += Lines[i];
      for(int j=0;j<Lines[i].length();j++){
      //label_backup += Lines[i];
      //textbox.add(new Letter(str(Lines[i].charAt(j)),x,y));
      //lines.add(i);
      }}
    backup = Lines;
    textsize = 12;
    if(Lines.length> rows){
      rows = floor(Lines.length);
      h = textsize * rows;
      }
    totalwidth = w * rows;
    size = textbox.size();
    tbox = false;
    //toolBox = new Menu(x+1,y-20,200-1,20);
    testcode(textBox);
    }
  };
  
  public void testcode(String a){
      
      //for(
    };
    
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void init(){
    
  };
  
  public void draw(){
    
    twidth = 0;
    box();getCursor();mpos();nav();conditionals();highlight();selectall();toolbox();error();
    //debug();
    if(!tsize)getKey();;
    
    //----------------------------------------------------- amend letters
    float c1 = 0;
    int cindex = -1;
    
    for(int i=0;i<textBox.length();i++){
      
      
      //text(textbox.get(i).l,x+ 10 *i,y);
       Letter a = null;
       String b = str(textBox.charAt(i));
       
      if(textbox.size()==textBox.length()){a = textbox.get(i);}
        else{a = new Letter(b,x,y);textbox.add(a);}
      
      if(a!=null){
        if(c1 + a.w > w)c1=0;
        if(c1==0){cindex++;
        a.id = i;
        a.vpos = cindex;
        boolean k = lines.contains(i);
        if(!k)lines.add(i);
      }
      }
      
      if(a==null&&b!=null){
        a = new Letter(b,x,y);
        if(a.id!=i)a.id = i;
        a.y = y + cindex*textsize;
        a.x = x+c1;
        a.vpos = cindex;
        textbox.add(a);
      }
      
      if(a.l!=b){ 
      textbox.get(i).l = b;
      a.w = textWidth(b);
      if(a.id!=i)a.id = i;
      a.y = y + cindex*textsize;
      a.x = x+c1;
      a.vpos = cindex;
      }
      fill(a.col2);
      text(a.l,a.x,a.y+textsize);
      c1 += textWidth(a.l);
      
      if(selectAll&&toggle==1&&dragh.size()==textBox.length()){
        
        if(dragh.get(i)!= i) dragh.set(i,i);
      }}
    
    //-------------------------------------------------
    
        for(int j=0;j<dragh.size();j++){
            Letter b = null;
            if(j<dragh.size()-1){
              if(dragh.get(j)<textbox.size()){
              b = textbox.get(dragh.get(j));
              fill(0,0,255,125);
              noStroke();
              rect(b.x,b.y,b.w,b.h);
          }}}
        if(!mousePressed){
          //dragh = new ArrayList<Integer>();
        }
        strokeWeight(1);
  };
  
  public void draw(PGraphics canvas){
    
    twidth = 0;
    box();getCursor(canvas);mpos(mouse);nav();conditionals(canvas);highlight(canvas);selectall();toolbox(canvas);error(canvas);
    //debug();
    if(!tsize)getKey();;
    
    //----------------------------------------------------- amend letters
    float c1 = 0;
    int cindex = -1;
    
    for(int i=0;i<textBox.length();i++){
      //text(textbox.get(i).l,x+ 10 *i,y);
       Letter a = null;
       String b = str(textBox.charAt(i));
       
      if(textbox.size()==textBox.length()){a = textbox.get(i);}
        else{a = new Letter(b,x,y);textbox.add(a);}
      
      if(a!=null){
        if(c1 + a.w > w)c1=0;
        if(c1==0){cindex++;
        a.id = i;
        a.vpos = cindex;
        boolean k = lines.contains(i);
        if(!k)lines.add(i);
      }
      }
      
      if(a==null&&b!=null){
        a = new Letter(b,x,y);
        if(a.id!=i)a.id = i;
        a.y = y + cindex*textsize;
        a.x = x+c1;
        a.vpos = cindex;
        textbox.add(a);
      }
      
      if(a.l!=b){ 
      textbox.get(i).l = b;
      a.w = textWidth(b);
      if(a.id!=i)a.id = i;
      a.y = y + cindex*textsize;
      a.x = x+c1;
      a.vpos = cindex;
      }
      canvas.fill(a.col2);
      canvas.text(a.l,a.x,a.y+textsize);
      c1 += textWidth(a.l);
      
      if(selectAll&&toggle==1&&dragh.size()==textBox.length()){
        
        if(dragh.get(i)!= i) dragh.set(i,i);
      }}
    
    //-------------------------------------------------
    
        for(int j=0;j<dragh.size();j++){
            Letter b = null;
            if(j<dragh.size()-1){
              if(dragh.get(j)<textbox.size()){
              b = textbox.get(dragh.get(j));
              canvas.fill(0,0,255,125);
              canvas.noStroke();
              canvas.rect(b.x,b.y,b.w,b.h);
          }}}
        if(!mousePressed){
          //dragh = new ArrayList<Integer>();
        }
        canvas.strokeWeight(1);
  };
  
  public void selectall(){
    
    if(toggle==1&&ctrl==1&&selectAll){
      fill(0);
      text("Select all", 100,200);
    }
  };
  
  public String getValue(){
    return textBox;
  };
  
  public ArrayList getObject(){
    return textbox;
  };
  
  public void regex(){
    
  };
  
  public void toolbox(){
    //tbox = true;
    if(tbox){
      stroke(col);
      fill(col2);
      toolBox.draw();
      // btn quote
      // btn Bold
      // btn Italic
      // btn Underlined
      // btn Link
      // btn Quotes
      // btn Html tag
      // btn Picture
      // btn Bulletpoints
      // btn Numbered
      // btn Smiley
      // btn Calendar
      // btn Options
      
    }
    
  };
  
  public void toolbox(PGraphics canvas){
    //tbox = true;
    if(tbox){
      canvas.stroke(col);
      canvas.fill(col2);
      toolBox.draw();
      // btn quote
      // btn Bold
      // btn Italic
      // btn Underlined
      // btn Link
      // btn Quotes
      // btn Html tag
      // btn Picture
      // btn Bulletpoints
      // btn Numbered
      // btn Smiley
      // btn Calendar
      // btn Options
      
    }
    
  };
  
  public void highlight(){
    float c = 0;
        int d = 0;
      
      if(textbox.size()>0){
        
        for(int i=0;i<textbox.size();i++){
          Letter a = textbox.get(i);
          noStroke();
          if(a.pos()){a.col = color(255,255,0);fill(a.col);rect(a.x,a.y,a.w,a.h);}
          else a.col  = color(0);
          if(mousePressed&&a.pos()){
            vindex = a.vpos;
            hindex = a.id;
            cursorx = a.x-x+a.w;
            cursory = a.y;
            boolean n = dragh.contains(i);
            if(!n) dragh.add(i);
            //text(a.id,a.x + x,a.y);
          }}}
  };
  
  public void highlight(PGraphics canvas){
    float c = 0;
        int d = 0;
      
      if(textbox.size()>0){
        
        for(int i=0;i<textbox.size();i++){
          Letter a = textbox.get(i);
          canvas.noStroke();
          if(a.pos(mouse)){a.col = color(255,255,0);canvas.fill(a.col);canvas.rect(a.x,a.y,a.w,a.h);}
          else a.col  = color(0);
          if(mousePressed&&a.pos(mouse)){
            vindex = a.vpos;
            hindex = a.id;
            cursorx = a.x-x+a.w;
            cursory = a.y;
            boolean n = dragh.contains(i);
            if(!n) dragh.add(i);
            //text(a.id,a.x + x,a.y);
          }}}
  };
  
  public void getKey(){
   
    if(pos()||toggle==1){
    String clipboard = null;
    Letter current = null;
    
    String a = getChar();
    String tm = "";
    String tm2 = "";
    tm0 = new ArrayList<Letter>();
    tm1 = new ArrayList<Letter>();
    float current_width = textWidth(textBox);
    
    if(textbox.size()>0&&hindex!=-1)current = textbox.get(hindex);
    if(textbox.size()>0&&hindex==-1)current = textbox.get(textbox.size()-1);
    
    if(clipboard_toggle==0)cboard = "";
    
    if(cboard != clipBoard&&copy_clipboard){ clipboard = clipBoard;cboard = clipBoard;}
    else{ clipboard = null;}
    
    if(!copy_clipboard&&clipboard_toggle==0){
      
        timer --;
        Letter l = null;
        
        if(a!=null) l = new Letter(a,x+strwidth,y + vcount * textsize);
        if(a!=null&&timer%5==0&&!exclusion()&&key!=BACKSPACE&&(current_width+ l.w<totalwidth)){
          
          l.id = hindex +1;
          
          if(hindex==-1){
            if(textbox.size()==0){
              l.y = y;
              l.x = x;
              textbox.add(l);
              textBox += a;
            }
              else if(l.vpos < rows||l.x+l.w<x+w){
              l.y = y + vcount * textsize;
              cursory = l.y;
              textbox.add(l);
              textBox += a;
              
          }}else{
            
            Letter end = textbox.get(textbox.size()-1);
            Letter n = new Letter(a,cursorx,cursory);
            if((hindex!=textbox.size()-1||hindex!=-1)&&timer%5==0){
              
            Letter b = textbox.get(hindex);
            l.id = b.id ;
            
            n.x = cursorx ;
            if(hindex-1> 0)l.y = y + textbox.get(hindex-1).vpos * textsize;
                else l.y = y; cursory = y;
                
            if(hindex<textBox.length())tm = textBox.substring ( 0, hindex + 1);
            tm += a;
            if(hindex<textBox.length())tm2  = textBox.substring ( hindex + 1, textBox.length()  );
            textBox = tm + tm2;
            hindex ++;
            if(hindex < textbox.size()-1)cursorx = textbox.get(hindex+1).x;
          }}
          
          if(timer<=0){
            timer = 21;
          }}
        else if(keyPressed && key==BACKSPACE&&timer%5==0){delete();}
    }
    else if(copy_clipboard&&clipboard_toggle==1&&timer%5==0&&!tsize){
      
            if(timer<=0){
              timer = 21;
            }
            if(hindex>-1){
            if(hindex<textBox.length())tm = textBox.substring ( 0, hindex + 1  );
            if(hindex<textBox.length())tm2  = textBox.substring ( hindex + 1, textBox.length()  );
            tm += cboard;
            tm += tm2;
            
            textBox = tm;
         }else{
             
              for (int i=0;i<cboard.length();i++){
                String b = str(cboard.charAt(i));
                textBox += b;
              }}}}
  };
  
  public void error(){
    
    if(clipBoard.length()>0&&textWidth(clipBoard)+textWidth(textBox)*textsize/12>w*(rows-1)&&copy_clipboard&&clipboard_toggle==1){tsize = true;}
    
    if(toggle==1||pos()){
          if(tsize){
              String message = "ClipBoard too large";
              float l = textWidth(message);
              stroke(0);
              fill(255);
              rect(W/2-l/2+200,H/2-textsize,l*2,textsize*2);
              fill(0);
              text(message,W/2+200,H/2);
          
          }
          
          if(tsize&&mousePressed)tsize = false;
    }
  };

public void error(PGraphics canvas){

  if(clipBoard.length()>0&&textWidth(clipBoard)+textWidth(textBox)*textsize/12>w*(rows-1)&&copy_clipboard&&clipboard_toggle==1){tsize = true;}
    
  if(mouse!=null&&(toggle==1||pos(mouse))){
          if(tsize){
              String message = "ClipBoard too large";
              float l = textWidth(message);
              canvas.stroke(0);
              canvas.fill(255);
              canvas.rect(W/2-l/2+200,H/2-textsize,l*2,textsize*2);
              canvas.fill(0);
              canvas.text(message,W/2+200,H/2);
          
          }
          
          if(tsize&&mousePressed)tsize = false;
    }
};

  public void getCursor(){
    
    getClick();
    
    if(hindex==-1){
      if(textbox.size()==0){
        cursory = y;
        cursorx = 1;
        vindex = 0;
      }else{
      if(textbox.size()>0&&hindex<textbox.size()){
      cursory = y + textbox.get(textbox.size()-1).vpos * textsize;
      cursorx = textbox.get(textbox.size()-1).x + textbox.get(textbox.size()-1).w*(textsize/12)-x;
      }
    }}
    if(hindex>-1){
      if(textbox.size()>hindex+1){
      cursorx = textbox.get(hindex).x + textbox.get(hindex).w*(textsize/12) - x;
      cursory = y + textbox.get(hindex).vpos * textsize;
    }}
    if(pos()||toggle==1){
      cursor(POINT);
        if(t1>0){
          t1 --;
          if(strheight<y+h){
          stroke(0);
          strokeWeight(1);
          line(x+cursorx,cursory ,x+cursorx,cursory+textsize);
          }
        if(t1<=0)t2 = blkrate;
        }
        if(t2>0&&t1<=0){
          t2--;if(t2<=0)t1 = blkrate;
          }}
          else {
            cursor(ARROW);
          }
  };
  
  public void getCursor(PGraphics canvas){
    
    getClick();
    
    if(hindex==-1){
      if(textbox.size()==0){
        cursory = y;
        cursorx = 1;
        vindex = 0;
      }else{
      if(textbox.size()>0&&hindex<textbox.size()){
      cursory = y + textbox.get(textbox.size()-1).vpos * textsize;
      cursorx = textbox.get(textbox.size()-1).x + textbox.get(textbox.size()-1).w*(textsize/12)-x;
      }
    }}
    if(hindex>-1){
      if(textbox.size()>hindex+1){
      cursorx = textbox.get(hindex).x + textbox.get(hindex).w*(textsize/12) - x;
      cursory = y + textbox.get(hindex).vpos * textsize;
    }}
    if(pos(mouse)||toggle==1){
      cursor(POINT);
        if(t1>0){
          t1 --;
          if(strheight<y+h){
          canvas.stroke(0);
          canvas.strokeWeight(1);
          canvas.line(x+cursorx,cursory ,x+cursorx,cursory+textsize);
          }
        if(t1<=0)t2 = blkrate;
        }
        if(t2>0&&t1<=0){
          t2--;if(t2<=0)t1 = blkrate;
          }}
          else {
            cursor(ARROW);
          }
  };
  
  public void delete(){
    Letter current = null;
    
    if(textbox.size()>0&&hindex!=-1)current = textbox.get(hindex);
    if(textbox.size()>0&&hindex==-1)current = textbox.get(textbox.size()-1);
    
    String tm1 = "",tm2 = "";
    String tma;
    
    if(keyPressed && key == BACKSPACE){
      if(hindex==-1){
        if(current!=null&&current.id>0){
          //text
          if(lines.get(lines.size()-1) > current.id-1) lines.remove(lines.size()-1);
          if(lines.size()-1>0&&current.vpos<lines.size()-1){
              vcount --;
              lines.remove(lines.size()-1);
          }
          hindex = current.id;
          textbox.remove(textbox.size()-1);
          textBox = textBox.substring ( 0, textBox.length()-1  );
        }else{
          textbox = new ArrayList<Letter>();
          textBox = "";
        }
      }
      else{
        if(current!=null&&current.id>-1){
          if(current!=null&&lines.get(lines.size()-1) > textbox.get(textbox.size()-1).id-1) lines.remove(lines.size()-1);
          if(lines.size()>0&&textbox.get(textbox.size()-1).vpos<lines.size()-1){
              vcount --;
              lines.remove(lines.size()-1);
          }
          hindex = current.id-1;
          
          textbox.remove(textbox.size()-1);
          if(current.id >0){
            tm1 = textBox.substring ( 0, hindex+1 );
            tm2 = textBox.substring ( hindex +2, textBox.length()  );
          }else if(current.id==0){
            tm1 = "";
            tm2 = textBox.substring ( 0, textBox.length()  );
          }
          textBox = tm1 + tm2;
          
        }}}
    
  };
  
  public void paste(){
    
    for(int i=0;i<cboard.length();i++){
      String a = str(cboard.charAt(i));
      getKey();
    }
    
  };
  
  public void box(){
    if(!hidden){
      //------------------------------- border
      if(border)stroke(col2);
      else noStroke();
      //-------------------------------label
      if(label!=null){
        fill(col2);
        text(label,x,y+textsize);
      }
      //---------------------------------fill
      if(fill)if(pos())fill(col);else fill(0);
        else noFill();fill(col);
      
      rect(x,y,w,h);
      }
  };
  
  public Letter sort(ArrayList<Letter>a){
    Letter k = a.get(0);
    
    for(int i=0;i<a.size();i++){
      
      if(k.id>a.get(i).id){
        k = a.get(i);
      }}
    return k;
  };
  
  public void conditionals(){
    
    if(vpos<=0) vpos = 0;
    
    if(selectAll&&toggle==1){
        if(dragh.size()!=textBox.length())dragh.add(0);
      }
     
    if(keyPressed){timer --;}
    else timer = 20;
    if(lines.size()>rows)lines.remove(lines.size()-1);
    if(lines.size()<=1)vcount = 0;
    if(toggle==1)clear = true;
    if(mousePressed&&!pos()){
        //vindex = -1;
        hindex = -1;
      }
      if(mousePressed&&pos()){toggle=1;}
  };
  
  public void conditionals(PGraphics canvas){
    
    if(vpos<=0) vpos = 0;
    
    if(selectAll&&toggle==1){
        if(dragh.size()!=textBox.length())dragh.add(0);
      }
     
    if(keyPressed){timer --;}
    else timer = 20;
    if(lines.size()>rows)lines.remove(lines.size()-1);
    if(lines.size()<=1)vcount = 0;
    if(toggle==1)clear = true;
    if(mousePressed&&!pos(mouse)){
        //vindex = -1;
        hindex = -1;
      }
      if(mousePressed&&pos(mouse)){toggle=1;}
  };
  
  public void constants(){
    strheight = (floor(textWidth(textBox)/(w)));
    strwidth = ((textWidth(textBox))%(w));
  };
  
  public boolean exclusion(){
    boolean k = false;
    
    if(keyCode==37||keyCode==38||keyCode==39||keyCode==40||keyCode==33||keyCode==34||keyCode==17||keyCode==18||keyCode==9||
       keyCode==20||keyCode==16||keyCode==255||keyCode==91||keyCode==36||keyCode==35||keyCode==45||keyCode==46||keyCode==8){
      k = true;
    }
    return k;
  };
  
  public void select_All(){
    if(selectAll){
      
    }
  };
  
  public void debug(){
    fill(255);
    text(textbox.size(),140,80);
    text(backup.length,140,90);
    text(totalwidth,140,100);
    //text(currentwidth,140,110);
    
    text("lines " + lines.size(),140,150);
    if(hindex>-1){text(hindex,140,120);}
    else {text(hindex,140,120);}
    if(vcount>-1)text(vcount,140,130);
    //if(clipBoard!=""){text(clipBoard,140,100);}
    for(int i=0;i<lines.size();i++){
      text(lines.get(i),x+x,y+textsize+10*i);
    }
  };

  
  
  public String getChar(){
    String a = null;
    
    if(keyPressed){
      a  = str(key);
    }
    if(keyCode==9) a = null;
    
    return a;
    
  }
  public char getchar(){
    char a = '¬';
    
    if(keyPressed){
      a  = PApplet.parseChar(key);
    }
    if(keyCode == 8){
      
    }
    pos();
    return a;
    
  };
  
  public boolean pos(){
    
    float X = mouseX;
    float Y = mouseY;
    
    return X > x && X < x + w && Y > y && Y < y + h; 
  };
  
  public boolean pos(PVector m){
    
    float X = m.x;
    float Y = m.y;
    
    return X > x && X < x + w && Y > y && Y < y + h; 
  };
  
  public void calc_lwidth(){
    for (int i=0;i<strheight+1;i++){
      for(int j=0;j<w;j++){
        
        
    }}
  };
  
  public void insert(){
    if(hindex>-1){
      
    }else{
      
    }
  };
  
  public void mpos(){
    float X = mouseX;
    float Y = mouseY;
    float ww = w/cols;
    float hh = h/rows;
    
    if(pos())posx = floor(X/ww)*ww-10;posy = floor(Y/hh)*hh;
  };
  
  public void mpos(PVector m){
    float X = m.x;
    float Y = m.y;
    float ww = w/cols;
    float hh = h/rows;
    
    if(pos(m))posx = floor(X/ww)*ww-10;posy = floor(Y/hh)*hh;
  };
  
  public void getClick(){
  if(pos() && mousePressed)toggle=1;
  if(!pos()&& mousePressed)toggle=0;
  //if(toggle==2)toggle=0;
  };
  
  public void getClick(PVector m){
  if(pos(m) && mousePressed)toggle=1;
  if(!pos(m)&& mousePressed)toggle=0;
  //if(toggle==2)toggle=0;
  };
  
  public void nav(){
    if(hindex>=textbox.size()-1){hindex  =-1;}
    if(textbox.size()>0){
      if(hindex>=1){
    if(keyPressed && keyCode == 37 &&timer%5==0){hindex --;}}
    if(hindex<=textbox.size()-1&&hindex>-1){
    if(keyPressed && keyCode == 39 &&timer%5==0){ hindex ++;}}
    //if(keyPressed && key == UP && strheight >0) hindex += vpos *2;
    //if(keyPressed && key == DOWN && strheight )
    
    if(hindex==-1){
      if(keyPressed && keyCode == 37 &&timer%5==0){hindex = textbox.size()-2;}
      //if(keyPressed && keyCode == 39 &&timer%5==0){ hindex = 0;}
    }
    
    
    }
  };
  
};

class Letter{
  
  int id,vpos,hpos;
  float x,y,w,h,tsize;
  String l;
  int col = color(255,0);
  int col2 = color(0,0);
  boolean visible = true;
  
  Letter(String ll,float xx, float yy){
    x = xx;
    y = yy;
    l = ll;
    w = textWidth(l);
    h = 12;
  };
  
  public boolean pos(){
    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
  }
  
  public boolean pos(PVector m){
    return m.x>x&&m.x<x+w&&m.y>y&&m.y<y+h;
  }
};

// --------------------------------------------------------------

 
ArrayList<Window> windows = new ArrayList<Window>();
ArrayList<Menu> menus = new ArrayList<Menu>();
ArrayList<Button> buttons = new ArrayList<Button>();
ArrayList<Slider> Sliders = new ArrayList<Slider>();
ArrayList<Quad> qgrid = new ArrayList<Quad>();
ArrayList<Quad> fields = new ArrayList<Quad>();
ArrayList<PImage> images = new ArrayList<PImage>();
ArrayList<Boundary> boundaries = new ArrayList<Boundary>();
ArrayList<TextArea> textboxes = new ArrayList<TextArea>();
ArrayList<TextBox> textb = new ArrayList<TextBox>();

ArrayList<Entity> entities = new ArrayList<Entity>();
String[] Lines ;
String hello = "hello";
int W = 1200, H = 660,gw = 25,gh = 20,clipboard_toggle,ctrl=0,totalraces;
int backgroundcol = 51;
boolean gridtype,restart,open_menus,Terrain3d = false,xdown,ydown,leftdown,copy_clipboard,selectAll,pastedown,Qgrid = false,wrap = false,globaldown,
        camOpen,gridCreated;
float kkkk = 0.1f;
String clipBoard=""; 
String[] cameras = Capture.list();
Button btn1,btn2,btn3,reset,attractor,grid,d2_plot,d3_plot,btn4,btn5,btn6,btn7,btn8,btn9,yes,no;
Button btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19;
Button btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29;
Button btn30, btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39;
Button btn40, btn41,btn42,btn43,btn44,btn45,btn46,btn47,btn48,btn49;
Button btn50, btn51,btn52,btn53,btn54,btn55,btn56,btn57,btn58,btn59;
Button btn60, btn61,btn62,btn63,btn64,btn65,btn66,btn67,btn68,btn69;
Button btn70, btn71,btn72,btn73,btn74,btn75,btn76,btn77,btn78,btn79,
       btn80, btn81,btn82,btn83,btn84,btn85,btn86,btn87,btn88,btn89,
       btn90, btn91,btn92,btn93,btn94,btn95,btn96,btn97,btn98,btn99;
Slider sld1,sld2,sld3,sld4,sld5,sld6,sld7,sld8,sld9,
       sld10,sld11,sld12,sld13,sld14,sld15,sld16,sld17,sld18,sld19,
       sld20,sld21,sld22,sld23,sld24,sld25,sld26,sld27,sld28,sld29,
       sld30,sld31,sld32,sld33,sld34,sld35,sld36,sld37,sld38,sld39,
       sld40,sld41,sld42,sld43,sld44,sld45,sld46,sld47,sld48,sld49;
Button grav;
Window header,main,rightmenu,leftmenu,footer;
TextArea textb1,textb2,textb3,textb4,textb5,textb6,textb7,textb8,textb9,textb10,textb11,textb12,textb13;
TextBox txtb1, txtb2,txtb3, txtb4, txtb5, txtb6, txtb7, txtb8, txtb9, txtb10;
Grid g,g2,gterrain,gplain;
GridImg gimg;
Cam gcam;
Entity humans,plants,animals, minerals,metals;
Boundary lines;
Boundary l1 = new Boundary(20,20,100,100,4);
Plot_2D plot;
Menu file,gridbox,plotbox,reset_dialogue,shapes,physics,mapMenu,Entities_sub,menu1,imgsliderMenu,sliderMenu,
     neuralNetworkMenu,Entities_debug,Entities_sublist,twitter;
rgb_Slider rgb_slider;
int bgcol = color(50);
Capture Cam;
sliderBox sliderbox,fRate,imgsliderList, cammenuList;
listBox list1,shapesList;
Window fmenu;
Attractor attractors;
Dropdown d1,d2;
//horizontaltabs navigator;
horizontaltabs tab;
TwitterKeyword twitterKeywords;
class vectorText{
  
  String [] text = null;
  String Sentence = "",sentence = "",Text="";
  ArrayList<String> Sentences = new ArrayList<String>();
  ArrayList<Integer> sentences = new ArrayList<Integer>();
  
  ArrayList<ArrayList<String>> words = new ArrayList<ArrayList<String>>();
  ArrayList<Word> Words = new ArrayList<Word>();
  ArrayList<String> words1d = new ArrayList<String>();
  ArrayList<String> words1dsingle = new ArrayList<String>();
  
  int sentence_counter = 0, word_counter = 0,word_total,char_counter,char_counter2,char_counter3,counter,counter2,counter3,mid,
      nonRep_words,char_total,space_total;
  boolean init = true;
  
  vectorText(String a){
    sentence = a;
  };
  
  vectorText(String [] a){
    text = a;
  };
  
  public void classString(){
    
    words.add(new ArrayList<String>());
    if(sentence_counter<sentence.length()){
      
    for(int i=0;i<sentence.length();i++){
      
      char a = sentence.charAt(i);
      
      if(a==' '||i==sentence.length()-1){
        String b = "";
        if(a==' ')b += sentence.substring(word_counter,i);
        else b += sentence.substring(word_counter,i+1);
        words.get(0).add(b);
        //sentence = sentence.substring(i,sentence.length());
        word_counter=i;
        if(i==0);word_counter =0;
        System.out.println(b);
      }
      sentence_counter ++;
    }}
    
    mid = floor(sentence.length()/2);
    float cursorx = 0;
    for(int i=0;i<words.size();i++){
      String a = words.get(0).get(i);
      
      int dy = mid - i;
      
      //text(dy,10,20+10*i);
      
      Word w = new Word(dy,0,i,cursorx,a.length(),a);
      
      if(!Words.contains(w))Words.add(w);
      cursorx+= textWidth(a);
    }
  };

  public void classString(String sentence){
    
    String temp = "";
    words.add(new ArrayList<String>());
    if(sentence_counter<sentence.length()){
      
    for(int i=0;i<sentence.length();i++){
      
      char a = sentence.charAt(i);
      
      if(a==' '||i==sentence.length()-1){
        String b = "";
        if(a==' ')b += sentence.substring(word_counter,i);
        else b += sentence.substring(word_counter,i+1);
        words.get(0).add(b);
        word_counter=i;
        if(i==0);word_counter =0;
        System.out.println(b);
      }
      sentence_counter ++;
    }}
    
    mid = floor(sentence.length()/2);
    float cursorx = 0;
    for(int i=0;i<words.size();i++){
      String a = words.get(0).get(i);
      
      int dy = mid - i;
      
      text(dy,10,20+10*i);
      
      Word w = new Word(dy,0,i,cursorx,a.length(),a);
      
      if(!Words.contains(w))Words.add(w);
      cursorx += textWidth(a);
    }
  };

  public void classText(){
    
    if(text!=null&&sentence_counter<text.length){
      
      for(int j=0;j<text.length;j++){
        Text+= text[j];
        sentence_counter++;
      }}
      
      if(counter<Text.length()){
        
      for(int i=0;i<Text.length();i++){
        
        counter ++;
        
      char a = Text.charAt(i);
      String b = "";
      
      if(a=='.'){
        
        if(a=='.')b = Text.substring(char_counter,i+1);
        char_counter=i+1;
        Sentences.add(b);
        words.add(new ArrayList<String>());
        
      }
      else if(i==Text.length()-1){
        b = Text.substring(char_counter,i);
        char_counter=i;
        Sentences.add(b);
        words.add(new ArrayList<String>());
      }
      System.out.println(b);
      
    }}else if(counter2<Sentences.size()){
      
    for(int i=0;i<Sentences.size();i++){
      
      String s = Sentences.get(i);
      char_counter2 = 0;
      
      for(int j=0;j<s.length();j++){
        
        char a = s.charAt(j);
        
        counter2++;
        String b = "";
        
      if(a==','){
        b = s.substring(char_counter2,j);
        words.get(i).add(b);
        
        words1d.add(b);
        char_counter2=j;
      }if(a==' '){
        b = s.substring(char_counter2,j);
        char_counter2 = j;
        words.get(i).add(b);
        words1d.add(b);
        word_total++;
      }else if(a=='.'){
        b = s.substring(char_counter2,j);
        char_counter2 = j;
        words.get(i).add(b);
        words1d.add(b);
        words.get(i).add(".");
        words1d.add(".");
      }
      
      
    };counter2++;}}else if(Words.size()<words1d.size()){
      
      for(int i=0;i<words.size();i++){
      
      ArrayList<String> s = words.get(i);
      char_counter2 = 0;
      
      mid = floor(s.size()/2);
      float cursorx = 0;
      for(int j=0;j<s.size();j++){
        
        String a = s.get(j);
        
        Word word = new Word(j - mid,j,i,cursorx,a.length(),a);
        cursorx += textWidth(a);
        Words.add(word);
    }}}
  };

  public void classTextsp(){
    
    if(sentence_counter<text.length){
      
      for(int j=0;j<text.length;j++){
        Text+= text[j];
        sentence_counter++;
      }}
      
      if(counter<Text.length()){
        
      for(int i=0;i<Text.length();i++){
        
        counter ++;
        
      char a = Text.charAt(i);
      String b = "";
      
      if(a=='.'){
        
        if(a=='.')b = Text.substring(char_counter,i+1);
        char_counter=i+1;
        Sentences.add(b);
        words.add(new ArrayList<String>());
        
      }
      else if(i==Text.length()-1){
        b = Text.substring(char_counter,i);
        char_counter=i;
        Sentences.add(b);
        words.add(new ArrayList<String>());
      }
      System.out.println(b);
      
    }}else if(counter2<Sentences.size()){
      
    for(int i=0;i<Sentences.size();i++){
      
      String s = Sentences.get(i);
      char_counter2 = 0;
      
      for(int j=0;j<s.length();j++){
        
        char a = s.charAt(j);
        
        counter2++;
        String b = "";
        
      if(a==','){
        b = s.substring(char_counter2,j);
        words.get(i).add(b);
        words1d.add(b);
        if(!words1dsingle.contains(b))words1dsingle.add(b);
        char_counter2=j;
        word_total ++;
        char_total++;
      }if(a==' '){
        b = s.substring(char_counter2,j);
        char_counter2 = j;
        words.get(i).add(b);
        words1d.add(b);
        word_total++;
        space_total ++;
      }else if(a=='.'){
        b = s.substring(char_counter2,j);
        char_counter2 = j;
        words.get(i).add(b);
        words1d.add(b);
        words.get(i).add(".");
        words1d.add(".");
        word_total ++;
        char_total ++;
      }
      
      
    };counter2++;}}else if(Words.size()<words1d.size()){
      
      for(int i=0;i<words.size();i++){
      
      ArrayList<String> s = words.get(i);
      char_counter2 = 0;
      
      mid = floor(s.size()/2);
      float cursorx = 0;
      for(int j=0;j<s.size();j++){
        
        String a = s.get(j);
        
        Word next = new Word(j - mid,j,i,cursorx,a.length(),a);
        cursorx += textWidth(a);
        if(!Words.contains(next))Words.add(next);
        else {
          
          int k = Words.indexOf(next);
          Word word =  Words.get(k);
          word.xpos.add(next.x);
          word.ypos.add(next.y);
          word.variance.add(next.p);
          
        }
    }}}
  };

  public void readText(){
      fill(255);
      text(counter,10,10);
      text(Text.length(),10,20);
      text(words1d.size(),10,30);
    
    for(int i=0;i<words.size();i++){
      
      ArrayList<String> s = words.get(i);
      
      float cursorx = 0;
      for(int j=0;j<s.size();j++){
        String s2 = s.get(j);
        
        //text(int(cursorx) ,10 + cursorx,90+10*i);
        
        //text(s2 +" " + j, cursorx,230+10*i);
        text(s2, cursorx,230+10*i);
        cursorx += textWidth(s2) -1;
        //else cursorx += 1000;
        
        
      }}
    
    //for(int i=0;i<Sentences.size();i++){
    //  String s = Sentences.get(i);
    //  fill(255);
    //  text(s,10,90+10*i);
    //}
    
    //for(int i=0;i<words1d.size();i++){
    //  String s = words1d.get(i);
      
    //  text(s,10,90+10*i);
    //}
  };

  class Word{
    
    int x,y,p;
    float w,l;
    String a;
    ArrayList<Integer> xpos = new ArrayList<Integer>();
    ArrayList<Integer> ypos = new ArrayList<Integer>();
    ArrayList<Integer> variance = new ArrayList<Integer>();
    ArrayList<Integer> pos = new ArrayList<Integer>();
    
    Word(int pp,int xx,int yy,float ww,int ll,String aa){
      x = xx;
      y = yy;
      a = aa;
      p = pp;
      variance.add(pp);
      xpos.add(xx);
      ypos.add(yy);
      w = ww;
      l = ll;
      
    };
    
    
  };

};
class Vehicle{
  
  Vehicle(){
    
  };
  
  public void draw(){
    
  };
  
  public void update(){
    
  };
  
  public void keys(){
    
  };
  
  public void interact(){
    
  };
  
  
};
class Cam extends Grid {

  boolean camtoggle;
  String []camboxLabels = {"Normal", "Hide", "Graph", "Attractor", "Forward", "Backwards", 
    "Pause", "Heading", "Save", "Load", "Contour", "Mouse", "Reset", 
    "Populate Boundaries", "Spawn Entities", "Debug"};

  String [] camsliderMenuLabels = {"Conv up","Conv right","Conv  down","Conv left",
                                    "Threshold","conv","mdist","convvp","convvn",
                                    "convhp","convhn"};
  Menu cambox;
  Capture cam;
  sliderBox camsliderMenu;

  Cam() {
  };

  Cam(float X, float Y, float W, float H) {

    x = X;
    y = Y;
    w = W;
    h = H;

    cambox = new Menu(width - 110, H/2, 70, camboxLabels);
    cambox.draggable = true;
    camera = true;
    
    camsliderMenu = new sliderBox(60,400,90,5,camsliderMenuLabels);
  };

  public void save() {
  };

  public void load() {
  };

  public void cam_draw() {
    if (BMS.Cam!=null&&toggle) {
      cambox.draw();
      camsliderMenu.draw();
      if (normal_cam) normal_cam();
    }
  };

  public void cam_functions() {
    //event_listener();
    cam_init();
    cam_draw();
  };

  public void cam_init() {
    if (toggle&&BMS.Cam.available() == true) BMS.Cam.read();

    if (!cm_init&&toggle) {
      BMS.Cam.start();
      cam = BMS.Cam;
      camrows = BMS.Cam.height;
      camcols = BMS.Cam.width;
      camw = BMS.Cam.width;
      camh = BMS.Cam.height;
    }

    if (!toggle)BMS.Cam.stop();
    else BMS.Cam.start();

    if (toggle&&Cam!=null) {

      if (camsquares.size()<100) {
        for (int yy = 0; yy < BMS.Cam.height; yy++) {
          for (int xx = 0; xx< BMS.Cam.width; xx++) {
            int num = xx + yy * BMS.Cam.width;

            Grid_space a = new Grid_space(x+xx, y+yy, 1, 1, num, xx, yy);
            a.col = bgcol;
            a.webcam = true;
            //a.parent = this;
            camsquares.add(a);
          }
        }
      } else init = true;
    }

    //if(reset) init = false;
  };

  public void normal_cam() {
    if (toggle) {
      //image(BMS.Cam, x, y);
      logic();
    }
  };

  public void linedetect_cam() {
    cam = BMS.Cam;
    cam.loadPixels();
    for (int i=1; i<camsquares.size(); i++) {
      float r = 0, g = 0, b = 0, alpha;

      Grid_space a = camsquares.get(i);

      float d = dist(a.x, a.y, mouseX, mouseY);
      float m = map(d, 0, 100, 1, 255);

      //r = red(pos)*m;
      //g = green(pos)*m;
      //b = blue(pos)*m;
      r = red(a.col);
      g = green(a.col);
      b = blue(a.col);
      alpha = alpha(a.col)*m;

      cam.pixels[a.id] = color(r, g, b, 255-m);
    }

    cam.updatePixels();
    image(cam, 0, 0);
  };
};
class Window extends Scene{
  
  //float x,y,w,h;
  float bw,bh, navheight = 50,deltay,transparency = 200,transparency1 = 50,transparency2 = 80,transparency3 = 100,transparency4 = 150;
  String label;
  int type = 0,index = -1,click,windex = -1,level = 0,wid;
  int main = color(0);
  int navcol = main,quicknavcol = main,fcol = main,bcol = main,xcol = main,quickNavItemcol = main,navItemcol = main,buttoncol = main,selectcol = main;
  //boolean drag,resize,hover,border,background,hidden,fill = true;
  Button child;
  Menu parent;
  
  float bsize = 12,tsize = 12,svalue,svalue2,colwidth = 100,rowheight = 80;;
  
  boolean smdown,ddown,amendslider,initB,launchable = true,quickAccess,navtoggle = true,transparent;
  public boolean show,open,close;
  ArrayList<Button> buttons = new ArrayList<Button>();
  ArrayList<Button> quicknav = new ArrayList<Button>();
  ArrayList<Button> buttongrid = new ArrayList<Button>();
  ArrayList<Slider> sliders = new ArrayList<Slider>();
  ArrayList<Window> windows = new ArrayList<Window>();
  ArrayList<PVector> track = new ArrayList<PVector>();
  ArrayList<String> Links = new ArrayList<String>();
  //sliderBox sliders;
  String []list;
  String link,currentp,back,forward,currentl,currentf;
  float [] window;
  int wcol = color(255,50);
  
  Window(){
    
  };
  
  Window(float X,float Y,float WW,float HH){
    
    x = X;
    y = Y;
    w = WW;
    h = HH;
    
    x1 = x;
    y1 = y;
    x2 = x + w;
    y2 = y + h;
    fill = true;
    //scene = new Sc
    
  };
  
  Window(float xx, float yy, float ww,float hh,String dir){
    
    x = xx;
    y = yy;
    w = ww;
    h = hh;
    bw = w;
    bh = h;
    list = listFileNames(dir);
    link = dir;
    currentp = dir;
    ArrayList<String> temp = new ArrayList<String>();
    ArrayList<String> temp2 = new ArrayList<String>();
    
    //if(list!=null)
    temp = trimNames(list);
    list = null;
    for(int i =0;i<temp.size();i++){
      
      String l = temp.get(i);
      String ndir = dir + "\\" + l + "\\";
      list = listFileNames(ndir);
      Button a = new Button( x ,y + 20 *(i), w-10,20,l);;
      if(list==null){
        
      
      
      }else {
        temp2 = trimNames(list);
        if(temp2.size()>0){
          a.submenu = new Menu(a.x+20,a.y+a.h,a.w-20,temp2);
          a.submenu.slide = true;
          a.submenu.visible = false;
        }
      }
      a.border = false;
      a.togglebox = true;
      buttons.add(a);
      
  }
  
    parent = new Menu( x + w - 10,y , 10,h-20);
    
    Slider s = new Slider( x + w - 10,y , 10,h);
    //h = buttons.size()*20;
    s.bar = true;
    s.classic = true;
    s.visible = true;
    s.valuex = 0;
    s.vertical = true;
    s.tvisible = false;
   
    sliders.add(s);
    Boundary b = new Boundary(x,y-10,w,h+10,4);
    Boundaries.add(b);
    
    for(int i =0;i<buttons.size();i++){
      Button b1 = buttons.get(i);
      Button a = new Button(0,0,40,40,b1.label);
      a.textbtm = true;
      a.tcol = 0;
      a.border = false;
      buttongrid.add(a);
    }
     cols = 5;
     rows = round(buttongrid.size()/cols)+1;
    
    b = new Boundary(x,y-50,cols*colwidth,5*rowheight + navheight,4);
    Boundaries.add(b);
    windows.add(this);
    
     s = new Slider( x + cols*colwidth - 10,y , 10,5*rowheight );
    //h = buttons.size()*20;
    s.bar = true;
    s.classic = true;
    s.visible = true;
    s.valuex = 0;
    s.vertical = true;
    s.tvisible = false;
   
    sliders.add(s);
    
    Window W = windows.get(0);
    
    Button b2 = new Button(x+w - 80,y - 40 + 10, 30,30,"Back");
    Button f = new Button(x+w - 80,y - 40 + 10, 30,30,"Forward");
    Button X = new Button(x + colwidth*cols - 35,y-50 + 5, 30,30,"X");
    X.txoff = 7;
    b2.border = false;
    f.border = false;
    X.border = false;
    //X.textbtm = true;
    nav.add(b2);
    nav.add(f);
    nav.add(X);
    
    for(int i=0;i<nav.size()-1;i++){
        Button b1 = nav.get(i);
        
        b1.x = x + 5 + 40 * i;
        b1.y = y - 50 + 5 + dy;
      }
      
   initqNav();
   h = sliders.get(1).h;
  };
  
  Window(float xx, float yy, float ww,float hh,String dir,int n){
    
    x = xx;
    y = yy;
    w = ww;
    h = hh;
    bw = w;
    bh = h;
    list = listFileNames(dir);
    link = dir;
    ArrayList<String> temp = new ArrayList<String>();
    ArrayList<String> temp2 = new ArrayList<String>();
    
    
    if(list!=null)temp = trimNames(list);
    //h = temp.size();
    int j = 0;
    int k = floor(temp.size()/n);
      for(int i =0;i<temp.size();i++){
      
      String l = temp.get(i);
      String ndir = "C:\\Users\\admin" + "\\" + l + "\\";
      list = listFileNames(ndir);
      if(list==null){
      Button a = new Button( x + w*j,y + 20 *(i)-k*20*(j), w-10,20,l);
      a.submenu = new Menu(x+20,y,w-20,20);
      a.submenu.borders(false);
      if(j>0) a = new Button( x + w*j,y + 20 *(i)-k*20*(j)-40, w-10,20,l);
      a.border = false;
      a.togglebox = true;
      buttons.add(a);
      if(i>k*(j+1))j++;
      }else {
        
      Button a = new Button( x + w*j,y + 20 *(i)-k*20*(j), w-10,20,l);
      a.submenu = new Menu(x+20,y,w-20,list);
      a.submenu.visible = false;
      a.submenu.slide = true;
      a.submenu.borders(false);
      if(j>0) a = new Button( x + w*j,y + 20 *(i)-k*20*(j)-40, w-10,20,l);
      a.border = false;
      a.togglebox = true;
      buttons.add(a);
      if(i>k*(j+1))j++;
  }}
    //h = temp.size()*20;
    parent = new Menu( x + w*n - 10,y, 10,h-20);
    
    Slider s = new Slider( x + w*n - 10,y, 10,h);
    //h = buttons.size()*20;
    s.bar = true;
    s.classic = true;
    s.visible = true;
    s.valuex = 0;
    s.vertical = true;
    s.tvisible = false;
   
    sliders.add(s);
    w = w*n;
    type = 1;
    Boundary b = new Boundary(x,y-10,w,h+20,4);
    //b.id = -1;
    Boundaries.add(b);
    
    for(int i =0;i<buttons.size();i++){
      Button b1 = buttons.get(i);
      Button a = new Button(0,0,40,40,b1.label);
      a.tcol = 0;
      a.textbtm = true;
      a.border = false;
      buttongrid.add(a);
    }
    cols = 5;
    rows = round(buttongrid.size()/cols);
    windows.add(this);
    
    Button b2 = new Button(x+w - 80,y - 40 + 10, 30,30,"Back");
    Button f = new Button(x+w - 80,y - 40 + 10, 30,30,"Forward");
    Button X = new Button(x + colwidth*cols - 35,y-50 + 5, 30,30,"X");
    b2.border = false;
    f.border = false;
    X.border = false;
    nav.add(b2);
    nav.add(f);
    nav.add(X);
    
    for(int i=0;i<nav.size()-1;i++){
        Button b1 = nav.get(i);
        
        b1.x = x + 5 + 40 * i;
        b1.y = y - 50 + 5 + dy;
      }
      
      initqNav();
      h = sliders.get(1).h;
  };
  
  public void initNav(){
    
  };
  
  public void initqNav(){
     Button n = new Button(x - 35,y,25,25,"My Computer");
     n = new Button(x - 35,y,25,25,"Data Folder");
     n.textbtm = true;
     n.border = false;
     n.tcol = 0;
     quicknav.add(n);
     n = new Button(x - 35,y + 50,25,25,"Documents");
     n.textbtm = true;
     n.border = false;
     n.tcol = 0;
     quicknav.add(n);
     n = new Button(x - 35,y + 100,25,25,"Downloads");
     n.textbtm = true;
     n.border = false;
     n.tcol = 0;
     quicknav.add(n);
  };
  
  
  public void render(){
    
    if(!hidden){
      stroke(0);if(!border)noStroke();
      noFill();
      rect(x,y,w,h);
      
      draw();
      functions();
      fill(255);
      for(int i=0;i<scenes.size();i++){
        //scenes.get(i).display();
      }
    }
  };
  
  public void display(){
    if(toggle||show){
    boundingbox();
    submenu();
    menu();
    
    scrollbar();
    wlogic();
    
    
    if(Boundaries.size()>0)Boundaries.get(0).draw2();
    }
  };
  
  public void boundingbox(){
    noStroke();
    if(!transparent)fill(255);
    else fill(255,transparency);
    rect(x,y,w,h);
    rect(x,y-10,w,10);
    
    fill(0,transparency4);
    rect(x,y,w,h);
    fill(0,transparency1);
    rect(x,y-10,w,10);
  };
  
  public void menu(){
    
    for(int i=0;i<buttons.size();i++){
      
      Button b = buttons.get(i);
      
      Slider s = sliders.get(0);
      if(index<0)svalue = s.value;
      if(index>=i||index==-1)b.y = b.by - s.value;
      else if(index>=0&&i>index)b.y = b.by - s.value + buttons.get(index).submenu.items.size()*20;
      
      b.x = x;
      b.by = y+10 + b.h*i;
      if(b.y+b.h<=y+h&&b.y>=y){
        if(b.pos())b.self_click2();
        b.draw();
        fill(255);
        textSize(b.bsize);
      if(b.submenu!=null)text(">",b.x+b.w-10,b.y+20);
      textSize(12);
      if(b.submenu!=null&&b.subpos()&&mousePressed&&!smdown){
        smdown = true;
        amendslider = false;
        index = i;
      }
      if(mousePressed&&!b.pos())b.toggle=0;
      b.highlight();
      }
    }
  };
  
  public void submenu(){
    if(index>-1){
    Button a = buttons.get(index);
      Menu m = a.submenu;
      //w = bw + 20;
      m.y = a.y+a.h + (dy);
      
      for(int j=0;j<m.items.size();j++){
          Button b = m.items.get(j);
          b.x = x + 20;
          if(b.y+b.h>y+h||b.y<y){
            b.visible=false;
            float dy2 = abs(y - by);
            
            noStroke();
            //if(b.border)strokeWeight(1);
            fill(255);
            rect(b.x,y,b.w,dy2);
            fill(0,150);
            rect(b.x,y,b.w,dy2);
          }
          //b.draw();
          else b.visible = true;
          
        }
      m.draw();
    }
  };
  
  public void scrollbar(){
    
    Slider s = sliders.get(0);
     
      s.x = x+w-10;
      s.y = y;
      s.draw();
      s.mouseFunctions();
  };
  
  public void scrollbar(PGraphics canvas){
    
    Slider s = sliders.get(0);
     
      s.x = x+w-10;
      s.y = y;
      //s.draw(mouse);
      //s.mouseFunctions(mouse);
  };
  
  public void wlogic(){
    
    float my = mouseY;
    if(click>2)click=0;
    ArrayList<Float> temp = new ArrayList<Float>();
    float dy = 0;
    Slider s = sliders.get(0);
    if(type==0)s.set(0,buttons.size()-h/20);
    else s.set(0,buttons.size()/3-h/20);
    if(index>-1&&buttons.get(index).pos()&&mousePressed&&!smdown){index=-1;smdown = true;}
    if(pos()&&!s.mdown&&mousePressed)smdown = true;
    if(!mousePressed){smdown = false;ddown=false;}
    if(!pos()&&mousePressed&&!s.mdown){index = -1;smdown = false;}
    if(dpos()&&mousePressed&&!smdown&&!s.mdown){
      ddown = true;
    }
    if(ddown){
      
      Boundary b = Boundaries.get(0);
      b.mtranslate(b,new PVector(mouseX,mouseY));
      
      x = b.Boundaries.get(0).x1;
      y = b.Boundaries.get(0).y1+10;
      
    }
    
    if(index>-1&&!amendslider){
      if(!amendslider&&!s.pos()&&!mousePressed){
        s.value = (index)*20;
        s.valuex = map(index,0,buttons.size(),0,h);
        
      }
      
      if(s.pos()&&mousePressed){
        temp.add(my);
        amendslider = true;
        dy = mouseY - temp.get(0);
      }}
    
  };
  
  public void display_grid(){
    if(close){
      fill(255);
      text("no",W-100,100);
      toggle = false;
      open = false;
      close = false;
    }
    if(toggle){
      fill(255);
      text("yes",W-100,100);
      close = false;
      open = true;
      toggle = false;
    }
    
    if(open){
      gridscrollbar();
      gridboundingbox();
      nav_();
      grid();
      drawQuicknav();
      drawBorder();
      gridlogic();
      
      
    }
    
  };
  
  public void drawQuicknav(){
    noStroke();
    if(quickAccess){
      if(navtoggle){
        if(!transparent)fill(255);
        else fill(255,transparency);
        rect(x - 80,y - 50,80,h + 50);
        
        fill(0,transparency1);
        rect(x - 80,y - 50,80,h + 50);
      }
      else {
        if(!transparent)fill(255);
        else fill(255,transparency);
        rect(x - 80,y,80,h);
        fill(0,transparency1);
        rect(x - 80,y,80,h);
      }
      for(int i=0;i<quicknav.size();i++){
        Button b = quicknav.get(i);
        b.x = x - 70;
        b.y = y + 20 + 50 * i;
        //fill(0);
        b.draw();
        b.highlight();
      }
    }
  };
  
  public void gridscrollbar(){
    
    Slider s = sliders.get(1);
    
      s.x = x+cols*colwidth-10;
      s.y = y;
      s.draw();
      s.mouseFunctions();
      s.set(0,rows);
  };
  
  public void gridlogic(){
    
    ArrayList<Float> temp = new ArrayList<Float>();
    
    float my = mouseY;
    Button X = nav.get(2);
    
    if(pos()&&mousePressed&&!dposg()&&!ddown)smdown = true;
    if(!pos()&&dposg()&&mousePressed&&!nav.get(0).pos()&&!nav.get(1).pos()&&!sliders.get(1).mdown&&!smdown&&!globaldown&&!X.pos())ddown = true;
    
    if(sliders.size()>0&&sliders.get(1)!=null){
    if(mousePressed&&!dposg()&&!sliders.get(1).pos()&&!mdown&&!ddown&&!sliders.get(1).mdown){
      if(track.size()<2)track.add(new PVector(mouseX,mouseY));
      mdown = true;
    }}
    else {
      if(mousePressed&&!dposg()&&!sliders.get(1).pos()&&!mdown&&!ddown){
      if(track.size()<2)track.add(new PVector(mouseX,mouseY));
      mdown = true;
    }}
    
    
    if(!mousePressed){
      smdown = false;
      ddown = false;
      mdown = false;
      track = new ArrayList<PVector>();
    }
    //text(track.size(),100,100);
    if(track.size()>0){
      
      //noFill();
      fill(0,20);
      stroke(0,50);
      strokeWeight(1);
      rect(track.get(0).x,track.get(0).y,(mouseX - track.get(0).x ),(mouseY - track.get(0).y));
      
    }
    
    
    if(ddown){
      
    }
    Boundary b = Boundaries.get(1);
    
    
    if(!mdown&&!ddown)X.latch(this,"close");
    if(ddown){
      
      b.mtranslate(new PVector(mouseX,mouseY));
      x = b.Boundaries.get(0).x1;
      y = b.Boundaries.get(0).y1+50;
      
      X.y = y-50 + 5 + dy;
      X.x = x + colwidth*cols - 35;
      
      for(int i=0;i<nav.size()-1;i++){
        Button b1 = nav.get(i);
        
        b1.x = x + 5 + 40 * i;
        b1.y = y - 50 + 5 + dy;
      }
    }else{
      b.mdown = false;
    }
    
    //Boundaries.get(1).draw2();
    
    if(sliders.get(1).pos()&&mousePressed){
        temp.add(PApplet.parseFloat(mouseY));
        deltay = mouseY - temp.get(0);
      }
      
     rows = round(windows.get(windows.size()-1).buttons.size()/5)+1;
  };
  
  public void gridboundingbox(){
      noStroke();
      if(!transparent)fill(255);
      else fill(255,transparency);
      rect(x,y,colwidth*cols,rowheight*(5));
      
      fill(0,transparency3);
      //rect(x,y,colwidth*cols,rowheight*(5));
      if(!transparent)fill(255);
      else fill(255,transparency);
      rect(x,y-navheight,colwidth*cols,navheight);
      
      fill(0,transparency1);
      rect(x,y-navheight,colwidth*cols,navheight);
      fill(0);
      //if(currentp!=null)text(currentp,x+100,y-20);
  };
  
  public void drawBorder(){
    if(!quickAccess&&border){
        stroke(0);
        noFill();
        rect(x,y-50,colwidth*cols,h+50);
      }
      else if(quickAccess&&border){
        stroke(0);
        noFill();
        rect(x - 80,y-50,colwidth*cols+80,h+50);
      }
  };
  
  public void nav_(){
    for(int i=0;i<nav.size()-1;i++){
        Button b = nav.get(i);
        
        b.textbtm = true;
        
        b.draw();
        b.highlight();
        
        if(b.pos()&&mousePressed&&b.label=="Back"&&!smdown){
          if(windows.size()>1){
            windows.remove(windows.size()-1);
            currentp = windows.get(windows.size()-1).link;
            sliders.get(0).value = 0;sliders.get(0).valuey = 0;
          }
        }
        if(b.pos()&&mousePressed&&b.label=="Forward"&&!smdown&&forward!=null){
          Window w1 = new Window(x,y,w,h,forward);
          windows.add(w1);
          currentp = windows.get(windows.size()-1).link;
        }
      }
      
      Button X = nav.get(2);
      X.draw();
      X.highlight();
      
  };
  
  public void grid(){
    
    Window w2 = windows.get(windows.size()-1);
    Slider s = sliders.get(1);
    
    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        
        int pos = j+i*cols;
        Button b = null;
        if(pos<w2.buttongrid.size()){
        b = w2.buttongrid.get(pos);
        Button b1 = w2.buttons.get(pos);
        b1.border = false;
        b.textbtm = true;
        b.x = x + 10 + colwidth * j;
        b.y = y + 10 + (rowheight+b.tsize) * i - s.value;
        b.highlight3();
        if(b.y<y||b.y+b.h + b.tsize>y + rowheight * 5)b.visible = false;
        else b.visible = true;
        if(!b.textcheck)b.labelcheck(colwidth);
          
        if(b.visible)b.draw();
        
        fill(0); 
        if(b.pos()&&b.submenu!=null){
          int size = currentp.length();
          if(currentp.charAt(size-1)!='\\')currentp += "\\";
           currentl = currentp + b.blabel;
        }
        //else if(b.pos()&&b.submenu==null){
        //  int size = currentp.length();
        //  if(currentp.charAt(size-1)!='\\')currentp += "\\";
        //   currentf = currentp + b.blabel;
        //}
        if(b.pos()&&mousePressed&&b1.submenu!=null&&!smdown){
          int size = currentp.length();
          if(currentp.charAt(size-1)!='\\')currentp += "\\";
          back = currentp;
          currentp += b.blabel;
          forward = currentp;
          Window w1 = new Window(w2.x+200,w2.y,w,h,currentp);
          windows.add(w1);
          windex = 0;
          s.value = 0;
          s.valuex = 0;
          wid = windows.size()-1;
        }else if(b.pos()&&mousePressed&&b1.submenu==null&&!smdown){
          int size = currentp.length();
          if(currentp.charAt(size-1)!='\\')currentp += "\\";
          String file = currentp + b.blabel;
          currentf = file;
          if(launchable)launch(file);
        }
      }}}
        
        
  };
  
  public void navbar(){
    
  };
  
  public boolean dpos(){
    return mouseX>x&&mouseX<x+w&&mouseY>y-10&&mouseY<y;
    
  };
  
  public boolean dposg(){
    return mouseX>x&&mouseX<x+cols*colwidth&&mouseY>y-50&&mouseY<y;
    
  };
  
  public boolean pos(){
    
    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
    
  }
  
};
public String [] WordStream(String Loc){
  WordExtractor extractor = null;
  String s = "sketch_191112a\\";
  String [] fileData = null;
  File file = null;
        
        try{

            file = new File(Loc);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            
            fileData = extractor.getParagraphText();
            
            for (int i = 0; i < fileData.length; i++){
              
                if (fileData[i] != null)System.out.println(fileData[i]);
                
            }}
            catch (Exception exep){
            //exep.printStackTrace();
        }
        return fileData;
};

public String [] WordStream(File file){
  WordExtractor extractor = null;
  String [] fileData = null;
        
        try{
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            
            fileData = extractor.getParagraphText();
            
            for (int i = 0; i < fileData.length; i++){
              
                if (fileData[i] != null)System.out.println(fileData[i]);
                
            }}
            catch (Exception exep){
            //exep.printStackTrace();
        }
        return fileData;
};
  //ArrayList<String> string_to_array(String [] a){
  //  String s = "";
  //  for(int i=0;i<a.length;i++){
  //    if(a[i].length()>0){
  //    String k = a[i] + ",";
      
  //    if(a[i].charAt(a[i].length()-1)==',')s += a[i];
  //    else s += k;
  //  }}
  //  int char_counter = 0;
    
  //  ArrayList<String> s1 = new ArrayList<String>();
    
  //  for(int i=0;i<s.length();i++){
      
  //    char c = s.charAt(i);
      
  //    if(c==','){
  //      String b = s.substring(char_counter,i);
        
  //      s1.add(b);
  //      char_counter = i+1;
  //    }
  //  }
    
  //  return s1;
  //};
  
  
  
class Workflow extends taskList{
    
    Table_ table;
    
    
    Workflow(float x,float y,float w,float h, int tcols, int trows){
      
      table = new Table_(x,y,w,h,tcols,trows,0);
      
      
    };
    
    public void draw_workflow(){
      
      displayList();
      if(Buttons.get(0).toggle==1){
        table.draw();
        
      }
      
    };
    
    
    
};
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_191112a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
